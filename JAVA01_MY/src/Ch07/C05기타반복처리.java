package Ch07;

import java.util.ArrayList;
import java.util.List;

public class C05기타반복처리 {	//★중요함!! ★

	public static void main(String[] args) {
		
		//Collection(자료구조-List,Map) 객체를 이용 - 저장
		List<String> lists = new ArrayList();
		//기본 자료형 LIST생성
		lists.add("JAVA");			//index번호 0
		lists.add("JSP");			//1
		lists.add("SERVLET");		//2
		lists.add("SPRINGBOOT");	//3
		lists.add("NODEJS");		//4
		lists.add("REACT");			//5
		lists.add("DOCKER_COMPOSE");//6

		// 반복 : 기본 for
//		for(int i=0;i<lists.size();i++) {
//						//size(): 총 길이 값
//			System.out.println(lists.get(i));
//		}
						
		
		
		
		// 반복 : 개량 for
		//for(요소변수 : 컬렉션) {
			
		//}
//		for(String subject : lists) {	//리스트 안에 있는 요소들을 하나씩 꺼낼 수 있음
//			System.out.println(subject);
//			
//		}
		
		// ★반복 : (람다)스트림함수 forEach -- Collection 자료구조여야지 사용 가능함
		
		lists.stream().forEach((item)->{System.out.println(item);});	//.map,reduce,sort 등등
							//Java는 람다함수라고 함
								//cf) JS는 ()=>{}
	}

}
