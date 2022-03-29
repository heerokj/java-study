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

	//MServer�� ���� �� �ִ� ���� ArrayList
	ArrayList<MServer> list = new ArrayList<MServer>();
	JTextArea jta;
	JScrollPane jsp;
	JButton jbtn;
	ServerSocket ss;
	String ip;
	
	
	ChatServer(){
		
		jta = new JTextArea();
		Font f = new Font("����ü", Font.PLAIN, 30);
		jta.setFont(f);
		
		jsp = new JScrollPane(jta, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		jbtn = new JButton("����");
		add(jsp,"Center");
		add(jbtn, "South");
		
		jbtn.addActionListener(this);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		setVisible(true);
		
		//ä���ڵ�
		vChatServer();
		
				
	}
	
	public static void main(String[] args) {		
		ChatServer cs = new ChatServer();
				
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("�����մϴ�.");
		System.exit(0);		
	}
	
	private void vChatServer(){
		try {
			//1.������Ĺ����
			ss = new ServerSocket(5000);
			//2.�ݺ��ؼ�
			while(true) {
				//3.����� ������ ���
				Socket client = ss.accept();
				//4. MServer ��ü�� ����(Ŭ���̾�Ʈ ��Ĺ)
				MServer ms = new  MServer(client);
				
				//5. ArrayList �� ���� MServer ��ü�� ���
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
				// �߽ź�
				pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(client.getOutputStream())));
				// ���ź�

				br = new BufferedReader(new InputStreamReader(client.getInputStream()));

			} catch (IOException e) {
				e.printStackTrace();
			}
		}// ������ end
		@Override
		public void run() {

			// ������ IP ���
			ip = client.getInetAddress().getHostAddress();
			try {
				while (true) {
					// �ݺ��ؼ� �����б�
					String msg = br.readLine();
					// jta�� �߰�
					jta.append("[ " + ip + " ] : " + msg + "\n");

					// ���ӵǾ� �ִ� ��ο��� ����
					broadcast("[ " + ip + " ] : " + msg + "\n");

					// ����������Ը� �޼��� ��� [ip] : �޼���
//					pw.println("[ " + ip + " ] : " + msg+"\n");
//					pw.flush();
					
					
					
				} // while() end
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				// ������ ���� ������ ��Ͽ��� ����
				broadcast(this.client.getInetAddress().getHostAddress() + "���� ����ϼ̽��ϴ�.");
				list.remove(this);

			}
						
			
		}//run() end
		
		private void broadcast(String msg) {
			// ��� ����ڿ��� msg�� ���
			for (MServer x : list) {
				x.pw.println(msg);
				x.pw.flush();
			}
		}
		
		
	}//MServer class end
	
	
	
}// class end
