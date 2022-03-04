package day02hw2;

import java.util.Scanner;

public class quiz03 {

	public static void main(String[] args) {

		System.out.println("입력");
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();

		if (value % 3 == 0) {
			System.out.println(value + " 는 3의 배수입니다.");
		} else {
			System.out.println(value + " 는 3의 배수가 아닙니다.");
		}

	}

}
