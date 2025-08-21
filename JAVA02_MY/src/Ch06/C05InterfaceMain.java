package Ch06;
//interface 다중상속 가능

interface A{}
interface B{}
class C{}
class D{}

class E extends C implements A,B //순서는 지켜야함 extends -> implements 순
{}

public class C05InterfaceMain {

	public static void main(String[] args) {

	}

}
