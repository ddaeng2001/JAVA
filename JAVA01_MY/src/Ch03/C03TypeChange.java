package Ch03;

public class C03TypeChange {

	public static void main(String[] args) {
		
		int num1 = 129;			// 00000000 00000000 00000000 10000001
		int num2 = 130;			// 00000000 00000000 00000000 10000010
		byte ch1 = (byte)num1;  //마지막 1byte만 존재 1000 0001
		byte ch2 = (byte)num2;  //마지막 1byte만 존재 1000 0010
		
		System.out.printf("%d\n", ch1); //결과값 : -127
		System.out.printf("%d\n", ch2); //결과값 : -126

	}

}
