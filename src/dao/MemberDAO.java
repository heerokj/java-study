package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vo.DeptVO;
import vo.MemberVO;

//CRUD �۾�
public class MemberDAO {
	
   // 1.��������
	String driver = "oracle.jdbc.driver.OracleDriver"; 
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";	
	String user = "scott";
	String password = "tiger";		
	Connection conn = null; 
	PreparedStatement pstmt = null; 
	ResultSet rs = null; 
	StringBuffer sb = new StringBuffer();
	
	public MemberDAO() {
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
	
	
	//�����ȸ
	// 4~7.
	public ArrayList<MemberVO> selectAll() {
		//4. SQL�� �ۼ�
		

		//5. ���� ��ü ����
				
		//6. ���� (select => ResulSet)
				
		//7. �о�ͼ� ���ڵ庰�� ���� ó��
		return null;
	}
	
	//1����ȸ
	public MemberVO selectOne(String id) {
		//4. SQL�� �ۼ�
		sb.setLength(0);
		sb.append("SELECT id, ename, pw, gender, motive FROM MEMBER WHERE id = ? ");
		//5. ���� ��ü ����
		MemberVO vo = null;
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, id);
		//6. ���� (select => ResulSet)
			rs = pstmt.executeQuery();
			while(rs.next()) {
			String pw = rs.getString("pw");
			String name = rs.getString("ename");
			String gender = rs.getString("gender");
			String motive = rs.getString("motive");
			vo = new MemberVO(id, name, pw, gender, motive);
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
		//7. �о�ͼ� ���ڵ庰�� ���� ó��
	return vo;
	}
	
	
	
	//�߰�
	public void insertOne(MemberVO vo) {
		//4. SQL�� �ۼ�
		sb.setLength(0);
		sb.append("INSERT INTO member VALUES(?, ?, ?, ? , ? ");
     	//5. ���� ��ü ����
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, vo.getId()); //vo�ȿ� ����ִ°Ŵϱ� �׳� id�ƴϰ� vo.getid��!
			pstmt.setString(2, vo.getEname());
			pstmt.setString(3, vo.getPw());
			pstmt.setString(4, vo.getGender());
			pstmt.setString(5, vo.getMotive());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		//6. ���� (select => ResulSet)
	}
	
	
	
	//����
	//����
	
	
	// 8. �ڿ��ݳ�
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

//4. SQL�� �ۼ�

//5. ���� ��ü ����
		
//6. ���� (select => ResulSet)
		
//7. �о�ͼ� ���ڵ庰�� ���� ó��