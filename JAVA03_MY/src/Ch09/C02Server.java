package Ch09;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class C02Server { //채팅창 생성하는 중!
	public static void main(String[] args) throws Exception {
		//하나의 스레드 안에 송수신부 스레드가 포함된 상태이기에 Server나 Client 중 데이터를 주고 받고 해야함
		//스레드 분할을 해야 동시 채팅이 가능해짐!
		
		//<현재 흐름 - 스레드가 나눠지기 전 상태>
		//	Client						Server
		//								1)키보드 입력
		//								2)dout.write()
		// 3)din. read
		// 4)dout.write()
		//								5)din.read()
		
		//서버생성
		//소켓 생성
		ServerSocket server = new ServerSocket(7000);
		System.out.println("[INFO] SERVER SOCKET LISTENING");
		
		//client 연결 대기 후 연결 성공 시 client 객체 생성
		Socket client = server.accept();
		System.out.println("[INFO] SERVER ACCEPT..CLIENT IP : " + client.getInetAddress());
		
		//연결된 client 객체를 통해 InOutstream 꺼내오기
		InputStream in = client.getInputStream();
		OutputStream out = client.getOutputStream();
		
		//InOut Stream은 byte라서 text로 받아오면 내용이 깨질 수 있기 때문에 보조스트림을 끼우기
		DataInputStream din = new DataInputStream(in); //기본 inputstream 삽입
		DataOutputStream dout = new DataOutputStream(out);
		
		//din과 dout으로 내용을 주고 받을 예정
		Scanner sc = new Scanner(System.in);	//키보드로 내용 입력받기
		String recv = null;	//수신용 참조변수
		String send = null; //송신용 참조변수
		while(true)
		{
			System.out.println("[SERVER (q:종료)] : ");
			send = sc.nextLine(); //공백 포함 문자열 받아서 send에 연결시킴

			//Server -> Client(송신)
				dout.writeUTF(send);
				dout.flush(); //버퍼공간 제거
				if(send.equals("q"))  //send에 입력한 문자가 q라면
					break;			  //나가기
				
			//연결 흐름을 분리시켜놓지 않은 동기방식이기에 지정해놓은 방식(순서)대로 처리됨
			//작업단위가 나눠져있기 않기 때문에(송신부 쓰레드/수신부 쓰레드가 합쳐져 있는 상태) 쓰레드를 적용하지 않았을 시 누가 먼저
			//데이터를 보낼 지 결정필요!
			//==Server가 데이터를 주기 전에 Client는 아무것도 할 수 없음
			//서버에서 키보드로부터 내용을 입력받아서 클라이언트에게 던지기 : 순서
				
			//Client -> Server(수신)
				recv = din.readUTF(); //유니코드를 포함한 문자열을 recv로 받음
				if(recv.equals("q"))  //Client도 있어야 q라는 값을 전달받을 수 있음
					break;
				System.out.println("[CLIENT] : " + recv);
			
			
		}
		
		//Server나 Client에서 q를 입력해서 종료했을 때
		sc.close();
		dout.close();
		din.close();
		out.close();
		in.close();
		client.close();
		server.close();
		System.out.println("[SERVER] 연결 종료합니다");
		
	}

}
