package Ch10;

public class C02Worker1 implements Runnable{ //Woker Thread를 만드는데 사용되는 대표적인 인터페이스 Runnable 
											 //- Run함수를 강제적으로 완성시켜야함

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("TASK01...");
			try {
				Thread.sleep(500); //5초 지연시간
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 		
		}
		
	}

}
