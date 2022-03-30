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
	
	Socket client; // Socket�� ��ü client ���� ����
	 
	MTServer(Socket client){
		this.client = client; // �����ڸ� ���� ���޹��� �Ű����� client�� MTServer���� ������ client�� ����
	}

	@Override
	public void run() {
		//Ŭ���̾�Ʈ�� ����� ����ϴ� �ڵ�
		
		// 1. ���� ������� IP���
		String ip = client.getInetAddress().getHostAddress(); // client�� ip�ּҸ� ���� ip�� ����
		System.out.println(ip); //ip�� ���
		
		
		InputStream is; // InputStream ��ü is ���� ����
		try {
			// 2. ��Ű�ü(���ź�)
			is = client.getInputStream(); //client�κ��� ���� �о���� => ���� is�� ����
			InputStreamReader isr = new InputStreamReader(is); // byteStream -> charStream���� ��ȯ
			BufferedReader br = new BufferedReader(isr); //�ӵ� ���̴� ���۱��
			
			// 3. �߽ź�
			PrintWriter pw = new PrintWriter(
					              new BufferedWriter(
					            		  new OutputStreamWriter(					           
					            				  client.getOutputStream())));
			// client�� ���� �����ϴ� ��ü ���� �� byteStream -> charStream���� ��ȯ + ���۱��, �پ��� �ڷ����� ���� �Է� ����
			
			
			
			String data = ""; //String�� data�ʱ�ȭ
			// 4. �ݺ��ؼ�
			// 5. �����б�
			while((data = br.readLine()) != null) { //data�� client�� ���� ���� ���� �����Ͽ� ���̻� ���� �����Ͱ� ���������� �ݺ����� 
				// 6. �ֿܼ� ���
				System.out.println("["+ip+"]"+data); //ip�� �Է��� data�� ���
				// 7. �ٽ� Ŭ���̾�Ʈ�� ������
				pw.println("�޾Ƹ� :"+data); //���޹��� data���� �ٽ� client���� ������
				pw.flush(); //���ۿ� ���� ������ �����ֱ�
				
			}

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
