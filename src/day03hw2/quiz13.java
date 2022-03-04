package day03hw2;

import java.util.Scanner;

public class quiz13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("학년: ");
		int value = sc.nextInt();
		System.out.print("점수: ");
		int score = sc.nextInt();

		if (value == 4) {
			if (score >= 70 && score <= 100) {
				System.out.println("합격");
			} else if (0 <= score && score < 70) {
				System.out.println("불합격");
			} else {
				System.out.println("점수범위초과");
			}
		}

		if (value == 1 || value == 2 || value == 3) {
			if (score >= 60 && score <= 100) {
				System.out.println("합격");
			} else if (0 <= score && score < 60) {
				System.out.println("불합격");
			} else {
				System.out.println("경고");
			}

		}
	}
}
