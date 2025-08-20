package Ch05Inheritance;
//is a 관계를 대입해봤을 때 성립되면 상속관계로 간주
class Employee {
	public String name;
	protected int age; //상속관계에 있는 하위 클래스에서도  접근이 가능함 : protected(~ 표시)
	protected String addr;

	//기본생성자
	public Employee() {}
	
	//모든 인자 생성자
	public Employee(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	//getter - setter 함수 생성
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

}

class Parttimer extends Employee {
	private int hour_pay;

	//기본생성자
	public Parttimer() {}
	
	//모든 인자 생성자
	public Parttimer(String name, int age, String addr, int hour_pay) {
		super(name, age, addr); //상위 클래스 생성자 호출하는 방법 super()
		this.hour_pay = hour_pay;
	}

	//setter함수 생성
	public void setHourPay(int hour_pay) {
		this.hour_pay = hour_pay;
	}

	//toString()
	@Override
	public String toString() {
		return "Parttimer [hour_pay=" + hour_pay + ", name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}


}

class Regular extends Employee {

	private int salary;
	
	//기본생성자
	public Regular() {}
	
	//모든 인자 생성자
	public Regular(String name, int age, String addr, int salary) {

		super(name, age, addr);
		this.salary = salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	//toString()
	@Override
	public String toString() {
		return "Regular [salary=" + salary + ", name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}
}

public class C05Ex {

	public static void main(String[] args) {
		Parttimer emp1 = new Parttimer("홍길동", 25, "대구", 20000);
		emp1.setAge(100);
		
		Regular emp2 = new Regular("서길동", 45, "울산", 50000000);
		System.out.println(emp1);
		System.out.println(emp2);
	}

}
