package day03hw2;

import java.util.Scanner;

public class quiz14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("�Է�:");

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a > b && a > c) {
			System.out.println("�ִ밪 : " + a);
		} else if (b > a && b > c) {
			System.out.println("�ִ밪 : " + b);
		} else if (c > a && c > b) {
			System.out.println("�ִ밪 : " + c);
		}
		if (a < b && a < c) {
			System.out.println("�ּҰ� : " + a);
		} else if (b < a && b < c) {
			System.out.println("�ּҰ� : " + b);
		} else if (c < a && c < b) {
			System.out.println("�ּҰ� : " + c);
		}

		System.out.println("�հ� : " + (a + b + c));
		System.out.println("��� : " + (a + b + c) / 3);

	}

}
