package day18; //��������  

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
		
		//������ ������ �����ؾ� ���ᰡ��
		
		//192.168.0.4
		
		System.out.println("Ŭ���̾�Ʈ ���� �����..");
		try {
			ServerSocket ss = new ServerSocket(5000);
			// 5000���並 ���� Ŭ���̾�Ʈ�� �����⸦ ��ٸ�..
			
			//ss.accept(); //��ٸ��� �޼ҵ�
			//������ ����ϴٰ� Ŭ���̾�Ʈ���� �����ϸ� Ŭ���̾�Ʈ ������ ����
			Socket client = ss.accept();  
			
			//inetaddress�� ������ �� �־�
			InetAddress inet = client.getInetAddress();
			System.out.println(inet);
			System.out.println(inet.getHostAddress());
			
			System.out.println("���Ӽ���!!"); //NetEx2 class���� �����ϸ� ��µ�
			
			
			
			
			//������ ������ ��ȭ�� ���ź�
			InputStream is = client.getInputStream();
			//Ŭ���̾�Ʈ�� �����°� �ϳ��о ����
			int value = is.read();
			System.out.println(value); //65���
			
			
			 
			
			//������ ������ ��ȭ�� ���ź�
			InputStreamReader isr = new InputStreamReader(is);
			
			//���� ���
			BufferedReader br = new BufferedReader(isr);
			
		// �ѹ��� ���� ���� �� ����	
		//	String data = br.readLine();
		//	System.out.println("Ŭ���̾�Ʈ�� �����޼��� : "+data); //���䳢��¼�� ���
			
			
			
			

			//**������ �߽ź� �����(���޹����� �ٽ� ���� �� ����)
			PrintWriter pw = new PrintWriter(
					              new BufferedWriter(
					            		   new OutputStreamWriter(
					            				   client.getOutputStream())));      
			
			
		
			
			String data = "";
			while((data = br.readLine()) != null) {
				System.out.println("Ŭ���̾�Ʈ�� �����޼��� : "+data);
				
				pw.println("���޹����� �ٽ� ���� �޾Ƹ� : "+data);
				pw.flush();
				
			}
			
							
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
