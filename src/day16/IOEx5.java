package day16;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOEx5 {
	
	public static void main(String[] args) throws IOException {
		
		File f1 = new File("c:\\Hello.java");
		File f2 = new File("c:\\Hello5.java");
		
		//���Ͽ� �����ؼ� �о���� �ɷ��� �ִ� Ŭ����
		FileInputStream fis = new FileInputStream(f1);	
		FileOutputStream fos = new FileOutputStream(f2);
		
		//BufferedInputStream(InputStream in)
		//InputStream��ü�� ���� �ļյ�(�θ��ڽİ��� �����ϰ� ������)
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		
		//bis : buffer��밡�� + file���ٰ���
		
		int value = 0;
		
		while((value = bis.read()) != -1) {
			bos.write(value);
			System.out.print((char)value);
		}
		bos.flush();
	}

}
