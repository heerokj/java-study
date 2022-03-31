package day19hwtest; //이거보면서 signup바꿔보기

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
	String gid; //글로벌아이디
	
	Register() {
		
		flag = true; //따로안정하면  flase 되니깐
		jlbId = new JLabel("ID");
		jlbPw = new JLabel("PW");
		jlbName = new JLabel("이름");
		jlbGender = new JLabel("성별");
		jlbEtc = new JLabel("가입동기");
		
		jtfId = new JTextField();
		jtfPw = new JTextField();
		jtfName = new JTextField();
		
		jcbMale = new JCheckBox("남");
		jcbFemale = new JCheckBox("여");
		
		jtaEtc = new JTextArea();
		
		jbtnRegister = new JButton("회원 가입");
		jbtnCancel = new JButton("취소");
		jbtnCheck = new JButton("중복확인");
		
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
		
		
		setTitle("회원가입");
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
		//System.out.println("체크버튼 눌림");
			String id = jlbId.getText();
			System.out.println("입력한id :"+id);
			
			MemberDAO dao = new MemberDAO(); //db연결을 이렇게 간단히
			MemberVO vo = dao.selectOne(id); 
			if(vo == null) {
				flag = false;
				}
			
	     	//7. 읽어와서 레코드별로 로직 처리
				if(flag == false) { //중복되지 않는다면 즉, 이런 아이디를 가진 회원이 존재하지 않는다.
					gid = id; //지금 id를 전역변수에 담아두기
					JOptionPane.showConfirmDialog(this,
							"사용 할 수 있는 아이디입니다.","확인",
							JOptionPane.PLAIN_MESSAGE);
				}else{
					JOptionPane.showConfirmDialog(this,
			 				"이미 존재하는 아이디입니다. 확인 후 다시 시도해주세요.",
							"확인",JOptionPane.PLAIN_MESSAGE);
					//기존 내용 지우기
					jtfId.setText("");
					//커서위치이동
					jtfId.requestFocus();
					
				}
				System.out.println("flag :"+flag);
				System.out.println("gid : "+gid);
	
		
				
		}else if (obj == jbtnRegister) {
			//System.out.println("등록버튼눌림");
			String id = jtfId.getText();
			//마지막순간에 아이디 기존에있는아이디로 바꾸지 못하게 하기*
			//아이디체크 => 기록gid 현재 입력한 id가 동일 할땨만 db에 데이터 추가
			if(flag == false && gid.equals(id)) {
			String pw = jtfPw.getText();
			String name = jtfName.getText();

			String motive = jtaEtc.getText();
			System.out.println(jcbMale.isSelected()); //선택이되었으면 true /아니면 flase 리턴
			System.out.println(jcbFemale.isSelected());
			String gender = "";
			
			if(jcbMale.isSelected() == true && jcbMale.isSelected() == false) {
				gender = "남";
			}else if(jcbMale.isSelected() == false && jcbMale.isSelected() == true) {
				gender = "여";
			}
			MemberDAO dao = new MemberDAO();
			MemberVO vo = new MemberVO(gid, name, pw, gender, motive);
			dao.insertOne(vo);
			}
					
		}else if (obj == jbtnCancel) {
			System.out.println("취소버튼 눌림");
			//기존에 입력한 내용을 지우기
			jtfId.setText("");
			jtfPw.setText("");
			jtfName.setText("");
			jcbMale.setText("");
			jcbFemale.setText("");
			jtaEtc.setText("");
		}

	}
}
