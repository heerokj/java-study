package day19; 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCEx4 {
	public static void main(String[] args) {
		
		// �μ����̺� ���ο� �μ� 1�� �߰�
		// �μ���ȣ�� �������� ���ؼ� ���� �ޱ�, �μ��� : ���� , ��ġ : ����
		
		
		//1. ��������
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";	
		String user = "scott";
		String password = "tiger";		
		PreparedStatement pstmt = null; 
		ResultSet rs = null;
		Connection conn = null;
		
		try {
			
		//2. JDBC ����̹� �ε��Ǿ� �ִ��� ���� üũ
			Class.forName(driver);	// driver ����� ��ü ���� (����̹� ��üȭ)
			
		//3. ����(Connection)			
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("conn : "+conn+" : "+"����̹� ���� ����");
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
		} catch (SQLException e) {
			System.out.println("DB���� ����");                        
			e.printStackTrace();
		}	
					
		//4. SQL�� �ۼ� /  ������������ ���� ?�� ��ü  //DEPT_DEPTNO.NEXTVAL �� ������ 
			String sql = "INSERT INTO dept VALUES (DEPT_DEPTNO.NEXTVAL, ?, ?)";	
	
			//5. ���� ��ü ����
			try {
				pstmt = conn.prepareStatement(sql); 
				pstmt.setString(1, "����"); //ù��° ? ���� �������� //�����ϴ¼��� ������ ä������ => �����ͺ��̽� ���� ���� 
				pstmt.setString(2, "����"); //�ι�° ? ���� ��������
			
			//6. ���� (select => ResulSet)
				pstmt.executeUpdate(); //SELECT�� �ϰ�츸  pstmt.executeQuery(); �̰� / �������� .executeUpdate()			
				System.out.println("������ �߰� ��");
			
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
