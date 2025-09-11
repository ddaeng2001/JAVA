package Ch19;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

//제공되는 함수형 인터페이스들
//Function<T, R>:
//apply 메서드를 가지고 있어서 하나의 인자(T : 파라미터형의 자료형)를 받아서 결과(R)를 반환하는 함수형 인터페이스 입니다.

//Supplier<T>:
//get 메서드를 가지고 있어서 어떠한 인자도 받지 않고 결과만을 제공하는 함수형 인터페이스 입니다.
//T는 반환자료형

//Consumer<T>:
//accept 메서드를 가지고 있어서 어떠한 인자를 받아서 결과를 반환하지 않는 함수형 인터페이스 입니다.
//T는 파라미터형

//Predicate<T>:
//test 메서드를 가지고 있어서 어떠한 인자를 받아서 불리언 결과를 반환하는 함수형 인터페이스 입니다.
//
//UnaryOperator<T>:
//apply 메서드를 가지고 있어서 하나의 인자를 받아서 동일한 타입의 결과를 반환하는 함수형 인터페이스 입니다.
//
//BinaryOperator<T>:
//apply 메서드를 가지고 있어서 두 개의 인자를 받아서 동일한 타입의 결과를 반환하는 함수형 인터페이스 입니다.
//처음부터 파라미터형 2개를 받겠다는 의미

public class C03FunctionalInterfaceMain {

	//01 Function<T,R>
	//함수형 인터페이스로서 미완성된 함수가 있음
	//파라미터가 Integer 자료형으로 받고 결과(Integer형)(R)를 반환함
//	public static Function<Integer, Integer> func1=(x)->{return x*x}; - 원본
	public static Function<Integer, Integer> func1=x-> x*x;
	
	//02
	public static Function<Integer, Integer> func2=x-> x+x;
	
	//03 자료형 다양하게 해보겠읍니다.
	public static Function<List<Integer>, Integer> func3=x->
														//x는 List<Integer>자료형을 지님
	x.stream().reduce(0,(sum,el)->{return sum+el;});;
//		return x.stream().reduce(0, (sum,el)->{return sum+el;}); - 원본
			 //x.stream().reduce(누적변수초기값, (누적변수,요소변수)->{return 누적연산;});					
			 //reduce에 맞는 람다식 전달. 첫번째 인자는 (누적변수의 초기값을 지정,(누적변수,요소변수)->{return 누적연산;}); 
		
	
	//04 들어오는 값 중 Integer만 선별해서 누적합 구하기
	public static Function<List<Object>, Integer> func4=(li)->{
						 //List를 Object형태로 받아내기
		
		//01 List의 각 요소 중 Integer만  filter
		return li.stream()
			.filter((el)->{return el instanceof Integer;})
					//list내의 각 요소를 el(UPCASTING된 OBJECT 자료형)로
								//요소 el이 Integer인지 필터링(형변환X이 아닌 조건식 생성)
		
		//02 필터링 된 Integer의 재구성(map)
			.map((el)->{return (Integer)el;}) //el은 Object로 Upcasting된 상태이기에 다운캐스팅을 해줘야 함
											  //Object는 상위 타입이기 때문에 Integer의 고유 기능을 알 수 없는 상태이기에
											  //Integer 고유 기능을 쓰기 위해 다운캐스팅이 필요함
		
		
		//03 reduce를 통한 누적합 구하기
			.reduce(0,(sum,el)->{return sum+el;});
		
	};
	
	//05 
	//반환자료형 지정 및 들어오는 여러 list형 데이터 중 문자열만 추출, //들어오는 Object 중 String 형 데이터만 추출해내서 하나로 묶을 예정
			//반환자료형도 Object로 바뀐 상태
	public static Function <List<Object>, List<String>> func5=(li)->{
	
		
		return li.stream()
				//선별 - String인가
				.filter((el)->{return el instanceof String;})
				//재구성
				.map((el)->{return "-" +(String)el + "-";})
				//list<String>형으로 콜렉팅
				.collect(Collectors.toList()); // List형으로 반환됨
	};
	
	//06 
	//func1에 func2 연결(func1의 return값을 func2의 인자값으로 전달해서 결과를 return)
	public static Function<Integer, Integer> func6 = func1.andThen(func2);
													//func1 실행 후 func2가 실행됨
													//andThen은 계속 붙여서 사용이 가능함
	
	//07
	//func2에 func1을 연결
	public static Function<Integer, Integer> func7 = func2.andThen(func1);
	
	//08
	//func3에 func1 그리고 func2를 연결
	public static Function<List<Integer>, Integer> func8 = func3.andThen(func2).andThen(func1);
							//func3의 T
	
	//09
	//반환자료형을 함수형인터페이스로 == 반환은 람다식으로!
	//함수형 인터페이스를 거치게 되면 함수를 생성해주는 함수로 변환됨
	public static Function<Integer, Function<Integer, Integer>> func9 = (x)->{
	
		//
		System.out.println("func9 x: " + x); //func9의 x값 확인
		return (n)->{
			//
			System.out.println("func9 n : " + n); //func9의 n값 확인 - 함수의 위치정보가 return됨
			return n+x; //누적합
			};
		};
		
	//10
	//함수형 인터페이스를 반환자료형으로 받는(2)(9번과 동일하나 간결화시킴)
		public static Function<Integer, Function<Integer, Integer>> func10 = x->y->x+y;
		//첫번째 apply(10)을 x가 받고 2번째 apply를 썼을 때 첫번째 apply값은 그대로 유지된 채로 두 번째 apply의 인자만 변함
		//즉 x에 10이 들어간 상태(유지된 상태)로 == x에 10이 삽입된 상태
			
	
	public static void main(String[] args) {
		
		//01
		System.out.println(func1.apply(10)); //01 결과 : 100(10*10)
		//02
		System.out.println(func2.apply(10)); //02 결과 : 20(10+10)
		//03
		System.out.println(func3.apply(Arrays.asList(10,20,30,40))); //03 결과 : 100(10+20+30+40)
										//asList: 배열을 리스트로 변환시키는 함수
		//04
		System.out.println(func4.apply(Arrays.asList(11, 10.5, "TEST", true, new StringBuffer(),20, 40)));
		//결과 : Integer형만 걸러서 누적합을 구함 11+10.5+20+40, 71
		
		//05
		System.out.println(func5.apply(Arrays.asList("10", 55, "집가자!", 7, true)));
		//문자열만 추출해서 List로 출력/ 결과 : [-10-, -집가자!-]
		
		//06
		System.out.println(func6.apply(10));
		//결과 : 200
		//func1에서의 결과값 100이 func2의 인자값 즉 x에 들어와서 함수가 실행되고 100+100의 결과값을 리턴함
		
		//07
		System.out.println(func7.apply(10));
		//결과 : 400
		
		//08
		System.out.println(func8.apply(Arrays.asList(10,20,30,40)));
		//결과 : 40000
		//func3의 누적합을 func2에 삽입한 후 결과물을 func1이 인자값으로 받아서 결과를 return함

		//09
		System.out.println(func9.apply(10).apply(20));
							//func9.apply(10)은 y->10(x)+y라는 새로운 람다식을 반환
							//람다식 자체가 Function 타입이므로 .apply()를 사용할 수 있는 객체가 됨
		//결과값: 30

		//10
		System.out.println(func10.apply(10).apply(20));
		//결과값: 30
	}

}
