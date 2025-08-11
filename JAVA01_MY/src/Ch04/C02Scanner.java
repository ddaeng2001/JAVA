package Ch04;

import java.util.Scanner;

public class C02Scanner { //키보드 입력할 때만 잠깐 쓰고  웹 개발에서는 잘 안씀
						  //in out stream이 중요!!

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.println("입력된 정수 값 : " + num1);
		
		System.out.print("실수 입력:");
		double num2 = sc.nextDouble();
		System.out.println("입력된 실수 값 : " +num2);
		
		System.out.print("문자열 입력 : ");
//		String str1 = sc.next(); 		//문자열 입력 받기 기능 함수, 띄어쓰기(스페이스바)는 포함하지 않는다
																//버퍼공간에는 남아있지만 띄어쓰기 기준 앞쪽에만 Console창에서 확인 가능
		sc.nextLine(); //next와 nextLine을 섞어 쓸거면 nextLine()을 삽입해서 엔터키(Still in 버퍼)를 잡아내고 쓰기! 
					   //아니라면 그냥 nextLine()으로 다 받아도 ㄱㅊ~
		String str1 = sc.nextLine(); //스페이스바 입력해도 Console창에서 그대로 띄워줌!
						//엔터키가 있으면 초기화시키지 않고 값이 들어왔다고 생각 == 엔터키 자체도 값으로 여겨 공간에 넣어줌으로써 문제 발생
		System.out.println("입력된 문자열 : " + str1);
		
		sc.close(); //닫기
		//버퍼가 있기 때문에 정수 입력 : 칸에 10, 10.5, TEST를 한번에 넣어도 ㄱㅊ!
		
	}

}
