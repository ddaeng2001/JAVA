package Ch06;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class C05FileInputStreamMain { //Byte(1byte)단위 Stream : String을 제외한 모든 파일을 받아올 수 있음
			//reader처리(File->Java)

	public static void main(String[] args) throws IOException {

		InputStream fin = new FileInputStream("c:\\IOTEST\\test.zip");
		
		//시간재기(시작 시간) - 1byte로 읽기 때문에 String(2byte)보다 시간이 더 걸림
		long startTime = System.currentTimeMillis();
		
		//버퍼 공간을 만들어서 처리해주는 것이 훨씬 효율적
		StringBuffer stringBuffer = new StringBuffer();
		
		//4kbyte 버퍼를 만들어서!
		byte[] buff = new byte[4096];
		
		while(true) {
								//buff를 써서 가져오기
								//buff에 담아주면 작업 속도가 향상됨
			int data = fin.read(buff); //byte를 int로 읽음(1byte 단위로 하나씩 받아서 콘솔자!
			if(data==-1)
				break;
//			System.out.println((char)data); //binary파일을 메모장으로 여는 것과 같은 결과가 나옴(실행파일을 텍스트로 여는 것은 정상X)
			
			//StringBuffer에 덧붙이는 작업
			stringBuffer.append((char)data);
//			stringBuffer.append(buff);

		}
		
		//사이즈 재보기
		System.out.println("총 길이 : " + stringBuffer.length());
		fin.close(); 
		
		//시간재기(종료시간)
		long endTime = System.currentTimeMillis();
		System.out.println("소요시간 : " + (endTime-startTime) +"ms");
	}

}
