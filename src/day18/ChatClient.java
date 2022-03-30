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
	
		
//////////객체 초기화
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
		
		
		
//////////컴포넘트의 위치,크기 조정
		jlbIP.setBounds(100,100,100,50);
		jlbPort.setBounds(100,300,100,50);
		jtfIP.setBounds(350,100,100,50);
		jtfPort.setBounds(350,300,100,50);
		jbtnLogin.setBounds(100,450,150,50);
		jbtnExit.setBounds(300,450,150,50);
		
		
		
//////////버튼 이벤트 추가
		//이벤트 소스는 버튼 
		//클릭할때 감지 - 액션리스너
		//버튼 액션리스너
		jbtnLogin.addActionListener(this); //add뒷부분이 인터페이스 이름
		jbtnExit.addActionListener(this); //나자신이 매개변수로 전달 / 현재 내가 구현할게
		jbtnSend.addActionListener(this); 
		
		//키도드입력값 감지하도록
		jtf.addKeyListener(this); //인터페이스 해주고 추상메서드 오버라이드 해주기
		
		
		
//////////객체 화면에 부착		
		jp1.add(jlbIP); //jp1에 jlbIP부착
		jp1.add(jlbPort); //jp1에 jlbPort부착
		jp1.add(jtfIP); //jp1에 jtfIP부착
		jp1.add(jtfPort); //jp1에 jtfPort부착
		jp1.add(jbtnLogin); //jp1에 jbtnLogin부착
		jp1.add(jbtnExit); //jp1에 jbtnExit부착
		
		jp3.add(jtf); // jp3에 jtf부착
		jp3.add(jbtnSend); // jp3에 jbtnSend 부착

		jp2.add(jsp, "Center"); // jp2에 jsp를 중앙에 부착
		jp2.add(jp3, "South"); // jp2에 jp3을 남쪽에 부착
		
		
		//패널을 컨테이너에 부착 (별 다른 조건없으면 오른쪽으로 차례대로 부착됨)
		//add(jp1);
		
		
     ////현재 배치관리자를 CardLayout으로 변경
		cl = new CardLayout(); //cl초기화 
		setLayout(cl); //배치관리자 cl사용
		
		
	 ////패널교체하기	
		//패널을 컨테이너에 부착 add(패널, 이름)
		add(jp1, "login"); //jp1을 컨테이너(윈도우창)에 부착, 이름은 login
		add(jp2, "chat"); //jp2를 컨테이너에 부착, 이름은 chat
		
		
	 ////현재 컨텐츠 패널에 login 패널을 지정
		cl.show(getContentPane(), "login"); //""안에 뭘쓰냐에 따라 보여지는 패널이 달라짐
		
	
		
//////////윈도우창 설정
		
		//종료기능
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//창 위치,크기
		setBounds(100, 100, 600, 700);
		//창이 보이게 설정
		setVisible(true);
					
	}

	
	
	public static void main(String[] args) {
		ChatClient cc = new ChatClient(); //ChatClient 실행
	}

	
	@Override 
	public void actionPerformed(ActionEvent e) {
		
		// 참고> get.AcctonCommand  사용하면 다른국가에서 사용하기 불편
		Object obj = e.getSource(); //obj객체 생성 후 클릭한 버튼의 객체를 전달
		if(obj == jbtnLogin) { //로그인버튼을 클릭할 경우
			System.out.println("로그인 버튼"); 
			
			ip = jtfIP.getText(); //jtfIP에 입력한 주소를 가져와 ip에 전달
			port = Integer.parseInt(jtfPort.getText()); //jtfPort에 입력한 port번호를 변수port에 전달
		                                                 //전달하기 전, 텍스트 받고 인티저로 형변환후 담기 	
			cl.show(getContentPane(), "chat"); //현재화면 chat패널 띄움(즉, 로그인버튼 누르면 chat화면으로 전환)
			
			vChat(); //vChat메소드 호출 
			
		} else if (obj == jbtnExit) { //EXIT버튼을 클릭할 경우
			System.out.println("종료 버튼");
			System.exit(0); //프로그램 종료
		}else if (obj == jbtnSend) { //SEND버튼 클릭할 경우
			System.out.println("send  버튼 눌림");
			send(); //send메소드 호출
		}
	
	}
	
	
	private void vChat() { //멀티 쓰레드 구현하는 vChat메소드 생성 => 클래스는 인터페이스 Runnable 구현
		Thread th = new Thread(this); // Thread 생성
		th.start(); //start메소드 호출
	}	
	
	
	@Override
	public void run() { // 동시 동작이 필요한 부분 구현 메소드

		// 1. 소켓객체 생성
		try {
			Socket s = new Socket(ip, port); //Socket객체 s생성 => 클라이언트주소ip 와 port번호를 매개변수로 전달

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
				String msg = ""; // String변수 msg 초기화
				msg = br.readLine(); // 클라이언트로부터 한줄씩 데이터 읽어서 msg에 저장 
				// 5. jta에 추가
				jta.append(msg + "\n"); //jta에 이어서 msg이어붙임 /append는 기존 문자열의 뒤쪽에 문자열을 추가하는 기능
				System.out.println(msg); // msg 출력

			}

		} catch (UnknownHostException e) {
			System.out.println("잘못된IP");
		} catch (IOException e) {
			System.out.println("접속실패");
	}
}

	

	@Override
	public void keyPressed(KeyEvent e) {
		
		int code = e.getKeyCode(); //키보드로 부터 입력받은 key코드를 int형 변수code에 전달
		//엔터키누르면 아스키코드 10 / code == 10 이라고 해도되지만 이하처럼!
		if(code == KeyEvent.VK_ENTER) { //엔터키를 누르면
	//		String msg = jtf.getText();
	//		pw.println(msg);
	//		pw.flush();          ==>이 3줄 여러군데에서 중복되는 코드임 => 리펙터로 코드줄이기!
			
			send(); //send 메소드 호출*
		}
		
	}

	//send메소드*
	private void send() {
		String msg = jtf.getText(); //jtf로부터 읽어온 메세지를 String형변수 msg에 전달
		pw.println(msg); //pw의 println함수 이용하여 ____에게 msg전송
		pw.flush(); //버퍼에 남아있는 데이터 내려주기
		
		jtf.setText(""); // 메세지 보낸 후, 텍스트창에 텍스트 없어짐 (카톡생각하기)
	}

	@Override
	public void keyReleased(KeyEvent e) {		
	}
	
	@Override
	public void keyTyped(KeyEvent e) {	
	}

}









