package day19; //�ּ� �ٽ�

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCEx4 {
	public static void main(String[] args) {
		//�μ����̺� ���ο� �μ� 1�� �߰�
		//�μ� 
		
		//1. ��������
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";	
		String user = "scott";
		String password = "tiger";		
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		Connection conn = null;
		
		try {
			//2. JDBC ����̹� �ε��Ǿ� �ִ��� ���� üũ
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
			String sql = "INSERT INTO dept VALUES (DEPT_DEPTNO.NEXTVAL, ?, ?)";	
	
			//5. ���� ��ü ����
			try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, "����"); //�����ϴ¼��� ������ ä������ => �����ͺ��̽� ���� ���� 
				pstmt.setString(2, "����");
				//6. ���� (select => ResulSet)
				pstmt.executeUpdate(); //SELECT�� �ϰ�츸  pstmt.executeQuery(); �̰� / �������� .executeUpdate()			
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				//8. �ڿ��ݳ�
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
