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
		// ��ġ������ �����Ұž�
		setLayout(null);
		// ������Ʈ �ʱ�ȭ
		btnLogin = new Button("LOGIN");
		btnReset = new Button("RESET");
		lbID = new Label("ID", Label.CENTER);
		lbPw = new Label("PW", Label.CENTER);
		tfId = new TextField();
		tfPw = new TextField();
		// �� ������Ʈ�� ũ��, ��ġ
		lbID.setBounds(100, 80, 140, 50);
		lbID.setBackground(Color.red);

		lbPw.setBounds(100, 200, 140, 50);
		lbPw.setBackground(Color.red);

		tfId.setBounds(350, 80, 140, 50);
		tfPw.setBounds(350, 200, 140, 50);
		
		btnLogin.setBounds(150, 300, 100, 60);
		btnReset.setBounds(350, 300, 100, 60);
		// �̺�Ʈ�ҽ� ���� : btnLogin, btnReset
		// �̺�Ʈ ������ ���� : ActionListener
		btnLogin.addActionListener(this);
		btnReset.addActionListener(this);
		
		//font
		Font f = new Font("���",Font.BOLD,30);
		tfId.setFont(f);
		tfPw.setFont(f);
		
		//�н������ ���� ǥ��
		tfPw.setEchoChar('*');
		
		// �߰�
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
			System.out.println("LOGIN ��ư ����");
			//����ڰ� �Է��� �� ��������..
			String id = tfId.getText();
			String pw = tfPw.getText();
			System.out.println(id+","+pw);
			
		} else if (cmd.equals("RESET")) {
			System.out.println("RESET ��ư ����");
			tfId.setText("");
			tfPw.setText("");
		}

	}
}
