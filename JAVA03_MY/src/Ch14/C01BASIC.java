package Ch14;

import java.lang.reflect.Method;


public class C01BASIC {

	public static void main(String[] args) throws Exception {
			//<>=제너릭형태				//클래스 위치
		Class<?> clazz =  Class.forName("java.lang.String");	//String에 어떤 속성들이 있는지 확인해보는 것
						 //Class.forName: 특정 클래스를 문서로 확인
		
		//모든 Field 확인
//		Field[] fields = clazz.getDeclaredFields(); //해당 문서에 선언된 필드들을 모두 확인하겠다!
//		for(Field field : fields) {
//			System.out.println(field); //String클래스에 들어가있는 모든 항목들 확인 가능!
//		}
		
		//모든 생성자 확인
		//Constructor[] : reflect에 있는 constructor배열로 받아낼 예정
//		Constructor[] constructors =  clazz.getDeclaredConstructors(); 
//		for(Constructor con : constructors) {
//			System.out.println(con);
//		}
		
		//모든 메서드 확인
		Method [] methods = clazz.getDeclaredMethods();
		for(Method m : methods)
			System.out.println(m);
		
	

	}

}
