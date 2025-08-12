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
		Scanner sc = new Scanner(System.in);
		System.out.println("단을 입력해주세요(2단부터 시작): ");
		int ndan = sc.nextInt();

		int dan = 2;
		//n>2 조건
		if(ndan<2) {
			int temp = ndan;
			ndan = dan;
			dan = temp;
			System.out.println("2보다 큰 수를 입력해주세요: ");
			ndan = sc.nextInt();
		}
		
		
		
		while(dan <= ndan) {
			int i = 1;
			while(i<10) {
				System.out.printf("%d X %d = %d\n",dan,i,dan*i);
				i++;
			}
			dan++;
			System.out.println();
		}
		
		
		
		
		
		
		
		//n단 - m단 (n<m)
		
		
	}

}
