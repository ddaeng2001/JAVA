package Ch03;

public class C07TypeChange_String {

	public static void main(String[] args) {
		//-------------------------
		// 문자열 + 문자열
		//-------------------------
//		System.out.println("문자열 1" + "문자열 2");
//		System.out.println("문자열 1" + "문자열 2");		//문자열 + 문자열
//		System.out.println("문자열1" + ',' + "문자열2"); 	//문자열 + 문자 + 문자열
//		System.out.println("문자열" + 2 ); 				//문자열 + 숫자 -> 숫자를 문자열로 해석! 단순연결
//		System.out.println("문자열" + ',' + '!');
//		System.out.println(',' + '!' + "문자열"); //문자열과 문자가 만나면 문자열이 되지만 문자와 문자가 만나면 숫자로 취급해서 덧셈연산결과값을 도출
//						  //결과 : ','+'!' => 77
//		System.out.println("문자열1" + "문자열2");
		
		
		//--------------------------
		//문자열 -> 숫자형 변환
		//--------------------------
		//문자열 -> 숫자형으로 변환(정수)
		//int n1="10";
		System.out.println("10"+"20"); 		//문자열 연결
		int n1 = Integer.parseInt("10");	//웹개발코드 시 폼(프론트엔드)으로부터 전달받은 값은 다 문자열임
						//"문자"에 갇힌 숫자를 정수형으로 변환시켜줌 : parseInt
						//""내에는 순수하게 정수가 들어가야함 ex>!를 삽입 시 오류!
		//원시타입 데이터를 객체화 시키거나 반대의 상황
											
		int n2 = Integer.parseInt("20");
		System.out.println(n1+n2);
		
		//문자열 -> 숫자형으로 변환(실수)
		double n3 = Double.parseDouble("10.5");
		double n4 = Double.parseDouble("20.4");
		System.out.println(n3+n4);
		
		short n5 = Short.parseShort("5");
		short n6 = Short.parseShort("6");
		
		System.out.println(n5+n6);
	}

}
