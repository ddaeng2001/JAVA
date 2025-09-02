package Ch11;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ClientMain {

	public static void main(String[] args) throws Exception {
		
		//
		Socket client = new Socket("192.168.5.20",7000);
		System.out.println("SERVER와 연결되었습니다.");
		
		// 연결된 client 객체를 통해 InOutstream 꺼내오기
		InputStream in = client.getInputStream();
		OutputStream out = client.getOutputStream();

		// InOut Stream은 byte라서 text로 받아오면 내용이 깨질 수 있기 때문에 보조스트림을 끼우기
		DataInputStream din = new DataInputStream(in); // 데이터 수신하는 스레드로 무한루프
		DataOutputStream dout = new DataOutputStream(out); // 데이터 송신하는 스레드로 무한루프

		// 아래 코드들은 Thread 코드들이 삽입된 것
		// 송수신 Thread 분리 - ServerRecvThread / ServerSendThread

		// Worker 생성 - Server 수송신 Thread와 동일하게 만들면 됨
		ClientRecvThread recv = new ClientRecvThread(din); // 들어오는 데이터 담당
		ClientSendThread send = new ClientSendThread(dout); // 나가는 데이터 담당

		// Main Thread와 분리
		Thread th1 = new Thread(recv);
		Thread th2 = new Thread(send);

		// 스레드 실행
		th1.start();
		th2.start();

		// 메인 스레드와 워크 스레드를 함께 종료시키는 작업
		th1.join(); // 메인 스레드와 함께 종료하는 작업
		th2.join();

		// 자원 제거(InOutStream)
		dout.close();
		din.close();
		out.close();
		in.close();
		client.close();
		System.out.println("[CLIENT] 연결 종료합니다");
	}

}
