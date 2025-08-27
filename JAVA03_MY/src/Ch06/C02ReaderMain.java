package Ch06;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class C02ReaderMain {// File->JAVA
						//main(운영체제)로 예외를 던지는 것이기에 자바에서는 예외처리를 하지 않는 것이나 마찬가지
	public static void main(String[] args) throws IOException {
		Reader fin = new FileReader("c:\\IOTEST\\test1.txt");

//		while(true) {
//			int data = fin.read(); //읽을 CHARACTER(문자)가 없으면 -1 반환 / 0~65535사이
//			if(data==-1)
//				break;
//			else {
//				System.out.print((char)data); //Char로 형변환을 해야 파일 내의 본문을 읽을 수 있음
//			}
//		}
		
		int data;
		while((data = fin.read())!=-1 ) { //조건 식 내에 프로세스를 삽입해서 조건식을 만듦! 위와 동일한 결과
				System.out.println((char)data); //문자열을 담을 예정이라면 String buffer를 통해야 덧붙이는 과정에서 메모리 
												//공간을 계속해서 쓰지 않음
		}
		
		fin.close(); //String도 자원이기에 적절하게 종료
	}

}
