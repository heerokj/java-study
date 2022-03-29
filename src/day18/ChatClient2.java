package day18;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClient2 extends JFrame implements ActionListener, Runnable, KeyListener{
	
	JPanel jp1 ,jp2, jp3;	
	JLabel jlbIP, jlbPort;	
	JButton jbtnLogin, jbtnExit, jbtnSend;
	JTextField jtfIP, jtfPort, jtf;
	JScrollPane jsp;
	JTextArea jta;
	CardLayout cl;
	String ip;
	int port;
	PrintWriter pw;
	BufferedReader br;
	
	public ChatClient2() {
		jp1 = new JPanel();
		jp2 = new JPanel();
		jp3 = new JPanel();
		
		jp1.setBackground(Color.cyan);
		jp2.setBackground(Color.gray);

		
		jlbIP = new JLabel("IP");
		jlbPort = new JLabel("PORT");
		
		jtfIP = new JTextField("192.168.0.4");
		jtfPort = new JTextField("5000");
		jtf = new JTextField(30);
		
		jta = new JTextArea();
		jsp = new JScrollPane(jta, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
				
		jbtnLogin = new JButton("�α���");
		jbtnExit = new JButton("EXIT");
		jbtnSend = new JButton("SEND");
		
		jp3.add(jtf);
		jp3.add(jbtnSend);
		
		//JPanel�� �⺻��ġ������ ��� : FlowLayout
		jp1.setLayout(null); // jp1 �г��� ��ġ�����ڸ� ������� ����
		jp2.setLayout(new BorderLayout()); //�������̾ƿ����� ��ġ�����ڸ� ����

		jp2.add(jsp, "Center");
		jp2.add(jp3, "South");
		
		
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
		jbtnSend.addActionListener(this); 
		
		//Ű�����Է°� �����ϵ���
		jtf.addKeyListener(this); //�������̽� ���ְ� �߻�޼��� �������̵� ���ֱ�
		
		
		
		jp1.add(jlbIP);
		jp1.add(jlbPort);
		jp1.add(jtfIP);
		jp1.add(jtfPort);
		jp1.add(jbtnLogin);
		jp1.add(jbtnExit);
		
		//�г��� �����̳ʿ� ���� (�� �ٸ� ���Ǿ����� ���������� ���ʴ�� ������)
//		add(jp1);
		
		//���� ��ġ�����ڸ� CardLayout���� ����
		cl = new CardLayout();
		setLayout(cl);
		
		
		//�гα�ü�ϱ�	
		//�г��� �����̳ʿ� ���� add(�г�, �̸�)
		add(jp1, "login");
		add(jp2, "chat");
		
		//���� ������ �гο� login �г��� ����
		cl.show(getContentPane(), "login"); //""�ȿ� �����Ŀ� ���� �������� �г��� �޶���
		
		
		//������
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//â ��ġ,ũ��
		setBounds(100, 100, 600, 700);
		//â�� ���̰� ����
		setVisible(true);
			
		
	}

	public static void main(String[] args) {
		ChatClient2 cc = new ChatClient2();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("��ư ����");
		Object obj = e.getSource(); //get.AcctonCommand  ����ϸ� �ٸ��������� ����ϱ� ����
		if(obj == jbtnLogin) {
			System.out.println("�α��� ��ư");
			ip = jtfIP.getText();
			port = Integer.parseInt(jtfPort.getText()); //�ؽ�Ʈ �ް� ��Ƽ���� ����ȯ�� ��� => �ɹ������� �������ٰ��� //String ip; /int port;	
			cl.show(getContentPane(), "chat"); //�α��� ��ư ������ chat�г� ���
			
			vChat();
			
		} else if (obj == jbtnExit) {
			System.out.println("���� ��ư");
			System.exit(0);
		}else if (obj == jbtnSend) {
			System.out.println("send  ��ư ����");
			send();
		}
	
	}
	private void vChat() {
		Thread th = new Thread(this);
		th.start();
	}		
	@Override
	public void run() {

		// 1. ���ϰ�ü ����
		try {
			Socket s = new Socket(ip, port);

			// 2. �߽ź� - ���������� �÷����� ��������� ��(�ٸ����̾ƿ������� �����ֵ���?)
			pw = new PrintWriter(
					   new BufferedWriter(
							   new OutputStreamWriter(
									   s.getOutputStream())));

			// 3. ���ź� - ���������� �÷����� ��������� ��
			br = new BufferedReader(
					  new InputStreamReader(
							  s.getInputStream()));
			
			// 4. �ݺ��ؼ� �б�
			while (true) {
				String msg = "";
				msg = br.readLine();
				// 5. jta�� �߰�
				jta.append(msg + "\n");
				System.out.println(msg);

			}

		} catch (UnknownHostException e) {
			System.out.println("�߸���IP");
		} catch (IOException e) {
			System.out.println("���ӽ���");
		}

	}

	@Override
	public void keyTyped(KeyEvent e) {	
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int code = e.getKeyCode();
		//����Ű������ �ƽ�Ű�ڵ� 10 / code == 10 �̶�� �ص������� ����ó��!
		if(code == KeyEvent.VK_ENTER) { //����Ű�� ������
	//		String msg = jtf.getText();
	//		pw.println(msg);
	//		pw.flush();                ==>�� 3�� ������������ �ߺ��Ǵ� �ڵ��� �����ͷ� �ڵ����̱�!
			
			send();
		}
		
	}

	private void send() {
		String msg = jtf.getText();
		pw.println(msg);
		pw.flush();
		
		jtf.setText(""); // �޼��� ���� ��, �ؽ�Ʈâ�� �ؽ�Ʈ ������ (ī������ϱ�)
	}

	@Override
	public void keyReleased(KeyEvent e) {		
	}

}









