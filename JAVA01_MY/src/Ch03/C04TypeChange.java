package Ch03;

public class C04TypeChange {

	public static void main(String[] args) {
		
		
		
		//정수 연산식 자동형변환(int보다 작은 변수 자료형간의 산술연산 시 -> int로 자동형변환)
		//byte, short, char
//		byte x= 10;
//		byte y= 20;
//		byte result1 =(byte)(x + y) ; //?
		//중앙처리장치(CPU)가 연산자(+)를 받아오는 과정에서 CPU가 편해하는 int 자료형으로 바뀌게 되면서 x + y는 int 자료형이 됨!
//		int result 2 = x + y;
		
		
		
		
		
		
		// 정수 연산식 자동형변환(int 보다 큰 변수 자료형 간의 산술 연산 시 -> 큰 자료형(아래 기준>long)으로 자동형변환)
//		byte var1 = 10;
//		int var2 = 100;
//		long var3 = 1000L;
//		int result = (int)var1 + var2 +var3;	//var1 , var2, var3 셋 다 long으로 형 변환이 된 상태라 오류 뜸
					// 덧셈을 하는 과정에서 cpu연산처리가 끝난 후에 형변환을 해줘야함! 
		
		
		
		
		//실수 연산식
		//큰 타입으로 자동 형 변환
		int intvar = 10;
		float flvar = 3.3F;
		double dbvar = 5.5;
		int result3 = (int)(intvar + flvar + dbvar); //int var, flvar가 각각 double 형으로 형변환 형변환된 값이 더해져서 result 3에 저장
		double result4 = intvar + flvar + dbvar;
		System.out.println(result3);
		
		
		
		
	}

}
