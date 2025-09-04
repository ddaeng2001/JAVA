package Ch17;

import java.util.Scanner;
//함수형 프로그램은 인터페이스 구현 시 하나만 있어야함!

interface Printer
{
//	void print(String name); //문자열 받는 함수 선언 //추상메서드 - 완성시키려면 상속관계를 생성 후 하위 클래스가 작업필수
															//람다식을 이용하면 간편하게 생성 가능
//	String print(String message); //반환자료형String 끼워넣음
	String print();
	
}
public class C02Lambda {

	public static void main(String[] args) {

		//함수형 프로그램 인터페이스와 람다함수 연결
		//람다식으로 생성하는 방법
		//01
		//함수형 프로그래밍을 하는 기본 형태
//		Printer printer = (message)->{System.out.println("01."+message);};	//하나만 만들어진 선언부의 본문을 연결해줌 == 완성된 하나의 메서드가 연결되는 것
						//객체 생성없이 람다함수를 연결해서 바로 사용하면 됨
		
//		printer.print("안뇽!");
		
		
		//02 람다식표현을 줄여서
//		Printer printer2=(message)->{return "02."+message;}; //함수형 프로그래밍에 맞게 단일 함수에 연결할 본문 생성
									//반환자료형 String이기 때문에 return이 필수적
//		Printer printer2=message->"02."+message; //return을 하되 라인이 하나라면 return과 함께 중괄호 생략 가능
//		String str = printer2.print("STARVING...");
//		System.out.println(str);
		
		
		//03키보드로부터 입력받아서 String으로부터 출력
		Printer printer3=()->{
			//Scanner 생성
			Scanner sc = new Scanner(System.in);
			System.out.println("문자를 입력하세요:");
			//키보드로 문자열 받기
			String home = sc.nextLine();
			//입력된 값 리턴
			return home;
		};
		System.out.println(printer3.print());
		
		
	}

}
