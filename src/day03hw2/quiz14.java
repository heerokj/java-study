package day03hw2;

import java.util.Scanner;

public class quiz14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("입력:");

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a > b && a > c) {
			System.out.println("최대값 : " + a);
		} else if (b > a && b > c) {
			System.out.println("최대값 : " + b);
		} else if (c > a && c > b) {
			System.out.println("최대값 : " + c);
		}
		if (a < b && a < c) {
			System.out.println("최소값 : " + a);
		} else if (b < a && b < c) {
			System.out.println("최소값 : " + b);
		} else if (c < a && c < b) {
			System.out.println("최소값 : " + c);
		}

		System.out.println("합계 : " + (a + b + c));
		System.out.println("평균 : " + (a + b + c) / 3);

	}

}
