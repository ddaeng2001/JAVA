package Ch08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class C01DbConn {

	public static void main(String[] args) {
		
		//JDBC 참조변수 : 자바에서 JDBC 사용을 위한 객체 선언
		Connection conn = null;			//DBMS의 특정 DB와 연결되는 객체
		PreparedStatement pstmt = null; //SQL Query 전송용 객체
		ResultSet rs = null;			//Select 결과물 담을 객체
		//null로 초기화한 이유
		//객체가 실제로 할당되기 전까지 참조변수가 객체를 가리키지 않도록 명확하게 관리하고, 
		//객체 할당 전 접근을 방지하기 위해서입니다. 이렇게 하면 코드 흐름에서
		//객체가 제대로 생성되었는지, 참조변수에 값을 할당하기 전 예외가 발생하지 않도록 예방
		
		
		//DB CONN DATA(DB연결(Connection))시작)
		//자바 애플리케이션이 MySQL 데이터베이스에 접속하기 위해 필요한 정보를 설정
		String id = "root"; //데이터베이스 접속에 사용할 사용자 이름
		String pw = "1234";
								  //DBMS위치 : Java와 동일한 위치에서 동작하고 있으니 = local host
		String url = "jdbc:mysql://localhost:3306/opendatadb"; //자바 프로그램이 MySQL 데이터베이스에 연결할 수 있도록 경로를 정의
						   //DBMS종류				//접속하고자 하는 db명
		//url 표기법 : jdbc:db_protocol://[호스트명][:포트번호]/[접속하고자 하는 db명];
		

		
		//연결작업
		try {
		//Class.forName : Java에서 클래스 이름을 문자열로 제공하여 해당 클래스를 로드 및 초기화시켜줌
		Class.forName("com.mysql.cj.jdbc.Driver"); //JDBC 드라이버 로딩
					   //JDBC 드라이버 클래스: MySQL 데이터베이스와 연결하기 위해 사용됨 
					   //해당클래스를 드라이버에 적재
					   //DBMS랑 달라서 배포 전 확인 필요
		
		//결론 : 데이터베이스와 연결하는 드라이버 클래스를 찾아 로드
		//이를 통해 Driver Class를 로딩하면 객체가 생성되고, DriverManager에 접근이 가능
													//sample DB와 연결하는 작업 : DriverManager
		
		System.out.println("Driver Loading Success...");
		conn = DriverManager.getConnection(url,id,pw); //만들어놓은 자원
			  //DB 서버에 접속해서 연결(Connection)을 만들어주는 메서드
			  //메서드 호출시 실제 DB와 연결된 상태를 나타내는 Connection 객체 반환
			  //변수 conn에 할당 후 conn은 DB 연결 정보를 가지고 있는 객체로 변환됨
				
							//연결 정보들이 Connection 객체에 저장됨 : getConnection();
		//지정한 데이터베이스 "URL"을 연결하는데 연결한 데이터베이스의 사용자 ID와 암호를 conn 객체에 함께 저장
				
		System.out.println("DB CONNECTED...");
		
		//예외발생
		}catch(ClassNotFoundException e1) {
			System.out.println("클래스 부재 예외발생!");
		}catch(SQLException e2) {
			System.out.println("SQL 예외발생!");
		}finally {
			
			//자원제거! - Surround with Try/Catch 클릭
			try {conn.close();} catch (SQLException e) {e.printStackTrace();} 
			
		}
	}

}
