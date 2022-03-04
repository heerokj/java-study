package day03;

import java.util.Scanner;

public class StatementEx10 {
	public static void main(String[] args) {
		
// 1. 사용자로부터 내어난년도 4자리 숫자를 입력받는다.
		System.out.println("태어난 면도를 4자리숫자로 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		System.out.println("year : " + year);

		// 2. 12로 나눈 나머지로 이용해서 띠를 구한다.
		
		// 띠 : 12간지
				// 자 축 인 묘 진 사 오 미 신 류 술 해
				// 쥐 소 호 토 용 뱀 말 양 원 닭 개 돼
				// 4 5 6 7 8 9 10 11 0 1 2 3

		
		year %= 12; // 
		System.out.println("12로 나눈 나머지값 : " + year);

		if (year == 4) {
			System.out.println("당신은 쥐띠입니다.");
		} else if (year == 5) {
			System.out.println("당신은 소띠입니다.");
		} else if (year == 6) {
			System.out.println("당신은 호랑이띠입니다.");
		} else if (year == 7) {
			System.out.println("당신은 토끼띠입니다.");
		} else if (year == 8) {
			System.out.println("당신은 용띠입니다.");
		} else if (year == 9) {
			System.out.println("당신은 뱀띠입니다.");
		} else if (year == 10) {
			System.out.println("당신은 말띠입니다.");
		} else if (year == 11) {
			System.out.println("당신은 양띠입니다.");
		} else if (year == 0) {
			System.out.println("당신은 원숭이띠입니다.");
		} else if (year == 1) {
			System.out.println("당신은 닭띠입니다.");
		} else if (year == 2) {
			System.out.println("당신은 개띠입니다.");
		} else if (year == 3) {
			System.out.println("당신은 돼지띠입니다.");
		}

	}

}
