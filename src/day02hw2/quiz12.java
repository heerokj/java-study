package day02hw2;

import java.io.IOException;

public class quiz12 {

	public static void main(String[] args) throws IOException {

		System.out.println("�Է�:");
		int value = System.in.read();

		if (65 <= value && value <= 90) {
			int a = value + 32;
			System.out.println((char) a);
		} else if (97 <= value && value <= 122) {
			int b = value - 32;
			System.out.println((char) b); // ū���� ���������� �ٲٷ��� ����ȯ �������
		}
		// System.out.println((char) value + 32); ->�䷸�Դ� �� �ȵ�??

	}
}
