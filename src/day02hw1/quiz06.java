package day02hw1;

import java.io.IOException;

public class quiz06 {

	public static void main(String[] args) throws IOException {

		System.out.println("���?");

		int sc = System.in.read(); //  ǥ�� �Է� ��ġ�� ���� ���� �Է¹޾� ���� / �ƽ�Ű�ڵ�� �ҷ���
		sc -= 48; // �ƽ�Ű�ڵ�-> ����
		for (int i = 1; i <= 9; i++) { // 1���� 9���� i�� 1�������Ҷ����� �������
			System.out.println(sc + "*" + i + "=" + (sc * i));

		}

	}

}
