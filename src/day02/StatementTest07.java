package day02;

import java.io.IOException;

public class StatementTest07 {

//���� : ����ڷκ��� ���ڸ� �Է¹޾� 3�� ����������θ� ��� 

	public static void main(String[] args) throws IOException {
 
		System.out.println("�Է��ϼ���!");

		int value = System.in.read(); // 1. ����ڷκ��� ���� �Է¹޴´�.

		value -= 48; // 2. �ƽ�Ű�ڵ� ==> ����
		System.out.println(value);

		// 3. �� ���� 3�ǹ������ ���� &
		// 4. ���ǿ� ���� �޼����� ���
		if (value % 3 == 0) {
			System.out.println(value + "�� 3�ǹ�� �Դϴ�.");
		} else {
			System.out.println(value + "�� 3�ǹ���� �ƴմϴ�.");
		}
	}
}
