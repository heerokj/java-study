package day02;

import java.io.IOException;

public class StatementTest06 {

	public static void main(String[] args) throws IOException {
		// n�Է��ϸ�
		// 1���� n���� ��µǵ��� �����(��, n�� 10�� �����ʴ´�)

		System.out.println("�Է�");

		int n = System.in.read(); // ǥ���Է���ġ�κ��� �ѹ��ڸ� ascii�ڵ尪���� ��������
		// System.out.println(n); //56���*
		n -= 48; // 56-48 => 8 -=�� ���Կ�����
		// System.out.println(n); //8���

		for (int i = 1; i <= n; i++) { // n�� 8���Ŷ� �Ȱ��� ����
			System.out.println(i);
		}

	}

}
