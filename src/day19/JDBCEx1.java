package day19;
//JDBC �� �ڹٿ��� �����ϴ� �����ͺ��̽��� �����Ͽ� �����͸� �ְ� ���� �� �ֵ��� �ϴ� �������̽�

//*Statement Ŭ����
//- SQL ������ �����ϴ� ����
//- �����δ� SQL ���� ���� ����(�����ؼ� X) -> ���޿���
//- SQL ���� O + ���� ���� X

//*PreparedStatement Ŭ����
//- Statement Ŭ������ ��� ���
//- ���ڿ� ���õ� �۾��� Ưȭ(�Ű�����)
//- �ڵ� ������ ����. ������ ����.
//- �ڵ差�� ���� -> �Ű������� set������ϱ� ������..
//- �ؽ�Ʈ SQL ȣ��

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCEx1 {
	public static void main(String[] args) {
		
/////////DB�����ϱ�(�׻���)////////
		
	 ////1. ��������
		String driver = "oracle.jdbc.driver.OracleDriver"; // ��Ű����+Ŭ������
		String url = "jdbc:oracle:thin:@localhost:1521:orcl"; 
		//jdbc ���� oracle����
		//thin : �淮����̹�
		//@���Ӽ����� IP : ������ �ּ�  192.168.0.4 (�ٵ� �ٲ���־.. localhost ����) 
		//���port : 1521
		//������ DB�̸� : orcl
		
		String user = "scott"; //DB�� �������̵�
		String password = "tiger"; //DB�� ���� �н�����
		
		PreparedStatement pstmt = null; //PreparedStatement��ü ����pstmt ����
		ResultSet rs = null; //ResultSet��ü ����rs����
		
		
		
	  ////2. JDBC ����̹� �ε��Ǿ� �ִ��� ���� üũ
		
		Connection conn = null; //Connection��ü ����conn����
		try {	
			//forName�� Ŭ������ Ǯ�̸��� �Է¹޾� Ŭ������ ã���� �� Ŭ������ ��ü�� �����ϰ� ��ã����
			//���� �߻���Ű�� �޼���
			Class.forName(driver); //����̹� �ε�
			
	  ////3. ����(Connection)
			conn =                        //url,user,password�� ���� DB����, ������ �����ϸ� ����conn�� ����
					DriverManager.getConnection(url,user,password);  

			System.out.println("conn :" + conn); // �߿���Ǿ������� ���
			
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
		} catch (SQLException e) {
	     	System.out.println("DB ���� ����");
			e.printStackTrace();
		}
		
	  
	  ////4. SQL�� �ۼ�
		String sql = "SELECT * FROM DEPT";
		
		try { //�����Ϸ��� ��ü �����ؾ���
	  
	  ////5. ���� ��ü ���� ->PreparedStatement : *���� ��������!
			pstmt = conn.prepareStatement(sql); //���������� ������ // sql���� ���޹޾� ����pstmt�� ����
	  System.out.println(pstmt);
	
	  ////6. ���� (select => ResultSet)                  //executeQuery() : �������� ResultSet ��ü�� ���� ��ȯ
			rs = pstmt.executeQuery(); //���������� ������  // ��ü pstmt�� executQuery() �޼ҵ带 ���� ����� ����
			System.out.println("rs :" + rs); // DB�κ��� dataSet�� ������ �� 
			
	  ////7. �о�ͼ� ���ڵ庰�� ���� ó��
			
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
			
			//8. �ڿ��ݳ� : i/o, network, DB�� ��� �ڿ��� �ݳ����ش�
		}finally { //���ܰ��߻��ϵ� ���� ������ :finally
			try {
				if(rs != null)rs.close(); //���帶������ �Ѱ� rs�̴� ����close�ϱ� 
				if(pstmt != null)pstmt.close();   //null�ϰ�� ������ ������Ʈ �ͼ����� �߻�		                                 
				if(conn != null)conn.close();    //��¥�� null �ε� close()�� ���ϳĴ� �ǹ�. ������ ���¿� ����ϱ� ���� ���� null üũ�� �ϴ°�				
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
					
	}
}
