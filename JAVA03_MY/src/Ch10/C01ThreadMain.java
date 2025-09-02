package Ch10;

public class C01ThreadMain {

	public static void main(String[] args) throws Exception{

		//최초 시작 흐름은 main thread이지만 흐름을 분할시켜서 작업을 처리할 때가 있기에
		//thread가 독자적으로 역할을 하는데 이를 worker thread(데이터 송 수신)라고 함
		

		//main thread 하나로 실행되는 상태
		//1번이 다 끝나야 2번이 진행됨 - 동기 방식(순서대로 진행됨)
		for(int i=0;i<5;i++) {
			System.out.println("TASK01...");
			Thread.sleep(500); 		//5초 지연시간
		}
		
		
		for(int i=0;i<5;i++) {
			System.out.println("TASK02...");
			Thread.sleep(500); 		//5초 지연시간
		}

	}

}
