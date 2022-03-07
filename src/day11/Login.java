package day11;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends Frame implements ActionListener {

	Button btnLogin, btnReset;
	Label lbID, lbPw;
	TextField tfId, tfPw;

	Login() {
		// 배치관리자 사용안할거야
		setLayout(null);
		// 컴포넌트 초기화
		btnLogin = new Button("LOGIN");
		btnReset = new Button("RESET");
		lbID = new Label("ID", Label.CENTER);
		lbPw = new Label("PW", Label.CENTER);
		tfId = new TextField();
		tfPw = new TextField();
		// 각 컴포넌트의 크기, 위치
		lbID.setBounds(100, 80, 140, 50);
		lbID.setBackground(Color.red);

		lbPw.setBounds(100, 200, 140, 50);
		lbPw.setBackground(Color.red);

		tfId.setBounds(350, 80, 140, 50);
		tfPw.setBounds(350, 200, 140, 50);
		
		btnLogin.setBounds(150, 300, 100, 60);
		btnReset.setBounds(350, 300, 100, 60);
		// 이벤트소스 결정 : btnLogin, btnReset
		// 이벤트 리스너 부착 : ActionListener
		btnLogin.addActionListener(this);
		btnReset.addActionListener(this);
		
		//font
		Font f = new Font("고딕",Font.BOLD,30);
		tfId.setFont(f);
		tfPw.setFont(f);
		
		//패스워드는 별로 표시
		tfPw.setEchoChar('*');
		
		// 추가
		add(btnLogin);
		add(btnReset);
		add(lbID);
		add(lbPw);
		add(tfId);
		add(tfPw);

		setSize(600, 400);
		setLocation(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		Login lg = new Login();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println(e.getActionCommand());
		String cmd = e.getActionCommand();
		if (cmd.equals("LOGIN")) {
			System.out.println("LOGIN 버튼 눌림");
			//사용자가 입력한 값 가져오기..
			String id = tfId.getText();
			String pw = tfPw.getText();
			System.out.println(id+","+pw);
			
		} else if (cmd.equals("RESET")) {
			System.out.println("RESET 버튼 눌림");
			tfId.setText("");
			tfPw.setText("");
		}

	}
}
