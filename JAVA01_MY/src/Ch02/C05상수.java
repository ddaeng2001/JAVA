package Ch02;

public class C05상수 {

	public static void main(String[] args) {
		//상수 : 항상 같은 수
		
		//리터럴 상수 : 이름부여X, 상수 Pool에 저장, 단순한 수치, 값
		//심볼릭 상수 : 이름부여O, final 예약어 사용 == 사용하는 이유? 가독성 향상을 위해 (ex> PI = 3.14)
		
		//리터럴 접미사 : 리터럴 상수가 저장되는 자료형을 지정
		//l,L : long 자료형
		//f,F : float 자료형
		
		int a = 'a';
		System.out.println((int)a);
		System.out.println((char)a);

		int n1 = 100;	//100은 리터럴 상수
		final int n2 = 200; //n2는 심볼릭 상수
		
		final double PI = 3.14; // final == 값 변경을 막기 위해 고정시켜놓음 이름 자체가 여러가지 연산에 사용될 때 가독성 향상을 위해서!
		
		double result = PI*4*4;
		
//		double a = 1e-3;
//		System.out.println(a);
		
		
		확인문제2
		맞는 코드인지 틀린 코드인지 확인 
		byte var = 200;							( x	) //리터럴 상수를 담는 과정에서 문제 발생
		char var='AB';							( x	) //char는 문자 한 개만 담을 수 있음
		char var=65;							( o )
		long var=50000000000;					( x	) //리터럴 상수가 담기지 않음
		float var = 3.14						( x	) //;와 f(접미사) 생략됨
		double var = 100.0						( o	)
		String var = "나의직업은 "개발자" 입니다.";	( x ) //이스케이프 문자로 사용할려면 \필요함
		boolean var = 0;						( x ) //True or False값은 숫자형태로 표시할 수 없음(in JAVA)
		int v2 = 1e2; 1*10^2					( x ) //큰 공간에 있는 1e2를 작은 공간 in에 넣으려고 함
		float = 1e2f;	 						( x	) //담는 공간이 x
				1곱하기 10의 2승
		
		
		
		
	}

}
