package day19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCEx3 {

	public static void main(String[] args) {
		 		
		//부서번호가 10인 부서 사원의 사번, 이름, job을 콘솔에 출력
		
		//1. 변수선언 
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String user = "scott";
		String password = "tiger";
		ResultSet rs = null;
		PreparedStatement pstmt = null;
			
		
		//2. JDBC 드라이버 로딩되어 있는지 여부 체크	
		Connection conn =null;
		try {
			Class.forName(driver);
		//3. 연결(Connection) 
		conn = 
				DriverManager.getConnection(url, user, password);
			System.out.println(conn);
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			System.out.println("DB 연결 실패");
			e.printStackTrace();
		}
					
		//4. SQL문 작성 
		//(부서번호가 10인 부서 사원의 사번, 이름, job)
		String sql = "SELECT DEPTNO, ENAME, JOB FROM EMP WHERE DEPTNO = 10";
								
		//5. 문장 객체 생성
			try {
				pstmt = conn.prepareStatement(sql);
		//6. 실행 (select => ResulSet)
				rs = pstmt.executeQuery();
				System.out.println(rs);
				
		//7. 읽어와서 레코드별로 로직 처리
				while(rs.next()) {
					int deptno = rs.getInt("deptno");
					String ename = rs.getString("ename");
					String job = rs.getString("job");
					System.out.println(deptno+" : "+ename+" : "+job);
				}
			} catch (SQLException e) {			
				e.printStackTrace();
		//8. 자원반납
			}finally {
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
