package day16;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class IOEx1 {
	public static void main(String[] args) throws IOException {
		
		//InputStream : System.in : Ű����
		
//		int value = System.in.read(); //��������(throws IOException)
//		System.out.println(value);
		
		File f =  new File("c:\\Hello.java");  //������ �ִ����� ��ü��������
		FileInputStream fis = new FileInputStream(f);
		//���� FileInputStream(File file)
		
	//	int value = fis.read();
	//	System.out.println(value); //112 ��� : ���Ͽ��������� ù������ �ƽ�Ű�ڵ尪(�ѹ���Ʈ�� �о�ü��ֱ⿡)
		
		//���� ���� �ѱ����ѱ��� �� ����ϰ�;�
		int value =0;//
		while ((value = fis.read()) != -1) {
			char c = (char)value;//�ƽ�Ű�ڵ尪 ���ڷ� ����ȯ
			System.out.print(c); //�ѱ��� ���� : �ڹٴ� �����ڵ�
		}
		
	}

}
