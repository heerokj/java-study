package day16;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOEx3 {
	public static void main(String[] args) throws IOException {

		// c:\\Hello.java������ ������ c:\\Hello3.java�� �ٸ����Ϸ� �����ϱ�

		// 1.Hello.java���� ��ü f1 ����
		File f1 = new File("c:\\Hello.java");
		// 2.Hello3.java���� ��ü f2 ����
		File f2 = new File("c:\\Hello3.java");

		
		FileInputStream fis = new FileInputStream(f1);
		FileOutputStream fos = new FileOutputStream(f2);

		
		// fis.read() : �ƽ�Ű�ڵ� ������ �о��
		int value = 0;
		// 3.f1�� �̿��ؼ� ���� �о����('1'����Ʈ��)
		while ((value = fis.read()) != -1) { //�о�°�  value�� ����
			// 4.f2�� �̿��ؼ� ���� ����
			fos.write(value); //�о�� ���� ���Ͽ���
			System.out.println((char) value);
		}

	}

}
