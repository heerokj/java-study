package day17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOEx8 {
	public static void main(String[] args) throws IOException {
		
		
		//System.in ==> byte �迭
	
		System.out.print("�Է�: (���� : crl+z)");
				
		InputStreamReader isr = new InputStreamReader(System.in); //Ű����κ��� �Է¹����Ÿ�  isr�� �̿�
		
		//�ӵ��� ������ �ϱ� ����
		BufferedReader br = new BufferedReader(isr);
		
		//�Է¹��� ���� ���Ͽ� ����(�ѱ�)
		FileWriter fw = new FileWriter("c:\\ddd.txt"); 
		
		//������ ����
		BufferedWriter bw = new BufferedWriter(fw);
		
		
		String msg = null; //�о�°��� ���
		
		while((msg = br.readLine()) != null) {  
			bw.write(msg+"\n");
			System.out.println(msg); 
		}
		bw.flush();
	}
	
}
