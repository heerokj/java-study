package day17hw;

//Q06. ����ڰ� �Է��� ���� �ƽ�Ű �ڵ�� ��ȯ�Ͽ� +3��ū ������Ű�� ���ڷ� ��ȣȭ �Ϸ��� �Ѵ�. 
//������ ���� �����Ͽ� �ڵ带 �ۼ��Ͻÿ�
//ex) �ƽ�Ű�ڵ带 3��ŭ�̵��� ���� ���
//�Է�: ABC 
//quiz6.txt���� 
//------------------
//DEF

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class q06 {
	public static void main(String[] args) throws IOException {
		
		System.out.print("�Է� :");	
	//	InputStreamReader isr = new InputStreamReader(System.in);
	//	BufferedReader br = new BufferedReader(isr);
		
		BufferedReader br = new BufferedReader(
				                  new InputStreamReader(System.in));
		
		
		FileWriter fw = new FileWriter("c:\\q06.txt");
		BufferedWriter bw = new BufferedWriter(fw); 
	
		
		int value = 0;
		while ((value = System.in.read()) != -1) {
			bw.write((char)(value + 3));
			System.out.print((char)(value + 3));
		}
		bw.flush();  //�ƴ� �� �޸��忡 �Ƚ����ı�..
		
		
	//���..���..��	
		/*
	 * 	char n = br.readLine().charAt(0);
	 * int num = n;
	 * system.out.println(num);
	 */
		
//		char n = 0;
//		while((n = br.readLine().charAt(0)) != -1) {
//			bw.write(n+3);
//			System.out.println((char)n+3);
//		}bw.flush();
		
		
	/*	
		String data = null;
		while((data = br.readLine()) != null) {
			bw.write(data);
			System.out.println(data);
		}bw.flush();
	*/
		

		
	}

}
