package day02hw2;

import java.util.Scanner;

public class quiz01 {

	public static void main(String[] args) {

		System.out.println("¸î´Ü?");
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();

		for (int i = 2; i <= 9; i += 2) {

			System.out.println(value + "*" + i + "=" + (value * i));
		}
	}

}
