package Ch05Inheritance;

class Parent{
	void func1() {System.out.println("Parent's func1() call!");}
	void func2() {}
}

class Son extends Parent{ //Parent를 상속받았기에 func1()도 담겨있는 상태
	//func2를 재정의한 상황
	void func2() {System.out.println("Son's func2() call!");}
}

public class C08UpDownCastingMain {

	public static void main(String[] args) {
		//NoCasting
		Parent ob1 = new Parent();
		ob1.func1();
		
		System.out.println("---------------------------");
		//NoCasting
		Son ob2 = new Son();
		ob2.func1();
		ob2.func2();
		
		System.out.println("---------------------------");
		//UpCasting
		Parent ob3 = new Son();
		ob3.func1();
		ob3.func2(); //상속관계에서 상위클래스에서 없는 게 만들어지면 업캐스팅에서 접근 불가능 - 다운 캐스팅 해야함
					 //but, 함수가 재정의된 상태라면 업캐스팅되어있더라도 접근이 가능함
		
		//Upcasting 된 상태에서
		//확장된(멤버추가) 멤버변수 접근 가능한가? x -> Downcasting해야 가능
		//확장된(멤버추가) 멤버함수 접근 가능한가? x -> DownCasting해야 가능
		//재정의된 멤버함수 접근 가능한가? O!!!
		
	}

}
