package day03hw1;

import java.util.Scanner;

public class quiz03 {

	public static void main(String[] args) {
		// ?��?��교환�?(?�� ?��?�� ?��?��?��?���? )
		// ?��?�� : 67921

		Scanner sc = new Scanner(System.in);
		System.out.println("?��?�� :");
		int value = sc.nextInt();

		int a = value % 50000;
		int b = a % 10000;
		int c = b % 5000;
		int d = c % 1000;
		int e = d % 500;
		int f = e % 100;
		int g = f % 50;
		int h = g % 10;

		System.out.println("50000�? : " + value / 50000 + "�?");
		System.out.println("10000�? : " + a / 10000 + "�?");
		System.out.println("5000�? : " + b / 5000 + "�?");
		System.out.println("1000�? : " + c / 1000 + "�?");
		System.out.println("500�? : " + d / 500 + "�?");
		System.out.println("100�? : " + e / 100 + "�?");
		System.out.println("50�? : " + f / 50 + "�?");
		System.out.println("10�? : " + g / 10 + "�?");
		System.out.println("1?�� : " + h / 1 + "�?");
	}

}
