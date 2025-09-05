package Ch01;


//참조변수 VS 원시변수

//Object에 삽입하기 위한 Class
class Person{
	private String name;
	private int age;
	
	//모든 인자 생성자
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	//toString
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}	
	
	
}

public class C10EX {

	//객체 생성 없이 바로 사용하기 위해서
	
	//파라미터가 원시타입
	public static void func1(int num) { //파라미터 : Primitive(데이터값 저장)
		System.out.println(num);
	}
	
	//파라미터가 참조변수
	public static void func2(Object obj) {//파라미터 : Reference(주소값 저장) -- 원본은 다른 곳에 있고 데이터의 위치값이 저장됨
		System.out.println(obj);
	}
	
	//			  클래스 자료형(주소 전달)
	public static Object func3(String name, int age) {
		return new Person(name, age); //만들어진건 하위객첸데 상위객체로 던짐(UPCASTING)
		
	}
	
	
	public static void main(String[] args) 
	{
		func1(10);
		func2(new Person("홍길동",10));
		Object ob=func3("티모",100);
	}

}
