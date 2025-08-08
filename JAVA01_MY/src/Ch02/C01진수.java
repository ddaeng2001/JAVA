package Ch02;

public class C01진수 {

	public static void main(String[] args) {
		
		
		//어떤 수든 10진수로 진법 변환해서 표시
		System.out.printf("10진수 : %d\n", 0b10101101);	//2진수 (0b:2진수를 의미하는 접두사)
		System.out.printf("10진수 : %d\n", 173);			//10진수
		System.out.printf("10진수 : %d\n", 0255);			//8진수 (0 : 8진수를 의미하는 접두사)
		System.out.printf("10진수 : %d\n", 0xAD);			//16진수(0x: 16진수를 의미하는 접두사)
		
		//어떤 수든 8진수로 진법 변환해서 표시
		System.out.printf("8진수 : %o\n", 173);			//10진수
		System.out.printf("8진수 : %o\n", 0255);			//8진수 (0 : 8진수를 의미하는 접두사)
		System.out.printf("8진수 : %o\n", 0xAD);			//16진수(0x: 16진수를 의미하는 접두사)
		
		//어떤 수든 16진수로 진법 변환해서 표시
		System.out.printf("16진수 : %x\n", 173);			//10진수
		System.out.printf("16진수 : %x\n", 0255);			//8진수 (0 : 8진수를 의미하는 접두사)
		System.out.printf("16진수 : %x\n", 0xAD);			//16진수(0x: 16진수를 의미하는 접두사)

	}

}
