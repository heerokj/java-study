package day18;
/*
package day18;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ChatClient extends JFrame implements ActionListener{
	
	JPanel jp1;
	
	JLabel jlbIP, jlbPort;
	
	JButton jbtnLogin, jbtnExit;
	JTextField jtfIP, jtfPort;
	
	public ChatClient() {
		jp1 = new JPanel();
		
		jp1.setBackground(Color.cyan);
		
		jlbIP = new JLabel("IP");
		jlbPort = new JLabel("PORT");
		
		jtfIP = new JTextField("192.168.0.4");
		jtfPort = new JTextField("5000");
		
		jbtnLogin = new JButton("�α���");
		jbtnExit = new JButton("EXIT");
		
		//JPanel�� �⺻��ġ������ ��� X
		jp1.setLayout(null);
		//������Ʈ�� ��ġ,ũ�� ����
		jlbIP.setBounds(100,100,100,50);
		jlbPort.setBounds(100,300,100,50);
		jtfIP.setBounds(350,100,100,50);
		jtfPort.setBounds(350,300,100,50);
		jbtnLogin.setBounds(100,450,150,50);
		jbtnExit.setBounds(300,450,150,50);
		
		//�̺�Ʈ �ҽ��� ��ư 
		//Ŭ���Ҷ� ���� - �׼Ǹ�����
		//��ư �׼Ǹ�����
		jbtnLogin.addActionListener(this); //add�޺κ��� �������̽� �̸�
		jbtnExit.addActionListener(this); //���ڽ��� �Ű������� ���� / ���� ���� �����Ұ�
		
		
		jp1.add(jlbIP);
		jp1.add(jlbPort);
		jp1.add(jtfIP);
		jp1.add(jtfPort);
		jp1.add(jbtnLogin);
		jp1.add(jbtnExit);
		
		//�г��� �����̳ʿ� ���� (�� �ٸ� ���Ǿ����� ���������� ���ʴ�� ������)
		add(jp1);
		//������
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//â ��ġ,ũ��
		setBounds(100, 100, 600, 800);
		//â�� ���̰� ����
		setVisible(true);
			
		
	}

	public static void main(String[] args) {
		ChatClient cc = new ChatClient();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("��ư ����");
		Object obj = e.getSource(); //get.AcctonCommand  ����ϸ� �ٸ��������� ����ϱ� ����
		if(obj == jbtnLogin) {
			System.out.println("�α��� ��ư");
		}else if(obj == jbtnExit) {
			System.out.println("���� ��ư");
			System.exit(0);
		}
		
		
	}
}

*/















