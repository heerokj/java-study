package day16;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOEx4 {
	public static void main(String[] args) throws IOException {

		File f = new File("c:\\Hello.java");
		File f2 = new File("c:\\Hello4.java");

		FileReader fr = new FileReader(f);
		FileWriter fw = new FileWriter(f2);

		
//		int value = 0;
//		value = fr.read();
//		System.out.println(value);

		
		// '2'����Ʈ�� �о����
		// �ݺ��ؼ�
		int value = 0;
		while ((value = fr.read()) != -1) {
			System.out.print((char) value);// �о����
			fw.write(value); // .write(int c) //����(c����̺꿡 Hello4.java����)
		}
		//Buffer ���..
		//���ٰ� �ٷ� �����°� �ƴ϶� ���ۿ� ���� => ���� ���� Hello4.java�� ���� �����
		fw.flush(); 

	}
	
}
