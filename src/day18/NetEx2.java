package day18; //Ŭ���̾�Ʈ �κ�

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class NetEx2 {
	public static void main(String[] args) {
		
		//Ư�� ������ ���� �غ���
		//���� ip�ּ� : 192.168.0.4
		
		 try {
			Socket s = new Socket("192.168.0.4", 5000);
			System.out.println(s);
			
			
			
			//������ ��ȭ���� �߽ź�
			//Ŭ���̾�Ʈ ���忡�� ������
			OutputStream os = s.getOutputStream();
			os.write(65); //������ �ֿܼ� ���޵Ǿ� ��µ�
			
			
			
			
			//�ѱ�ó����(���̽���Ʈ��) => char��Ʈ������ �ٲ�� : InputStreamReader, OutputStreamWriter
			OutputStreamWriter ows = new OutputStreamWriter(os);
			
			//Buffer
			BufferedWriter bw = new BufferedWriter(ows);
			
			//�پ��� �ڷ����� ���ؼ� ���
			PrintWriter pw = new PrintWriter(bw);
			
			//pw.println("���䳢 �䳢��..");
			//pw.flush();			
			
			
			
			//**Ŭ���̾�Ʈ�� ���ź� �����(������ �������°� �ޱ�)
			BufferedReader br = new BufferedReader(
					                 new InputStreamReader(
							                 s.getInputStream()));
			                                 //������ ���� ��ǲ��Ʈ�� 
				
			
			
			//Ű����� �Է��� ���� ������ ������ ������(�ֿܼ� �Է��� ���� ������ ���޵Ǿ� ���)
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader keyboard = new BufferedReader(isr);
			
			String data = "";
			String msg = ""; //
			while((data = keyboard.readLine()) != null) {
				System.out.println("Ŭ���̾�Ʈ�� ������ �޼��� : "+data); 
				pw.println(data);
				pw.flush(); 
				
				//**�����κ��� �޾Ƹ� ���޹޾� ���
				msg = br.readLine();
				System.out.println("�޾Ƹ� ���޹޾� ��� : "+msg);
				
			}
			
			
		
			
		} catch (UnknownHostException e) {
			System.out.println("�˼� ���� ȣ��Ʈ");
		} catch (IOException e) {
			System.out.println("���� ����");
			e.printStackTrace();
		} //ó������ ���� ���� �� => �����ʿ��� ���� �������ְ� �׶� ���Ӱ���
		  // NetEx3 class���� ���� ������ְ� NetEx2 class���� �ٽ� ���� => ���ӵ�
	}

}
