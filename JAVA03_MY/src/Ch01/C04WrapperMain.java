package Ch01;

public class C04WrapperMain { //★★개념중요!★★

	//객체 지향에서 원시타입이 쓰이지 않는 경우가 더러 있기 때문에 wrapperclass를 사용함
	//원시타입(ex>int n = 10)을 객체형 데이터로 바꿀 때 사용됨
	//기본 자료형을 객체 형태로 포장해줄때 
	//쓰는 이유 : 원시타입을 지원하지 못하는 객체지향 문법들이 있기 때문에 wrapper클래스로 원시타입의 값을 대체해줌
			//: null체크 시 유리함
	
	//ex> int(원시타입) -> Integer(래퍼 클래스)
	//ex> long(원시타입) -> Long(래퍼 클래스, 제너릭 값)
	
	public static void main(String[] args) {
		//Boxing(기본 자료형 -> wrapper class)
		Integer ob1 = new Integer(100); //버전이 올라가면서 이건 안 쓴다는 밑줄의 의미(deprecated) : 앞으로 사라지게 될
		//리터럴 100을 Integer로 포장한다!
		Integer ob2 = new Integer("100"); //문자에 갇혀있는 숫자도 Integer로 포장
		Integer ob3 = Integer.valueOf("300");
		System.out.println(ob1 + ob2 + ob3);
		
		//UnBoxing
		int n1 = ob1.intValue();
		int n2 = ob2.intValue();
		int n3 = ob3.intValue();
		System.out.println(n1 + n2 + n3);
		
		//Auto Boxing
		Integer ob4 = 100;
		//wrapper class = int(원시타입)여서 형이 다른데 자동으로 형변환을 해줌
		//그래서 굳이 integer를 구별해서 boxing/unboxing이 필요가 없음
		
		int n4 = ob1 + ob2 + ob3 + ob4;

	}

}
