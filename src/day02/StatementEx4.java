package day02;

import java.io.IOException; // �Ʒ� throws IO~ ������ import~�������

public class StatementEx4 {
	                                    //System.in.read ����Ϸ��� ���� throws IOExcepton����ߵ�
	public static void main(String[] args) throws IOException { 

		System.out.println("���?");
		
		// ǥ�� �Է� ��ġ�� ���� ���� �Է¹޾� ����
		int value = System.in.read(); // ����ڷκ��� ���� �Է¹޾� 
		System.out.println("�Է��ѹ����� ascill:" + value); //�ƽ�Ű�ڵ�

		value -= 48; //�ƽ�Ű�ڵ� -> ����
		System.out.println("����ȭ ��Ų�� :" + value);
		// 3-> 51-48

		
		// ����) �Է��� ���� ������ ���

		for (int i = 1; i <= 9; i++) { // {}�ȿ��ִ� i�� �������� / �� �����ȿ����� ����Ǵ� ��
			System.out.println(value + "*" + i + "=" + (value * i));
		}
	}
}
