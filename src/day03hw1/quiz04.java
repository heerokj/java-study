package day03hw1; //ê³ ë??.. ?•´?„¤ì°¸ê³ 

import java.util.Scanner;

public class quiz04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("?™? „?„ ?ž…? ¥?•˜?„¸?š”: ");
		int money = sc.nextInt();

		System.out.println("?ž…? ¥ ê°?: " + money + "?›");
		System.out.println();
		System.out.println("1. ì½œë¼ : 1200?›");
		System.out.println("2. ?‚¬?´?‹¤ : 1600?›");
		System.out.println("3. ë§¥ì£¼ : 2500?›");

		System.out.print("ë©”ë‰´ë¥? ?„ ?ƒ?•˜?„¸?š”: "); 
		int num = sc.nextInt(); //?‹¤?‹œ ?ž…? ¥ê°? ë°›ì•„?˜¤ê¸? => int num = sc.nextInt(); ë³??ˆ˜?‹¤ë¥´ê²Œ ?•´?„œ ?˜ ?•œë²? ?¨ì¤??‹¤!
		System.out.println("?„ ?ƒ?•œ ë²ˆí˜¸: " + num);

		System.out.print("ëª‡ê°œ: ");
		int count = sc.nextInt(); //?ž…? ¥ê°? ë°›ì•„?˜¤ê¸?
		System.out.println("?ˆ˜?Ÿ‰: " + count);

		int price = 0;
		if (num == 1) {
			price = 1200;
		} else if (num == 2) {   // ?œ”?—·ê°ˆë¦¬ì§? ë§ê¸°  
			price = 1600;        // ?—¬ê¸°ì„œ ifë¬? { }?‹¤ ?—†?• ?„ok  ==>>?????????????? ?™œ????
		} else if (num == 3) {
			price = 2500;
		}

		int total = price * count;

		System.out.println("ì´? ê¸ˆì•¡??: " + total + "?ž…?‹ˆ?‹¤.");

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
			System.out.println("ê¸ˆì•¡?´ ë¶?ì¡±í•©?‹ˆ?‹¤.");
		} else {
			System.out.println("?ž”?ˆ : " + (money - total) + "?ž…?‹ˆ?‹¤.");
			if ((blance / 50000) != 0) {
				System.out.println("50000ê¶? : " + blance / 50000 + "ë§?");
			}
			if (a != 0) {
				System.out.println("10000ê¶? : " + a / 10000 + "ë§?");
			}
			if (b != 0) {
				System.out.println("5000ê¶? : " + b / 5000 + "ë§?");
			}
			if (c != 0) {
				System.out.println("1000ê¶? : " + c / 1000 + "ë§?");
			}
			if (d != 0) {
				System.out.println("500ê¶? : " + d / 500 + "ê°?");
			}
			if (e != 0) {
				System.out.println("100ê¶? : " + e / 100 + "ê°?");
			}
			if (f != 0) {
				System.out.println("50ê¶? : " + f / 50 + "ê°?");
			}
			if (g != 0) {
				System.out.println("10ê¶? : " + g / 10 + "ê°?");
			}
			if (h != 0) {
				System.out.println("1?› : " + h / 1 + "ê°?");
			}
		}

	}
}
