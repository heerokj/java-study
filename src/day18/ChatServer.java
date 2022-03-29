package day18;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ChatServer extends JFrame implements ActionListener{

	//MServer만 담을 수 있는 전용 ArrayList
	ArrayList<MServer> list = new ArrayList<MServer>();
	JTextArea jta;
	JScrollPane jsp;
	JButton jbtn;
	ServerSocket ss;
	String ip;
	
	
	ChatServer(){
		
		jta = new JTextArea();
		Font f = new Font("굴림체", Font.PLAIN, 30);
		jta.setFont(f);
		
		jsp = new JScrollPane(jta, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		jbtn = new JButton("종료");
		add(jsp,"Center");
		add(jbtn, "South");
		
		jbtn.addActionListener(this);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		setVisible(true);
		
		//채팅코드
		vChatServer();
		
				
	}
	
	public static void main(String[] args) {		
		ChatServer cs = new ChatServer();
				
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("종료합니다.");
		System.exit(0);		
	}
	
	private void vChatServer(){
		try {
			//1.서버소캣생성
			ss = new ServerSocket(5000);
			//2.반복해서
			while(true) {
				//3.사용자 접속을 대기
				Socket client = ss.accept();
				//4. MServer 객체를 생성(클라이언트 소캣)
				MServer ms = new  MServer(client);
				
				//5. ArrayList 에 현재 MServer 객체를 담기
				list.add(ms);
				
				//6. MServer Start
				ms.start();
			}
					
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}//vChatServer end
	
	//member inner class
	class MServer extends Thread{
		Socket client;
		PrintWriter pw;
		BufferedReader br;
		
		MServer(Socket client){
			try {
				// 발신부
				pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(client.getOutputStream())));
				// 수신부

				br = new BufferedReader(new InputStreamReader(client.getInputStream()));

			} catch (IOException e) {
				e.printStackTrace();
			}
		}// 생성자 end
		@Override
		public void run() {

			// 접속자 IP 얻기
			ip = client.getInetAddress().getHostAddress();
			try {
				while (true) {
					// 반복해서 한줄읽기
					String msg = br.readLine();
					// jta에 추가
					jta.append("[ " + ip + " ] : " + msg + "\n");

					// 접속되어 있는 모두에게 전달
					broadcast("[ " + ip + " ] : " + msg + "\n");

					// 보낸사람에게만 메세지 출력 [ip] : 메세지
//					pw.println("[ " + ip + " ] : " + msg+"\n");
//					pw.flush();
					
					
					
				} // while() end
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				// 접속을 끊고 나가면 목록에서 제거
				broadcast(this.client.getInetAddress().getHostAddress() + "님이 퇴실하셨습니다.");
				list.remove(this);

			}
						
			
		}//run() end
		
		private void broadcast(String msg) {
			// 모든 사용자에게 msg를 방송
			for (MServer x : list) {
				x.pw.println(msg);
				x.pw.flush();
			}
		}
		
		
	}//MServer class end
	
	
	
}// class end
