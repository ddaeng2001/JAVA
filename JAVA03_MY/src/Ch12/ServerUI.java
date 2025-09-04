package Ch12;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

					//프레임			//이벤트처리 
class Sgui extends JFrame implements ActionListener, KeyListener {

	//멤버 컴포넌트 전역화
	JTextArea area;
	JScrollPane scroll;
	JTextField txt1;

	// 소켓코드 추가
	ServerSocket server;	//서버소켓
	Socket client;
	DataOutputStream dout;	//내용 송수신을 위한 보조스트림
	DataInputStream din;

	Sgui() throws Exception {
		super("Chat Server"); // 프레임창 제목
		JPanel pannel = new JPanel(); // 패널 생성
		pannel.setLayout(null); // Layout 설정 x

		area = new JTextArea(); // 텍스트영역창
		area.setEditable(false); // 편집 불가능

		// area.setBounds(10,10,260,240); //스크롤 추가시 생략
		scroll = new JScrollPane(area); // area에 스크롤 추가하기
		scroll.setBounds(10, 10, 260, 240);

		txt1 = new JTextField(); // 텍스트입력창
		txt1.setBounds(10, 260, 260, 30); // 크기
		txt1.addKeyListener(this); // 이벤트 추가(키보드)

		pannel.add(txt1);		//패널에 해당 컴포넌트 추가
		// pannel.add(area); //스크롤 추가시 생략
		pannel.add(scroll);

		add(pannel); // 프레임에 패널 추가

		setBounds(100, 100, 300, 350); // 프레임창 위치
		setResizable(false); //크기조절가능여부(false)
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 종료버튼 사용가능상태
		setVisible(true); // 프레임창 보여주기 - 기본 활성화

		//------------------------스윙작업완료---------------------------------------
		
		
		
		// 소켓연결-ServerSocket
		// 서버 소켓 생성
		server = new ServerSocket(7003); // 192.168.16.203:7000
		System.out.println("[INFO] SERVER SOCKET LISTENING");

		// 1회 응답
		client = server.accept(); //소켓 객체가 만들어지고 상단의 소켓과 연결됨

		System.out.println("[SERVER] 연결 시작합니다");
		// INOUT STREAM
		System.out.println("CLIENT IP : " + client.getInetAddress());
		dout = new DataOutputStream(client.getOutputStream()); //소켓 객체 안의 기본 스트림을 보조 스트림에 연결시켜놓음
		din = new DataInputStream(client.getInputStream());
		area.append("[CLIENT] " + client.getInetAddress() + " 접속하셨습니다\n");
		//보여지는 프레임창의 area에 접속을 누가했는지 띄어줌

		
		//수신스레드 생성
		ServerRecvThread recv = new ServerRecvThread(din,this); //(수신스트림, 이 객체의 주소)
		Thread th = new Thread(recv);
		th.start();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	}

	// 키를 뗏을때(UNICODE지원)
	@Override
	public void keyTyped(KeyEvent e) {
		// System.out.println("KEYTPYED함수 : " + e.getKeyChar());

	}

	// 키를 눌렀을때
	@Override
	public void keyPressed(KeyEvent e){
		//System.out.println("KEYPRESSED함수 : "+e.getKeyChar());
		//System.out.println("KEYPRESSED함수 : "+e.getKeyCode());
		if(e.getKeyCode()==10) //엔터키 입력(텍스트 필드에)
		{
			try {
				//1 필드의 내용 ->Area
				area.append("[SERVER] : "+txt1.getText()+"\n");
				//필드에 있는 내용 append
				
				//SERVER->CLIENT (송신)
				dout.writeUTF(txt1.getText()); //gui의 outstream에 입력했던 내용 그대로 전달
				dout.flush();
				
				//2 필드의 내용 삭제
				txt1.setText("");
				
				//스크롤를 맨 아래로 이동
				area.setCaretPosition(area.getDocument().getLength());
			
			}catch(Exception e2) {
				e2.printStackTrace();
			}
			

			
			
		}
	}

	// 키를 뗏을때(UNICODE 미지원)
	@Override
	public void keyReleased(KeyEvent e) {
		// System.out.println("KEYRELEASED함수 : "+e.getKeyChar());

	}

}

public class ServerUI {

	public static void main(String[] args) throws Exception {
		new Sgui();
	}

}
