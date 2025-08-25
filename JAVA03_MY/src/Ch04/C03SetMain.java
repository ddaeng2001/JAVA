package Ch04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C03SetMain { //Set은 참고하자요
	//중복없이 형태를 넣어주는 자료구조
	//Map 구현시에도 사용함

	public static void main(String[] args) {

		Set<String> set = new HashSet();

		// 추가 - 값삽입
		set.add("HTML/CSS/JS");
		set.add("NODEJS");
		set.add("SCSS");
		set.add("REACT");
		set.add("JAVA"); 	//older
		set.add("JAVA");	//newer(적용) : //새롭게 동일한 내용이 들어오면 나중에 들어온 것으로 채택!
		set.add("JSP/SERVLET");
		set.add("STS");
		set.add("SPRING BOOT");	//older
		set.add("SPRING BOOT");	//newer(적용)
		
		//삭제
		set.remove("REACT");
		
		//확인
		System.out.println("개수 확인 : " + set.size());
		
		//탐색(고전) - Iterator : 특정 기준점을 잡을 때 사용됨
//		Iterator<String> iter = set.iterator();
//		while(iter.hasNext()) {
//			System.out.println(iter.next());
//		}
		
		//탐색(최근)
		for(String el : set) { //set안에 있는 요소가 el에 담겨 하나하나씩 꺼내지는 개량 for문
			System.out.println(el);
			
		}
		
		//전체삭제
		set.clear();
		
	}

}
