package Ch06;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.UUID;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class C09JsoupMain { //Document내의 특정 요소만 꺼내는 작업 start

	public static void main(String[] args) throws IOException, URISyntaxException {

		
		//URL 연결
		//Jsoup 라이브러리를 통해 내부의 Connection 클래스 이용
		Connection conn=
		//요청 헤더 waiting
		Jsoup.connect("https://op.gg/lol/champions")	//크롤링(이동)할 URL 지정
			 //브라우저 정보(ex>chrome)
			 .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/139.0.0.0 Safari/537.36") 
			 .timeout(5000) 	//timeout 값(언제까지 기다릴건데?)
			 .ignoreHttpErrors(true) //에러 발생 시 에러 예외처리 없이 바로 진행할거야?
			 .followRedirects(true); //기본옵션
		
		//DOM 객체 받기
		Document document = conn.get();
//		System.out.println(document); //크롤링 전 브라우저 정보 셋업 후 연결이 된 상태에서 문서요청을 get방식으로 해서 나오는 dom객체를 java로 가져옴
		
		//태그 검색 가능
		Elements elements = document.getElementsByTag("img"); //태그명과 일치하는 것만 긁어옴 - 태그 : 어떠한 항목을 보충 설명하는 낱말 혹은 키워드
		//Elements : Jsoup에서 제공하는 Collection단위
		System.out.println("총 img size : " + elements.size());
		
			//Elements: Collection단위이기에 개량된 for문 사용가능
		for(Element el : elements) {
			System.out.println(el);
			String img_url = el.getElementsByAttribute("src").attr("src"); //속성키를 전달 시, 그에 상응하는 value값을 추출해옴
									  //src를 가진 모든 elements가 반환됨
									  //elements안의 속성값을 꺼내려면 attr("src") - 특정형태의 파일을 문자로 꺼내려면
									  
			System.out.println(img_url); //속성에 대한 url값 가져옴
			
			URL url = (new URI(img_url).toURL());
			InputStream in = url.openStream();

			
			//보조 스트림 추가(for 속도향상)
			BufferedInputStream buffIn = new BufferedInputStream(in); //버퍼를 공간을 기본스트림에 저장하는 보조스트림 작업
		
			//데이터 저장할 준비
			OutputStream out = null;
			
			
			
			//확장자가 다를 경우를 대비하여 분기처리 필요
			if(img_url.contains(".png"))
				out  = new FileOutputStream("c:\\IOTEST\\"+UUID.randomUUID()+".png");
			else if(img_url.contains(".svg")) //svg가 binary로 처리되어있어서 문자형 그대로 받아오는 처리가 필요할 듯(보조 스트림 띄우면 됨!) 
				out  = new FileOutputStream("c:\\IOTEST\\"+UUID.randomUUID()+".svg");
			else if(img_url.contains(".webp"))
				out  = new FileOutputStream("c:\\IOTEST\\"+UUID.randomUUID()+".webp");
			else if(img_url.contains(".jpg"))
				out  = new FileOutputStream("c:\\IOTEST\\"+UUID.randomUUID()+".jpg");


			
			//단일확장자일 경우
																		  //svg등과 같이 다른 확장자인 이미지는 제대로 받아오지 못함
			 out = new FileOutputStream("c:\\IOTEST\\"+UUID.randomUUID()+".png"); //inStream으로 받은 것을 내가 원하는 방향으로 파일화로 저장할 준비
			 										   //UUID.randomUUID() : 겹치지않는 ID를 만들기 위한 표준방식으로 이미지 파일 저장시 이름 중복을 방지하기 위해 사용함!
			 while(true) {
				 int data = buffIn.read(); //binary데이터 1byte를 가져옴
				 if(data==-1) {
					 break;
				 }
				 out.write((byte)data); //instream으로 받은 데이터를 outstream으로 던짐
				 out.flush();
			 }
			 out.close();
			 buffIn.close();
			 in.close(); //in : 브라우저 방향으로 받았던 것도 close!
			 
			 
			 
			 
			 
			 
			
		}
		
	}

}
