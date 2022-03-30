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
		
		jbtnLogin = new JButton("로그인");
		jbtnExit = new JButton("EXIT");
		
		//JPanel의 기본배치관리자 사용 X
		jp1.setLayout(null);
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
		
		
		jp1.add(jlbIP);
		jp1.add(jlbPort);
		jp1.add(jtfIP);
		jp1.add(jtfPort);
		jp1.add(jbtnLogin);
		jp1.add(jbtnExit);
		
		//패널을 컨테이너에 부착 (별 다른 조건없으면 오른쪽으로 차례대로 부착됨)
		add(jp1);
		//종료기능
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//창 위치,크기
		setBounds(100, 100, 600, 800);
		//창이 보이게 설정
		setVisible(true);
			
		
	}

	public static void main(String[] args) {
		ChatClient cc = new ChatClient();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼 눌림");
		Object obj = e.getSource(); //get.AcctonCommand  사용하면 다른국가에서 사용하기 불편
		if(obj == jbtnLogin) {
			System.out.println("로그인 버튼");
		}else if(obj == jbtnExit) {
			System.out.println("종료 버튼");
			System.exit(0);
		}
		
		
	}
}

*/















