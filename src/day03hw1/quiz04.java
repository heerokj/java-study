package day03hw1; //고�??.. ?��?��참고

import java.util.Scanner;

public class quiz04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("?��?��?�� ?��?��?��?��?��: ");
		int money = sc.nextInt();

		System.out.println("?��?�� �?: " + money + "?��");
		System.out.println();
		System.out.println("1. 콜라 : 1200?��");
		System.out.println("2. ?��?��?�� : 1600?��");
		System.out.println("3. 맥주 : 2500?��");

		System.out.print("메뉴�? ?��?��?��?��?��: "); 
		int num = sc.nextInt(); //?��?�� ?��?���? 받아?���? => int num = sc.nextInt(); �??��?��르게 ?��?�� ?�� ?���? ?���??��!
		System.out.println("?��?��?�� 번호: " + num);

		System.out.print("몇개: ");
		int count = sc.nextInt(); //?��?���? 받아?���?
		System.out.println("?��?��: " + count);

		int price = 0;
		if (num == 1) {
			price = 1200;
		} else if (num == 2) {   // ?��?��갈리�? 말기  
			price = 1600;        // ?��기서 if�? { }?�� ?��?��?��ok  ==>>?????????????? ?��????
		} else if (num == 3) {
			price = 2500;
		}

		int total = price * count;

		System.out.println("�? 금액??: " + total + "?��?��?��.");

		int blance = (money - total);
		int a = blance % 50000;
		int b = a % 10000;
		int c = b % 5000;
		int d = c % 1000;
		int e = d % 500;
		int f = e % 100;
		int g = f % 50;
		int h = g % 10;

		if (blance < 0) { 
			System.out.println("금액?�� �?족합?��?��.");
		} else {
			System.out.println("?��?�� : " + (money - total) + "?��?��?��.");
			if ((blance / 50000) != 0) {
				System.out.println("50000�? : " + blance / 50000 + "�?");
			}
			if (a != 0) {
				System.out.println("10000�? : " + a / 10000 + "�?");
			}
			if (b != 0) {
				System.out.println("5000�? : " + b / 5000 + "�?");
			}
			if (c != 0) {
				System.out.println("1000�? : " + c / 1000 + "�?");
			}
			if (d != 0) {
				System.out.println("500�? : " + d / 500 + "�?");
			}
			if (e != 0) {
				System.out.println("100�? : " + e / 100 + "�?");
			}
			if (f != 0) {
				System.out.println("50�? : " + f / 50 + "�?");
			}
			if (g != 0) {
				System.out.println("10�? : " + g / 10 + "�?");
			}
			if (h != 0) {
				System.out.println("1?�� : " + h / 1 + "�?");
			}
		}

	}
}
