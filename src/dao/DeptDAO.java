package dao; 

//DAO(Data Access Object)

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vo.DeptVO;

public class DeptDAO {
	
	//1. 변수선언
	String driver = "oracle.jdbc.driver.OracleDriver"; 
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";	
	String user = "scott";
	String password = "tiger";		
	Connection conn = null; 
	PreparedStatement pstmt = null; 
	ResultSet rs = null; 
	StringBuffer sb = new StringBuffer();
	

	public DeptDAO() {
				
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
					
	
	
	//4~7까지는 메소드로 만들기
	
///// 테이블의 모든 데이터 가져오기 / 메서드이름을 selectAll 
	public ArrayList<DeptVO> selectAll(){// 가변 배열 ArrayList로 리턴	
		ArrayList<DeptVO> list = new ArrayList<DeptVO>(); //DeptVO만 담을 수 있도록
	
	//4. SQL문 작성
		sb.append("SELECT deptno, dname, loc FROM DEPT");	

	//5. 문장 객체 생성
			try {
				pstmt = conn.prepareStatement(sb.toString()); // SQL문 객체화 실행
				
	//6. 실행 (select => ResulSet)
				rs = pstmt.executeQuery();
				
	//7. 읽어와서 레코드별로 로직 처리
				while(rs.next()) {
					int deptno = rs.getInt("deptno");
					String dname = rs.getString("dname");
					String loc = rs.getString("loc");
					
					//System.out.println(deptno+" : "+dname+" : " +loc);

					DeptVO vo = new DeptVO(deptno, dname, loc);
					list.add(vo);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return list;
		}
	
	
	
///// 데이터 1건 조회
	public DeptVO selectOne(int no) { //no는 부서번호
			
		//4. SQL문 작성
		//SQL문 초기화
		sb.setLength(0); //위에꺼랑 겹치지 않도록!  append 때문에
		sb.append("SELECT * FROM dept WHERE DEPTNO = ? "); //append 이전꺼랑 붙여라란 뜻
		System.out.println(sb.toString());
	
		//5. 문장 객체 생성
		DeptVO vo = null; //리턴할때 사용하기위해 여기에 선언해줌
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, no);
		
		//6. 실행 (select => ResulSet)
			rs = pstmt.executeQuery();
		//7. 읽어와서 레코드별로 로직 처리
			rs.next(); //한개밖에 없으니 걍 반복문안썼다
			String dname = rs.getString("dname");
			String loc = rs.getString("loc");
			vo = new DeptVO(no, dname, loc);
	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
		return vo;
     }
	
	
	
/////추가
	public void insertOne(DeptVO vo) {			
		
		//4. SQL문 작성
		sb.setLength(0);
		sb.append("INSERT INTO DEPT VALUES (dept_deptno.nextval, ?, ?) ");
		
		//5. 문장 객체 생성
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, vo.getDname()); // 물음표값 정의
			pstmt.setString(2, vo.getLoc()); // 물음표값 정의
			
		//6. 실행 (select => ResulSet)
			pstmt.executeUpdate(); // SQL문 실행
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			
	}
	
	
	
/////변경	
	public void updateOne(int deptno, String loc) {
		
		//4. SQL문 작성
		sb.setLength(0);
		sb.append("UPDATE DEPT SET LOC = ? ");
		sb.append("WHERE DEPTNO = ? ");
		
		//5. 문장 객체 생성
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1,loc);
			pstmt.setInt(2,deptno);
			
		//6. 실행 (select => ResulSet)
			pstmt.executeUpdate();
			System.out.println("행 변경 완료");
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	

	
/////삭제 ..다시..
	public void deleteOne(int deptno) {

		// 4. SQL문 작성
		sb.setLength(0); // sb 초기화
		sb.append("DELETE DEPT WHERE DEPTNO = ? ");

		// 5. 문장 객체 생성
		try {
			pstmt = conn.prepareStatement(sb.toString()); // SQL문 객체화 실행
			pstmt.setInt(1, deptno);// 물음표값 정의
			
		// 6. 실행 (select ---> ResultSet)
			pstmt.executeUpdate(); // SQL문 실행	
			System.out.println("행 삭제 완료");
	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

	
/////8. 자원반납
	public void close() {
			try {
					if(rs != null)rs.close();
					if(pstmt != null)pstmt.close();
					if(conn != null)conn.close();			
	
					System.out.println("자원반납 완료");
		
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}