package day19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCEx2 {
	public static void main(String[] args) {
		//사원의 급여가 1500이상인 사원의 사번, 이름, 급여 콘솔에 출력
		
		//1. 변수선언
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";	
		String user = "scott";
		String password = "tiger";		
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		
		   
		//2. JDBC 드라이버 로딩되어 있는지 여부 체크
		Connection conn = null;
		try {
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
		//(사원의 급여가 1500이상인 사원의 사번, 이름, 급여)
		String sqp = "SELECT EMPNO, ENAME, SAL FROM EMP WHERE SAL>=1500";
			
		 
		try {
			//5. 문장 객체 생성
			pstmt = conn.prepareStatement(sqp);
			//6. 실행 (select => ResulSet)
			rs = pstmt.executeQuery();
			System.out.println(rs);
			
			//7. 읽어와서 레코드별로 로직 처리
			while(rs.next()) {
				String empno = rs.getString("empno");
				String ename = rs.getString("ename");
				int sal = rs.getInt("sal");
				System.out.println(empno+" : "+ename+" : "+sal);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			//8. 자원반납
			try {
				if(rs != null)rs.close(); 
				if(pstmt != null)rs.close();
				if(conn != null)rs.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
				           	
	}

}
