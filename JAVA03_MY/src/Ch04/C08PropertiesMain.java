package Ch04;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class C08PropertiesMain { //Map과 비슷하게 구성되어있고 프로그램 실행 시 전역변수를 받아옴
								 //직접 할 일은 없지만(프레임워크가 자동으로 해줄 것) 이 과정을 통해서 properties의 내부 내용을 읽어온다는 것 정도만 알면 됨

	public static void main(String[] args) throws IOException {
		
		String classPath = System.getProperty("java.class.path");
		System.out.println("classPath : " + classPath);
		String dirPath = System.getProperty("user.dir"); //application.properties 위치 찾으려고 함 
//		dirPath : C:\Users\Administrator\Desktop\HTML\Java\JAVA03_MY -> 운영체제에서 인식하고 있는 경로
		//받아야 하는 이유 : 배포/온라인화 하는 과정에서 리눅스 기반의 서버를 자주 사용하는데 윈도우와 경로가 달라 맞는 설정이 힘들기에
						//property를 써서 운영체제의 종류에 상관없이 경로를 찾아낼 수 있음
		
		System.out.println("dirPath : " + dirPath);
		String packagePath = C08PropertiesMain.class.getPackageName();
		System.out.println("packagePath : " + packagePath);
		
									  //separator : 구분자 - 운영체제가 다를 수 있다는 것을 고려해서 삽입함
		String filePath = dirPath+File.separator +"src"+File.separator +packagePath+File.separator+"application.properties";
		//application.properties 위치를 문자열로 저장해놓음 : filePath
		
		System.out.println("filePath: " + filePath);
		FileInputStream fin = new FileInputStream(filePath);
		//★★★FileInputStream : 파일 내부의 내용을 자바 안으로 가져오기 위한 stream형 클래스 - 서버에 내용을 업로드/다운로드 할 때 대표적으로 사용됨
		
		//
		Properties properties = new Properties();
		properties.load(fin);
											//key값
		String url = properties.getProperty("url"); //key값 입력 시 value값을 가져옴 
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		
		System.out.printf("%s %s %s \n", url,username,password);
	}

}
