package Ch10;

class IncrementThread implements Runnable {
	private static int counter = 0;
	
	//lock object를 생성
	private static final Object lock = new Object(); 
	
	public int getCounter() {
		return counter;
	}

	@Override
	public void run() {
		
		
			
			for (int i = 0; i < 100000; i++) {
				
				synchronized (lock) { //★★ 임계영역 설정하는 예약어 synchronized에 lock object를 전달
									  //특정 스레드가 들어가있는 동안에는 다른 스레드가 들어가지 못하도록 lock
					//작업내용
					counter++; // 공유변수값증가
					System.out.println(Thread.currentThread().getName() + "s counter : " + counter);
					
					try {
						if(i<=99999) { //마지막값이 아닌 경우
							
							lock.notifyAll();//같은 자원을 이용하는 다른스레드에게 알림 : 작업이 완료되었음을
							lock.wait(5);//잠깐대기 : 현재 쓰레드(들어와있는)는 다른 스레드가 작업할 때까지 0.005초 대기
						}
		
					}catch(InterruptedException e) {
						e.printStackTrace();
						break;
					}
					
				}
				
			}
			
		
	
		
	}

}

public class C05ThreadMain_Ex_임계영역설정 {

	public static void main(String[] args) throws InterruptedException {

		
		IncrementThread incrementThread1 = new IncrementThread();
		IncrementThread incrementThread2 = new IncrementThread();
		IncrementThread incrementThread3 = new IncrementThread();
		IncrementThread incrementThread4 = new IncrementThread();

		Thread thread1 = new Thread(incrementThread1);
		Thread thread2 = new Thread(incrementThread2);
		Thread thread3 = new Thread(incrementThread3);
		Thread thread4 = new Thread(incrementThread3);

		thread1.setName("TH1");
		thread2.setName("TH2");
		thread3.setName("TH3");
		thread4.setName("TH4");

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		//메인 스레드가 thread1,thread2의 작업이 모두 완료될 때까지 대기하도록 설정
		thread1.join();
		thread2.join();
		thread3.join();
		thread4.join();

		System.out.println("Final value: " + incrementThread1.getCounter());

	}
}
