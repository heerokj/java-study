package day19hw;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class SignUp extends JFrame implements ActionListener{
	
	JLabel jlId, jlPw, jlName, jlSex, jlReason;
	JTextField jtfId, jtfPw, jtfName, jtfReason;
	JButton jbtnCheck, jbtnSignUp, jbtnCancle;
	JCheckBox jcbMen, jcbWomen;
	Font f = new Font("고딕체",Font.PLAIN,20);
	
	SignUp(){
		
		//배치관리자 사용 안해
		setLayout(null);
		
		//컴포넌트 초기화		
		jlId = new JLabel("ID");
		jlPw = new JLabel("PW");
		jlName = new JLabel("이름");
		jlSex = new JLabel("성별");
		jlReason = new JLabel("가입동기");
		
		jtfId = new JTextField();
		jtfId.setFont(f);
		jtfPw = new JTextField();
		jtfPw.setFont(f);
		jtfName = new JTextField();
		jtfReason = new JTextField();	
		jtfReason.setFont(f);
		
		jbtnCheck = new JButton("중복확인");
		jbtnSignUp = new JButton("회원가입");
		jbtnCancle = new JButton("취소");
		
		jcbMen = new JCheckBox("남");
		jcbWomen = new JCheckBox("여");
		
		
		//부착
		add(jlId);
		add(jlPw); 
		add(jlName);
		add(jlSex);
		add(jlReason);

		add(jtfId);
		add(jtfPw);
	    add(jtfName);
		add(jtfReason);
		
		add(jbtnCheck);
		add(jbtnSignUp);
		add(jbtnCancle);
		
		add(jcbMen);
		add(jcbWomen);
		
		//컨포넌트 위치, 크기 설정
		jlId.setBounds(50,30,50,50);
		jlPw.setBounds(50,80,50,50);
		jlName.setBounds(50,130,50,50);
		jlSex.setBounds(50,180,50,50);
		jlReason.setBounds(40,350,50,50);

		jtfId.setBounds(150,50,150,30);
		jtfPw.setBounds(150,100,150,30);
		jtfName.setBounds(150,150,150,30);		
		jtfReason.setBounds(120,250,320,300);

		jbtnCheck.setBounds(320,50,100,30);
		jbtnSignUp.setBounds(130,580,100,50);
		jbtnCancle.setBounds(300,580,100,50);
		
		jcbMen.setBounds(150,180,50,50);
		jcbWomen.setBounds(250,180,50,50);
		
		jbtnCheck.setBackground(Color.white);
		jbtnCheck.setForeground(Color.red);
		
		jbtnSignUp.setBackground(Color.blue);
		jbtnSignUp.setForeground(Color.white);
		
		jbtnCancle.setBackground(Color.white);
		jbtnCancle.setForeground(Color.blue);
		
		//이벤트추가 
		jbtnCheck.addActionListener(this);
		jbtnSignUp.addActionListener(this);
		jbtnCancle.addActionListener(this);
		
		
		
		//창 위치, 크기 설정
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBackground(Color.cyan );
		setBounds(400, 50, 500, 700);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		SignUp su = new SignUp(); //SignUp실행
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj == jbtnCheck) {
			
			//1. 변수선언
			String driver = "oracle.jdbc.driver.OracleDriver"; 
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";	
			String user = "scott";
			String password = "tiger";		
			ResultSet rs = null; 
			PreparedStatement pstmt = null; 
			Connection conn = null; 
			
			//2. JDBC 드라이버 로딩되어 있는지 여부 체크
			try {
				Class.forName(driver);
			//3. 연결(Connection)			
				conn = 
						DriverManager.getConnection(url, user, password);
			
				System.out.println("conn : " + conn);
			} catch (ClassNotFoundException e1) {
				System.out.println("드라이버 로딩 실패");
			} catch (SQLException e1) {
				System.out.println("DB연결 실패");
				e1.printStackTrace();
			}

			//4. SQL문 작성
			String sql = "SELECT ID, ENAME, PW FROM MEMBER WHERE ID = ?";
					
			//5. 문장 객체 생성
			Boolean isOK = null;
			String id = null; //?
			try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, id );
			//6. 실행 (select => ResulSet)
				rs = pstmt.executeQuery();
				isOK = rs.next();
			//7. 읽어와서 레코드별로 로직 처리
				if(isOK) {
					JOptionPane.showConfirmDialog(this,
			  				"이미 존재하는 아이디입니다. 확인 후 다시 시도해주세요.",
							"확인",JOptionPane.PLAIN_MESSAGE);
				}else{
					JOptionPane.showConfirmDialog(this,
							"사용 할 수 있는 아이디입니다.","확인",
							JOptionPane.PLAIN_MESSAGE);
				} 
			
			} catch (SQLException e1) {		
				e1.printStackTrace();
			}finally {
				//8. 자원반납
				try {
					if (rs != null)rs.close();
					if (pstmt != null)pstmt.close();
					if (conn != null)conn.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
			    }
		   }	
		}else if (obj == jbtnSignUp) { //다시 체크하기!!!!!
			System.out.println("회원 가입 버튼 클릭하였습니다.");
			//1. 변수선언
			String driver = "oracle.jdbc.driver.OracleDriver";
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";	
			String user = "scott";
			String password = "tiger";		
			ResultSet rs = null;
			PreparedStatement pstmt = null; 
			Connection conn = null;
			//2. JDBC 드라이버 로딩되어 있는지 여부 체크
			try {	
				Class.forName(driver);
			//3. 연결(Connection)			
				conn = DriverManager.getConnection(url, user, password);
				System.out.println(conn);
			} catch (ClassNotFoundException e1) {
				System.out.println("드라이버 로딩 실패");
			} catch (SQLException e1) {
				System.out.println("DB연결 실패");                        
				e1.printStackTrace();
			}	
			//4. SQL문 작성
			String sql = "INSERT INTO member VALUES(?,?,?,?)";						
			//5. 문장 객체 생성
			try {
				conn.prepareStatement(sql);
			//6. 실행 (select => ResulSet)
				pstmt.executeUpdate();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}finally {
				//8. 자원반납
				try {
					if (pstmt != null)pstmt.close();
					if (conn != null)conn.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}					
					
		}else if(obj == jbtnCancle) {
			System.out.println("취소 버튼 클릭하였습니다.");
			new NewLogin();
			this.setVisible(false);
		}
		
	}
}
