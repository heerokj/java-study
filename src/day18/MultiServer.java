package day18; //�����Ѱ��� ���ÿ� ���� Ŭ���̾�Ʈ �����ϵ��� 

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiServer {

	public static void main(String[] args) {
				
		//���� ���� ��ü ����
		try {
			
					ServerSocket ss = new ServerSocket(5000); // ������ ���� ���� -> 5000��Ʈ�� ���� Client ���� ���
					
					//Ŭ���̾�Ʈ�� ���� ���
					while(true) {//���ѹݺ�
					System.out.println("Ŭ���̾�Ʈ�� ���� ���");
					
					Socket client = ss.accept(); //������ ����ϴٰ� client�� �����ϸ� client�� ������ �����Ͽ� client������ ����
					System.out.println("client :"+client); //client���
					
					//System.out.println("client ip :"+
					//		client.getInetAddress().getHostAddress()); //
					
					
					//��Ƽ������ ó��(day15����)
					//��� ����ϴ� MTServer /  class���θ���
					
					//���������� ���ϱ�
					MTServer ms = new MTServer(client); //MTServer��ü���� => ����(client)�� �Ű������� ����
					ms.start(); //start�޼ҵ� ȣ��

		}

	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
}
