package Ch06;

import java.util.Scanner;

public class C02SWITCH {

	public static void main(String[] args) {
		
		//if보다 조건식을 제한의 범위가 좁음
		//조건식이 아닌 상수값만 삽입 가능

		//유의사항
		//break문이 없으면 1을 넣어도 마지막까지 결과값을 도출해서 C가 나옴
		//==break를 생략하면 다음 case가 실행되는 fall-through 현상 발생
		
		Scanner sc = new Scanner(System.in);

		int ranking = sc.nextInt();
		char medalColor;
		switch (ranking) {
		case 1:
			medalColor = 'G';
			System.out.println("메달색상 : G");
			break; //switch 전체 문장을 벗어남
			
		case 2:
			medalColor = 'S';
			System.out.println("메달색상 : S");
			break;
		case 3:
			medalColor = 'B';
			System.out.println("메달색상 : B");
			break;
		default:
			medalColor = 'C';
			System.out.println("메달색상 : C");
		}
		System.out.println(ranking + " 등 메달의 색은 " + medalColor + " 입니다.");
	}
}