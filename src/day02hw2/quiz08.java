package day02hw2;

import java.util.Scanner;

public class quiz08 {

	public static void main(String[] args) {

		System.out.println("�����Է� :");
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();

		if (value % 3 == 0) {
			System.out.println(value + " �� 3�ǹ�� �Դϴ�.");
		} else {
			System.out.println(value + " �� 3�ǹ���� �ƴմϴ�.");
		}
	}

}
