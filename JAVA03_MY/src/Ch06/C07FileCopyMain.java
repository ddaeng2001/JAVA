package Ch06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;

public class C07FileCopyMain {

	private static final String PATH="c:\\IOTEST\\";
	
	public static void main(String[] args) throws IOException {

		//args[0] : 원본파일경로(원본파일명)
		//args[1] : 복사대상경로(복사파일명)
		InputStream fin = new FileInputStream(PATH+args[0]); 
		FileOutputStream fout = new FileOutputStream(PATH+args[1]); 
	
		long startTime = System.currentTimeMillis();
		
		//바이트 단위로 버퍼 받아내기
		byte [] buff = new byte[4096];
		
		while(true) {
			int data = fin.read(buff); //read() : byte단위로 데이터를 읽어냄 => data에 대한 byte값
									   //read(buff):
							           //오버로딩된 리턴 함수 값이 달라짐 => 얼마만큼 data를 읽었는지에 대한 byte 수가 리턴
			if(data==-1)
				break; //더 이상 읽을 문자가 없으면 나감
			fout.write(buff, 0, data); //binary데이터를 복사할 때의 ★★point!★★
			fout.flush(); 
		}
		 //자원제거
		fout.close();
		fin.close();
		
		long endTime = System.currentTimeMillis();
		System.out.println("소요시간 : " + (endTime-startTime) +"ms");
	}

}
