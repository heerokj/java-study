package dao; //�ٽ� üũ�ϱ�

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vo.DeptVO;

public class DeptDAO {
	//1. ��������
	String driver = "oracle.jdbc.driver.OracleDriver"; 
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";	
	String user = "scott";
	String password = "tiger";		
	Connection conn = null; 
	PreparedStatement pstmt = null; 
	ResultSet rs = null; 
	StringBuffer sb = new StringBuffer();
	
	public DeptDAO() {
		// 2. JDBC ����̹� �ε��Ǿ� �ִ��� ���� üũ
		try {
			Class.forName(driver);
			// 3. ����(Connection)
			conn = DriverManager.getConnection(url, user, password);
			System.out.println(conn);
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
		} catch (SQLException e) {
			System.out.println("DB���� ����");
			e.printStackTrace();
		}
	}// constructor end
				
	
	//4~7������ �޼ҵ�� �����
	//���̺��� ��� ������ �������� / �޼����̸��� selectAll 
	public ArrayList selectAll(){	
		ArrayList<DeptVO> list = new ArrayList<DeptVO>(); //DeptVO�� ���� �� �ֵ���
	//4. SQL�� �ۼ�
		sb.append("SELECT deptno, dname, loc FROM DEPT");	
	//5. ���� ��ü ����
			try {
				pstmt = conn.prepareStatement(sb.toString());
				//6. ���� (select => ResulSet)
				rs = pstmt.executeQuery();
				while(rs.next()) {
					int deptno = rs.getInt("deptno");
					String dname = rs.getString("dname");
					String loc = rs.getString("loc");
					//7. �о�ͼ� ���ڵ庰�� ���� ó��
					//System.out.println(deptno+" : "+dname+" : " +loc);
					DeptVO vo = new DeptVO(deptno, dname,loc);
					list.add(vo); 
				
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
	} 
			
	
	
///// ������ 1�� ��ȸ
	public DeptVO selectOne(int no) { //no�� �μ���ȣ
			
		//4. SQL�� �ۼ�
		//SQL�� �ʱ�ȭ
		sb.setLength(0); //�������� ��ġ�� �ʵ���!  append ������
		sb.append("SELECT * FROM dept WHERE DEPTNO = ? "); //append �������� �ٿ���� ��
		System.out.println(sb.toString());
		//5. ���� ��ü ����
		DeptVO vo = null; //�����Ҷ� ����ϱ����� ���⿡ ��������
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, no);
			//6. ���� (select => ResulSet)
			rs = pstmt.executeQuery();
			//7. �о�ͼ� ���ڵ庰�� ���� ó��
			rs.next(); //�Ѱ��ۿ� ������ �� �ݺ����Ƚ��
			String dname = rs.getString("dname");
			String loc = rs.getString("loc");
			vo = new DeptVO(no, dname, loc);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
		return vo;
     }
	
	
	
/////�߰�
	public void insertOne(DeptVO vo) {			
		//4. SQL�� �ۼ�
		sb.setLength(0);
		sb.append("INSERT INTO dept VLAUES (dept_deptno.nextval, ? , ?) ");
		//5. ���� ��ü ����
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1,vo.getDname());
			pstmt.setString(2,vo.getLoc());
			//6. ���� (select => ResulSet)
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
	}
	
	
	
/////����	
	public void updateOne(int deptno, String loc) {
		//4. SQL�� �ۼ�
		sb.setLength(0);
		sb.append("UPDATE dept SET LOC = ? WHERE deptno = ? ");
		//5. ���� ��ü ����
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1,loc);
			pstmt.setInt(2,deptno);
			//6. ���� (select => ResulSet)
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	

	
/////���� ..�ٽ�..
	public void deleteOne(int deptno) {
		//4. SQL�� �ۼ�
		sb.setLength(0);
		sb.append("DELETE dept ");
		sb.append("WHERE deptno = ? ");
		//5. ���� ��ü ����
		try {
			pstmt = conn.prepareStatement(sb.toString());
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//6. ���� (select => ResulSet)
	}
	
	

	
/////8. �ڿ��ݳ�
	public void close() {
			try {
			if(rs != null)rs.close();
			if(pstmt != null)pstmt.close();
			if(conn != null)conn.close();			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
