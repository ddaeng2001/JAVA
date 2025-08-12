package Ch07;

import java.util.Scanner;

public class C01While {

	public static void main(String[] args) {

		// 00 기본 문법

//		while(조건식) {
//			조건식이 true인 동안 실행되는 종속문장
//		}

		// 01 HELLOW WORLD 10회 출력
		// (반복문을 벗어나기 위한) 탈출용 변수 : i
		// 탈출용 조건식 : i<10
		// 탈출 연산식 : i++

//		int i=0;
//		while(i<10) {
//			System.out.println(i + "HELLO WORLD");
//			i++;
//		}
		// i는 숫자 10으로 저장됨

		// 02 HELLO WORLD N회(키보드로부터 받는 정수값,N>0) 출력
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		
//		if(n<=0) {
//			System.out.printf("n은 0보다 커야 합니다\n");
//			System.exit(-1);	//프로그램 즉시 종료
//		}
//			
//		int i = 0;
//		while(i<n) {
//			System.out.println(i+"HELLO WORLD");
//			i++;
//		}

		// 03 1부터 10까지 누적합 구하기

//		int i = 1;
//		int sum = 0;
//		while(i<=10) {
//			System.out.println("i: "+ i);
//			sum += i;
//			i++;
//		}
//		System.out.printf("%d부터 %d까지의 합 : %d\n", 1, 10, sum);

		
		
		
		
		
		
		
		// 04 1부터 N까지 누적합 구하기
//		Scanner sc = new Scanner(System.in);
//
//
//		System.out.println("숫자를 입력해주세요: ");
//		int n = sc.nextInt();
//		if(n<=1){
//		System.out.println("n>1이여야 합니다.");
//		System.exit(-1);
//	    }
//		int i = 1;
//		int sum = 0;
//		while(i<=n) {
//			sum += i;
//			i++;
//		}
//		System.out.printf("1부터 " + n + "까지의 합:"+sum);

		
		
		
		
		
		// 05 N부터 M까지 누적합 구하기(N<M)
		
		
//		<내 답>
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수 2개를 입력해주세요: ");
//		
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//
//		if(num1 >= num2) {
//			System.out.println("두 번쨰 정수가 커야합니다.");
//		}
//		else {
//			int i = num1;
//			int sum = 0;
//			while(i<= num2) {
//				sum += i;
//				i++;
//			}
//			System.out.printf(num1 + "부터" + num2 + "까지의 합은" + sum + "입니다.");
//		}
		
		
//		<정답>
//		Scanner sc  = new Scanner(System.in);
//
//		int n = sc.nextInt();	//시작값
//		int m = sc.nextInt();	//종료값
//		
		//n<m을 만족하는 처리(n>=m -> swap(tmp 임시공간))
//		if(n>=m) {
//			//잘못 입력한경우(시작값(n)이 끝값(m)보다 큰경우 , (5,3)...)
//			int tmp = n;
//			n = m;
//			m = tmp;
//		}
		//괄호를 벗어나면 tmp(공간)는 자연스럽게 소멸됨
//		
//		int i = n;		//탈출용 변수
//		int sum = 0;	//누적합 변수
//		while(i<=m)	//탈출용 조건식 
//		{
//			System.out.println("i : " + i);
//			sum += i;		//sum = sum + i; 
//			i++;		//탈출용 연산식
//		}
//		System.out.println("SUM : " + sum);	
		
		
		
		
		
		
		// 06 n부터 m까지 수중(n<m)에 짝수의 합, 홀수의 합을 각각 구해서 출력
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수를 2개 입력하쇼: ");
//
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		
//		//n<m을 만족하는 처리(n>=m -> swap(tmp임시공간))
//		if(n>=m) {
//			int tmp = n;
//			n = m;
//			m = tmp;
//		}
//		int i=n;
//		int oddSum = 0; //홀수합
//		int evenSum = 0; //짝수 합
//		while(i<=m) {
//			System.out.println("i: "+ i);
//			if(i%2==0)
//				evenSum+=i;
//			else
//				oddSum+=i;
//			i++;
//		}
//		
//		System.out.printf("%d부터 %d 까지의 짝수 합 : %d 홀수 합 : %d\n", n,m,evenSum,oddSum);



		// 07 n단 구구단 출력(2<= n <= 9)
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		// 유효성 확인( n<2 || n>9)
		while(n<2||n>9) {
			System.out.println("2<=n<=9 값을 입력하세요!");
			n = sc.nextInt(); // 다시 값 받기
		}
		
		int i=1;
		while(i<10) {
			System.out.printf("%d X %d = %d\n",n,i,n*i);
			i++;
		}

	}
}


