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
	Font f = new Font("���ü",Font.PLAIN,20);
	boolean flag;
	String gid; //�۷ι����̵�
	
	Register(){
		
		//��ġ������ ��� ����
		setLayout(null);
		
		//������Ʈ �ʱ�ȭ		
		jlbId = new JLabel("ID");
		jlbPw = new JLabel("PW");
		jlbName = new JLabel("�̸�");
		jlbGender = new JLabel("����");
		jlbReason = new JLabel("���Ե���");
		
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
		
		jcbMale = new JCheckBox("��");
		jcbFemale = new JCheckBox("��");
		
		
		//����
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
		
		//������Ʈ ��ġ, ũ�� ����
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
		Register su = new Register(); //SignUp����
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
	
		
		if(obj == jbtnCheck) {
			//System.out.println("�ߺ�üũ��ư ����");
			String id = jlbId.getText();
			System.out.println("�Է��� id : "+id);
			
	////�Է��� ID aaa�� ȸ���� �����ϴ��� �˾ƿ���
	//(�ϴ� db�� [ID ENAME PW GENDER MOTIVE]���̺� ����� ��������)
			
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
				System.out.println("conn : " + conn);
		
			} catch (ClassNotFoundException e1) {
				System.out.println("����̹� �ε� ����");
			} catch (SQLException e1) {
				System.out.println("DB���� ����");
				e1.printStackTrace();
			}

			
			//4. SQL�� �ۼ�
			String sql = "SELECT ID FROM MEMBER WHERE ID = ?";
					
			//5. ���� ��ü ����			
			try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, id);
		
			//6. ���� (select => ResulSet)
				rs = pstmt.executeQuery();
				flag = rs.next();
			
			//7. �о�ͼ� ���ڵ庰�� ���� ó��
				if(flag == false) { //���̵� �ߺ����� �ʴ´ٸ� ��, �̷� ���̵� ���� ȸ���� �������� �ʴ´�.(dataset�� 'ȸ������â���� �Է��� ���̵�'�� ���ٴ� ��)
					JOptionPane.showConfirmDialog(this,
			  				"����� �� �ִ� ���̵��Դϴ�.",
							"Ȯ��",JOptionPane.PLAIN_MESSAGE);
				}else{ //true�̸� ���̵� �ߺ�
					JOptionPane.showConfirmDialog(this,
							"�̹� �����ϴ� ���̵��Դϴ�. Ȯ�� �� �ٽ� �õ����ּ���.","Ȯ��",
							JOptionPane.PLAIN_MESSAGE);
					//�������������
					jtfId.setText("");
					//Ŀ����ġ�̵�
					jtfId.requestFocus();
				} 
				System.out.println("flag :"+flag); 
				System.out.println("gid :"+gid); 
				
			
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


	////ȸ�������Ͽ� db�� ���� �߰��ϱ�		 
		}else if (obj == jbtnSignUp) { 
			//System.out.println("ȸ�� ���� ��ư Ŭ���Ͽ����ϴ�.");			
			String id = jtfId.getText();
			
			//*������ ������ ���̵� 'dataset�� �ִ� ���̵�'�� �ٲ��� ���ϰ� �ϱ�
			//���̵�üũ => ��� gid���� �Է��� id�� ���� �Ҷ��� db�� �߰�
			if(flag == false && gid.equals(id)){
				String pw = jtfPw.getText();
				String name = jtfName.getText();
				String reason = jtfReason.getText();
				System.out.println(jcbMale.isSelected()); //�����̵Ǿ����� true /�ƴϸ� flase ����
				System.out.println(jcbFemale.isSelected());
				String gender = ""; 
				
				if(jcbMale.isSelected() == true && jcbMale.isSelected() == false) {
					gender = "��";
				}else if(jcbMale.isSelected() == false && jcbMale.isSelected() == true) {
					gender = "��";
				}
			
		////�����Է°��� db�� �־��ֱ�
				
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
				//System.out.println(conn);
		
			} catch (ClassNotFoundException e1) {
				System.out.println("����̹� �ε� ����");
			} catch (SQLException e1) {
				System.out.println("DB���� ����");                        
				e1.printStackTrace();
			}	
			
			//4. SQL�� �ۼ�
			String sql = "INSERT INTO member VALUES(?,?,?,?,?)"; //���̵� �̸� �н����� ���� ��Ƽ��					
		
			//5. ���� ��ü ����
			try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, gid);
				pstmt.setString(2, name);
				pstmt.setString(3, password);
				pstmt.setString(4, gender);
	 			pstmt.setString(5, reason);
				
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
			new Login();
			this.setVisible(false);
			
			/*
			//������ �Է��� ������ �����
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