package Ch04;

import java.util.Scanner;

public class C04Scanner {

	public static void main(String[] args) {
		// 이름을 입력하세요? 홍길동
		// 홍길동 님의 나이를 입력하세요? 35
		// 홍길동 님의 주소를 입력하세요? 대구광역시 달서구 000
		// 홍길동 님의 나이는 35세 주소는 대구광역시 ~~ 입니다
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요: ");
		String name = sc.next();	//표준 입력값을 받는 부분
									//띄어쓰기를 인식하지 X 
		System.out.printf("%s님의 나이를 입력하세요: ", name);
		int age = sc.nextInt(); //주의할 점 : 그전의 엔터값을 값으로 인식해버리기 때문에 sc.nextLine();이 필요
		System.out.printf("%s님의 주소를 입력하세요: ", name);
		sc.nextLine();
		String addr = sc.nextLine();
		
		System.out.printf("%s님의 나이는 %d세 주소는 %s입니다.", name,age,addr);
		sc.close();
	
	}

}







