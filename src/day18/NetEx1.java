package day18;

import java.net.InetAddress;
import java.net.UnknownHostException;

// network ���� Ŭ���� : java.net.*;
public class NetEx1 {
	public static void main(String[] args) throws UnknownHostException {
		
		InetAddress inet = InetAddress.getLocalHost();
		 
		System.out.println(inet.getHostAddress()); //��ǻ���� ip�ּ�
		System.out.println(inet.getHostName()); //��ǻ���� name 
		
		//������ ������ ip�ּ�
		//���̹��� ip
		//�̸� ==> ip : DNS
		
		//naver dns�� ������� ������ϵ��� �迭�� �Ѱܹ޵���
		InetAddress [] inet2 = InetAddress.getAllByName("www.naver.com");
		
		for(InetAddress x : inet2) { // ����for��
			System.out.println(x.getHostAddress());
		}//���̹��� ���� �� �� �ִ� ip���� �� ����
		
		
		
	}
	

}
