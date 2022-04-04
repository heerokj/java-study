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
		ResultSet rs = null; //ResultSet객체 변수rs선언
		PreparedStatement pstmt = null; //PreparedStatement객체 변수pstmt 선언
		Connection conn = null; //Connection객체 변수conn선언
		
		   		
		//2. JDBC 드라이버 로딩되어 있는지 여부 체크
		try {
			Class.forName(driver); //drive에 입력한 클래스를 찾아 객체를 리턴
			
		//3. 연결(Connection)			//url,user,password를 통해 DB연결, 연결이 성공하면 변수conn에 전달
			conn =                  //url, user, password를 통해 연결받은 객체를 저장 
					DriverManager.getConnection(url, user, password);
			System.out.println(conn); //conn출력
	
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			System.out.println("DB연결 실패");                        
			e.printStackTrace();
		}
			 
		//4. SQL문 작성 
		//(사원의 급여가 1500이상인 사원의 사번, 이름, 급여)
		String sql = "SELECT EMPNO, ENAME, SAL FROM EMP WHERE SAL>=1500";
			
		 
		try {
			//5. 문장 객체 생성
			pstmt = conn.prepareStatement(sql); //결과값을 pstmr에 저장
			//6. 실행 (select => ResulSet)
			rs = pstmt.executeQuery(); //객체pstmt의 executQuery()메소드를 통해 실행한 결과값 rs에 저장
			System.out.println(rs); //rs출력
			
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
