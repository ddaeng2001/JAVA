package Ch01;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class C07LocalDateTimeFormatMain {

	public static void main(String[] args) {

		//연, 월, 일까지만!
//		Scanner sc = new Scanner(System.in);
//		System.out.println("YYYY/MM/DD 입력 : ");
//		String ymd = sc.next();
//		
//		//포매터 객체 생성(입력용)
//		DateTimeFormatter fmtin = DateTimeFormatter.ofPattern("yyyy/MM/dd");

//		//Local Date용
//		LocalDate date = LocalDate.parse(ymd,fmtin);
//		//LocalDate도 객체이기에 쓸 수 있는 기능이 다양함 ex> 날짜계산
//		System.out.println(date); 
//		
//		//포매터 객체 생성(출력용)
//		DateTimeFormatter fmtout = DateTimeFormatter.ofPattern("yyyy★MM★dd");
//		System.out.println("출력포맷 : " + fmtout.format(date));
//		
		
//--------------------------------------------------------------------		
		
		//LocalDateTime
		//연,월,일,시간,분,초까지!
		Scanner sc = new Scanner(System.in);
		System.out.println("YYYY/MM/DD HH:MM:SS 입력 : ");
		String ymd = sc.nextLine();
		
//		//포매터 객체 생성(입력용)											  //대소문자 구별!
		DateTimeFormatter fmtin = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime date = LocalDateTime.parse(ymd,fmtin);
		System.out.println(date); 
		
//		LocalDateTime의 format 사이에는 T가 삽입되어있음
//		2025-08-08T03:03:03
		
//		포매터 객체 생성(출력용)
		DateTimeFormatter fmtout = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss");
		System.out.println("출력포맷 : " + fmtout.format(date));
		
		
		//포맷이 다르면 java, db에 맞게 처리하는 것이 필요함
	}

}
