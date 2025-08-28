package Ch07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class C02ReadLineMain {//ReadLine : 줄바꿈 문자(\n)을 기준으로 데이터 문자열을 가져올 수 있음
	
	public static void main(String[] args) throws Exception{
		
//		//파일저장
//		Writer out = new FileWriter("c:\\IOTEST\\test2.txt");
//		//버퍼공간 추가
//		BufferedWriter bout = new BufferedWriter(out);	
//		//보조스트림 추가
//		PrintWriter pout = new PrintWriter(bout);
//		pout.println("HELLO");
//		pout.println("HELLO");
//		pout.println("HELLO");
//		pout.flush();
//		pout.close();
		
		
		Reader in = new FileReader("c:\\IOTEST\\test2.txt");
		BufferedReader bin = new BufferedReader(in);
		
		while(true) {
			String data = bin.readLine(); 
			if(data==null)
				break;
			System.out.println(data);
		}
		
		
		
	}
}
