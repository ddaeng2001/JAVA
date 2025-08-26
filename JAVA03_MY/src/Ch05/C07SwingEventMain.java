package Ch05;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class GUI extends JFrame implements ActionListener,KeyListener, MouseListener { //키보드 이벤트처리 & 마우스 이벤트 처리
	
	//이벤트 등록을 위해 멤버 변수로 변환시킴
	JButton btn1;
	JButton btn2;
	JButton btn3;
	JButton btn4;
	JTextArea area; //area의 내용이 들어가는 것
	JTextField txt1;
	public GUI(String title) {
		//Frame기본설정
		super(title);
		setBounds(100,100,400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Pannel 설정
		JPanel panel  = new JPanel();
		panel.setLayout(null);
		
		//
		btn1 = new JButton("파일로저장"); //지역변수여서 다른 곳에서는 사용할 수 없어 멤버 변수로 올려줌 - 그래야 이벤트 등록이 가능함!
		btn1.setBounds(270,10,110,30);
		btn2 = new JButton("1:1요청");
		btn2.setBounds(270,50,110,30);
		btn3 = new JButton("대화기록보기");
		btn3.setBounds(270,90,110,30);
		btn4 = new JButton("입력");
		btn4.setBounds(270,300,110,30);
		

		
		//
		area = new JTextArea();
		JScrollPane scroll = new JScrollPane(area);
		scroll.setBounds(10,10,250,280);
		
		//
		txt1 = new JTextField();
		txt1.setBounds(10,300,250,30);
		
		
		//Event 처리
		//버튼 이벤트 처리
		btn1.addActionListener(this);
			 //this는 btn1의 this이기에 btn1를 이벤트감지항목의 요소가 되도록 만듦
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		//키보드 이벤트처리
		txt1.addKeyListener(this);
		//마우스 이벤트 처리
		area.addMouseListener(this);
		
		
		
		//Panel에 Component추가
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		panel.add(scroll);
		panel.add(txt1);
		
		//Frame에 Panel추가
		add(panel);
		
		//Frame표시여부
		setVisible(true);
	}

	//미완성된 함수 완성시키기 - 그래야 이벤트 발생 후 확인 가능
	//버튼을 멤버변수로 변환시켰기에 접근이 가능한 상태!
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("BTN 클릭!" + e.getSource());
										//getSource : 해당 이벤트를 발생시킨 객체의 toString()값 확인 가능
		if(e.getSource()==btn1) { //이벤트를 발생시킨 컴포넌트가 btn1인지 비교
			System.out.println("파일로 저장버튼 클릭!");
		}else if(e.getSource()==btn2) {
			System.out.println("1:1 요청 버튼 클릭!");
		}else if(e.getSource()==btn3) {
			System.out.println("대화 기록보기 버튼 클릭!");
		}else if(e.getSource()==btn4){
			System.out.println("입력 버튼 클릭!");
		}
	}

	
	//키보드 이벤트 처리 함수(TEXT입력 칸에 입력 후 Enter 시)
	@Override
	public void keyTyped(KeyEvent e) {
		// 눌렀다가 뗐을 때 
//		System.out.println("keyTyped..." + e.getKeyChar());
//		System.out.println("keyTyped..." + e.getKeyCode());
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// 사용자가 키를 누르는 순간 발생하는 이벤트를 잡은
		System.out.println("keyTyped..." + e.getKeyChar());
		System.out.println("keyTyped..." + e.getKeyCode()); //enter ==10
		
		if(e.getKeyCode()==10) { //엔터키를 쳤을 때 
			//textfield에 입력했던 내용을 textarea에 붙이기
			String message = txt1.getText(); //입력된 text값을 문자열로 받아오기
			System.out.println("message: " + message);
			area.append(message+"\n"); //기존내용에 덧붙임
								//다음 메시지가 줄바꿈해서 아래에 붙도록
			
			txt1.setText(""); //입력 + Enter후 textfield 비우기
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		//사용자가 키를 뗐을 때
//		System.out.println("keyTyped..." + e.getKeyChar());
//		System.out.println("keyTyped..." + e.getKeyCode()); //enter ==10
		
	}

	
	//마우스 이벤트 함수 (in textarea)
	@Override
	public void mouseClicked(MouseEvent e) {
		
		try { //getLineOfOffset으로 인한 예외처리
		System.out.println("cilcked!!");
		int offset = area.viewToModel(e.getPoint());
			//offset : 클릭한 위치의 상대적 위치 파악 , 일렬로 텍스트를 늘여놨을 때 커서의 위치
		System.out.println("offset : " + offset);
		int row = area.getLineOfOffset(offset);
		System.out.println("row: " + row);
		
		//시작과 끝의 offset값 뽑아내기 == 원하는 text줄을 뽑아낼 수 있음!
		int startOffset = area.getLineStartOffset(row);
		int endOffset = area.getLineEndOffset(row);
		System.out.printf("start : %d - end : %d\n", startOffset ,endOffset);
		//원하는 문자열만 뽑아내기
		String str = area.getText(startOffset, endOffset - startOffset);
		System.out.println("str: " + str);
		}catch(Exception e2) {
			e2.printStackTrace();
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}
	
}

public class C07SwingEventMain {

	
	public static void main(String[] args) {
		new GUI("Chatting");
	}
}
