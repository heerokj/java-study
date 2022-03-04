package day03hw1;

import java.util.Scanner;

public class quiz06 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("¸î°³?");

		int value = sc.nextInt();

		int a = 1;
		System.out.println(a);
		int b = 1;
		System.out.println(b);
		int c = a + b;
		System.out.println(c);

		for (int i = 4; i < value; i++) {
			a = b;
			b = c;
			c = a + b;
			System.out.println(c);

		}

	}

}
