package Ch18;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Person {
	protected String name; //protected : 상속 관계에 있는 하위 클래스가 접근 가능하도록 함
	protected Integer age;

	// 디폴트 생성자
	public Person() {
	}

	// 모든 인자 생성자
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	// getter and setter
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

	// toString()
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}

class Employee extends Person{
	private String department;
	private String role;
	
	//디폴트 생성자
	public Employee() {}
	
					//Person 객체 -> Employee로 변환하기 위한 작업!
	public Employee(Person person) { //Point!! : Person을 받도록 함
		this.name = person.getName();
		this.age = person.getAge();
		//super(이름, 나이)를 전달해도 ㄱㅊ!
	}
	
	//모든 인자 생성자
	public Employee(String department, String role) {
		super();
		this.department = department;
		this.role = role;
	}
	
	//getter and setter
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	//toString()
	@Override
	public String toString() {												//상속받은 부분(name,age)
		return "Employee [department=" + department + ", role=" + role + ", name=" + name + ", age=" + age + "]";
	}

	

	
	
	
}

public class C01STREAMMAIN { // 기존 컬렉션 재구성 시 사용되는 Map

	public static void main(String[] args) {
		List<Integer> list  = Arrays.asList(1,2,3,4,5);
									//배열을 List로 만드는 작업
		System.out.println(list); //결과 : [1,2,3,4,5]
		
		//1.filter
		//스트림함수를 컬렉션에서 쓰기 위해서는 .stream()
		List<Integer> list2 = list.stream()	//반환형이 Stream이기에 재구성을 위해서는 원하는 형태로 변환시켜야함!
			.filter((n)->{return n%2==0;})	//람다식으로 처리
					//하나씩 들어오는 요소 : n
						//짝수만 걸러내기
			.collect(Collectors.toList()); //어떤 자료형으로 바꿀건지 지정 가능
		System.out.println(list2); //결과 : [2,4]
		
		
		//2.map
		List<Integer> list3 = list.stream()
			.filter((n)->{return n%2==1;})
			.map((n)->{return n*n;}) //기존 요소의 새로운 요소 추가 가능 - Map을 통해 요소들을 재구성해서 곱셈함
					//반환자료형이 Stream이기에 마지막 작업을 위해서는  Collectors로 받기
			.collect(Collectors.toList());
		System.out.println(list3); //결과 : [1,9,25]
		
		//3.sorted
		//정렬이 안된 상태에서 정렬하는 과정
		List<Person> list4 = Arrays.asList(
				new Person("홍길",45),
				new Person("김범수수",35),
				new Person("유재석",25),
				new Person("서장훈훈",65),
				new Person("남",75)
				
				);
		System.out.println(list4); //정렬이 되어있지 않은 상태
		
		//나이순으로 내림차순 정렬해서 출력 .sorted(()->{}) //내림차순 
		List<Person> list5 = list4.stream()
			.sorted((a,b)->{return b.getAge()-a.getAge();})	//나이를 비교해야하기 때문에  getAge();필요!
			.collect(Collectors.toList());
		
		list5.forEach(System.out::println);
		
		
		//나이만 재구성
		List<Integer> list6 = list4.stream()
//			.map((el)->{return el.getAge();}) //요소단위 return - Person객체를 Age로만 뽑아서!
//			.map(el->el.getAge());	//축약1
			.map(Person::getAge) 	//축약 2: getAge()와 같이 하나의 메서드만 쓴다면 가능한 축약
					 //:: - 메서드 참조 연산자
			.collect(Collectors.toList());
		System.out.println(list6); 	//결과 : [45,35,25,65,75]
		
		//재구성 시 Stream함수 사용하면 빠른 동작 가능해짐!
		
		
		//메서드 참조(::)이용해보기
		List<Integer> list7 = list4.stream()
//			.map((el)->{return el.getName();})	
			//메서드 참조(::) 이용 - Person
			.map(Person::getName)
//			.map((el)->{return el.length();})	//Person객체의 이름 갯수 확인
			//메서드 참조(::)이용 - String (r:getName으로 이미 이름을 꺼내온 상황이기 때문에!)
			.map(String::length)
			.collect(Collectors.toList()); //Collector가 List로 변환되는 작업
		System.out.println(list7);

		
		//생성자 사용(with 메서드 참조)
		//Person을 Employee의 상속관계로 둔 후 작업
		List<Employee> list8 =
		list4.stream() //list4==<Person>
			//재구성을 위한
//				.map((el)->{return new Employee(el);}) //Employee에 Person을 받도록 하는 생성자 존재
				.map(Employee::new) //Employee에 Person을 받도록 하는 생성자 존재
							//new : 관련된 생성자가 존재한다면 생성자 참조(Employee::new)문법을 사용가능!
				.collect(Collectors.toList()); 
			//이름과 나이를 받는 생성자 필요함(위쪽에 작업해놓음)
		list8.forEach(System.out::println);

	}

}
