package Ch09;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class C02Client {
	public static void main(String[] args) throws Exception {
		
		//
		Socket client = new Socket("SERVERIP",7000);
		System.out.println("SERVER와 연결되었습니다.");
		
		//연결된 client 객체를 통해 InOutstream 꺼내오기
		InputStream in = client.getInputStream();
		OutputStream out = client.getOutputStream();
		
		//InOut Stream은 byte라서 text로 받아오면 내용이 깨질 수 있기 때문에 보조스트림을 끼우기
		DataInputStream din = new DataInputStream(in); 
		DataOutputStream dout = new DataOutputStream(out);
		
		//Client도 입력해서 전달해야하기에
		Scanner sc = new Scanner(System.in);	//키보드로 내용 입력받기
		String recv = null;	//수신용 참조변수
		String send = null; //송신용 참조변수
		
		// Server가 내용을 줘야지 Client가 작업이 가능한 상태
		
		while(true)
		{
			
			//Server-> Client(수신)
			recv = din.readUTF(); //유니코드를 포함한 문자열을 recv로 받음
			if(recv.equals("q"))  //Client도 있어야 q라는 값을 전달받을 수 있음
				break;
			System.out.println("[SERVER] : " + recv);
			
			//
			System.out.println("[CLIENT (q:종료)] : ");
			send = sc.nextLine(); //공백 포함 문자열 받아서 send에 연결시킴
			
			//Client->Server(송신)
				dout.writeUTF(send);
				dout.flush(); //버퍼공간 제거
				if(send.equals("q"))  //send에 입력한 문자가 q라면
					break;			  //나가기
				

			
			
		}
		//Server나 Client에서 q를 입력해서 종료했을 때
		sc.close();
		dout.close();
		din.close();
		out.close();
		in.close();
		client.close();
		System.out.println("[CLIENT] 연결 종료합니다");
	}

}
