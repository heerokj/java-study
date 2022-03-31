package day19hwtest; //�̰ź��鼭 signup�ٲ㺸��

import java.awt.Color;
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
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import dao.MemberDAO;
import vo.MemberVO;

public class Register extends JFrame implements ActionListener {
	
	JLabel jlbId,jlbPw,jlbName,jlbGender,jlbEtc;
	JTextField jtfId,jtfPw,jtfName;
	JCheckBox jcbMale, jcbFemale;
	JTextArea jtaEtc;
	JPanel jp;
	JButton jbtnRegister, jbtnCancel, jbtnCheck; 
	boolean flag;
	String gid; //�۷ι����̵�
	
	Register() {
		
		flag = true; //���ξ����ϸ�  flase �Ǵϱ�
		jlbId = new JLabel("ID");
		jlbPw = new JLabel("PW");
		jlbName = new JLabel("�̸�");
		jlbGender = new JLabel("����");
		jlbEtc = new JLabel("���Ե���");
		
		jtfId = new JTextField();
		jtfPw = new JTextField();
		jtfName = new JTextField();
		
		jcbMale = new JCheckBox("��");
		jcbFemale = new JCheckBox("��");
		
		jtaEtc = new JTextArea();
		
		jbtnRegister = new JButton("ȸ�� ����");
		jbtnCancel = new JButton("���");
		jbtnCheck = new JButton("�ߺ�Ȯ��");
		
		Color c = new Color(240,255,255);
		jp = new JPanel();
		jp.setBackground(c);
		jp.setLayout(null);
		
		jlbId.setBounds(80,100,100,25);
		jlbPw.setBounds(80,150,100,25);
		jlbName.setBounds(80,200,100,25);
		jlbGender.setBounds(80,250,100,50);
		jlbEtc.setBounds(80,400,100,50);
		
		jtfId.setBounds(180,100,150,25);
		jtfPw.setBounds(180,150,150,25);
		jtfName.setBounds(180,200,150,25);
		
		jcbMale.setBounds(180,250,50,50);
		jcbFemale.setBounds(280,250,50,50);
		
		jtaEtc.setBounds(180,350,200,200);
		
		jbtnRegister.setBounds(100,600,100,50);
		jbtnCancel.setBounds(300,600,100,50);
		jbtnCheck.setBounds(350,100,100,25);
		
		jbtnRegister.addActionListener(this);
		jbtnCancel.addActionListener(this);
		jbtnCheck.addActionListener(this);
		
		jp.add(jlbId);
		jp.add(jlbPw);
		jp.add(jlbName);
		jp.add(jlbGender);
		jp.add(jlbEtc);
		
		jp.add(jtfId);
		jp.add(jtfPw);
		jp.add(jtfName);
		
		jp.add(jcbMale);
		jp.add(jcbFemale);
		
		jp.add(jtaEtc);
		
		jp.add(jbtnRegister);
		jp.add(jbtnCancel);
		jp.add(jbtnCheck);
				
		add(jp);
		
		
		setTitle("ȸ������");
		setBounds(100,100,500,700);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
	}
	public static void main(String[] args) {
		new Register();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj == jbtnCheck) {
		//System.out.println("üũ��ư ����");
			String id = jlbId.getText();
			System.out.println("�Է���id :"+id);
			
			MemberDAO dao = new MemberDAO(); //db������ �̷��� ������
			MemberVO vo = dao.selectOne(id); 
			if(vo == null) {
				flag = false;
				}
			
	     	//7. �о�ͼ� ���ڵ庰�� ���� ó��
				if(flag == false) { //�ߺ����� �ʴ´ٸ� ��, �̷� ���̵� ���� ȸ���� �������� �ʴ´�.
					gid = id; //���� id�� ���������� ��Ƶα�
					JOptionPane.showConfirmDialog(this,
							"��� �� �� �ִ� ���̵��Դϴ�.","Ȯ��",
							JOptionPane.PLAIN_MESSAGE);
				}else{
					JOptionPane.showConfirmDialog(this,
			 				"�̹� �����ϴ� ���̵��Դϴ�. Ȯ�� �� �ٽ� �õ����ּ���.",
							"Ȯ��",JOptionPane.PLAIN_MESSAGE);
					//���� ���� �����
					jtfId.setText("");
					//Ŀ����ġ�̵�
					jtfId.requestFocus();
					
				}
				System.out.println("flag :"+flag);
				System.out.println("gid : "+gid);
	
		
				
		}else if (obj == jbtnRegister) {
			//System.out.println("��Ϲ�ư����");
			String id = jtfId.getText();
			//������������ ���̵� �������ִ¾��̵�� �ٲ��� ���ϰ� �ϱ�*
			//���̵�üũ => ���gid ���� �Է��� id�� ���� �ҋx�� db�� ������ �߰�
			if(flag == false && gid.equals(id)) {
			String pw = jtfPw.getText();
			String name = jtfName.getText();

			String motive = jtaEtc.getText();
			System.out.println(jcbMale.isSelected()); //�����̵Ǿ����� true /�ƴϸ� flase ����
			System.out.println(jcbFemale.isSelected());
			String gender = "";
			
			if(jcbMale.isSelected() == true && jcbMale.isSelected() == false) {
				gender = "��";
			}else if(jcbMale.isSelected() == false && jcbMale.isSelected() == true) {
				gender = "��";
			}
			MemberDAO dao = new MemberDAO();
			MemberVO vo = new MemberVO(gid, name, pw, gender, motive);
			dao.insertOne(vo);
			}
					
		}else if (obj == jbtnCancel) {
			System.out.println("��ҹ�ư ����");
			//������ �Է��� ������ �����
			jtfId.setText("");
			jtfPw.setText("");
			jtfName.setText("");
			jcbMale.setText("");
			jcbFemale.setText("");
			jtaEtc.setText("");
		}

	}
}
