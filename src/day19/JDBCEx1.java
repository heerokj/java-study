package day19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCEx1 {
	public static void main(String[] args) {
		
/////////DB�����ϱ�(�׻���)////////
		
		//1. ��������
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		//jdbc ���� oracle����
		//thin : �淮����̹�
		//@���Ӽ����� IP : ������ �ּ� : 192.168.0.4 (�ٵ� �ٲ���־.. localhost ����)
		//���port : 1521
		//����db�̸� : orcl
		
		String user = "scott";
		String password = "tiger";
		
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		
		//2. JDBC ����̹� �ε��Ǿ� �ִ��� ���� üũ
		Connection conn = null;
		try {	
			//forName�� Ŭ������ Ǯ�̸��� �Է¹޾� Ŭ������ ã���� �� Ŭ������ ��ü�� �����ϰ� ��ã����
			//���� �߻���Ű�� �޼���
			Class.forName(driver); //����̹� �ε�
			
			//3. ����(Connection)
			conn = 
					DriverManager.getConnection(url,user,password);

			System.out.println("conn :" + conn); // �߿���Ǿ������� ���
			
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
		} catch (SQLException e) {
	     	System.out.println("DB ���� ����");
			e.printStackTrace();
		}
		
		//4. SQL�� �ۼ�
		String sql = "SELECT * FROM DEPT";
		
		try { //�����Ϸ��� ��ü �����ؾ���
			//5. ���� ��ü ����
			pstmt = conn.prepareStatement(sql); //������ �� ������
			//6. ���� (select => ResultSet)
			rs = pstmt.executeQuery(); //������ �� ������
			System.out.println("rs :" + rs);
			
			//7. �о�ͼ� ���ڵ庰�� ���� ó��
			
		/* �ݺ��� ó�� ������
		  	
			rs.next(); //ù��° ���ڵ�� �̵�
			int deptno = rs.getInt("deptno"); // �����ͺ��̽� �÷��̸�����
			String dname = rs.getString("dname");
			String loc = rs.getString("loc");
			System.out.println(deptno+" : "+dname+" : "+loc);
			
			rs.next(); //�ι�° ���ڵ�� �̵�
			deptno = rs.getInt(1); //����>������ 2�� ������ �� ������ int, String ����
			dname = rs.getString(2); //�����ͺ��̽� ��������
			loc = rs.getString(3);			
			System.out.println(deptno+" : "+dname+" : "+loc);
			
		*/	
		
		/*	
			for(int i = 0; i < 4; i++) { 
			    Boolean value = rs.next(); //�������������� true
			    System.out.println(value);
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				System.out.println(deptno+" : "+dname+" : "+loc);
			}
		
		*/	
			
			while(rs.next()) { //rs.next()�� true�ϰ�쿡 ���� ����(��, �����ͺ��̽����� �������� ������ ���Ͻ���)
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				System.out.println(deptno+" : "+dname+" : "+loc);
			}
					
		} catch (SQLException e) {
			e.printStackTrace();
			
			//8. �ڿ��ݳ� 
		}finally { //���ܰ��߻��ϵ� ���� ������ :finally
			try {
				if(rs != null)rs.close(); //���帶������ �Ѱ� rs�̴� ����close�ϱ�?				
				if(pstmt != null)pstmt.close(); 
				if(conn != null)conn.close(); 
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
				
		
		
		
		
	}
}
