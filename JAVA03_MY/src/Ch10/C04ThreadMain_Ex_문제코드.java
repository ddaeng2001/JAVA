//package Ch10;
//
//class IncrementThread implements Runnable {
//	private static int counter = 0; 
//
//	public int getCounter() { //private이여서 꺼내는 작업
//		return counter;
//	}
//
//	@Override
//	public void run() {
//		for (int i = 0; i < 100000; i++) {
//			counter++; // 공유변수값증가 //4개의 쓰레드가 공유할 수 있는 공간
//			System.out.println(Thread.currentThread().getName() + "s counter : " + counter);
//			//400,000이 나와야하는데 동시에 네개의 쓰레드가 접근하는 경우도 있기 때문에 제대로 된 값이 나오지 않음
//			//동시에 접근하는 동시성에 대한 문제 발생으로 제대로 값이 나오지 않음 -> 해결한 코드 : C05참고
//		}
//	}
//
//}
//
//public class C04ThreadMain_Ex_문제코드 {
//
//	public static void main(String[] args) throws InterruptedException {
//
//		
//		IncrementThread incrementThread1 = new IncrementThread();
//		IncrementThread incrementThread2 = new IncrementThread();
//		IncrementThread incrementThread3 = new IncrementThread();
//		IncrementThread incrementThread4 = new IncrementThread();
//
//		Thread thread1 = new Thread(incrementThread1);
//		Thread thread2 = new Thread(incrementThread2);
//		Thread thread3 = new Thread(incrementThread3);
//		Thread thread4 = new Thread(incrementThread3);
//
//		//thread 이름 지정
//		thread1.setName("TH1");
//		thread2.setName("TH2");
//		thread3.setName("TH3");
//		thread4.setName("TH4");
//
//		//thread 실행
//		thread1.start();
//		thread2.start();
//		thread3.start();
//		thread4.start();
//		
//		//메인 스레드가 thread1,thread2의 작업이 모두 완료될 때까지 대기하도록 설정
//		thread1.join();
//		thread2.join();
//		thread3.join();
//		thread4.join();
//
//		//마지막 값 확인
//		System.out.println("Final value: " + incrementThread1.getCounter());
//
//	}
//}
