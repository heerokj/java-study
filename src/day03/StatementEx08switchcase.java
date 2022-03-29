package day03;

import java.util.Scanner;

public class StatementEx08switchcase {
	public static void main(String[] args) {

		// 사용자로부터 성적 입력 받기

		System.out.println("성적 입력:");
		Scanner sc = new Scanner(System.in);

		// String data = sc.next(); //.next 메서드는 문자열 가져올 수 있음
		// System.out.println(data); //문자?�� 출력
		
		int score = sc.nextInt(); // 사용자로부터 받은 값을 int형 변수 score에 저장
		System.out.println(score); // score값 출력

		// <switch ~ case문>
		// 별 언급이 없으면 조건 만족한 부분에서 빠져나오는게 아니라 아래까지 쭉 실행됨
		// 멈추고 싶은부분에 break를 써줘야함
		switch (score / 10) { // 100~91까지 10으로 나눈 몫이
		case 9:  // 9인 경우 (98/10 = 9)
			System.out.println("A학점"); //몫이 10,9인경우 A학점
			break; 
		case 8:
			System.out.println("B학점");
			break;
		case 7:
			System.out.println("C학점");
			break;
		case 6:
			System.out.println("D학점");
			break;

		default: // if 문의 else ?��?�� => ?��머�??�� ?���?
			System.out.println("F학점");

		}  // switch ~ case문 end
	}

}
