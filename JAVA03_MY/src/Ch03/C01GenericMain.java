package Ch03;

//제너릭 타입을 제한하고 싶을때?
//허용할 클래스의 상위 클래스 만들기 for 제너릭 타입 제한을 위한
class 호빵재료{ //팥 슈크림 야채를 상속관계로 묶기
	
}

class 팥 extends 호빵재료{

	@Override
	public String toString() {
		return "단팥";
	}

	
	}
	

class 슈크림 extends 호빵재료{

	@Override
	public String toString() {
		return "슈크림";
	}
	
}
class 야채 extends 호빵재료{

	@Override
	public String toString() {
		return "야채";
	}
	
}

//제너릭 타입을 제한하고 싶을때?
class 민트초코{
	
	@Override
	public String toString() {
		return "민트초코";
	}
	
}
//class 호빵<T>//제너릭 타입:<T>삽입

class 호빵<T extends 호빵재료>{ //제너릭 타입 제한
		  //제너릭 타입을 호빵재료의 상속관계까지만 허용함
	private T 재료; //T가 팥 or 슈크림 or 야채가 됨
	
	public 호빵(T 재료) {
		this.재료 = 재료;
	}
	
	
	//toString 재정의
	@Override
	public String toString() {
		return "호빵 [재료=" + 재료 + "]";
	}
	
}
public class C01GenericMain {

	public static void main(String[] args) {
		호빵<팥> ob1 = new 호빵<팥>(new 팥());
					 //new 호빵<핕> : 타입 명시
								//new 팥() : 객체 생성
					//팥이라는 타입이 들어오면 팥 객체가 생성되도록!
		System.out.println(ob1);
		
		호빵<슈크림>ob2 = new 호빵<슈크림>(new 슈크림());
		System.out.println(ob2);
		
		호빵<야채> ob3 = new 호빵<야채>(new 야채());
		System.out.println(ob3);
		
		호빵<민트초코> ob4 = new 호빵<민트초코>(new 민트초코());
		System.out.println(ob4);

	}

}
