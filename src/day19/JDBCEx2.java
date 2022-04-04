package day19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCEx2 {
	public static void main(String[] args) {
		
		//����� �޿��� 1500�̻��� ����� ���, �̸�, �޿� �ֿܼ� ���
		
		//1. ��������
		String driver = "oracle.jdbc.driver.OracleDriver"; 
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";	
		String user = "scott";
		String password = "tiger";		
		ResultSet rs = null; //ResultSet��ü ����rs����
		PreparedStatement pstmt = null; //PreparedStatement��ü ����pstmt ����
		Connection conn = null; //Connection��ü ����conn����
		
		   		
		//2. JDBC ����̹� �ε��Ǿ� �ִ��� ���� üũ
		try {
			Class.forName(driver); //drive�� �Է��� Ŭ������ ã�� ��ü�� ����
			
		//3. ����(Connection)			//url,user,password�� ���� DB����, ������ �����ϸ� ����conn�� ����
			conn =                  //url, user, password�� ���� ������� ��ü�� ���� 
					DriverManager.getConnection(url, user, password);
			System.out.println(conn); //conn���
	
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
		} catch (SQLException e) {
			System.out.println("DB���� ����");                        
			e.printStackTrace();
		}
			 
		//4. SQL�� �ۼ� 
		//(����� �޿��� 1500�̻��� ����� ���, �̸�, �޿�)
		String sql = "SELECT EMPNO, ENAME, SAL FROM EMP WHERE SAL>=1500";
			
		 
		try {
			//5. ���� ��ü ����
			pstmt = conn.prepareStatement(sql); //������� pstmr�� ����
			//6. ���� (select => ResulSet)
			rs = pstmt.executeQuery(); //��üpstmt�� executQuery()�޼ҵ带 ���� ������ ����� rs�� ����
			System.out.println(rs); //rs���
			
			//7. �о�ͼ� ���ڵ庰�� ���� ó��
			while(rs.next()) {
				String empno = rs.getString("empno");
				String ename = rs.getString("ename");
				int sal = rs.getInt("sal");
				System.out.println(empno+" : "+ename+" : "+sal);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			//8. �ڿ��ݳ�
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
