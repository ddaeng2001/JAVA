package Ch11;

import java.io.DataInputStream;

public class ClientRecvThread implements Runnable { // 스레드로 만들기 위해서

	// run()에서 쓰기 위해서 멤버 변수 생성
	DataInputStream din;

	public ClientRecvThread(DataInputStream din) {
		this.din = din;

	}

	@Override
	public void run() {
		String recv = null;
		while (true) {

			// interrupt 신호 처리를 위한 예외처리
			try {
				// Server->Client(수신)
				recv = din.readUTF(); // 유니코드를 포함한 문자열을 recv로 받음
				if (recv.equals("q")) // Client도 있어야 q라는 값을 전달받을 수 있음
					break;
				System.out.println("[SERVER] : " + recv);

			} catch (Exception e) {
				System.out.println("[EXCEPTION] 예외발생 RECV THREAD 종료");
			} finally {

			}

		}

	}

}
