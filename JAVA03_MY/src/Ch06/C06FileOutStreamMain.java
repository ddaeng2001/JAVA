package Ch06;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class C06FileOutStreamMain { //java에서 하는 작업을 byte단위로 전달
			//Java->File 내용 쓰기
	
	public static void main(String[] args) throws Exception {
//		OutputStream fout = new FileOutputStream("c:\\IOTEST\\test6.txt");
//		fout.write('괙'); //이상하게 나옴 
						 //-> 한글문자같은 경우는 기본 2byte를 사용하고 있기 때문에 '괙'이 1byte로 나눠져서 처리됨

		
		//byte로 한글문자를 넣고 싶으면 1byte로 쪼개기
		//문자열 object로 만들어준 후 byte형으로 변환처리를 해서 전달해줘야 텍스트가 그대로 전달됨
		fout.write("가나다".getBytes(StandardCharsets.UTF_8));
						  //해당 문자열을 바이트열로 나열
		
		fout.write('a'); //되는 이유 : (아스키코드)문자를 숫자로 판단하고 있기 때문에 byte로 받을 수 있음
////		fout.write("b"); //-> 문자열로 인식하기에 안됨!
		fout.write('b');
		fout.write('c');
		fout.flush();
		fout.close();
	}

}
