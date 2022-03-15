package day16;

import java.io.File;
import java.io.IOException;

public class FileEx {

	public static void main(String[] args) throws IOException {
		String str = new String("c:\\");// \�ΰ�! \�Ѱ��� Ư�����ڳ�Ÿ���� ���� ����
		File f = new File(str);

		System.out.println("----------------");

		File f1 = new File("c:\\Hello2.java"); // ������ ��� ����X

		// ������ �ֳ�?
		System.out.println(f1.exists() ? "��������" : "���Ͼ���");

		// ������ ������ ���� ����..
		if (!f1.exists()) { // exists()������ �� ������ ����
			// ����
			f1.createNewFile(); // ����������Ŵ (throws IOException)
			System.out.println("������ �����մϴ�.");
		} else {
			System.out.println("������ �����մϴ�.");
		}
		System.out.println("----------------");
		
		String path = f1.getAbsolutePath(); //������
		System.out.println(path); //c:\Hello2.java���

		
		//isXXX() : boolean ���� ����
		//�갡 �����ΰ���?
		if(f1.isFile()) {
			System.out.println("�����Դϴ�.");
		}
		if(f1.isDirectory()) {
			System.out.println("���丮�Դϴ�.");
		}
		
		System.out.println("----------------");
		File f2 = new File("C:\\dev\\eclipse-jee-2021-12-R-win32-x86_64\\eclipse");
		if(f2.isDirectory()) {
			System.out.println("���丮 ����");
			
			// ���� ���丮�� ���ϸ���� �迭�� ����
			String [] list = f2.list(); 
			//���
			for(String x : list) { // ���� for��
				System.out.println(x);
			}
			
		}

	}
}
