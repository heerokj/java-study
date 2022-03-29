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
		//Ŭ���̾�Ʈ�� ����� ����ϴ� �ڵ�
		
		// 1. ���� ������� IP���
		String ip = client.getInetAddress().getHostAddress();
		System.out.println(ip);
		
		
		try {
			// 2. ��Ű�ü(���ź�)
			InputStream is = client.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			// 3. �߽ź�
			PrintWriter pw = new PrintWriter(
					              new BufferedWriter(
					            		  new OutputStreamWriter(					           
					            				  client.getOutputStream())));
			String data = "";
			// 4. �ݺ��ؼ�
			// 5. �����б�
			while((data = br.readLine()) != null) {
				// 6. �ֿܼ� ���
				System.out.println("["+ip+"]"+data);
				// 7. �ٽ� Ŭ���̾�Ʈ�� ������
				pw.println("�޾Ƹ� :"+data);
				pw.flush();
				
			}

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
