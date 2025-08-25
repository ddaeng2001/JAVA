package Ch04;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Person{
	String name;
	int age;
	//생성자
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	//toString
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//equals를 재정의해서 name,age가 동일하면 true / 아니면 false 
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person down = (Person)obj;	//downcasting
			return this.name.equals(down.name) && this.age == down.age;
		}
		return false;
	}
	
	//hashCode() 재정의 -> HashSet의 동등객체 판단처리
	@Override
	public int hashCode() {
		return Objects.hash(this.name,this.age); //속성값 기반으로 HaschCode값 수정
	}
	
	
}
public class C05SetMain {

	public static void main(String[] args) {
		Set<Person> set = new HashSet(); //※※Hash를 붙이는 함수를 사용하는 경우 equals와 HashCode를 재정의해줘야 같은 객체임을 판단할 수 있음!※※
			
		Person ob1 = new Person("홍길동",55);
		Person ob2 = new Person("남길동",35);
		Person ob3 = new Person("홍길동",55);
		
		System.out.println(ob1.equals(ob2)); 
		System.out.println(ob1.equals(ob3)); //새로운 객체 생성 == 참조변수 새로 생성이기에 ob1과 ob3의 값은 다름
		
		set.add(ob1);	
		set.add(ob2);
		set.add(ob3); 	
//
		System.out.println("SIZE : " + set.size());
	}

}
