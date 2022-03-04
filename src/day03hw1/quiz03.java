package day03hw1;

import java.util.Scanner;

public class quiz03 {

	public static void main(String[] args) {
		// ?”?ˆêµí™˜ê¸?(?° ?‹¨?œ„ ?™”??ˆœ?œ¼ë¡? )
		// ?…? ¥ : 67921

		Scanner sc = new Scanner(System.in);
		System.out.println("?…? ¥ :");
		int value = sc.nextInt();

		int a = value % 50000;
		int b = a % 10000;
		int c = b % 5000;
		int d = c % 1000;
		int e = d % 500;
		int f = e % 100;
		int g = f % 50;
		int h = g % 10;

		System.out.println("50000ê¶? : " + value / 50000 + "ë§?");
		System.out.println("10000ê¶? : " + a / 10000 + "ë§?");
		System.out.println("5000ê¶? : " + b / 5000 + "ë§?");
		System.out.println("1000ê¶? : " + c / 1000 + "ë§?");
		System.out.println("500ê¶? : " + d / 500 + "ê°?");
		System.out.println("100ê¶? : " + e / 100 + "ê°?");
		System.out.println("50ê¶? : " + f / 50 + "ê°?");
		System.out.println("10ê¶? : " + g / 10 + "ê°?");
		System.out.println("1?› : " + h / 1 + "ê°?");
	}

}
