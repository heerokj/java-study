package day05hw2; //Quiz3. 2�� ���� 6�ܱ��� ����ϴ� �޼��带 �����ϼ���

public class quiz03 {

	static void printGuGuDan(int a, int b) {
		for (int i = a; i <= b; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j);
			}

		}

	}

	public static void main(String[] args) {
		printGuGuDan(2, 6);

	}
}
