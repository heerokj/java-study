package day03;

import java.util.Scanner;

public class StatementEx08switchcase {
	public static void main(String[] args) {

		// ?��?��?��로�??�� ?��?��?�� ?��?��받기

		System.out.println("?��?�� ?��?��");
		Scanner sc = new Scanner(System.in);

		// String data = sc.next(); //.next메서?��?�� 문자?�� �??��?�� ?�� ?��?��
		// System.out.println(data); //문자?�� 출력
		
		int score = sc.nextInt(); //?��?�� �? �??��?���?
		System.out.println(score); //?��?�� �? 출력

		// ?��<switch ~ case�?>
		// if�? ???��?�� switch문으로도 ?��?���??��
		// switch�??��?�� 문�? 
		// �? ?���? ?��급이 ?��?���? 조건만족?�� �?분에?�� 빠져?��?���?x
		// ?��?��까�? 모두 ?��?��?�� 
		// 멈추�? ?��??�?분에 break?��?��?�� ?��?��?��?��
		switch (score / 10) { //?��?��받�? ?��?���? 10?���? ?��?�� 몫이
		case 10: // 10?�� 경우 
		case 9:  // 9?�� 경우 (98/10 = 9)
			System.out.println("A?��?��"); //몫이 10,9?��경우 A?��?��
			break; //만족?���? 멈춤
		case 8:
			System.out.println("B?��?��");
			break;
		case 7:
			System.out.println("C?��?��");
			break;
		case 6:
			System.out.println("D?��?��");
			break;

		default: // if 문의 else ?��?�� => ?��머�??�� ?���?
			System.out.println("F?��?��");

		} //switch ~ case �? end
	}

}
