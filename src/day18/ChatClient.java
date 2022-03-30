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

public class ChatClient extends JFrame implements ActionListener, Runnable, KeyListener{
	
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
	
	
	public ChatClient() {
	
		
//////////��ü �ʱ�ȭ
		jp1 = new JPanel();
		jp2 = new JPanel();
		jp3 = new JPanel();
		
		jp1.setBackground(Color.cyan);
		jp2.setBackground(Color.GREEN);

		
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
		
		
		
//////////������Ʈ�� ��ġ,ũ�� ����
		jlbIP.setBounds(100,100,100,50);
		jlbPort.setBounds(100,300,100,50);
		jtfIP.setBounds(350,100,100,50);
		jtfPort.setBounds(350,300,100,50);
		jbtnLogin.setBounds(100,450,150,50);
		jbtnExit.setBounds(300,450,150,50);
		
		
		
//////////��ư �̺�Ʈ �߰�
		//�̺�Ʈ �ҽ��� ��ư 
		//Ŭ���Ҷ� ���� - �׼Ǹ�����
		//��ư �׼Ǹ�����
		jbtnLogin.addActionListener(this); //add�޺κ��� �������̽� �̸�
		jbtnExit.addActionListener(this); //���ڽ��� �Ű������� ���� / ���� ���� �����Ұ�
		jbtnSend.addActionListener(this); 
		
		//Ű�����Է°� �����ϵ���
		jtf.addKeyListener(this); //�������̽� ���ְ� �߻�޼��� �������̵� ���ֱ�
		
		
		
//////////��ü ȭ�鿡 ����		
		jp1.add(jlbIP); //jp1�� jlbIP����
		jp1.add(jlbPort); //jp1�� jlbPort����
		jp1.add(jtfIP); //jp1�� jtfIP����
		jp1.add(jtfPort); //jp1�� jtfPort����
		jp1.add(jbtnLogin); //jp1�� jbtnLogin����
		jp1.add(jbtnExit); //jp1�� jbtnExit����
		
		jp3.add(jtf); // jp3�� jtf����
		jp3.add(jbtnSend); // jp3�� jbtnSend ����

		jp2.add(jsp, "Center"); // jp2�� jsp�� �߾ӿ� ����
		jp2.add(jp3, "South"); // jp2�� jp3�� ���ʿ� ����
		
		
		//�г��� �����̳ʿ� ���� (�� �ٸ� ���Ǿ����� ���������� ���ʴ�� ������)
		//add(jp1);
		
		
     ////���� ��ġ�����ڸ� CardLayout���� ����
		cl = new CardLayout(); //cl�ʱ�ȭ 
		setLayout(cl); //��ġ������ cl���
		
		
	 ////�гα�ü�ϱ�	
		//�г��� �����̳ʿ� ���� add(�г�, �̸�)
		add(jp1, "login"); //jp1�� �����̳�(������â)�� ����, �̸��� login
		add(jp2, "chat"); //jp2�� �����̳ʿ� ����, �̸��� chat
		
		
	 ////���� ������ �гο� login �г��� ����
		cl.show(getContentPane(), "login"); //""�ȿ� �����Ŀ� ���� �������� �г��� �޶���
		
	
		
//////////������â ����
		
		//������
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//â ��ġ,ũ��
		setBounds(100, 100, 600, 700);
		//â�� ���̰� ����
		setVisible(true);
					
	}

	
	
	public static void main(String[] args) {
		ChatClient cc = new ChatClient(); //ChatClient ����
	}

	
	@Override 
	public void actionPerformed(ActionEvent e) {
		
		// ����> get.AcctonCommand  ����ϸ� �ٸ��������� ����ϱ� ����
		Object obj = e.getSource(); //obj��ü ���� �� Ŭ���� ��ư�� ��ü�� ����
		if(obj == jbtnLogin) { //�α��ι�ư�� Ŭ���� ���
			System.out.println("�α��� ��ư"); 
			
			ip = jtfIP.getText(); //jtfIP�� �Է��� �ּҸ� ������ ip�� ����
			port = Integer.parseInt(jtfPort.getText()); //jtfPort�� �Է��� port��ȣ�� ����port�� ����
		                                                 //�����ϱ� ��, �ؽ�Ʈ �ް� ��Ƽ���� ����ȯ�� ��� 	
			cl.show(getContentPane(), "chat"); //����ȭ�� chat�г� ���(��, �α��ι�ư ������ chatȭ������ ��ȯ)
			
			vChat(); //vChat�޼ҵ� ȣ�� 
			
		} else if (obj == jbtnExit) { //EXIT��ư�� Ŭ���� ���
			System.out.println("���� ��ư");
			System.exit(0); //���α׷� ����
		}else if (obj == jbtnSend) { //SEND��ư Ŭ���� ���
			System.out.println("send  ��ư ����");
			send(); //send�޼ҵ� ȣ��
		}
	
	}
	
	
	private void vChat() { //��Ƽ ������ �����ϴ� vChat�޼ҵ� ���� => Ŭ������ �������̽� Runnable ����
		Thread th = new Thread(this); // Thread ����
		th.start(); //start�޼ҵ� ȣ��
	}	
	
	
	@Override
	public void run() { // ���� ������ �ʿ��� �κ� ���� �޼ҵ�

		// 1. ���ϰ�ü ����
		try {
			Socket s = new Socket(ip, port); //Socket��ü s���� => Ŭ���̾�Ʈ�ּ�ip �� port��ȣ�� �Ű������� ����

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
				String msg = ""; // String���� msg �ʱ�ȭ
				msg = br.readLine(); // Ŭ���̾�Ʈ�κ��� ���پ� ������ �о msg�� ���� 
				// 5. jta�� �߰�
				jta.append(msg + "\n"); //jta�� �̾ msg�̾���� /append�� ���� ���ڿ��� ���ʿ� ���ڿ��� �߰��ϴ� ���
				System.out.println(msg); // msg ���

			}

		} catch (UnknownHostException e) {
			System.out.println("�߸���IP");
		} catch (IOException e) {
			System.out.println("���ӽ���");
	}
}

	

	@Override
	public void keyPressed(KeyEvent e) {
		
		int code = e.getKeyCode(); //Ű����� ���� �Է¹��� key�ڵ带 int�� ����code�� ����
		//����Ű������ �ƽ�Ű�ڵ� 10 / code == 10 �̶�� �ص������� ����ó��!
		if(code == KeyEvent.VK_ENTER) { //����Ű�� ������
	//		String msg = jtf.getText();
	//		pw.println(msg);
	//		pw.flush();          ==>�� 3�� ������������ �ߺ��Ǵ� �ڵ��� => �����ͷ� �ڵ����̱�!
			
			send(); //send �޼ҵ� ȣ��*
		}
		
	}

	//send�޼ҵ�*
	private void send() {
		String msg = jtf.getText(); //jtf�κ��� �о�� �޼����� String������ msg�� ����
		pw.println(msg); //pw�� println�Լ� �̿��Ͽ� ____���� msg����
		pw.flush(); //���ۿ� �����ִ� ������ �����ֱ�
		
		jtf.setText(""); // �޼��� ���� ��, �ؽ�Ʈâ�� �ؽ�Ʈ ������ (ī������ϱ�)
	}

	@Override
	public void keyReleased(KeyEvent e) {		
	}
	
	@Override
	public void keyTyped(KeyEvent e) {	
	}

}









