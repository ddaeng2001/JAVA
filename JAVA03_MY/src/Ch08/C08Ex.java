package Ch08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class C08Ex {

	public static void main(String[] args) throws Exception{
		
		//01 DBMS DRIVER 클래스 적재 IN 메모리 공간
		Class.forName("com.mysql.cj.jdbc.Driver"); //reflection함수를 통해 메모리 공간에 인지를 시켜줌
		//02 CONNECTION 객체 생성(with DB)
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root","1234");
																	//MySql 서버 포트 : 3306		
		//03 PREPAREDSTATEMENT("SQL") - 쿼리문 받을 객체 생성
		PreparedStatement pstmt = conn.prepareStatement("select * from TBL_SAMPLE"); //쿼리문을 만들어서 보내기 전 사전 준비
		//04 EXECUTE(SELECT : .executeQuery(), INSERT/UPDATE/DELETE : .executeUpdate())
		ResultSet rs = pstmt.executeQuery();
		
		//05 결과값 확인
		List<SampleDto> list = new ArrayList();
		SampleDto dto = null;
		if(rs!=null) {
			while(rs.next()) {
				 //다음 행으로 행 단 이동
				dto=new SampleDto();
				dto.set위반구분(rs.getString("위반구분")); //실제로는 적절한 영문명 dto를 생성해야함(한글은 원래 안됨!)
				dto.set위반일시(rs.getString("위반일시"));
				dto.set위반장소(rs.getString("위반장소"));
				dto.set과태료부과일자(rs.getString("과태료부과일자"));
				dto.set데이터기준일자(rs.getString("데이터기준일자")); //한 행의 값을 다 채우고 나서
				list.add(dto); //dto에 담아서 list로 정리
			}
		}
		
		list.forEach(System.out::println);
	}

}
