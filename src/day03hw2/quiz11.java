package day03hw2;

import java.util.Scanner;

public class quiz11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("입력:");

		int value = sc.nextInt();

		if (value >= 50) {
			System.out.println(value + "는 50이상의 수입니다.");
		} else {
			System.out.println(value + "는 50미만의 수입니다.");
		}
	}

}
