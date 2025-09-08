package Ch19;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//함수형 인터페이스 명시를 위한 Annotation
@FunctionalInterface

interface Func1{
	void say(String message); //인터페이스는 추상 메서드가 하나이상 필수!
	
}

@FunctionalInterface

interface Func2{
	int sum(Integer ...args); //sum의 결과 반환(Integer 내용 받아냄)
	
}

@FunctionalInterface

interface Func3{
	List<Integer> sum(Object ...args); //sum의 결과 반환(Integer 내용 받아냄) , args : 어떤 것이든 받아낼 수 있는 가변인자 삽입
					  //Object화해야 어떤 것이든 다 받아낼 수 있음
}
public class C01FunctionalInterfaceMain {

	public static void main(String[] args) {
		
		//01
		
		Func1 func1 = (message)->{System.out.println(message+"_!");};

		func1.say("HELLO WORLD");
		
		//들어오는 인자와 사용하는 함수가 1개면 람다식 축약 가능!
		Func1 func1_2 = System.out::println;
		func1_2.say("HELLO WORLD");
		
		
		
		
		//02
		Func2 func2 = (arr)->{
					//arr : Interger...args
			int sum=0;
			for(Integer n : arr)
				sum+=n;
			return sum;
		};
		System.out.println(func2.sum(10,20,30,40,50,60)); //결과 : 210(합)
		
		
		
		
		//03
					
		Func3 func3 = (arr)->{	//arr : 데이터가 Object배열로 들어올 에정
			//Stream함수를 이용해 내용을 선별해서 return
			return Arrays.stream(arr) //배열 Object를 stream함수로
						
//					.filter((obj)->{return obj instanceof Integer;}) //Integer인지 먼저 선별
						//축약
						.filter(obj->obj instanceof Integer)
//						.filter(instanceof::Integer)
						
						//Integer가 맞다면 map을 통한 재구성
						.map((obj)->{return (Integer)obj;})	//Integer로 다운캐스팅
															//코드 라인 간결화를 위한 사용
						//축약ver
						.map(obj->(Integer)obj)
						
						.collect(Collectors.toList());
		};
		System.out.println(func3.sum(10,20,30.5, "홍길동", true)); //결과 : [10, 20]
		
		
		
		
		
		
		
	}

}
