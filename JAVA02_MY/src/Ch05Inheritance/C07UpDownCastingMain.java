package Ch05Inheritance;

class A{
	int a;
	
	//toString 재정의
	@Override
	public String toString() {
		return "A [a=" + a + "]";
	}
	
}
class B extends A{
	int b;
	
	//toString 재정의
	@Override
	public String toString() {
		return "B [b=" + b + ", a=" + a + "]";
	}
	
}
class C extends A{
	int c;
	
	//toString 재정의
	@Override
	public String toString() {
		return "C [c=" + c + ", a=" + a + "]";
	}
	
}
class D extends B{
	int d;
	
	//toString 재정의
	@Override
	public String toString() {
		return "D [d=" + d + ", b=" + b + ", a=" + a + "]";
	}
	
}
class E extends B{
	int e;

	//toString 재정의
	@Override
	public String toString() {
		return "E [e=" + e + ", b=" + b + ", a=" + a + "]";
	}
	
}
class F extends C{
	int f;
	
	//toString 재정의
	@Override
	public String toString() {
		return "F [f=" + f + ", c=" + c + ", a=" + a + "]";
	}
	
}
class G extends C{
	int g;
	
	//toString 재정의
	@Override
	public String toString() {
		return "G [g=" + g + ", c=" + c + ", a=" + a + "]";
	}
	
}


public class C07UpDownCastingMain { //코드로 업다운캐스팅을 쓰는 이유 확인하기
	
										 //상속관계에서 제일 위에 있는 클래스 A : 모든 하위 클래스 객체들을 obj에 받아낼 수 있음 - UpCasting
	public static void UpDownCastTestFunc(A obj){//객체 없이도 사용가능
										 //A obj = new A(); - noCasting
										 //A obj = new B(); - upCasting
										 //A obj = new C(); - upCasting
		obj.a = 100; 
//		obj.b = 200; //b는 upcasting된 상태라서 b에 접근 불가능
		
//		instanceOf라는 예약어로 어느 클래스인지 선별해서 downcasting해야함
		if(obj instanceof B) { //obj를 연결하는 객체가 B로 만들어진 객체면
		B down = (B)obj;
		down.b = 200;
		}
		
		if (obj instanceof C) {
			C down = (C)obj;
			down.c=300;
		}
		
		if (obj instanceof D) {
			D down = (D)obj;
			down.d = 400;
		}
		
		if (obj instanceof E) {
			E down = (E)obj;
			down.e = 500;
		}
		
		if (obj instanceof F) {
			F down = (F)obj;
			down.f = 600;
		}
		
		if (obj instanceof G) {
			G down = (G)obj;
			down.g = 700;
		}
		
		System.out.println(obj);
	}

	
	public static void main(String[] args) {
		//
		UpDownCastTestFunc(new A());
		UpDownCastTestFunc(new B());
		UpDownCastTestFunc(new C());
//		UpDownCastTestFunc(new D());
//		UpDownCastTestFunc(new E());
	}

}
