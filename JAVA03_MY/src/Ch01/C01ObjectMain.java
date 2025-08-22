package Ch01;

class A {

	int x;
	int y;
	
	@Override
	public String toString() { //Object로부터 물려받은 toString() 
		return "A [x=" + x + ", y=" + y + "]";
	}
}

public class C01ObjectMain {
//Object 클래스
//모든 클래스의 최상위 부모 클래스
//모든 클래스는 자동으로 Object를 상속

		 //★파라미터가 Object형태★ -> 모든 객체들을 받을 준비가 되어있다는 의미를 내포 - 하위객체가 들어옴(Upcasting)
							// -> 확장된 하위 객체 부분에 접근하려면 다운캐스팅이 필요함
// equals(Object obj) : 어떤 하위 객체가 만들어지던간에 equals로 받아낼 수 있음(by. Upcasting)
					//: 반환자료형 - boolean : 객체의 일치여부를 boolean형으로 반환

//getClass() : 객체의 클래스 정보 반환, 문서 기반으로 원하는 내용들을 꺼내 쓸 수 있음(==reflection)
//만들어진 클래스 자료형을 적절히 메모리 공간에 적재시키고 객체 생성 없이도 뽑아낼 수 있는 reflection이 getClass()를 이용함

//hashCode() : 객체의 위치값을 코드로 알 수 있음
//toString()  : "클래스 이름 @ 해시코드" 형식의 문자열 반환
			//: object로 받은것을 overriding해서 객체의 실제 값을 나타내는 문자열을 반환시킬 때 주로 사용함

	public static void main(String[] args) {

		A ob1 = new A(); //객체생성
		System.out.println(ob1); //참조변수를 보겠다 == toString();을 쓰겠다는 말과 동일
		System.out.println(ob1.toString());
		
		Object ob2 = new Object();
		System.out.println(ob2);
		System.out.println(ob2.toString());
			}

}
