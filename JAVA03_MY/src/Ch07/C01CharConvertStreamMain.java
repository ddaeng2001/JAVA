package Ch07;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class C01CharConvertStreamMain {

	public static void main(String[] args) throws Exception {
		/*
		 * String str = "문자 변환 스트림 사용!!";
		 * 
		 * //for 성능향상을 위한 보조스트림 OutputStream out = new
		 * FileOutputStream("c:\\IOTEST\\test.txt"); OutputStreamWriter wout = new
		 * OutputStreamWriter(out); //byte(1byte)->char(2byte)문자화해서 저장하겠다! //버퍼공간에 넣어주기
		 * BufferedWriter bout = new BufferedWriter(wout);
		 * 
		 * 
		 * bout.write(str); bout.flush(); bout.close();
		 */

		InputStream in = new FileInputStream("c:\\IOTEST\\test.txt");
		BufferedInputStream bin = new BufferedInputStream(in); // 1byte -> 2byte로 charcter화해서 가져오기!
		InputStreamReader rin = new InputStreamReader(bin);
		while (true) {
			int data = rin.read();
			if (data == -1)
				break;
			System.out.print((char) data);

		}

	}
}
