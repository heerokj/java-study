package day20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCEx5 {
	public static void main(String[] args) {
		
		//INSERT INTO ENP(EMPNO, ENAME, SAL)
		//VALUES (1111,'HONG',3000);
		
		//UPDATE EMP
		//SET SAL =3000
		//WHERE EMPNO = 7788;
		
		//DELETE FROM EMP /(FROM생략가능)
		//WHERE EMPNO = 1111;
		
		//1. 변수선언
		String driver = "oracle.jdbc.driver.OracleDriver"; 
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";	
		String user = "scott";
		String password = "tiger";		
		ResultSet rs = null;
		PreparedStatement pstmt = null; 
		Connection conn = null; 
		
		//2. JDBC 드라이버 로딩되어 있는지 여부 체크
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
		StringBuffer sb = new StringBuffer();   //문장길어질때 => StringBuffer사용
//		sb.append("INSERT INTO EMP(EMPNO, ENAME, SAL ) ");
//		sb.append("VALUES (?, ? , ? ) ");
		
//		sb.append("UPDATE EMP ");
//		sb.append("SET SAL = ? ");
//		sb.append("WHERE EMPNO = ? ");

		sb.append("DELETE EMP ");
		sb.append("WHERE EMPNO = ? ");
		
		

		//5. 문장 객체 생성
		try {
			pstmt = conn.prepareStatement(sb.toString());
//			pstmt.setInt(1, 1111);
//			pstmt.setString(2, "HONG");
//			pstmt.setInt(3, 3000);

			
//			pstmt.setInt(1, 5000);
//			pstmt.setInt(2, 1111);

			pstmt.setInt(1, 1111);
			
					
			//6. 실행 (select => ResulSet)
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//8. 자원반납
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
