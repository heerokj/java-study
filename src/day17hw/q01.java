package day17hw;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class q01 { 

	public static void main(String[] args) throws IOException {
	
		// 1.File ��ü ����
		File f = new File("c:\\Test.txt");
		// 2. file + char Stream �迭 ���� Ŭ����
		FileWriter fw = new FileWriter(f);
		// 3. ���� char Stream �迭 ���� Ŭ����
		BufferedWriter bw = new BufferedWriter(fw);
		// 4. ���ڸ� ����
		bw.write("Hello javaWorld");
		bw.flush();
		System.out.println("������");
		
	
	}
}
