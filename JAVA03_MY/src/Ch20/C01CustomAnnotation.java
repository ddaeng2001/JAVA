package Ch20;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Annotation이 컴파일러가 프로그램을 실행하는 시점 지정(생명주기)
@Retention(RetentionPolicy.RUNTIME) //에노테이션의 유지기간(프로그램 동작 중인 상태에서만 실행이 가능하도록 설정)

//현재 만들고 있는 Annotation을 어디에 적용시킬건지 적용 대상을 제한할 때 사용
@Target({ElementType.TYPE, ElementType.METHOD}) //에노테이션을  TYPE(클래스)과 METHOD(함수)에 적용할 수 있게끔
												//ElementType.TYPE : 클래스, 인터페이스, eum(열거형 인터페이스)..적용
												//ElementType.FILED : 멤버 변수에 적용
												//ElementType.METHOD : 메서드에 적용

		//Annotation임을 명시하기 위한 @삽입
public @interface C01CustomAnnotation {
	
	//Annotation에 지정할 옵션 값 지정(함수형으로만!)
	//담겨진 데이터 값 지정
	//추상메서드 - 속성을 삽입했을 때 선언하는 함수 - 함수형 속성
	String value() default "HELLO WORLD"; //기본값을 사용하는 Annotation을 만들고 싶을 때 DEFAULT 삽입
	int number() default 1; 
	boolean isOpen() default false; 
	
	
}
