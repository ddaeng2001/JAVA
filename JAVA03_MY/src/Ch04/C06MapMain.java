package Ch04;

import java.util.HashMap;
import java.util.Map;

public class C06MapMain {

	public static void main(String[] args) {

		Map<String,Integer> map = new HashMap();
		
		//추가 - "key", "value값"
				//key에는 유일한 값만 삽입 가능함 == set 구조!
		map.put("aaa", 1111); //set, list와 달리(add) map은 put을 이용함
		map.put("bbb", 2222);
		map.put("ccc", 3333);
		map.put("ddd", 4444);	//older 가 삭제
		map.put("ddd", 5555);	//newer 가 적용
		
		//확인
						//map에서 모든 key를 가지고 있겠다 : map.keySet()
		for(String key: map.keySet()) //["aaa", "bbb", "ccc", "ddd"]
		{	
			System.out.println("KEY: " + key + "VALUE : " + map.get(key));
		}
		
		//삭제
		map.remove("aaa"); // 모두 삭제 - clear
		
		//확인
		System.out.println("SIZE: " + map.size());
		System.out.println("단건 : " + map.get("bbb")); //key를 통해 단건 조회
	}

}
