package day17hw;

//Q04. File Ŭ������ ���ؼ� ������ �����ϰ� FileŬ������ �پ��� �޼��带 �̿��ؼ�
//����� ����ϴ� �ڵ�� �ۼ��Ͻÿ�(�� �޼��尡 �ϴ� ����� ����)

import java.io.File;

public class q04 {
	public static void main(String[] args) {
		
		File f = new File("C:\\q04.txt");
		System.out.println(f.getAbsolutePath()); // ������ ������
		System.out.println(f.canExecute());  //���α׷��� �߻� ��� �̸����� ǥ�õ� ������ �����Ҽ��ִ��� ����
		System.out.println(f.canRead()); //���� ���� �� �ִ��� ����
		System.out.println(f.getName()); // �����̸�

	
		
	}
}
