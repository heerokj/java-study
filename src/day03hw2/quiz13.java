package day03hw2;

import java.util.Scanner;

public class quiz13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("�г�: ");
		int value = sc.nextInt();
		System.out.print("����: ");
		int score = sc.nextInt();

		if (value == 4) {
			if (score >= 70 && score <= 100) {
				System.out.println("�հ�");
			} else if (0 <= score && score < 70) {
				System.out.println("���հ�");
			} else {
				System.out.println("���������ʰ�");
			}
		}

		if (value == 1 || value == 2 || value == 3) {
			if (score >= 60 && score <= 100) {
				System.out.println("�հ�");
			} else if (0 <= score && score < 60) {
				System.out.println("���հ�");
			} else {
				System.out.println("���");
			}

		}
	}
}
