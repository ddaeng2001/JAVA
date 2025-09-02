package Ch09;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class C01Client { 

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		//소켓 생성 후 연결 요청 - 서버와 연결되는 client가 생성됨
		Socket client = new Socket("192.168.5.2",7000); //소켓 생성자체가 연결요청을 하는 셈
													 	// IP:192.168.5.2
							//해당 컴퓨터에 도착한 후 7000번으로 접속
		//기존스트림연결
		InputStream in = client.getInputStream();
		DataInputStream din = new DataInputStream(in);
		
		String recv = din.readUTF();
		System.out.println("메시지 :  " + recv);
		
		din.close();
		in.close();
		client.close();
	}

}
