package Ch06;

import java.util.Scanner;

public class C01IF {

	public static void main(String[] args) {
	
		//★ SWITCH보다 IF가 훨~씬 중요함!! ★
		//---------------------------------
		//단순 IF
		//---------------------------------
//		Scanner sc = new Scanner(System.in);
//		System.out.print("나이: ");
//		int age = sc.nextInt();
//		if(age >= 8)
//			System.out.println("학교에 다닙니다."); //중괄호는 라인이 1개밖에 없을 시 생략 가능
//		
//		System.out.println("첫번째 IF 코드 블럭 종료..");
//		
//		if(age<8)
//			System.out.println("학교에 다니지 않습니다.");
//		
//		System.out.println("두번째 IF코드 블럭 종료..");
//		System.out.println("프로그램을 종료합니다.");
//		
//		sc.close();
////		
////		//---------------------------------
////		//IF-ELSE
////		//---------------------------------
//		Scanner sc = new Scanner(System.in);
//		System.out.pring("나이 : ");
//		int age = sc.nextInt();
//		if(age >= 8)
//			System.out.println("학교에 다닙니다.");
//		else
//			System.out.println("학교에 다니지 않습니다.");
//		System.out.println("프로그램을 종료합니다.");
//		sc.close();
//		
//		
//		
//		//--------------
//		//1. 문제
//		//--------------
//		//정수 한 개 값을 입력받아 3의 배수이면 해당 수를 출력하세요.
//		//3의 배수이면서 5의 배수라면 출력-
//		//순서도도 그려보세요-
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수를 한 개 입력하세용: ");
//		int num = sc.nextInt();
//		if (num%3==0 && num%5==0) {
//			System.out.println("3과 5의 배수입니다.");
//		}
//		else {
//			System.out.println("3과 5의 배수가 아닙니다.");
//		}
//		sc.close();
//		
//		//--------------
//		//2. 문제
//		//--------------
//		//두 개의 정수를 입력받아 큰 수 출력
//		Scanner sc = new Scanner(System.in);
//		System.out.print("두 개의 정수를 입력하세용: ");
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		if(num1>num2) {
//			System.out.printf("%d 등장!!", num1);
//		}
//		else {
//			System.out.printf("%d 등장!!",num2);
//		}
//		sc.close();
//		
//		//--------------
//		//3. 문제
//		//--------------
//		//세 개의 정수를 입력받아 큰 수 출력
//		Scanner sc = new Scanner(System.in);
//		System.out.print("세 개의 정수를 입력하시옹: ");
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		int num3 = sc.nextInt();
//		if(num1>num2&&num1>num3){
//			System.out.printf("%d가 젤 큽니다용 ", num1);
//		}
//		else if(num2>num1&&num2>num3) {
//			System.out.printf("%d가 젤 큽니다용 ",num2);
//		}
//		else {
//			System.out.printf("%d가 대장입니다. ",num3);
//			
//		}
//		sc.close();
		
		//---------------
		//4.문제
		//---------------
		//세 개의 정수를 입력받아 해당수의 합과 평균을 출력
		
		//---------------
		//5.문제
		//---------------
//		입력한 수가 짝수이고, 3의 배수라면 출력 (n%2==0 && n%3==0)
//		입력한 수가 홀수이고, 5의 배수라면 출력 (n%2==1 && n%5==0)
		
		
		
		
		
		
		
		
		//----------------
		//IF-ELSE IF -ELSE
		//----------------
		//과목 1,2,3,4 중 하나라도 40점 미만이면 불합격
		//과목평균이 100점 만점 기준으로 60점 미만이면 불합격
		//아니면 합격
		
//		Scanner sc = new Scanner(System.in);
//		int 과목1 = sc.nextInt();
//		int 과목2 = sc.nextInt();
//		int 과목3 = sc.nextInt();
//		int 과목4 = sc.nextInt();
//		double 평균 = (double)(과목1 + 과목2 + 과목3 + 과목4)/4;
//		
//		//불합격 여부 판단
//		if(과목1<40) 
//		{
//			System.out.println("불합격");
//		}
//		else if(과목2<40) //과목1>=40 && 과목2<40
//		{
//			System.out.println("불합격");
//		}
//		else if(과목3<40) //과목1>=40 && 과목2>=40 && 과목3<40
//		{
//			System.out.println("불합격");
//		}
//		else if(과목4<40)	 //과목1>=40 && 과목2>=40 && 과목3>=40 && 과목4<40
//		{
//			System.out.println("불합격");
//		}
//		else if(평균<60) //과목1>=40 && 과목2>=40 && 과목3>=40 && 과목4>=40 && 평균<60
//		{
//			System.out.println("불합격");
//		}
//		else
//		{
//			System.out.println("합격");
//		}
		
		
		//문제
		//시험 점수를 입력받아
		//90 ~ 100점은 A,
		//80 ~ 89점은 B,
		//70 ~ 79점은 C,
		//60 ~ 69점은 D,
		//나머지 점수는 F를 출력하는 프로그램을 작성하시오.
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("시험 점수를 입력하세용: ");
//		int score = sc.nextInt();
//		
//		if(score>89) {
//			System.out.println("A");
//		}
//		else if(score>79) {
//			System.out.println("B");
//		}
//		else if(score>69) {
//			System.out.println("C");
//		}
//		else if(score>59) {
//			System.out.println("D");
//		}
//		else {
//			System.out.println("F");
//		}
//		sc.close();
		
		
		
		
		
		//문제
		//나이별로 요금을 부과하는 else if문을 만드세요.
		//8세 미만 : 요금은 1000원
		//14세 미만 : 요금은 2000원
		//20세 미만 : 요금은 2500원
		//20세 이상 : 요금은 3000원
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요: ");
		int age = sc.nextInt();
		
		if(age<8) {
			System.out.printf("%d세 미만의 요금은 1000원입니다. ", age);
		}
		else if (age<14) {
			System.out.printf("%d세 미만의 요금은 2000원입니다.", age);
		}
		else if (age<20) {
			System.out.printf("%d세 미만의 요금은 2500원입니다.", age);
		}
		else {
			System.out.println("성인이시군요?3000원 내세용.");
		}
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
