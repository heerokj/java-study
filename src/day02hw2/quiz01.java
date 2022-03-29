package day02hw2; // 다시풀고 다른 답

import java.util.Scanner;

public class quiz01 {

	public static void main(String[] args) {

		System.out.println("몇단?");
		Scanner sc = new Scanner(System.in);

		int value = sc.nextInt();

		for (int i = 2; i <= 9; i += 2) {

			System.out.println(value + "*" + i + "=" + (value * i));
		}

		System.out.println("======");
		for (int i = 1; i <= 9; i++) {
			if (i % 2 == 0) {
				System.out.println(value + "*" + i + "=" + (value * i));
			}

		}

	}
}
