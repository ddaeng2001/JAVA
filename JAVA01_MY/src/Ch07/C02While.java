package Ch07;

import java.util.Scanner;

public class C02While {

	public static void main(String[] args) {
		//중첩 while문
		
		//2단 - 9단 출력
//		dan	i
//		2	1-9
//		3	1-9
//		...
//		9	1-9
//		---------------------------
//		dan=2	i=1
//		dan++	i++
//		dan<10   i<10
		
//		int dan = 2; //2단으로 초기화
//		while(dan<10) {
//			System.out.printf("%d\n", dan);
//			int i = 1;
//			while(i<10) {
//				System.out.printf("%d X %d = %d\n", dan,i,dan* i);
//				i++;
//			}
//			dan++;
//			System.out.println();
			
//		}
		
		
		
		
		//2단 - 9단 (2X9, 2X8, 2X7 ..... 9X9 .. 9X1)
//		int dan = 2;
//		while(dan<10) {
//			System.out.printf("%d\n",dan);
//			int i = 9;
//			while(i>=1) {
//				System.out.printf("%d X %d = %d\n", dan, i, dan*i);
//				i--;
//			}
//			dan++;
//			System.out.println();
//		}
		
		
		
		//9단 - 2단 (9X9, 9X8,9X7 .... 2X9 .. 2X1)
//		int dan = 9;
//		while(dan>=1) {
//			int i = 9;
//			while(i>=1) {
//				System.out.printf("%d X %d = %d\n", dan, i, dan*i);
//				i--;
//			}
//			dan--;
//			System.out.println();
//		}
		
		
		
		//2단 - n단 (n>2)
//		n단 입력받기
//		Scanner sc = new Scanner(System.in);
//		System.out.println("단을 입력해주세요(2단부터 시작): ");
//		int ndan = sc.nextInt();
//
		

//		//n>2 조건
//		if(ndan<=2) {
//			System.out.println("2보다 큰 수를 입력해주세요: ");
//			System.exit(-1);
//		}
//		
//		
//		
//		int dan = 2;
//		while(dan <= ndan) {
//			int i = 1;
//			while(i<10) {
//				System.out.printf("%d X %d = %d\n",dan,i,dan*i);
//				i++;
//			}
//			dan++;
//			System.out.println();
//		}
//		
//		sc.close();
		
	
		
		//n단 - m단 (n<m)
		//n단 m단 입력받기
//		Scanner sc = new Scanner(System.in);
//		System.out.println("2개의 단을 입력하세요: ");
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		
//		//n단 < m단
//		if(n>=m) {		//SWAP 작업
//			int tmp = n;
//			n = m;
//			m = tmp;
//		}
//		
//		int dan = n;
//		while(dan <=m ) {
//			int i = 1;
//			while(i<10) {
//				System.out.printf("%d X %d = %d\n", dan, i, dan*i);
//				i++;
//			}
//			dan++;
//			System.out.println();
//		}
//		
//		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		//-------------------------------
		//별찍기(기본높이 : 4)
		//반드시 반복을 사용할 것, 반복시마다 하나의 *만 찍어낼 것
		//-------------------------------
		//*****
		//*****
		//*****
		//*****
		//규칙
		//개행(바깥에 돌아가는)처리 = i로 취급 = i:0~3(4줄) ==> 별이 4줄 찍힘
		//별 찍어낼 때 사용되는 변수 = j: 0 ~ 4까지(5개)
		//i=0 i++ i<4
		//개행 처리 : System.out.println();
		//별찍기 : System.out.print("*");
		
//		int i=0;
//		while(i<4) {
//			int j = 0;
//			while(j<5) {
//				System.out.print("*");
//				j++;
//			}
//			i++;
//			System.out.println();
//		}
		
		
		
		
		
		
		
		
		//높이 : h
		//*****
		//*****
		//*****
		//*****
		
		//높이를 입력받아보자
		//개행 처리 : h-1줄(총 h줄)
//		Scanner sc = new Scanner(System.in);
//		System.out.println("높이를 입력해주세요: ");
//		int h = sc.nextInt();
//		
//		int i = 0;
//		while(i<h+1) {
//			int j = 0;
//			while(j<5) {
//				System.out.printf("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//
//		}
//		sc.close();
		
		
		
		
		
		
		
		
		
		
		//*
		//**
		//***
		//****
		//개행 : 4줄
		
//		i(개행)		j(별)
//		0		0-0
//		1		0-1
//		2		0-2
//		3		0-3	
//		--------------------------------
//		i=0		j=0
//		i++		j++
//		i<4		j<=i or j<i+1
		
//		int i = 0;
//		while(i<4) {
//			int j = 0;
//			while(j<=i) {
//				System.out.printf("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}

		
		
		
		
		
		
		
		
//		높이 : h
//		*
//		**
//		***
//		****
		
		//개행4줄
//		Scanner sc = new Scanner(System.in);
//		System.out.println("높이를 입력해주세요: ");
//		int h = sc.nextInt();
//		
//		int i = 0;
//		while(i<h) {
//			int j = 0;
//			while(j<=i) {
//				System.out.printf("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
//		sc.close();
		
		
		
		
		
		
		
		
		
		//****
		//***
		//**
		//*
		//개행 4줄
//		i(개행)		j(별)
//		0		0-3
//		1		0-2
//		2		0-1
//		3		0-0
//		--------------------------------
//		i=0		j=3
//		i++		j++ : 하나의 행에 머무를 때 j값 증가한다는 의미, 끝 값으로 따졌을 때는 줄어드는 게 맞음!
//		i<4		j>=i
		
		
//		int i = 0;
//		while(i<4) {
//			int j = 3;
//			while(j>=i) {
//				System.out.printf("*");
//				j--;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		
		
		
		
		
		
		//-----------------------
		//높이 : h
		//-----------------------
		//****
		//***
		//**
		//*
		
		//개행 3줄 고정이라 치고
//		Scanner sc = new Scanner(System.in);
//		System.out.println("높이를 입력해주세요: ");
//		int h = sc.nextInt();
//		
//		int i = 0;
//		while(i<h+1) {
//			int j = 3;
//			while(j>=i) {
//				System.out.printf("*");
//				j--;
//			}
//			System.out.println();
//			i++;
//		}
//		sc.close();
		
		
		
		
		//----------------------
		//공백
		//----------------------
		//   *
		//  ***
		// *****
		//*******
		//개행은 총 4줄
//		int i = 0;
//		while(i<4) {
//			//공백
//			int b = 0;
//			while(b<3-i) {
//				System.out.print(" ");
//				b++;
//			}
//			
//			//*은 홀수로 증가(1부터)
//			int j = 0 ;
//			while(j<=2*i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		
		
		
		
		
		
		// 높이: h
		//   *
		//  ***
		// *****
		//*******
		
		//개행h줄
//		Scanner sc = new Scanner(System.in);
//		System.out.println("높이를 입력해주세요: ");
//		int h = sc.nextInt();
//		
//		int i = 0;
//		while(i<h) {
//			
//			//공백 삽입
//			int b = 0;
//			while(b<(h-1)-i) {
//				System.out.print(" ");
//				b++;
//			}
//			
//			//별 삽입
//			int j = 0;
//			while(j<=i*2) {
//				System.out.printf("*");
//				j++;
//			}
//			
//			System.out.println();
//			i++;
//		}
//		
//		sc.close();
//		

		
		
		
		
		
		

	
		
		
		
		
		
		//
		//----------------------
		//공백
		//----------------------
		//*******
		// *****
		//  ***
		//   *

		
		//개행 4줄
//		int i = 0;
//		while(i<4) {
//			
//			//공백 찍어내기
//			int b = 1;
//			while(b<=i) {
//				System.out.print(" ");
//				b++;
//			}
//			//별 찍어내기
//			int j = 6;
//			while(j>=i*2) {
//				System.out.print("*");
//				j--;
//			}
//			
//			System.out.println();
//			i++;
//		}

		
		
		
		
		
		
		//-------------------------
		// 높이 : h
		//-------------------------
		//*******
		// *****
		//  ***
		//   *
		
		//높이 : h
		//i(행)			j(공백)			k(별)
		//0				-				0-6
		//1				0-0				0-4
		//2				0-1				0-2
		//3				0-2				0-0
		//..
		//h-1
		//-----------------------------------------
		//i=0			j=0				k=0
		//i++			j++				k++
		//i<h			j<i				k<=((h-1)*2) - 2*i
		
		
		//개행 n줄입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.print("높이를 입력해주세요: ");
		int h = sc.nextInt();
		
		
		int i = 0;
		while(i<h) {
			
			//공백 삽입
			int j = 0;
			while(j<i) {
				System.out.printf(" ");
				j++;
			}
			//별 역행으로 삽입하기
			int k = 0;
			while(k<=((h-1)*2)-2*i) {
				System.out.printf("*");
				k++;
				
			
			}
			System.out.println();
			i++;
		}
		sc.close();
		
		
		
		
		
		
		//-------------------------
		// 높이 : 7
		//-------------------------
		//   *
		//  ***
		// *****
		//*******
		// *****
		//  ***
		//   *
		
		
		
		
		
		
		
		
		
		
		

		//-------------------------
		// 높이 : h
		//-------------------------
		//   *
		//  ***
		// *****
		//*******
		// *****
		//  ***
		//   *
		
		
		
		
		
		
		
		
		
		
		
		//-------------------------
		// 높이 : 7
		//-------------------------
		//*******
		// *****
		//  ***
		//   *
		//  ***
		// *****
		//*******

		
		
		
		
		
		
		
		
		

		//-------------------------
		// 높이 : h
		//-------------------------
		//*******
		// *****
		//  ***
		//   *
		//  ***
		// *****
		//*******
		
		
		
		
		
		
		
		
		
		
		//--------------------------------
		//--------------------------------
		//--------------------------------
		//--------------------------------
		//--------------------------------
		//--------------------------------
		
	}
	
	
	
	
	
	
	

}
