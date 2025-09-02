package Ch11;

import java.io.DataInputStream;

public class ServerRecvThread implements Runnable {

	// 멤버변수
	DataInputStream din;

	public ServerRecvThread(DataInputStream din) {// main thread에서 전달하는 수신용 stream

		// 외부로 받은 Stream 연결
		this.din = din;

	}

	@Override
	public void run() {
		String recv = null;
		while (true) {

			// interrupt 신호 처리를 위한 예외처리
			try {
				// Client -> Server(수신)
				recv = din.readUTF(); // 유니코드를 포함한 문자열을 recv로 받음
				if (recv.equals("q")) // Client도 있어야 q라는 값을 전달받을 수 있음
					break;
				System.out.println("[CLIENT] : " + recv);

			} catch (Exception e) {
				System.out.println("[EXCEPTION] 예외발생 SEND THREAD 종료");
			} finally {

			}

		}
		// 자원제거(Main Thread)에서 이미 처리 중
//		try {
//			din.close();
//		} catch (Exception e2) {
//		}


	}

}
