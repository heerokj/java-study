package day17; //ok read�о�ͼ� �ٸ����Ͽ� write�ϱ�

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOEx6 {
	public static void main(String[] args) throws IOException {
		File f1 = new File("c:\\Hello.java");
		File f2 = new File("c:\\Hello6.java"); //file�������� ��ü����
		
		
		FileReader fr = new FileReader(f1);	
		FileWriter fw = new FileWriter(f2);	 //���ⰴü
		
		//BufferedReader(Reader in) :Reader ��ü�� �� �ļյ��� �Ű������� ���� ������
		BufferedReader br = new BufferedReader(fr); //��ü ���� �� �������������ֱ�
		BufferedWriter bw = new BufferedWriter(fw);
		
		
	//	String msg = br.readLine();  //�����б�?
		
		String msg = null;
		
		while((msg = br.readLine()) != null) {
			System.out.println(msg);
			//bw.write(msg); // ���ٷ����
			bw.write(msg+"\n"); 
		}
		bw.flush(); // ����ؾ� txt�� �Էµ�
		
		
	}

}
