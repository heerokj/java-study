package day03hw2;

import java.util.Scanner;

public class quiz11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("�Է�:");

		int value = sc.nextInt();

		if (value >= 50) {
			System.out.println(value + "�� 50�̻��� ���Դϴ�.");
		} else {
			System.out.println(value + "�� 50�̸��� ���Դϴ�.");
		}
	}

}
