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

public class Register extends JFrame implements ActionListener{
	
	JLabel jlbId, jlbPw, jlbName, jlbGender, jlbReason;
	JTextField jtfId, jtfPw, jtfName, jtfReason;
	JButton jbtnCheck, jbtnSignUp, jbtnCancle;
	JCheckBox jcbMale, jcbFemale;
	Font f = new Font("고딕체",Font.PLAIN,20);
	boolean flag;
	String gid; //글로벌아이디
	
	Register(){
		
		//배치관리자 사용 안해
		setLayout(null);
		
		//컴포넌트 초기화		
		jlbId = new JLabel("ID");
		jlbPw = new JLabel("PW");
		jlbName = new JLabel("이름");
		jlbGender = new JLabel("성별");
		jlbReason = new JLabel("가입동기");
		
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
		
		jcbMale = new JCheckBox("남");
		jcbFemale = new JCheckBox("여");
		
		
		//부착
		add(jlbId);
		add(jlbPw); 
		add(jlbName);
		add(jlbGender);
		add(jlbReason);

		add(jtfId);
		add(jtfPw);
	    add(jtfName);
		add(jtfReason);
		
		add(jbtnCheck);
		add(jbtnSignUp);
		add(jbtnCancle);
		
		add(jcbMale);
		add(jcbFemale);
		
		//컨포넌트 위치, 크기 설정
		jlbId.setBounds(50,30,50,50);
		jlbPw.setBounds(50,80,50,50);
		jlbName.setBounds(50,130,50,50);
		jlbGender.setBounds(50,180,50,50);
		jlbReason.setBounds(40,350,50,50);

		jtfId.setBounds(150,50,150,30);
		jtfPw.setBounds(150,100,150,30);
		jtfName.setBounds(150,150,150,30);		
		jtfReason.setBounds(120,250,320,300);

		jbtnCheck.setBounds(320,50,100,30);
		jbtnSignUp.setBounds(130,580,100,50);
		jbtnCancle.setBounds(300,580,100,50);
		
		jcbMale.setBounds(150,180,50,50);
		jcbFemale.setBounds(250,180,50,50);
		
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
		Register su = new Register(); //SignUp실행
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
	
		
		if(obj == jbtnCheck) {
			//System.out.println("중복체크버튼 눌림");
			String id = jlbId.getText();
			System.out.println("입력한 id : "+id);
			
	////입력한 ID aaa인 회원이 존재하는지 알아오기
	//(일단 db에 [ID ENAME PW GENDER MOTIVE]테이블 만들고 시작하자)
			
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
				System.out.println("conn : " + conn);
		
			} catch (ClassNotFoundException e1) {
				System.out.println("드라이버 로딩 실패");
			} catch (SQLException e1) {
				System.out.println("DB연결 실패");
				e1.printStackTrace();
			}

			
			//4. SQL문 작성
			String sql = "SELECT ID FROM MEMBER WHERE ID = ?";
					
			//5. 문장 객체 생성			
			try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, id);
		
			//6. 실행 (select => ResulSet)
				rs = pstmt.executeQuery();
				flag = rs.next();
			
			//7. 읽어와서 레코드별로 로직 처리
				if(flag == false) { //아이디 중복되지 않는다면 즉, 이런 아이디를 가진 회원이 존재하지 않는다.(dataset에 '회원가입창에서 입력한 아이디'가 없다는 뜻)
					JOptionPane.showConfirmDialog(this,
			  				"사용할 수 있는 아이디입니다.",
							"확인",JOptionPane.PLAIN_MESSAGE);
				}else{ //true이면 아이디 중복
					JOptionPane.showConfirmDialog(this,
							"이미 존재하는 아이디입니다. 확인 후 다시 시도해주세요.","확인",
							JOptionPane.PLAIN_MESSAGE);
					//기존내용지우기
					jtfId.setText("");
					//커서위치이동
					jtfId.requestFocus();
				} 
				System.out.println("flag :"+flag); 
				System.out.println("gid :"+gid); 
				
			
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


	////회원가입하여 db에 정보 추가하기		 
		}else if (obj == jbtnSignUp) { 
			//System.out.println("회원 가입 버튼 클릭하였습니다.");			
			String id = jtfId.getText();
			
			//*마지막 순간에 이이디를 'dataset에 있는 아이디'로 바꾸지 못하게 하기
			//아이디체크 => 기록 gid현재 입력한 id가 동일 할때만 db에 추가
			if(flag == false && gid.equals(id)){
				String pw = jtfPw.getText();
				String name = jtfName.getText();
				String reason = jtfReason.getText();
				System.out.println(jcbMale.isSelected()); //선택이되었으면 true /아니면 flase 리턴
				System.out.println(jcbFemale.isSelected());
				String gender = ""; 
				
				if(jcbMale.isSelected() == true && jcbMale.isSelected() == false) {
					gender = "남";
				}else if(jcbMale.isSelected() == false && jcbMale.isSelected() == true) {
					gender = "여";
				}
			
		////현재입력값을 db에 넣어주기
				
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
				//System.out.println(conn);
		
			} catch (ClassNotFoundException e1) {
				System.out.println("드라이버 로딩 실패");
			} catch (SQLException e1) {
				System.out.println("DB연결 실패");                        
				e1.printStackTrace();
			}	
			
			//4. SQL문 작성
			String sql = "INSERT INTO member VALUES(?,?,?,?,?)"; //아이디 이름 패스워드 젠더 모티브					
		
			//5. 문장 객체 생성
			try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, gid);
				pstmt.setString(2, name);
				pstmt.setString(3, password);
				pstmt.setString(4, gender);
	 			pstmt.setString(5, reason);
				
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
			new Login();
			this.setVisible(false);
			
			/*
			//기존에 입력한 내용을 지우기
			jtfId.setText("");
			jtfPw.setText("");
			jtfName.setText("");
			jcbMale.setText("");
			jcbFemale.setText("");
			jtaEtc.setText("");
			*/
			
		}
		
	}
}
}