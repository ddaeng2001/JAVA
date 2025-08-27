package Ch06;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class C04BufferAddMain {// File->JAVA
						//main(운영체제)로 예외를 던지는 것이기에 자바에서는 예외처리를 하지 않는 것이나 마찬가지
	public static void main(String[] args) throws IOException {
		Reader fin = new FileReader("c:\\IOTEST\\origin.txt");

		//시간 재기(시작시간)
		long startTime = System.currentTimeMillis();
		
		//데이터를 읽어내는 과정에서 buffer에 담아보기
		StringBuffer strBuffer = new StringBuffer(); 
		
		//버퍼를 사용해서 시간 단축 (430ms->62ms)
		//char [] buff : 문자 단위 버퍼
		char [] buff = new char[4096]; //4096byte로 받아낼 준비 - 한 번에 최대 4096자의 문자를 읽고 쓸 준비
		//버퍼 단위로 데이터 받아내기
		
//		int data;		        //(buff의 시작 offset, 데이터 길이)
//		while((data = fin.read(buff,))!=-1 ) { //문자를 하나씩 읽어오고 있음
////				System.out.println((char)data); 
//				strBuffer.append((char)data);
//		}

		while(true) {
							//(buff, buff 시작값, 데이터길이)
			int data = fin.read(buff,0,buff.length); //buff 배열에 담긴 문자 중에서
													 //0번 인덱스부터 시작해서 len개 만큼만 - r : 파일의 끝에 가까워지면, fin.read(buff)는 4096개보다 적게 읽을 수 있습니다.
													 								//예를 들어 파일에 10000자가 있다면 마지막 루프에서는 1816자만 읽을 수도 그럴 때
																					//fout.write(buff); 같이 배열 전체를 써버리면 이전에 남아 있던 쓰레기 값까지 써질 위험
													 //출력 스트림(fout)을 통해 복사본 파일에 씀
			if(data==-1)
				break;
			else {
				strBuffer.append((char)data);
			}
		}
		
		//사이즈 재보기
		System.out.println("총길이 : " + strBuffer.length());
		fin.close(); 
		
		//시간재기(종료시간)
		long endTime = System.currentTimeMillis();
		System.out.println("소요시간 : " + (endTime-startTime) +"ms");
	}

}
