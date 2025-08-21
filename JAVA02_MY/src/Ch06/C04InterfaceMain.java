package Ch06;

interface Tire{
	void run();
}

//interface의 run함수를 완성시켜주기위해 implements 삽입
class 한국타이어 implements Tire{

	@Override
	public void run() {
		System.out.println("한국타이어가 굴러갑니다.");
	}
}


class 금호타이어 implements Tire{

	@Override
	public void run() {
		System.out.println("금호타이어가 굴러갑니다.");
	}
}

class Car{
	Tire FL;
	Tire FR;
	Tire BL;
	Tire BR;
	
	
	Car(){
		FL = new 한국타이어(); //기본으로 끼워주기
		FR = new 한국타이어();
		BL = new 한국타이어();
		BR = new 한국타이어();
	}
	void start() {
		FL.run();
		FR.run();
		BL.run();
		BR.run();
	}
}

public class C04InterfaceMain {

	public static void main(String[] args) {
		Car car = new Car();
		
		car.FL = new 금호타이어();
		car.BR = new 금호타이어();
		car.start();
	}

}
