package Ch06;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class C01WriterMain {//문자 단위(텍스트용) 출력 : FileWriter (JAVA -> FILE)

	public static void main(String[] args) throws IOException {
															 //false(기본값) : 덮어쓰기
//		Writer fout = new FileWriter("c:\\IOTEST\\test1.txt",false); //File방향으로 Stream을 받음
										//첫번쨰 \는 두번째 \가 특수문자임을 알려줌
		
		Writer fout = new FileWriter("c:\\IOTEST\\test1.txt",true); //true : 내용 추가하기
		fout.write("TEST1-1\n");
		fout.write("TEST2-1\n");
		fout.write("TEST3-1\n");
		
		fout.flush();//내용을 주고받는 단계에서 속도차이가 발생할 수 있기때문에 버퍼에 담는 작업을 하는데 이때 초기화시키는 작업을 함
					 //정상적인 전송 처리를 위해 필요!
		fout.close();
	}

}
