package day19; //주석 다시

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCEx4 {
	public static void main(String[] args) {
		//부서테이블에 새로운 부서 1개 추가
		//부서 
		
		//1. 변수선언
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";	
		String user = "scott";
		String password = "tiger";		
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		Connection conn = null;
		
		try {
			//2. JDBC 드라이버 로딩되어 있는지 여부 체크
			Class.forName(driver);	
			//3. 연결(Connection)			
			conn = DriverManager.getConnection(url, user, password);
			System.out.println(conn);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			System.out.println("DB연결 실패");                        
			e.printStackTrace();
		}	
					
		//4. SQL문 작성
			String sql = "INSERT INTO dept VALUES (DEPT_DEPTNO.NEXTVAL, ?, ?)";	
	
			//5. 문장 객체 생성
			try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, "영업"); //실행하는순간 데이터 채워지게 => 데이터베이스 성능 높임 
				pstmt.setString(2, "서울");
				//6. 실행 (select => ResulSet)
				pstmt.executeUpdate(); //SELECT문 일경우만  pstmt.executeQuery(); 이고 / 나머지는 .executeUpdate()			
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				//8. 자원반납
				try {
					if(pstmt != null)pstmt.close();
					if(conn != null)conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	
	}

}
