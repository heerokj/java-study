package day03hw2;

import java.util.Scanner;

public class quiz16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("키 입력 : ");

		int value = sc.nextInt();

		if (value >= 150) {
			System.out.println("놀이기구 이용 가능");
		} else if (value < 150) {
			System.out.println("부모님과 함께왔는가?");
			int answer = sc.nextInt();
			if (answer == 1) {
				System.out.println("좋은 시간 보내렴~");
			} else if (answer == 2) {
				System.out.println("어른 모시고 다시 오렴~");
			}
		}

	}

}
