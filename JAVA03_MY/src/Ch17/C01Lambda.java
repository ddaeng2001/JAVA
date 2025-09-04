package Ch17;

import java.util.ArrayList;
import java.util.List;

class Person
{
	private String name;
	private int age;
	private String addr;
	
	//기본 생성자
	public Person(){}

	//모든 인자 생성자
	public Person(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	//Getter/Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	//toString()
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}
	
	
	
}

public class C01Lambda {

	//()->{} 람다함수(익명함수), 스트림함수와 많이 사용 stream.forEach(()->{}) // ()->{}:로직을 전달받는 함수 - 콜백함수
	
	
	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		//Collection은 기본적으로 stream함수 제공 == 자료값은 Lambda식으로 받는 다
		list.add(new Person("홍길동",55,"대구"));
		list.add(new Person("티모",100,"부산"));
		list.add(new Person("김범수",35,"서울"));
		
		list.stream().forEach((item)->{System.out.println(item);}); //stream생략가능
							//요소 하나하나를 item으로 받기
		System.out.println("----------------");
		list.sort((a,b)->{return b.getAge()-a.getAge();});
											//b-a : 내림차순, getAge() 나이만 비교
		//가지고 있는 리스트의 정렬을 해줌
		
		list.stream().forEach((item)->{System.out.println(item);});

	}

}
