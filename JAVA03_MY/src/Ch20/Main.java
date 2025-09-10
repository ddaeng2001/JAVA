package Ch20;

//프라임워크 내의 Annotation 흐름이 어떻게 되는지 확인하는 작업

@CustomAnnotation(value="홍길동",number=10000,isOpen=true )
//오류 뜨는 이유 : Annotation내의 값 삽입이 안된 상태일 떄
//CustomAnnotation() : ()내에 값을 따로 설정하지 않을 경우 CustomAnnotation에 기본값이 삽입됨(CustomAnnotation 커스터마이징 시 설정해놓은 default값)

class Simple
{
	//지정했던 위치에 코드 삽입
	String value;
	int number;
	boolean isOpen;
	
	//생성자
	Simple(){
		
		//AnnotationProcessor가 Annotation내의 데이터를 꺼내줌(현재는 Process를 만들지 않은 상태)
		//아래의 작업을 Processor가 대신 해줌. 그냥 우리가 확인한 것일뿐!
		
		//메타정보(클래스 정보) 꺼내올 예정
		CustomAnnotation ref = this.getClass().getAnnotation(CustomAnnotation.class);
		//CustomAnnotation의 참조형태다!
		
		
		System.out.println("VALUE : " + ref.value());
		System.out.println("NUMBER : " + ref.number());
		System.out.println("ISOPEN:" + ref.isOpen());
		
		this.value = ref.value(); //ref.value() == Annotation이 적용된 상태
		this.number = ref.number();
		this.isOpen = ref.isOpen();
	}
}

public class Main {

	public static void main(String[] args) {
		
		//객체 생성
		Simple ob = new Simple();
		System.out.println(ob);
	}

}
