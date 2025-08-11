package Ch04;

import java.util.Scanner;// Scanner입력 시 필수! or java.util.Scanner sc = new java.util.Scanner(System.in);도 가능!

import Ch00.C01SystemOut;

public class C01Scanner {

	public static void main(String[] args) {
		
		//키보드로부터 입력 받는 것 == for 문법 확인(Java 기초 수업까지만 씀)
		
		//자동 import : ctrl + shift + o
		
		//★ 스트림 : 데이터의 논리적 이동채널(통로)★
			    //: 단방향성(한쪽으로 흐름)
		//System.in		: 표준 입력 스트림 생성(요청)
		//System.out	: 표준 출력 스트림 생성(요청)
		
		//new Scanner(System.in) : 표준입력 스트림을 연결한 Scanner 객체(객체지향pt에서 더 자세히!)
		//표준입력스트림에 연결된 Scanner객체를 생성한 다음
		//해당 객체의 위치값(메모리위치값)을 main Stack 영역의 Scanner sc참조 변수에 초기화
		Scanner sc = new Scanner(System.in); // Scanner == 클래스형 자료형
					//키보드로부터 내용을 받기 위해 Scanner라는 장치를 만듦
					//키보드로 입력된 내용이 Scanner라는 단위에 저장될 예정이다~
		
		System.out.printf("num1 입력 : ");
		//운영 체제에서 관리하는 여러 자원들 중에 표준 출력 장치에 전달할 때 사용하는 것 : System.out
		int num1 = sc.nextInt();	//엔터(\n), 스페이스바
		//키보드로 입력한 데이터 중 Int값만 뽑아서 가져옴
		//엔터키 입력 전까지 아무런 변화X
		
		System.out.printf("num2 입력 : ");
		int num2 =sc.nextInt();
		
		System.out.printf("num3 입력 : ");
		int num3 = sc.nextInt();
	
		
		System.out.printf("%d %d %d \n", num1, num2, num3);
		//num1에 3개의 숫자를 넣어도 숫자 3개가 출력됨(by.버퍼[한 번에 데이터를 받기 위한 임시공간])
		//엔터키 or 스페이스바도 문자
		//엔터를 치는 순간 버퍼공간이 초기화됨
		sc.close(); //Scanner 기능 제거
		
		//표준 입력 스트림은 버퍼 공간을 만들어서 데이터를 한 번에 받아 올 수 있음
		//버퍼 = 키보드로 받아오는 속도
	}

}
