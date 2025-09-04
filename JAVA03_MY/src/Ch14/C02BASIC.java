package Ch14;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

//reflection을 이용해서 특정 클래스의 함수 실행해보기!

class Simple{
	String name;
	int age;
	String addr;
	//기본 생성자
	public Simple() {}
	
	public Simple(String name) {this.name = name;}
	public Simple(String name,int age) {this.name = name;this.age = age;}
	public Simple(String name,int age, String addr) {this.name=name;this.age=age;this.addr=addr;}
	
	//getter and Setter
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
	@Override
	public String toString() {
		return "Simple [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}
	
	//toString 
	
	
}

public class C02BASIC {

	public static void main(String[] args) throws Exception {
		//reflect로  매서드 사용하기
//		Simple ob = new Simple();
//		ob.setAge(10);
//
//		System.out.println(Simple.class); //결과 : class Ch14.Simple
//		
//														//==Ch14.Simple
//		Class<?> clazz = Class.forName( String.valueOf(Simple.class).split(" ")[1] );
//		Method method = clazz.getDeclaredMethod("getAge", null); //getAge는 파라미터가 없기에 null과 같은 파라미터 꺼내오는 것
//		Object result = method.invoke(ob,null); //invoke: 실행하다
//									//(ob에 있는 age를 꺼내옴) -가능한 이유--> 메서드는 공용 공간인 method area에 저장됨
//									//객체가 한 번 생성되고 나면 공용공간에 저장되어있는 상태이기에
//		System.out.println(result);
		
		
		
//		//reflect로 생성자 사용하기
//		Constructor<?> constructor = clazz.getConstructor(String.class); //인자1 개받는 생성자
//									//클래스 clazz에서 생성자 함수 꺼내오기
//		System.out.println(constructor);
//		Object obj =  constructor.newInstance("홍길동");
//						//생성자함수를 꺼내와서 newInstance[인스턴스 생성]하겠다!
//		System.out.println(obj);
//		
//		//reflect로 field에 값넣기
//		Field field = clazz.getDeclaredField("addr");
//						//선언된 필드 중에 addr를 꺼내와서
//		field.set(ob, "대구");	//ob 위치인 addr에 대구를 넣어줌
//		System.out.println(ob);
		
	}

}
