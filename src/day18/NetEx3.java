package day18; //서버입장  

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class NetEx3 {

	public static void main(String[] args) {
		
		//서버쪽 소켓을 생성해야 연결가능
		
		//192.168.0.4
		
		System.out.println("클라이언트 접속 대기중..");
		try {
			ServerSocket ss = new ServerSocket(5000);
			// 5000포토를 열고 클라이언트가 들어오기를 기다림..
			
			//ss.accept(); //기다리는 메소드
			//접속을 대기하다가 클라이언트에서 접속하면 클라이언트 소켓을 리턴
			Socket client = ss.accept();  
			
			//inetaddress를 가져올 수 있어
			InetAddress inet = client.getInetAddress();
			System.out.println(inet);
			System.out.println(inet.getHostAddress());
			
			System.out.println("접속성공!!"); //NetEx2 class에서 접속하면 출력됨
			
			
			
			
			//서버는 종이컵 전화기 수신부
			InputStream is = client.getInputStream();
			//클라이언트가 보내는거 하나읽어서 저장
			int value = is.read();
			System.out.println(value); //65출력
			
			
			 
			
			//서버는 종이컵 전화기 수신부
			InputStreamReader isr = new InputStreamReader(is);
			
			//버퍼 사용
			BufferedReader br = new BufferedReader(isr);
			
		// 한번만 전달 받을 수 있음	
		//	String data = br.readLine();
		//	System.out.println("클라이언트가 보낸메세지 : "+data); //산토끼어쩌구 출력
			
			
			
			

			//**서버의 발신부 만들기(전달받은거 다시 보낼 수 있음)
			PrintWriter pw = new PrintWriter(
					              new BufferedWriter(
					            		   new OutputStreamWriter(
					            				   client.getOutputStream())));      
			
			
		
			
			String data = "";
			while((data = br.readLine()) != null) {
				System.out.println("클라이언트가 보낸메세지 : "+data);
				
				pw.println("전달받은거 다시 보냄 메아리 : "+data);
				pw.flush();
				
			}
			
							
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
