package Ch04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class C04Ex {
	public static void main(String[] args) throws InterruptedException {
		
	//1) 1 ~ 45까지 숫자를 6개를 랜덤으로 받아(Random 클래스를 이용) set에 저장 /출력
					// set은 중복을 받지 않기 때문에 반복문을 사용해서 6개까지만 받으면 됨
	
		//<>자료형 안에는 클래스형 자료형만 들어갈 수 있음, 원시타입 불가능!
//		Set<Integer> set = new HashSet<Integer>();
		//왼쪽과 오른쪽 <>자료형이 동일하다면 오른쪽 자료형은 생략 가능!
		
		Set<Integer> set = new HashSet();
		//Set 타입의 참조변수가 HashSet객체를 참조
		
		Random rmd = new Random(); //난수 생성
		while(set.size()<6) {
//			System.out.println(rmd.nextInt(45)+1);
								   //(45)는 0~44이기 때문에 +1을 해줘야 1~45 범위의 수를 랜덤하게 뽑음
			set.add(rmd.nextInt(45)+1);
//			Thread.sleep(500); //0.5초 간격으로 숫자를 콘솔창에 띄워줌
		}
		for(Integer el : set) {
			System.out.println(el);
		}
		
		//2)[추가]지정된 set의 오름차순정렬을 해보세요
		
		//2-1)
//		List<Integer> list = set.stream().sorted().collect(Collectors.toList());
//									  						//set의 형태를 List형태로 반환받을 수 O
//		list.stream().forEach(System.out::println);
		
		//2-2)
		List<Integer> list = new ArrayList(set);
		Collections.sort(list); //list 전달 시 기본적으로 오름차순 정렬 반환
		list.stream().forEach(System.out::println);
		
	}

}
