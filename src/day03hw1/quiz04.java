package day03hw1; //κ³ λ??.. ?΄?€μ°Έκ³ 

import java.util.Scanner;

public class quiz04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("?? ? ?? ₯??Έ?: ");
		int money = sc.nextInt();

		System.out.println("?? ₯ κ°?: " + money + "?");
		System.out.println();
		System.out.println("1. μ½λΌ : 1200?");
		System.out.println("2. ?¬?΄?€ : 1600?");
		System.out.println("3. λ§₯μ£Ό : 2500?");

		System.out.print("λ©λ΄λ₯? ? ???Έ?: "); 
		int num = sc.nextInt(); //?€? ?? ₯κ°? λ°μ?€κΈ? => int num = sc.nextInt(); λ³???€λ₯΄κ² ?΄? ? ?λ²? ?¨μ€??€!
		System.out.println("? ?? λ²νΈ: " + num);

		System.out.print("λͺκ°: ");
		int count = sc.nextInt(); //?? ₯κ°? λ°μ?€κΈ?
		System.out.println("??: " + count);

		int price = 0;
		if (num == 1) {
			price = 1200;
		} else if (num == 2) {   // ??·κ°λ¦¬μ§? λ§κΈ°  
			price = 1600;        // ?¬κΈ°μ ifλ¬? { }?€ ?? ?ok  ==>>?????????????? ?????
		} else if (num == 3) {
			price = 2500;
		}

		int total = price * count;

		System.out.println("μ΄? κΈμ‘??: " + total + "???€.");

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
			System.out.println("κΈμ‘?΄ λΆ?μ‘±ν©??€.");
		} else {
			System.out.println("?? : " + (money - total) + "???€.");
			if ((blance / 50000) != 0) {
				System.out.println("50000κΆ? : " + blance / 50000 + "λ§?");
			}
			if (a != 0) {
				System.out.println("10000κΆ? : " + a / 10000 + "λ§?");
			}
			if (b != 0) {
				System.out.println("5000κΆ? : " + b / 5000 + "λ§?");
			}
			if (c != 0) {
				System.out.println("1000κΆ? : " + c / 1000 + "λ§?");
			}
			if (d != 0) {
				System.out.println("500κΆ? : " + d / 500 + "κ°?");
			}
			if (e != 0) {
				System.out.println("100κΆ? : " + e / 100 + "κ°?");
			}
			if (f != 0) {
				System.out.println("50κΆ? : " + f / 50 + "κ°?");
			}
			if (g != 0) {
				System.out.println("10κΆ? : " + g / 10 + "κ°?");
			}
			if (h != 0) {
				System.out.println("1? : " + h / 1 + "κ°?");
			}
		}

	}
}
