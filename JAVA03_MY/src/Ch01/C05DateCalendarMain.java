package Ch01;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class C05DateCalendarMain {

	public static void main(String[] args) {
		//Date
//		Date d1 = new Date(); //현재 날짜 정보 파악하는 오래된 형태
//		System.out.println(d1);
//		System.out.println(d1.getYear()+1900); //deprecated : 앞으로 사라지게 될 기능이여서 밑줄로 그어짐
//										//1900을 더해줘야 현재 년도가 정확히 나옴
//		System.out.println(d1.getMonth()+1);//월의 숫자값이 0부터 시작하기에 1을 더해줘야함
//		System.out.println(d1.getDay()); //0-6(일-토)
//		System.out.println(d1.getHours());
//		System.out.println(d1.getMinutes());
//		System.out.println(d1.getSeconds());
//		System.out.println(d1.getTime());	//타임스탬프(HH:mm:ss) : 초단위로 다 묶어서 표시를 함
											//처리 순서를 확인하기 위해 타임스탬프, 전후 데이터를 처리하기도 함
		
		
		
		//Calendar
//		Calendar cal = Calendar.getInstance(); //하나의 객체가 만들어진 상태에서 주소값(?)을 받기 떄문에 Singleton 
//											   //현재의 시간을 반복적으로 확인하는 경우에는 Calendar가 유리 - r: Singleton pattern이기 때문
//		System.out.println(cal);
//								   //final static
//		System.out.println(cal.get(Calendar.YEAR));
//		System.out.println(cal.get(Calendar.MONTH)+1);
//		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
//		System.out.println(cal.get(Calendar.DAY_OF_WEEK)); //요일
//														   //1-7
//		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
//		System.out.println(cal.get(Calendar.MINUTE));
//		System.out.println(cal.get(Calendar.SECOND));
		
		
		//★LocalDateTime★ - 제일 자주 사용됨
		//애써 외울 필요는 없음
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now); //결과 : 2025-08-22T11:07:54.816773100
		
		//연, 월, 일, 시, 분, 초 가져오기
		int year = now.getYear();
		int month = now.getMonthValue(); 	// 월 (1~12)
		int day = now.getDayOfMonth();		// 일 (1~31)
		int hour = now.getHour();			// 시 (0~23)
		int minute = now.getMinute();		// 분 (0~59)
		int second = now.getSecond();		// 초 (0~59)
		DayOfWeek dayOfWeek = now.getDayOfWeek(); //요일에 대한 문자열 값 받아오기
		
		//결과 출력
		System.out.println("연: " + year);
		System.out.println("월 : " + month);
		System.out.println("일 : " + day);
		System.out.println("시 : " + hour);
		System.out.println("분 : " + minute);
		System.out.println("초 : " + second);
		System.out.println("요일 : " + dayOfWeek);
	}

}
