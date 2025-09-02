package Ch11;

import java.io.DataOutputStream;
import java.util.Scanner;

public class ServerSendThread implements Runnable {

	// Send & Out을 하기 위한 스레드 생성

	// run()메서드에서 쓰기 위한 멤버 변수 생성
	DataOutputStream dout;

	// SendThread로 보내기 전에 키보드로 내용을 받아야함
	Scanner sc = new Scanner(System.in); // 생성되자마자 Scanner로 연결됨

	public ServerSendThread(DataOutputStream dout) {
		this.dout = dout;
	}

	@Override
	public void run() {
		String send = null; // 송신용 참조변수

		while (true) {

			// interrupt 신호 처리를 위한 예외처리
			try {
				System.out.println("[SERVER (q:종료)] : ");
				send = sc.nextLine(); // 공백 포함 문자열 받아서 send에 연결시킴
				// Server -> Client(송신)
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
