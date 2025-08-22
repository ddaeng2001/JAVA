package Ch01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class C06SimpleDateFormatMain { //날짜 포맷을 정해놓고 그대로 날짜를 받는 작업 -- ★★★Ch01에서 제일 중요한 pt!★★★

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		System.out.println("YYYY/MM/DD 입력 : ");
		String ymd = sc.next();
		
		
		//DATE를 이용한 포매팅!
		//포매터 객체 생성(입력용) : 데이터를 바꿔주기 위함
		SimpleDateFormat fmtin = new SimpleDateFormat("yyyy/MM/dd"); //y,M,d,h,m,s - 이 포매터대로 입력되는지 확인
		//문자열을 날짜형태로 바꿔주는 포매터
		Date date = fmtin.parse(ymd);
		System.out.println(date); //결과값 : Sat Aug 02 00:00:00 GMT+09:00 2025
		
		//포매터 객체 생성(출력용) : 외부로 내보낼 때의 출력포매터 생성
		SimpleDateFormat fmtout = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(fmtout.format(date)); //결과값 : 2025-08-02
		//외부용을 문자열로~!
		
		
	}

}
