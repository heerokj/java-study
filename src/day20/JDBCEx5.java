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
		
		//DELETE FROM EMP /(FROM��������)
		//WHERE EMPNO = 1111;
		
		//1. ��������
		String driver = "oracle.jdbc.driver.OracleDriver"; 
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";	
		String user = "scott";
		String password = "tiger";		
		ResultSet rs = null;
		PreparedStatement pstmt = null; 
		Connection conn = null; 
		
		//2. JDBC ����̹� �ε��Ǿ� �ִ��� ���� üũ
		try {
			Class.forName(driver); 
			
		//3. ����(Connection)		
			conn = DriverManager.getConnection(url, user, password);
			System.out.println(conn); 
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
		} catch (SQLException e) {
			System.out.println("DB���� ����");                        
			e.printStackTrace();
		}
							
		//4. SQL�� �ۼ�
		StringBuffer sb = new StringBuffer();   //���������� => StringBuffer���
//		sb.append("INSERT INTO EMP(EMPNO, ENAME, SAL ) ");
//		sb.append("VALUES (?, ? , ? ) ");
		
//		sb.append("UPDATE EMP ");
//		sb.append("SET SAL = ? ");
//		sb.append("WHERE EMPNO = ? ");

		sb.append("DELETE EMP ");
		sb.append("WHERE EMPNO = ? ");
		
		

		//5. ���� ��ü ����
		try {
			pstmt = conn.prepareStatement(sb.toString());
//			pstmt.setInt(1, 1111);
//			pstmt.setString(2, "HONG");
//			pstmt.setInt(3, 3000);

			
//			pstmt.setInt(1, 5000);
//			pstmt.setInt(2, 1111);

			pstmt.setInt(1, 1111);
			
					
			//6. ���� (select => ResulSet)
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//8. �ڿ��ݳ�
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
