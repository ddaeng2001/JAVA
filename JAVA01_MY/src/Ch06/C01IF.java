package Ch06;

import java.util.Scanner;

public class C01IF {

	public static void main(String[] args) {
	
		
		//---------------------------------
		//단순 IF
		//---------------------------------
		Scanner sc = new Scanner(System.in);
		System.out.print("나이: ");
		int age = sc.nextInt();
		if(age >= 8)
			System.out.println("학교에 다닙니다."); //중괄호는 라인이 1개밖에 없을 시 생략 가능
		
		System.out.println("첫번째 IF 코드 블럭 종료..");
		
		if(age<8)
			System.out.println("학교에 다니지 않습니다.");
		
		System.out.println("두번째 IF코드 블럭 종료..");
		System.out.println("프로그램을 종료합니다.");
		
		sc.close();
//		
//		//---------------------------------
//		//IF-ELSE
//		//---------------------------------
		Scanner sc = new Scanner(System.in);
		System.out.pring("나이 : ");
		int age = sc.nextInt();
		if(age >= 8)
			System.out.println("학교에 다닙니다.");
		else
			System.out.println("학교에 다니지 않습니다.");
		System.out.println("프로그램을 종료합니다.");
		sc.close();
		
		
		
		//--------------
		//1. 문제
		//--------------
		//정수 한 개 값을 입력받아 3의 배수이면 해당 수를 출력하세요.
		//3의 배수이면서 5의 배수라면 출력-
		//순서도도 그려보세요-
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 한 개 입력하세용: ");
		int num = sc.nextInt();
		if (num%3==0 && num%5==0) {
			System.out.println("3과 5의 배수입니다.");
		}
		else {
			System.out.println("3과 5의 배수가 아닙니다.");
		}
			
		
		//--------------
		//2. 문제
		//--------------
		//두 개의 정수를 입력받아 큰 수 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("두 개의 정수를 입력하세용: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		if(num1>num2) {
			System.out.printf("%d 등장!!", num1);
		}
		else {
			System.out.printf("%d 등장!!",num2);
		}
		
		
		
		//--------------
		//3. 문제
		//--------------
		//세 개의 정수를 입력받아 큰 수 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("세 개의 정수를 입력하시옹: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		if(num1>num2&&num1>num3){
			System.out.printf("%d가 젤 큽니다용 ", num1);
		}
		else if(num2>num1&&num2>num3) {
			System.out.printf("%d가 젤 큽니다용 ",num2);
		}
		else {
			System.out.printf("%d가 대장입니다. ",num3);
			
		}
	}
	

}
