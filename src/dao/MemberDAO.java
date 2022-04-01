package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vo.DeptVO;
import vo.MemberVO;

//CRUD �۾� : Create Read Update Delete
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
	MemberVO mvo;
	
	public MemberDAO() {
 
	// 2. JDBC ����̹� �ε��Ǿ� �ִ��� ���� üũ
		try {
				 
				Class.forName(driver);

	// 3. ����(Connection)
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("conn : " + conn); // conn�� ������ ���
		
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
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		//4. SQL�� �ۼ�
		sb.setLength(0); // sql�� �ʱ�ȭ
		sb.append("SELECT ID, ENAME, PW, GENDER, MOTIVE FROM MEMBER"); // SQL�� �ۼ�

		try {

			pstmt = conn.prepareStatement(sb.toString()); // SQL�� ��üȭ

			rs = pstmt.executeQuery(); // SQL�� ���� �� rs�� ����� ���

			while (rs.next()) { // ���� ���ڵ尪���� �̵�, ���ڴ��� ���̻� ���������� �ݺ�����

				String id = rs.getString("ID"); // String�� ���� id�� ID Column�� ����
				String ename = rs.getString("ENAME"); // String�� ���� ename�� ENAME Column�� ����
				String pw = rs.getString("PW"); // String�� ���� pw�� PW Column�� ����
				String gender = rs.getString("GENDER"); // String�� ���� gender�� GENDER Column�� ����
				String motive = rs.getString("MOTIVE"); // String�� ���� motive�� MOTIVE Column�� ����

				mvo = new MemberVO(id, ename, pw, gender, motive); // MemberVO ��ü ���� �� �Ű������� ������ ����
				list.add(mvo); // mvo ��ü list�� �߰�
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}
	
	
	//1����ȸ
	public MemberVO selectOne(String id) {
		
		//4. SQL�� �ۼ�
		sb.setLength(0);
		sb.append("SELECT id, ename, pw, gender, motive FROM MEMBER WHERE id = ? ");
	
		//5. ���� ��ü ����
		
			try {
				pstmt = conn.prepareStatement(sb.toString());
				pstmt.setString(1, id);
		//6. ���� (select => ResulSet)
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String pw = rs.getString("pw");
				String ename = rs.getString("ename");
				String gender = rs.getString("gender");
				String motive = rs.getString("motive");
				mvo = new MemberVO(id, ename, pw, gender, motive);
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
		
	return mvo;
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
		
		//6. ���� (select => ResulSet)
			pstmt.executeUpdate();
		
			System.out.println("�����Ͱ� �߰��Ǿ����ϴ�.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
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