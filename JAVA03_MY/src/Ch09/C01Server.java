package Ch09;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket; //소켓은 참고하기~!
import java.net.Socket;
import java.util.Date;

public class C01Server {

	public static void main(String[] args) throws IOException {

		
		//전화기 생성 후 콘센트 꼽는 작업
		
		//서버 소켓 생성
		ServerSocket server = new ServerSocket(7000); // IP: 192.168.5.50 PORT; - 전화기 만들어서 연결작업까지 포함
		System.out.println("[INFO] SERVER SOCKET LISTENING");
		
		//1회 접속
//		Socket client = server.accept();	//1회
//							//클라이언트 접속이 없을 때는 블럭상태(멈춰있는 상태)
//							//클라이언트 요청을 소켓 단위로 받을 수 있음 - 접속요청을 하는 상대방 컴퓨터의 java위치
//							//1회 접속, 1:1
//		
//		OutputStream out = client.getOutputStream(); //클라이언트에 대한 정보 전달을 위해 OutputStream을 꺼냄
//		
//		//데이터 전달 작업
//		DataOutputStream dout = new DataOutputStream(out); //문자형태로 전달 가능
//		dout.writeUTF("[SERVER] WELCOME TO SERVER + " + new Date()); //유니코드 문자 전달
//		dout.flush(); //내용이 추가되었으니 버퍼 공간 초기화
		
		
		
		//루프 접속
		while(true)
		{	
			Socket client = server.accept();
			OutputStream out = client.getOutputStream();
			DataOutputStream dout = new DataOutputStream(out);
			System.out.println("[INFO] SERVER SOCKET LISTENING");
			dout.writeUTF("[SERVER] WELCOME TO SERVER + " + new Date());
			dout.flush();
			dout.close();
			out.close();
			client.close();
			server.close();
			System.out.println("[INFO] SERVER EXIT");
		}
		

		
		
		
	}

}
