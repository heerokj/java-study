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
	Font f = new Font("���ü",Font.PLAIN,20);
	
	SignUp(){
		
		//��ġ������ ��� ����
		setLayout(null);
		
		//������Ʈ �ʱ�ȭ		
		jlId = new JLabel("ID");
		jlPw = new JLabel("PW");
		jlName = new JLabel("�̸�");
		jlSex = new JLabel("����");
		jlReason = new JLabel("���Ե���");
		
		jtfId = new JTextField();
		jtfId.setFont(f);
		jtfPw = new JTextField();
		jtfPw.setFont(f);
		jtfName = new JTextField();
		jtfReason = new JTextField();	
		jtfReason.setFont(f);
		
		jbtnCheck = new JButton("�ߺ�Ȯ��");
		jbtnSignUp = new JButton("ȸ������");
		jbtnCancle = new JButton("���");
		
		jcbMen = new JCheckBox("��");
		jcbWomen = new JCheckBox("��");
		
		
		//����
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
		
		//������Ʈ ��ġ, ũ�� ����
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
		
		//�̺�Ʈ�߰� 
		jbtnCheck.addActionListener(this);
		jbtnSignUp.addActionListener(this);
		jbtnCancle.addActionListener(this);
		
		
		
		//â ��ġ, ũ�� ����
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBackground(Color.cyan );
		setBounds(400, 50, 500, 700);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		SignUp su = new SignUp(); //SignUp����
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj == jbtnCheck) {
			
			//1. ��������
			String driver = "oracle.jdbc.driver.OracleDriver"; 
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";	
			String user = "scott";
			String password = "tiger";		
			ResultSet rs = null; 
			PreparedStatement pstmt = null; 
			Connection conn = null; 
			
			//2. JDBC ����̹� �ε��Ǿ� �ִ��� ���� üũ
			try {
				Class.forName(driver);
			//3. ����(Connection)			
				conn = 
						DriverManager.getConnection(url, user, password);
			
				System.out.println("conn : " + conn);
			} catch (ClassNotFoundException e1) {
				System.out.println("����̹� �ε� ����");
			} catch (SQLException e1) {
				System.out.println("DB���� ����");
				e1.printStackTrace();
			}

			//4. SQL�� �ۼ�
			String sql = "SELECT ID, ENAME, PW FROM MEMBER WHERE ID = ?";
					
			//5. ���� ��ü ����
			Boolean isOK = null;
			String id = null; //?
			try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, id );
			//6. ���� (select => ResulSet)
				rs = pstmt.executeQuery();
				isOK = rs.next();
			//7. �о�ͼ� ���ڵ庰�� ���� ó��
				if(isOK) {
					JOptionPane.showConfirmDialog(this,
			  				"�̹� �����ϴ� ���̵��Դϴ�. Ȯ�� �� �ٽ� �õ����ּ���.",
							"Ȯ��",JOptionPane.PLAIN_MESSAGE);
				}else{
					JOptionPane.showConfirmDialog(this,
							"��� �� �� �ִ� ���̵��Դϴ�.","Ȯ��",
							JOptionPane.PLAIN_MESSAGE);
				} 
			
			} catch (SQLException e1) {		
				e1.printStackTrace();
			}finally {
				//8. �ڿ��ݳ�
				try {
					if (rs != null)rs.close();
					if (pstmt != null)pstmt.close();
					if (conn != null)conn.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
			    }
		   }	
		}else if (obj == jbtnSignUp) { //�ٽ� üũ�ϱ�!!!!!
			System.out.println("ȸ�� ���� ��ư Ŭ���Ͽ����ϴ�.");
			//1. ��������
			String driver = "oracle.jdbc.driver.OracleDriver";
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";	
			String user = "scott";
			String password = "tiger";		
			ResultSet rs = null;
			PreparedStatement pstmt = null; 
			Connection conn = null;
			//2. JDBC ����̹� �ε��Ǿ� �ִ��� ���� üũ
			try {	
				Class.forName(driver);
			//3. ����(Connection)			
				conn = DriverManager.getConnection(url, user, password);
				System.out.println(conn);
			} catch (ClassNotFoundException e1) {
				System.out.println("����̹� �ε� ����");
			} catch (SQLException e1) {
				System.out.println("DB���� ����");                        
				e1.printStackTrace();
			}	
			//4. SQL�� �ۼ�
			String sql = "INSERT INTO member VALUES(?,?,?,?)";						
			//5. ���� ��ü ����
			try {
				conn.prepareStatement(sql);
			//6. ���� (select => ResulSet)
				pstmt.executeUpdate();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}finally {
				//8. �ڿ��ݳ�
				try {
					if (pstmt != null)pstmt.close();
					if (conn != null)conn.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}					
					
		}else if(obj == jbtnCancle) {
			System.out.println("��� ��ư Ŭ���Ͽ����ϴ�.");
			new NewLogin();
			this.setVisible(false);
		}
		
	}
}
