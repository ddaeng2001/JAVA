package Ch05;

import java.util.Scanner;

public class C02Ex {

	public static void main(String[] args) {
		
		
		//1.문제(삼항연산자 + 논리연산자)
		// 키보드로 국어/영어/수학 점수를 입력받아 각각의부분점수가 40점이상이고
		// 총점수합의 평균이 70점이상이면 '합격'
		// 미만이면 '불합격'을 출력합니다
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수를 입력하세요 : ");
		int Kor = sc.nextInt();
		System.out.println("영어 점수를 입력하세요 : ");
		int Eng = sc.nextInt();
		System.out.println("수학 점수를 입력하세요 : ");
		int Math = sc.nextInt();

		double avg = (double)(Kor+Eng+Math)/3;
		String grade = (Kor>=40 && Eng>=40 && Math>=40&&avg>=70)?"합격":"불합격";
		System.out.println("시험결과 : " + grade);
		sc.close();


		//2.미니문제(%연산자)
		//키보드로 부터 정수값 2개를 입력받아
		//두수의 합이 짝수이면 "짝수입니다"
		//홀수이면 "홀수입니다" 를 출력하세요~
		Scanner sc = new Scanner(System.in);
		System.out.println("두 개의 정수값을 입력하세요: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		String result = ((num1+num2)%2==0)?"짝수입니다":"홀수입니다";
		System.out.println("결과: "+ result);
		sc.close();
		
		
		
		
		
		
		
		
		
		
	}

}
