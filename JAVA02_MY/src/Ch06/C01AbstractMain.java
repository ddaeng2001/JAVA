package Ch06;

//일반 클래스 상속관계
class Parent{
	void func() {}
}

class Son extends Parent{
	void func() {System.out.println("Son's func() call!");}
}

//추상 클래스 상속관계
//미완성된 함수를 가짐(함수의 헤더만 존재, 로직{}을 구현하지 X) 
abstract class Parent2{
	abstract void func();  //추상메서드(미완성된 함수, {}로직이 없는)
	//일부러 미완성한 상태야라는 걸 알려주기 위해 abstract 붙이기
}
//미완성 함수이기 때문에 하위클래스가 추상메서드를 강제로 완성시켜야지 객체 생성 가능함(강제성 부여)


//추상 클래스를 사용하는 이유? 
//1. 메서드 구현의 강제성 부여
//2. 미완성된 함수를 포함하고 있기 때문

//추상 클래스만으로 객체 구현 불가능 - 메서드를 완성시켜야함

class Son2 extends Parent2{

	@Override
	void func() {
		
	}
	
}

public class C01AbstractMain {

	public static void main(String[] args) {
		//일반 클래스 상속관계
		Parent ob1 = new Parent(); //상위클래스형으로 객체 생성 O
		Son ob2 = new Son();	   //하위클래스형으로 객체 생성 O
		Parent ob3 = new Son();	   //UPCASTING 연결 o
		ob3.func(); 			   //재정의된 func() 접근 가능
		
		System.out.println("---------------------");
		
		//추상 클래스 상속관계
		//추상 클래스로 객체 생성은 불가능함!
//		Parent2 obj1 = new Parent2(); //미완성된 함수를 하나 이상 가지고 있기에 함수를 완성시키지 않으면 객체 생성X
		Son2 obj2 = new Son2(); 	  //하위클래스형으로 객체 생성 O
		//추상메서드를 완성시킨 클래스
		Parent2 obj3 = new Son2();	  //UPCASTING O
		obj3.func();				  //재정의된 함수(미완성 -> 구현된 메서드) 접근 가능
		
		
		
	}

}
