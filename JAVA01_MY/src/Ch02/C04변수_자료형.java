package Ch02;

import java.nio.charset.StandardCharsets;

public class C04변수_자료형 {

	public static void main(String[] args) {
		//-----------------------------
		//정수 int - 4byte 정수 부호 O
		//-----------------------------
		
		//<173>
//		int n1 = 0b10101101;
//		int n2 = 173;			//10진 정수값
//		int n3 = 0255;			//8진수
//		int n4 = 0xad;			//16진수
//		System.out.printf("%d %d %d %d\n",n1,n2,n3,n4);
		
		
		
		
		//-----------------------------
		//정수 int - 4byte 정수 부호 O
		//-----------------------------
//		byte n5 = (byte)-129;	//int 자료형을 byte 자료형에 삽입하기 위해 강제 형변환 [==(byte)]! but 데이터 손실은 감수
//		//자료형을 자동으로 일치시켜줌	//상수pool int자료형에는 들어갔으나 복사하는 과정에서 byte사이즈가 int를 초과하기 때문에 문제 발생
//		byte n6 = -30;
//		byte n7 = 30;
//		byte n8 = 127;
//		//자동형변환 X
//		byte n9 = (byte)129;
//		
//		System.out.println("n5 : " + n5); //결과값 127 - 왜?? 1111 1111 1111 1111 1111 1111 0111 1111 (-129)
//														//  1byte = 8bit를 제외한 나머지 자리의 숫자들을 삭제하면 0111 1111(127)만 남음
//		System.out.println("n9 : " + n9); //결과값 -127 - 왜?? 0000 0000 0000 0000 0000 0000 1000 0001 (129)
//										  //			// 1byte 기준 1000 0001만 살아남음 == -127
//		System.out.println(0b10101101); //? 10101101은 int형[기본]으로 저장될 것이기에 173 
//		System.out.println(Integer.toBinaryString(-129)); //int형으로 저장
//		
//		//byte : -128 ~ 127 지원
//		//		1000 0000 ~ 0111 1111
//		
//		
//		
//		
//		//-------------------------------------------------
//		//정수 short-2byte정수 부호o | char-2byte정수 부호X(양수값만 삽입 가능)
//									//char은 문자열 자료형이기에 
//		//-------------------------------------------------
//		char n1 = 65535;	//(0~2^16-1) (0~65535)
//		short n2 = 32767;	//(-2^15 ~ + 2^15-1)(-32768 ~ + 32767)
//		
//		char n3 = 60000;
//		short n4 = n3; //문제 발생... 왜? 범위 초과
//		short n4 = (short)n3; //결과값:-5536
//		
//		System.out.printf("%d\n", n4);
//		
//		//-----------------------------
//		//정수 long - 8byte 정수 부호 O
//		//-----------------------------
//		
//		long n1 = 10000000000L;	// 상수pool에 저장자체가 되지 않은 것! cf)위 byte예제의 오류와 비교
//		//상수pool에 상수를 저장할 때 정수형 상수가 기본자료형인 int보다 커지면 접미사를 붙이기!
//		long n2 = 20;	//L,l (리터럴 접미사) : long 자료형 사용하여 값
//		
//		long n3 = 10000000000;//문제 발생...왜? -- long 범위 초과!
//		long n4 = 10000000000;
//		
		
		
		
		
		
		
		//-----------------------------
		//실수 : 통계분석을 하기 전 안 쓰는 걸 추천~
		//-----------------------------
		//유리수와 무리수의 통칭
		//소수점이하값을 가지는 수 123.456
		//float 	: 4byte 실수(6-9자리) --6자리까지만 유효하고 그 이후로부터는 보장이 안됨(오류발생)
		//double 	: 8byte(64bit) 실수(15-18자리), [기본자료형]
		
		//정밀도 확인
//		float n1 = 0.123456789123456789F; //f,F:float형 접미사
//				   //약 6자리까지는 확실한 값으로 확인 가능 -- 결과값: 0.12345679
//		double n2 = 0.123456789123456789;
//		
//		System.out.println(n1);
//		System.out.println(n2);
		
		//오차 확인
//		float num = 0.1F;
//		for(int i=0;i<=1E5;i++) {
//			num=num+0.1F;
//			System.out.println(i);
//		}
//		System.out.println("num: "+ num);
		
		
		
		
		//-----------------------------
		//단일문자 char 2byte 정수
		//-----------------------------
//		char ch1 = 'a';	//문자도 숫자로 생각하자~
//		System.out.println(ch1);
//		System.out.println((int)ch1);	//결과값 : 97(아스키코드)
//		System.out.println(Integer.toBinaryString(ch1)); //2진 데이터 확인 : 1100001
//		
//		System.out.println("---------------------");
//		
//		char ch2 = 98; //숫자 데이터 삽입 가능
//		System.out.println(ch2);
//		System.out.println((int)ch2);
//		System.out.println(Integer.toBinaryString(ch2));
//		
//		System.out.println("-------------------------");
//		
//		char ch3 = 'b'+ 1;	//7bit 사용
//		System.out.println(ch3);
//		System.out.println((int)ch3);
//		System.out.println(Integer.toBinaryString(ch3));
//		
//		System.out.println("---------------------------");
//		char ch4 = 0xac02; //0x = 16진수, ac02 : 갂의 유니코드
//		System.out.println(ch4);
//		System.out.println((int)ch4);
//		System.out.println(Integer.toBinaryString(ch4)); //2byte, 한글 표시를 위해 필요한 최소 바이트
//		
//		System.out.println("--------------------------");
//		// \\u	: 유니코드 이스케이프 문자
//		System.out.printf("%c\n",0xac03); //결과값 : 갃
//		System.out.printf("%c\n",'\uac03'); // 문자형으로 전달할 때 ''로 하면 단일문자가 아닌 문자열로 인식하기에 오류 발생
											// 이스케이프 문자를 붙이면 단일문자로 인식
		
		
		
		
		//-----------------------------------
		//boolean : 논리형(true/false 저장)
		//-----------------------------------
//		boolean flag = (10>11); 		//참(긍정)
//		if(flag)
//		{
//			System.out.println("참인 경우 실행");
//		}
//		else
//		{
//			System.out.println("거짓인 경우 실행");
//		}
//		
		// JS와 C언어에서는 가능하나 JAVA에서는 불가능!
//		if(10) {
//		
//		}
//		else {
//			
//		}
		
		
		
		//---------------------------
		//문자열 : String(클래스 자료형)
		//---------------------------
		//기본자료형(원시타입)
//		byte n1;
//		short n2;
//		double n3;
//		long n4;
		
		//클래스 자료형
		//클래스 자료형으로 만든 변수는 '참조변수'라고 하고
		//참조변수는 데이터가 저장된 위치정보(메모리주소값)이 저장된다.
		int n1 = 10;
		byte n2 = 20;
		char n3 = 40;
		
		//클래스 자료형>>
		String name = "홍길동"; //"홍길동" == 리터럴 // 홍길동의 메모리 주소값(위치정보)을 복사해옴 == 참조
		//실제 name에 들어간 값은 홍길동이 아닌 홍길동의 메모리 주소값!
		//"홍"-> 문자열에 갇혀 있는 문자 한 개는 3byte
		String job = "프로그래머";	//문자열 길이가 어떻든 상관없음!가변O
		System.out.println(name);
		System.out.println(job);
		
		System.out.println("UTF-8기준 지정 크기: " + name.getBytes(StandardCharsets.UTF_8).length);
		System.out.println("UTF-8기준 지정 크기: " + job.getBytes(StandardCharsets.UTF_8).length);
		
		//사이즈 확인
		char ch = '홍';		//16bit == 2byte 사용
		String str = "홍";	//24bit == 3byte 사용 -- 문자열이기 때문!
							//String 객체로 판단하기에 String에서 제공하는 여러가지 함수 사용 가능
		
		System.out.println("ch 실제크기(bit)" + Integer.toBinaryString(ch).length());
		System.out.println("str 실제크기(byte) : " + str.getBytes(StandardCharsets.UTF_8).length);
	}

}
