package Ch05;

public class C04BitArith {

	public static void main(String[] args) {
		
		int num1 = 15;			//00000000 00000000 0000000 00001111
		int num2 = 20;			//00000000 00000000 0000000 00010100
		
		int num3 = num1&num2;	//00000000 00000000 0000000 00000100 = 4
				  //둘 다 1이여야 1, 나머지는 다 0
		
		int num4 = num1|num2;	//00000000 00000000 0000000 00011111 = 31
				  //하나라도 1이면 1
		
		int num5 = num1^num2;	//00000000 00000000 0000000 00011011 = 27
				   //&를 반전시킴
		int num6 = ~num1;		//11111111 11111111 1111111 11110000 = -16
				   //1의 보수
		
		System.out.println("AND 비트 연산 결과 : " + num3);
		System.out.println("OR 비트 연산 결과 : " + num4);
		System.out.println("XOR 비트 연산 결과 : " + num5);
		System.out.println("NOT 비트 연산 결과 : " + num6);

	}

}
