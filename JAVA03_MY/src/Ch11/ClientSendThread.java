package Ch11;

import java.io.DataOutputStream;
import java.util.Scanner;

public class ClientSendThread implements Runnable{

	//멤버변수
	DataOutputStream dout;
	Scanner sc = new Scanner(System.in);
	
	public ClientSendThread(DataOutputStream dout) {
		this.dout = dout;
		
	}

	@Override
	public void run() {
		String send = null; // 송신용 참조변수

		while (true) {

			// interrupt 신호 처리를 위한 예외처리
			try {
				System.out.println("[CLIENT (q:종료)] : ");
				send = sc.nextLine(); // 공백 포함 문자열 받아서 send에 연결시킴
				// Client -> Server(송신)
				dout.writeUTF(send); //client에 던져주기
				dout.flush(); // 버퍼공간 제거
				if (send.equals("q")) // send에 입력한 문자가 q라면
					break; // 나가기
			} catch (Exception e) {
				System.out.println("[EXCEPTION] 예외발생 SEND THREAD 종료");
			} finally {

			}

		}
		//자원제거
//		try {dout.close();}catch(Exception e2) {} //Main Thread에서 이미 처리
		sc.close();
	}

}
