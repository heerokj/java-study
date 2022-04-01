package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vo.DeptVO;
import vo.MemberVO;

//CRUD 작업 : Create Read Update Delete
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
	MemberVO mvo;
	
	public MemberDAO() {
 
	// 2. JDBC 드라이버 로딩되어 있는지 여부 체크
		try {
				 
				Class.forName(driver);

	// 3. 연결(Connection)
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("conn : " + conn); // conn의 참조값 출력
		
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
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		//4. SQL문 작성
		sb.setLength(0); // sql문 초기화
		sb.append("SELECT ID, ENAME, PW, GENDER, MOTIVE FROM MEMBER"); // SQL문 작성

		try {

			pstmt = conn.prepareStatement(sb.toString()); // SQL문 객체화

			rs = pstmt.executeQuery(); // SQL문 실행 및 rs에 결과값 담기

			while (rs.next()) { // 다음 레코드값으로 이동, 레코더가 더이상 없을때까지 반복실행

				String id = rs.getString("ID"); // String형 변수 id에 ID Column값 대입
				String ename = rs.getString("ENAME"); // String형 변수 ename에 ENAME Column값 대입
				String pw = rs.getString("PW"); // String형 변수 pw에 PW Column값 대입
				String gender = rs.getString("GENDER"); // String형 변수 gender에 GENDER Column값 대입
				String motive = rs.getString("MOTIVE"); // String형 변수 motive에 MOTIVE Column값 대입

				mvo = new MemberVO(id, ename, pw, gender, motive); // MemberVO 객체 생성 후 매개변수로 변수값 대입
				list.add(mvo); // mvo 객체 list에 추가
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}
	
	
	//1건조회
	public MemberVO selectOne(String id) {
		
		//4. SQL문 작성
		sb.setLength(0);
		sb.append("SELECT id, ename, pw, gender, motive FROM MEMBER WHERE id = ? ");
	
		//5. 문장 객체 생성
		
			try {
				pstmt = conn.prepareStatement(sb.toString());
				pstmt.setString(1, id);
		//6. 실행 (select => ResulSet)
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
		
		//6. 실행 (select => ResulSet)
			pstmt.executeUpdate();
		
			System.out.println("데이터가 추가되었습니다.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
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