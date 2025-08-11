package Ch03;

public class C06TypeChange {

	public static void main(String[] args) {

		char n1 = 60000;
		short n2 = (short) n1; //사이즈는 값지만 들어갈 데이터의 자료형 & 범위 제한 & 부호 지원 여부때문에 오류가 발생한 것
		System.out.println(n2);
		
		int n3 = n2; // int는 char과 short를 감당할 정도의 큰 범위를 지녔기에 자동 형변환으로 에러가 뜨지 않음!
		System.out.println(n3);

	}

}
