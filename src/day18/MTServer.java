package day18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class MTServer extends Thread{
	Socket client;
	 
	MTServer(Socket client){
		this.client = client;
	}

	@Override
	public void run() {
		//클라이언트와 통신을 담당하는 코드
		
		// 1. 접속 사용자의 IP출력
		String ip = client.getInetAddress().getHostAddress();
		System.out.println(ip);
		
		
		try {
			// 2. 통신객체(수신부)
			InputStream is = client.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			// 3. 발신부
			PrintWriter pw = new PrintWriter(
					              new BufferedWriter(
					            		  new OutputStreamWriter(					           
					            				  client.getOutputStream())));
			String data = "";
			// 4. 반복해서
			// 5. 한줄읽기
			while((data = br.readLine()) != null) {
				// 6. 콘솔에 출력
				System.out.println("["+ip+"]"+data);
				// 7. 다시 클라이언트에 보내기
				pw.println("메아리 :"+data);
				pw.flush();
				
			}

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
