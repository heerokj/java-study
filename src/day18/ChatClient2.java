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
				
		jbtnLogin = new JButton("로그인");
		jbtnExit = new JButton("EXIT");
		jbtnSend = new JButton("SEND");
		
		jp3.add(jtf);
		jp3.add(jbtnSend);
		
		//JPanel의 기본배치관리자 사용 : FlowLayout
		jp1.setLayout(null); // jp1 패널의 배치관리자를 사용하지 않음
		jp2.setLayout(new BorderLayout()); //보더레이아웃으로 배치관리자를 변경

		jp2.add(jsp, "Center");
		jp2.add(jp3, "South");
		
		
		//컴포넘트의 위치,크기 조정
		jlbIP.setBounds(100,100,100,50);
		jlbPort.setBounds(100,300,100,50);
		jtfIP.setBounds(350,100,100,50);
		jtfPort.setBounds(350,300,100,50);
		jbtnLogin.setBounds(100,450,150,50);
		jbtnExit.setBounds(300,450,150,50);
		
		//이벤트 소스는 버튼 
		//클릭할때 감지 - 액션리스너
		//버튼 액션리스너
		jbtnLogin.addActionListener(this); //add뒷부분이 인터페이스 이름
		jbtnExit.addActionListener(this); //나자신이 매개변수로 전달 / 현재 내가 구현할게
		jbtnSend.addActionListener(this); 
		
		//키도드입력값 감지하도록
		jtf.addKeyListener(this); //인터페이스 해주고 추상메서드 오버라이드 해주기
		
		
		
		jp1.add(jlbIP);
		jp1.add(jlbPort);
		jp1.add(jtfIP);
		jp1.add(jtfPort);
		jp1.add(jbtnLogin);
		jp1.add(jbtnExit);
		
		//패널을 컨테이너에 부착 (별 다른 조건없으면 오른쪽으로 차례대로 부착됨)
//		add(jp1);
		
		//현재 배치관리자를 CardLayout으로 변경
		cl = new CardLayout();
		setLayout(cl);
		
		
		//패널교체하기	
		//패널을 컨테이너에 부착 add(패널, 이름)
		add(jp1, "login");
		add(jp2, "chat");
		
		//현재 컨텐츠 패널에 login 패널을 지정
		cl.show(getContentPane(), "login"); //""안에 뭘쓰냐에 따라 보여지는 패널이 달라짐
		
		
		//종료기능
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//창 위치,크기
		setBounds(100, 100, 600, 700);
		//창이 보이게 설정
		setVisible(true);
			
		
	}

	public static void main(String[] args) {
		ChatClient2 cc = new ChatClient2();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼 눌림");
		Object obj = e.getSource(); //get.AcctonCommand  사용하면 다른국가에서 사용하기 불편
		if(obj == jbtnLogin) {
			System.out.println("로그인 버튼");
			ip = jtfIP.getText();
			port = Integer.parseInt(jtfPort.getText()); //텍스트 받고 인티저로 형변환후 담기 => 맴버변수로 설정해줄거임 //String ip; /int port;	
			cl.show(getContentPane(), "chat"); //로그인 버튼 누르면 chat패널 띄움
			
			vChat();
			
		} else if (obj == jbtnExit) {
			System.out.println("종료 버튼");
			System.exit(0);
		}else if (obj == jbtnSend) {
			System.out.println("send  버튼 눌림");
			send();
		}
	
	}
	private void vChat() {
		Thread th = new Thread(this);
		th.start();
	}		
	@Override
	public void run() {

		// 1. 소켓객체 생성
		try {
			Socket s = new Socket(ip, port);

			// 2. 발신부 - 전역변수로 올려놓고 멤버변수로 씀(다른레이아웃에서도 쓸수있도록?)
			pw = new PrintWriter(
					   new BufferedWriter(
							   new OutputStreamWriter(
									   s.getOutputStream())));

			// 3. 수신부 - 전역변수로 올려놓고 멤버변수로 씀
			br = new BufferedReader(
					  new InputStreamReader(
							  s.getInputStream()));
			
			// 4. 반복해서 읽기
			while (true) {
				String msg = "";
				msg = br.readLine();
				// 5. jta에 추가
				jta.append(msg + "\n");
				System.out.println(msg);

			}

		} catch (UnknownHostException e) {
			System.out.println("잘못된IP");
		} catch (IOException e) {
			System.out.println("접속실패");
		}

	}

	@Override
	public void keyTyped(KeyEvent e) {	
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int code = e.getKeyCode();
		//엔터키누르면 아스키코드 10 / code == 10 이라고 해도되지만 이하처럼!
		if(code == KeyEvent.VK_ENTER) { //엔터키를 누르면
	//		String msg = jtf.getText();
	//		pw.println(msg);
	//		pw.flush();                ==>이 3줄 여러군데에서 중복되는 코드임 리펙터로 코드줄이기!
			
			send();
		}
		
	}

	private void send() {
		String msg = jtf.getText();
		pw.println(msg);
		pw.flush();
		
		jtf.setText(""); // 메세지 보낸 후, 텍스트창에 텍스트 없어짐 (카톡생각하기)
	}

	@Override
	public void keyReleased(KeyEvent e) {		
	}

}









