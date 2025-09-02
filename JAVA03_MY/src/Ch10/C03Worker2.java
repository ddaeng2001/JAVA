package Ch10;

public class C03Worker2 implements Runnable {

	//Swing main area에 접근해서 area2에 내용 추가
	
	//멤버변수
	C03GUI gui;
	
	//C03GUI받을 생성자 생성
	public C03Worker2(C03GUI gui) {
		this.gui = gui;
	}
	
	@Override
	public void run() {
		while(true) {

		try {
			//gui를 쓸 수 있는 area2에 접근
			gui.area2.append("내일 4시에 간다!!\n");
			Thread.sleep(400);
		} catch (InterruptedException e) {
			e.printStackTrace();
			break;
			
			}
		}
		System.out.println("WORKER02 THERAD INTERRUPTED");

	}

}
