package Ch10;

public class C03Worker1 implements Runnable {
	
	//Swing main area에 접근해서 area1에 내용 추가

	//멤버 변수
	C03GUI gui;
	
	//C03GUI를 받을 생성자 생성
	public C03Worker1(C03GUI c03gui) { 
		this.gui = c03gui; //this에 넣기
		
	}

	@Override
	public void run() {
		while(true) {
			
			try {
			//gui에서 쓸 수 있는 area에 접근
			gui.area1.append("TASK01....\n"); //중지라고 하는 버튼을 누를 때 까지 계속 할 예정 > whileloop 사용
			Thread.sleep(500);
			}catch(InterruptedException e) {
					//특정 쓰레드 중지 신호를 전달했을 때 중지 객체(interrupt)가 만들어지고 이 객체를 받아주는 클래스가 Interrupt
					//Interrupt객체 받을 준비
					//즉 중지 신호가 전달됐을 때 이 부분이 실행될 예정
				e.printStackTrace();
				break;
			}
		}
		System.out.println("WORKER01 THREAD INTERRUPTED..");

	}

}
