package Ch06;

import java.io.BufferedInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;
import java.net.URI;
import java.net.URL;

public class C08URLStreamMain { //java에서 브라우저에 특정 url을 연결해서 나온 결과물을 java에 가져와서 보기 즉, 브라우저 - java 연결

	public static void main(String[] args) throws Exception {
					
					//URI를 URL로 바꿔서
		URL url = (new URI("https://n.news.naver.com/mnews/article/421/0008450305")).toURL();
		InputStream in = url.openStream();
							//openStream: 브라우저에서 표시된(출력된) 내용을 JAVA프로그램 안으로 가져오는 처리
		
		
		//byte-> char OR char->byte로 하는 보조스트림을 기존스트림을 기본으로 덧씌우면 변환 가능
		//buffer기능을 추가하는 걸 대신해서 빠르게 데이터를 받아올 수 있음
		//기존 스트림에 여러 보조스트림을 띄우기 가능
		
		//버퍼를 자동으로 띄우는보조스트림 추가
		BufferedInputStream buffIn = new BufferedInputStream(in); //버퍼를 공간을 기본스트림에 저장하는 보조스트림 작업
		//byte->char 변환시키는 보조스트림 추가(코드 짧아서 효율적)
		Reader rin = new InputStreamReader(buffIn);
		
		//문자단위의 스트림 생성(보통 문서는 String인 경우가 多기 때문)
		Writer fout = new FileWriter("c:\\IOTEST\\index.html"); //html파일로 저장함
		
		while(true) {
			int data = rin.read();
			if(data==-1) {
				break;
			}
//			System.out.println((char)data); //개발자 모드를 열었을 때 보이는 Elements
			fout.write((char)data);
			fout.flush(); //write시 flush처리를 중간중간에 해줘야 함
		}
		fout.close();
		rin.close();
		buffIn.close();
		in.close();
	
	}

}
