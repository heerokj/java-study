package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vo.DeptVO;
import vo.MemberVO;

//CRUD 작업
public class MemberDAO {
	
   // 1.변수선언
	String driver = "oracle.jdbc.driver.OracleDriver"; 
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";	
	String user = "scott";
	String password = "tiger";		
	Connection conn = null; 
	PreparedStatement pstmt = null; 
	ResultSet rs = null; 
	StringBuffer sb = new StringBuffer();
	
	public MemberDAO() {
    // 2. JDBC 드라이버 로딩되어 있는지 여부 체크
		try {
			Class.forName(driver);
	// 3. 연결(Connection)
			conn = DriverManager.getConnection(url, user, password);
			System.out.println(conn);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			System.out.println("DB연결 실패");
			e.printStackTrace();
		}
	}// constructor end
	
	
	//모두조회
	// 4~7.
	public ArrayList<MemberVO> selectAll() {
		//4. SQL문 작성
		

		//5. 문장 객체 생성
				
		//6. 실행 (select => ResulSet)
				
		//7. 읽어와서 레코드별로 로직 처리
		return null;
	}
	
	//1건조회
	public MemberVO selectOne(String id) {
		//4. SQL문 작성
		sb.setLength(0);
		sb.append("SELECT id, ename, pw, gender, motive FROM MEMBER WHERE id = ? ");
		//5. 문장 객체 생성
		MemberVO vo = null;
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, id);
		//6. 실행 (select => ResulSet)
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
		//7. 읽어와서 레코드별로 로직 처리
	return vo;
	}
	
	
	
	//추가
	public void insertOne(MemberVO vo) {
		//4. SQL문 작성
		sb.setLength(0);
		sb.append("INSERT INTO member VALUES(?, ?, ?, ? , ? ");
     	//5. 문장 객체 생성
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, vo.getId()); //vo안에 들어있는거니깐 그냥 id아니고 vo.getid로!
			pstmt.setString(2, vo.getEname());
			pstmt.setString(3, vo.getPw());
			pstmt.setString(4, vo.getGender());
			pstmt.setString(5, vo.getMotive());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		//6. 실행 (select => ResulSet)
	}
	
	
	
	//변경
	//삭제
	
	
	// 8. 자원반납
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

//4. SQL문 작성

//5. 문장 객체 생성
		
//6. 실행 (select => ResulSet)
		
//7. 읽어와서 레코드별로 로직 처리