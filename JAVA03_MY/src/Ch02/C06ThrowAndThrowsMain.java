package Ch02;

import java.awt.AWTException;

class A{
	public void Ex1() throws NullPointerException {
		System.out.println("A's Ex1 Func Call!");
		String a = null;
		a.toString();
		System.out.println("Ex에서 실행되어야 할 코드 ");
	}
		
}

class B{
	public void Ex2() throws AWTException{
		System.out.println("B's Ex2 Func Call!");
		throw new AWTException("AWT 예외발생");
	}
}

public class C06ThrowAndThrowsMain { //예외를 직접 처리하지 않고 다른 쪽으로(한 쪽으로)몰 때 사용 예외처리에서 가장 중요함 ★★★★★

	public static void main(String[] args) {
		
		A ob1 = new A();
		B ob2 = new B();
		
		//예외발생 시 함수 호출했던 자리로 던지기
		try{
			ob1.Ex1();
			ob2.Ex2();
		}catch(NullPointerException e1) {
			System.out.println("NULL 예외처리!");
		}catch(AWTException e2) {
			System.out.println("AWT 예외처리");
		}
	}

}
