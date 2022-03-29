package day17; //ok

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOEx10 {
	public static void main(String[] args) throws IOException {
		
		//test.txt : Hello java IO World ����!!
		
		// 1.File ��ü ����
		//File f = new File("c:\\test.txt");
				
		// 2. file + char Stream �迭 ���� Ŭ����
		//FileWriter fw = new FileWriter(f);
					
		// 3. ���� char Stream �迭 ���� Ŭ����
		//BufferedWriter bw = new BufferedWriter(fw);
		
		
		BufferedWriter bw = new BufferedWriter(
				                  new FileWriter(
				                		   new File("c:\\test.txt")));		
				
		// 4. ���ڸ� ����
		bw.write("Hello java IO World ����!!!");
		bw.flush();
		System.out.println("-----------------");
		
		
		
		// 5. file ��ü ����
		//File f2 = new File("c:\\test.txt");		
		
		// 6. ���� ������ �� �ִ� char Stream �迭 �б� Ŭ���� => �д°�ü
		//FileReader fr = new FileReader(f2);				
		
		// 7. ���۸� ��� �� �� �ִ� char Stream �迭 �б� Ŭ����
		//BufferedReader br = new BufferedReader(fr);
		
		
		BufferedReader br = new BufferedReader(
				                  new FileReader(
				                		  new File("c:\\test.txt")));
		
			
		// 8. �о���� =>������ �����̴� ���ٸ� �о����
		String data = br.readLine();		
		// 9. �ֿܼ� ����ϱ�
		System.out.println(data);
		
		
	}

}
