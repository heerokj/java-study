package day17hw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class q02 {
	public static void main(String[] args) throws IOException {

		//q02����(�о���� �ٸ����� ����)
		//�о����
		// 1. file ��ü ����
		 File f = new File("c:\\Test.txt");
		// 2. ���� ������ �� �ִ� char Stream �迭 �б� Ŭ����
		 FileReader fr = new FileReader(f);
		// 3. ���۸� ��� �� �� �ִ� char Stream �迭 �б� Ŭ����
		 BufferedReader br = new BufferedReader(fr);
		// 4. �о���� =>������ �����̴� ���ٸ� �о����	
		 String data = br.readLine();
		 System.out.println(data);
	
		 // �ٸ� ���� ����
		// 5. c:\\Test2.txt ���Ͽ� �����ϱ�
		 File f2 = new File("c:\\Test2.txt");
		 FileWriter fw2 = new FileWriter(f2);
		 BufferedWriter bw2 = new BufferedWriter(fw2);
		bw2.write(data);
		bw2.flush();
		
		

	}

}
