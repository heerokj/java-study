package day19;
//JDBC 란 자바에서 제공하는 데이터베이스와 연결하여 데이터를 주고 받을 수 있도록 하는 인터페이스

//*Statement 클래스
//- SQL 구문을 실행하는 역할
//- 스스로는 SQL 구문 이해 못함(구문해석 X) -> 전달역할
//- SQL 관리 O + 연결 정보 X

//*PreparedStatement 클래스
//- Statement 클래스의 기능 향상
//- 인자와 관련된 작업이 특화(매개변수)
//- 코드 안정성 높음. 가독성 높음.
//- 코드량이 증가 -> 매개변수를 set해줘야하기 때문에..
//- 텍스트 SQL 호출

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCEx1 {
	public static void main(String[] args) {
		
/////////DB연결하기(항상같음)////////
		
	 ////1. 변수선언
		String driver = "oracle.jdbc.driver.OracleDriver"; // 패키지명+클래스명
		String url = "jdbc:oracle:thin:@localhost:1521:orcl"; 
		//jdbc 에서 oracle연결
		//thin : 경량드라이버
		//@접속서버의 IP : 로컬의 주소  192.168.0.4 (근데 바뀔수있어서.. localhost 쓰기) 
		//통신port : 1521
		//연결할 DB이름 : orcl
		
		String user = "scott"; //DB의 유저아이디
		String password = "tiger"; //DB의 유저 패스워드
		
		PreparedStatement pstmt = null; //PreparedStatement객체 변수pstmt 선언
		ResultSet rs = null; //ResultSet객체 변수rs선언
		
		
		
	  ////2. JDBC 드라이버 로딩되어 있는지 여부 체크
		
		Connection conn = null; //Connection객체 변수conn선언
		try {	
			//forName은 클래스의 풀이름을 입력받아 클래스를 찾으면 그 클래스의 객체를 리턴하고 못찾으면
			//예외 발생시키는 메서드
			Class.forName(driver); //드라이버 로딩
			
	  ////3. 연결(Connection)
			conn =                        //url,user,password를 통해 DB연결, 연결이 성공하면 변수conn에 전달
					DriverManager.getConnection(url,user,password);  

			System.out.println("conn :" + conn); // 잘연결되어있으면 출력
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
	     	System.out.println("DB 연결 실패");
			e.printStackTrace();
		}
		
	  
	  ////4. SQL문 작성
		String sql = "SELECT * FROM DEPT";
		
		try { //전달하려면 객체 생성해야함
	  
	  ////5. 문장 객체 생성 ->PreparedStatement : *위에 설며있음!
			pstmt = conn.prepareStatement(sql); //전역변수로 선언함 // sql문을 전달받아 변수pstmt에 저장
	  System.out.println(pstmt);
	
	  ////6. 실행 (select => ResultSet)                  //executeQuery() : 수행결과로 ResultSet 객체의 값을 반환
			rs = pstmt.executeQuery(); //전역변수로 선언함  // 객체 pstmt의 executQuery() 메소드를 통해 결과값 저장
			System.out.println("rs :" + rs); // DB로부터 dataSet을 가지고 옴 
			
	  ////7. 읽어와서 레코드별로 로직 처리
			
		/* 반복문 처리 해주자
		  	
			rs.next(); //첫번째 레코드로 이동
			int deptno = rs.getInt("deptno"); // 데이터베이스 컬럼이름으로
			String dname = rs.getString("dname");
			String loc = rs.getString("loc");
			System.out.println(deptno+" : "+dname+" : "+loc);
			
			rs.next(); //두번째 레코드로 이동
			deptno = rs.getInt(1); //참고>변수는 2번 선언할 수 없으니 int, String 빼줌
			dname = rs.getString(2); //데이터베이스 순번으로
			loc = rs.getString(3);			
			System.out.println(deptno+" : "+dname+" : "+loc);
			
		*/	
		
		/*	
			for(int i = 0; i < 4; i++) { 
			    Boolean value = rs.next(); //다음값이있으면 true
			    System.out.println(value);
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				System.out.println(deptno+" : "+dname+" : "+loc);
			}
		
		*/	
			
			while(rs.next()) { //rs.next()가 true일경우에 이하 실행(즉, 데이터베이스에서 다음값이 있을때 이하실행)
				int deptno = rs.getInt("deptno"); 
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				System.out.println(deptno+" : "+dname+" : "+loc);
			}
					
		} catch (SQLException e) {
			e.printStackTrace();
			
			//8. 자원반납 : i/o, network, DB의 경우 자원을 반납해준다
		}finally { //예외가발생하든 말든 실행해 :finally
			try {
				if(rs != null)rs.close(); //가장마지막에 한게 rs이니 먼저close하기 
				if(pstmt != null)pstmt.close();   //null일경우 닫으면 널포인트 익셉션이 발생		                                 
				if(conn != null)conn.close();    //어짜피 null 인데 close()를 왜하냐는 의미. 만약의 사태에 대비하기 위해 먼저 null 체크를 하는것				
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
					
	}
}
