package Ch06;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class C03FileCopyMain {

	private static final String PATH="c:\\IOTEST\\";
	
	public static void main(String[] args) throws IOException {

		//args[0] : 원본파일경로(원본파일명)
		//args[1] : 복사대상경로(복사파일명)
		Reader fin = new FileReader(PATH+args[0]); //origin으로 데이터를 받아서
		Writer fout = new FileWriter(PATH+args[1]); //받은 데이터를 fout방향으로 저장
	
		while(true) {
			int data = fin.read(); //데이터를 inStream으로 문자 하나씩 받기
			if(data==-1)
				break; //더 이상 읽을 문자가 없으면 나감
			fout.write((char)data); //data가 정수형으로 받아주기 때문에 charater형으로 바꿔줌
			fout.flush(); //항상 버퍼를 초기화시켜야함
		}
		 //자원제거
		fout.close();
		fin.close();
	}

}
