package day03hw2;

import java.util.Scanner;

public class quiz16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Ű �Է� : ");

		int value = sc.nextInt();

		if (value >= 150) {
			System.out.println("���̱ⱸ �̿� ����");
		} else if (value < 150) {
			System.out.println("�θ�԰� �Բ��Դ°�?");
			int answer = sc.nextInt();
			if (answer == 1) {
				System.out.println("���� �ð� ������~");
			} else if (answer == 2) {
				System.out.println("� ��ð� �ٽ� ����~");
			}
		}

	}

}
