package day19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCEx3 {

	public static void main(String[] args) {
		 		
		//�μ���ȣ�� 10�� �μ� ����� ���, �̸�, job�� �ֿܼ� ���
		
		//1. �������� 
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String user = "scott";
		String password = "tiger";
		ResultSet rs = null;
		PreparedStatement pstmt = null;
			
		
		//2. JDBC ����̹� �ε��Ǿ� �ִ��� ���� üũ	
		Connection conn =null;
		try {
			Class.forName(driver);
		//3. ����(Connection) 
		conn = 
				DriverManager.getConnection(url, user, password);
			System.out.println(conn);
			
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
		} catch (SQLException e) {
			System.out.println("DB ���� ����");
			e.printStackTrace();
		}
					
		//4. SQL�� �ۼ� 
		//(�μ���ȣ�� 10�� �μ� ����� ���, �̸�, job)
		String sql = "SELECT DEPTNO, ENAME, JOB FROM EMP WHERE DEPTNO = 10";
								
		//5. ���� ��ü ����
			try {
				pstmt = conn.prepareStatement(sql);
		//6. ���� (select => ResulSet)
				rs = pstmt.executeQuery();
				System.out.println(rs);
				
		//7. �о�ͼ� ���ڵ庰�� ���� ó��
				while(rs.next()) {
					int deptno = rs.getInt("deptno");
					String ename = rs.getString("ename");
					String job = rs.getString("job");
					System.out.println(deptno+" : "+ename+" : "+job);
				}
			} catch (SQLException e) {			
				e.printStackTrace();
		//8. �ڿ��ݳ�
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
