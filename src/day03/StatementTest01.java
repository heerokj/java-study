package day03; //다시

import java.util.Scanner;

public class StatementTest01 {

	public static void main(String[] args) {

		System.out.println("태어난 년도를 입력하시오.");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();

		year %= 12;

		switch (year/12){
		case 4:
			System.out.println("당신은 쥐띠입니다.");
			break;
		case 5:
			System.out.println("당신은 소띠입니다.");
			break;
		case 6:
			System.out.println("당신은 호랑이입니다.");
			break;
		case 7:
			System.out.println("당신은 토끼입니다.");
			break;
		case 8:
			System.out.println("당신은 용띠입니다.");
			break;
		case 9:
			System.out.println("당신은 뱀띠입니다.");
			break;
		case 10:
			System.out.println("당신은 말띠입니다.");
			break;
		case 11:
			System.out.println("당신은 양띠입니다.");
			break;
		case 0:
			System.out.println("당신은 원숭이띠입니다.");
			break;
		case 1:
			System.out.println("당신은 닭띠입니다.");
			break;
		case 2:
			System.out.println("당신은 개띠입니다.");
			break;
		case 3:
			System.out.println("당신은 돼지띠입니다.");
			break;
		}

	}

}
