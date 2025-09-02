package Ch10;

public class C02ThreadMain {

	public static void main(String[] args) {
		// 1. Runnable interface를 이용한 스레드 분할 (Worker1/2에서 확인 가능)
		//		-> run()메서드를 정의해줘야함(override)
				   //Thread 클래스가 기본적으로 run()메서드를 제공하지만 이 메서드는 어떤 동작도 하지 않기 때문에
				   //실제로 해야 할 작업 run()메서드를 오버라이드하여 작성해야함
		
		// 비동기 처리 : thread를 여러 개 만들어서 독자적으로 처리함
		// Worker Thread를 따로따로 만들기 -- (C02Worker1/ Worker2)
		
		//Worker Thread 생성
		
		//01 - 해당 작업 객체 만들기
		C02Worker1 w1 = new C02Worker1();
		C02Worker2 w2 = new C02Worker2();
		
		//메인 스레드로부터 Worker1과 Worker2를 분리시키는 작업
		//02
		Thread th1 = new Thread(w1);
		Thread th2 = new Thread(w2);
		
		//03
		th1.start();
		th2.start();
		
		
		//2. Thread class를 이용한 스레드 분할
		new Thread() {//객체 생성 시 들어갈 여러 개의 데이터를 받아낼 수 있음
					  //익명 객체를 생성한 것 
					  //참조변수 연결없이 Thread안에서 처리해야 할 것들을 바로 받아옴

			@Override
			public void run() {
				for(int i=0;i<5;i++) {
					System.out.println("TASK03...");
					
					try {
						Thread.sleep(600);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}

			
		}.start(); //작업단위를 run에 넣어서 바로 실행됨 	
		
	}

}
