package Ch02;

public class C01NullPointerExceptionMain {

	public static void main(String[] args) {
		
		try { //예외가 발생할 법한 위치를 try{}로 묶기 -> catch()사용해서 예외객체 받아내기 
		String str = null;
		System.out.println(str.toString());}
		catch(NullPointerException e) {
			  //예외 객체를 e로 받아냄
			  System.out.println("예외발생 : " + e);
			  System.out.println(e.getCause()); //원인 확인
			  System.out.println(e.getStackTrace());
			  e.printStackTrace(); //Console창에 뜨는 빨간 글씨를 나오게 할 수 있음
		}
		
		//예외가 발생함으로써 아래의 코드가 실행이 되지 않음
		//예외가 발생해도 아래의 코드가 실행되도록 하는 것 == 예외처리
		System.out.println("실행되어야 할 코드 1");
		System.out.println("실행되어야 할 코드 2");

	}

}
