package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOEx2 {
	public static void main(String[] args) throws IOException {
		
		byte[] b = {'j','a','v','a'};
		
		File f = new File("c:\\javaout.txt");
		
		//�ڹٿ��� �ܺη� ��������(���Ϸ�) ���� Ŭ����
		//FileOutputStream 
		FileOutputStream fos = new FileOutputStream(f);//��������throws FileNotFoundException
		
		//c����̺꿡 �����
	//	fos.write(112); //�������� throws IOException
	
		//c����̺꿡 �����
		fos.write(b); //�迭�� �̸��� ���൵ �� 
	
	}
	

}
