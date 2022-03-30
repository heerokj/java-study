package day19; //다시

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import day18.ChatClient;

public class NewLogin extends JFrame implements ActionListener {

	JLabel jlbId, jlbPw;
	JButton jbtnLogin, jbtnRegister;
	JTextField jtfId;
	JPasswordField jtfPw;
	
	NewLogin(){
		
		setLayout(null);
		
		////초기화
		jlbId = new JLabel("ID");
		jlbPw = new JLabel("PW");
		jtfId = new JTextField();
		jtfPw = new JPasswordField(); //비밀번호쓸때 **이렇게 나타남
		//ftfPw = new JTextField();
		jbtnLogin = new JButton("로그인");
		jbtnRegister = new JButton("회원가입");
		
		////위치,크기
		jlbId.setBounds(100,50,100,50);
		jlbPw.setBounds(100,150,100,50);
		jtfId.setBounds(400,50,100,50);
		jtfPw.setBounds(400,150,100,50);
		jbtnLogin.setBounds(100,300,100,50);
		jbtnRegister.setBounds(300,300,100,50);
		
		////액션리스너
		jbtnLogin.addActionListener(this);
		jbtnRegister.addActionListener(this);
		
		////부착
		add(jlbId);
		add(jlbPw);
		add(jtfId);
		add(jtfPw);
		add(jbtnLogin);
		add(jbtnRegister);
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300, 150, 600, 500);
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new NewLogin();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	
		Object obj = e.getSource();
		if(obj == jbtnLogin) {
			System.out.println("로그인 버튼 눌림");
			
			String id = jtfId.getText();
			String pw = jtfPw.getText();
			
			System.out.println(id+pw);
			
			//1. 변수선언
			String driver = "oracle.jdbc.driver.OracleDriver";
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";	
			String user = "scott";
			String password = "tiger";		
			Connection conn = null;
			ResultSet rs = null;
			PreparedStatement pstmt = null;
			
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
			String sql = "SELECT id, ename, pw FROM member WHERE "; //*
			boolean isOk = false;
			try {
				//5. 문장 객체 생성
				pstmt = conn.prepareStatement(sql);
				//?에 값 채우기 : ?bind변수
				pstmt.setString(1, id);
				pstmt.setString(2, pw);
				//6. 실행 (select => ResulSet)
				rs = pstmt.executeQuery();
				//7. 읽어와서 레코드별로 로직 처리
				isOk = rs.next();
				if(isOk) {
					System.out.println("로그인 성공 : 새로운창을 띄우기");
					new ChatClient();
					//현재창은 감추기
					this.setVisible(false);
				
				}else {
					JOptionPane.showConfirmDialog(this, "넌 누구냐","메롱",JOptionPane.PLAIN_MESSAGE);
				}			
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}finally {
				//8. 자원반납
				try {
					if(rs != null)rs.close();
					if(pstmt != null)pstmt.close();
					if(conn != null)conn.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
					
		}else if(obj == jbtnRegister) {
			System.out.println("회원가입 버튼 눌림");
		}
		
	}
	
}
