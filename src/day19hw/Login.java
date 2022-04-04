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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import day18.ChatClient;


public class Login extends JFrame implements ActionListener {

	JLabel jlbId, jlbPw;
	JButton jbtnLogin, jbtnRegister;
	JTextField jtfId;
	JPasswordField jtfPw;
	Font f = new Font("���ü",Font.PLAIN,25);
	
	Login(){
		 
		setLayout(null);
		
		////�ʱ�ȭ
		jlbId = new JLabel("ID");
		jlbPw = new JLabel("PW");
		
		jtfId = new JTextField();
		jtfId.setFont(f);
		//ftfPw = new JTextField();
		jtfPw = new JPasswordField(); //��й�ȣ���� **�̷��� ��Ÿ��
		jtfPw.setFont(f);
		
		jbtnLogin = new JButton("�α���");
		jbtnRegister = new JButton("ȸ������");
		
		
		
		////��ġ,ũ��
		jlbId.setBounds(100,50,100,50);
		jlbPw.setBounds(100,150,100,50);
		jtfId.setBounds(250,50,150,50);
		jtfPw.setBounds(250,150,150,50);
		jbtnLogin.setBounds(100,300,100,50);
		jbtnRegister.setBounds(300,300,100,50);
		
		////�׼Ǹ�����
		jbtnLogin.addActionListener(this);
		jbtnRegister.addActionListener(this);
		
		////����
		add(jlbId);
		add(jlbPw);
		add(jtfId);
		add(jtfPw);
		add(jbtnLogin);
		add(jbtnRegister);
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(400, 150, 500, 500);
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new Login();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	
		Object obj = e.getSource();
		if(obj == jbtnLogin) {
			System.out.println("�α��� ��ư ����");
			
			String id = jtfId.getText();
			String pw = jtfPw.getText();
			
			System.out.println("ID : "+id+", "+"PW : "+pw);
			
			//1. ��������
			String driver = "oracle.jdbc.driver.OracleDriver";
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";	
			String user = "scott";
			String password = "tiger";		
			Connection conn = null;
			ResultSet rs = null;
			PreparedStatement pstmt = null;
			
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
			String sql = "SELECT id, ename, pw FROM member WHERE id = ? and pw =?";
			
			boolean isOk = false;
			try {
				//5. ���� ��ü ����
				pstmt = conn.prepareStatement(sql);
				//�� �� ä��� : bind����
				pstmt.setString(1, id);
				pstmt.setString(2, pw);
				//6. ���� (select => ResulSet)
				rs = pstmt.executeQuery();
				//7. �о�ͼ� ���ڵ庰�� ���� ó��
				isOk = rs.next(); //rs.next();�� true�� ��� isOK �� ����
				if(isOk) {  //true �̸� ��, �о�� �����Ͱ� ������
					System.out.println("�α��� ���� : ���ο�â�� ����");
				
					JOptionPane.showConfirmDialog(this,"�α��� ����","",JOptionPane.PLAIN_MESSAGE);
					new ChatClient();
					//����â�� ���߱�
					this.setVisible(false);
					
				
				}else {
					JOptionPane.showConfirmDialog(this, 
							"�α��� �����߽��ϴ�. ID�Ǵ� ��й�ȣ�� Ȯ�� �� �ٽ� �õ����ּ���.",
							"Ȯ��",JOptionPane.PLAIN_MESSAGE);
					
				}			
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}finally {
				//8. �ڿ��ݳ�
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
			System.out.println("ȸ������ ��ư ����");
			//new SignUp();
			new Register_sample();
			//����â�� ���߱�
			this.setVisible(false);
		}
		
	}
	
}
