package Ch02;

public class C05ExceptionMain { //예외처리를 쉽게 처리할 수 있지만 효과적으로 관리하기는 어려운 방법

	public static void main(String[] args) {
		
	try {	
		String str = ""; //문자열이 있으면 예외가 발생하지 않을 것임 ex> " " 
		str.toString(); //Error 발생
		
		int[] arr = {10,20,30};
//		arr[5] = 100;
		
		Animal tori = new Dog();
		Cat down = (Cat)tori;
	}
	
	//예외처리를 쉽게 하는 방법
	catch(Exception e) { //하위클래스형으로 예외객체가 만들어졌을때 상위클래스형 예외객체가 다 연결하고 있기 때문에(Upcasting된 상태)
						 // 래의 예외들을 한 번에 다 처리할 수 있음
		System.out.println(e.getCause() + "예외처리!"); //발생한 예외의 정보를 확인할 수 있음
	}
	
	
	//정석적인 예외처리 방법(따로따로)
	
//	}catch(NullPointerException e1) { 
//		System.out.println("NULLPOINTER 예외처리완료!");
//	}catch(ArrayIndexOutOfBoundsException e2) {
//		System.out.println("배열 예외처리완료!");
//	}catch(ClassCastException e3) {
//		System.out.println("다운캐스팅 예외처리완료!");
//		
//	}

	}

}
