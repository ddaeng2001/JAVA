package Ch04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C07Ex {

	//속성
	static Map<String,Object> map = new HashMap();
				//String문자열을 Key로 해서 value값을 Object로 뽑아내겠다!
												//=>어떠한 자바 객체든 value로 넣겠다
				//이 map은 어떠한 객체든지 다 받아낼 수 있게 됨 = Object로 업캐스팅하곘다!
	
	//set
											//map형태의 객체가 param에 들어옴
	static void setMap(Map<String, Object> param) { //사용자로부터 들어온 파라미터들을 다 받아줌 : (Map<String, Object> param) & DTO(JSP)로도 가능
		for(String key : param.keySet()) {
			Object value = param.get(key); //value가 Object이기에 value값을 다 받아낼 수 O
			System.out.println("KEY: " +  key + ", VALUE : " + value);
			map.put(key, value);
						//value는 현재 배열
		}
	}
	
	//get : Map이 그대로 return되어야기 때문에 Map의 자료형을 그대로 꺼내야함
	
	static Map<String, Object> getMap(){
		return map;
	}
	
	
	public static void main(String[] args) {
		//01 파라미터 생성 - 구조 만들기
		Map<String,Object> params = new HashMap();
		
		//02파라미터에 데이터 저장 - 잘 안 쓰는 게 콘솔창에 제대로 보이지가 않음
		String [] values = {"웹디자인기능사", "정보처리기사", "네트워크관리사", "SQLD"}; //배열로 초기값 삽입
		params.put("자격증", values);
				//UPCASTING구조를 통해서 어떤 객체든 다 받아낼 수 있는 구조 생성
//		setMap(params);
		
		//02 파라미터에 데이터 저장 - List형으로 자주 사용!
		List<String> values2 = new ArrayList();
		values2.add("등산");
		values2.add("독서");
		values2.add("게임");
		params.put("취미", values2);
		setMap(params);
		
		
		
		
		//03 저장데이터 확인 - 중요도 떨어짐
		Map<String, Object> mapDatas = getMap();
		for(String key : mapDatas.keySet()) {
			Object value = mapDatas.get(key);
			//배열
			if(value instanceof String[]) {
				String [] arr = (String[]) value; // 업캐스팅된 상태이기에 다운캐스팅이 필요함
				for(String el : arr) {
					System.out.println("배열값 확인 : " + el);
				}
			}
			else if(value instanceof List) {
				System.out.println("KEY: " + key +  " VAL : " + value);
				 
				
			}
			
			//list
		}
	}

}
