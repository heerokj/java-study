package day03; //�ٽ�

import java.util.Scanner;

public class StatementTest01 {

	public static void main(String[] args) {

		System.out.println("�¾ �⵵�� �Է��Ͻÿ�.");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();

		year %= 12;

		switch (year/12){
		case 4:
			System.out.println("����� ����Դϴ�.");
			break;
		case 5:
			System.out.println("����� �Ҷ��Դϴ�.");
			break;
		case 6:
			System.out.println("����� ȣ�����Դϴ�.");
			break;
		case 7:
			System.out.println("����� �䳢�Դϴ�.");
			break;
		case 8:
			System.out.println("����� ����Դϴ�.");
			break;
		case 9:
			System.out.println("����� ����Դϴ�.");
			break;
		case 10:
			System.out.println("����� �����Դϴ�.");
			break;
		case 11:
			System.out.println("����� ����Դϴ�.");
			break;
		case 0:
			System.out.println("����� �����̶��Դϴ�.");
			break;
		case 1:
			System.out.println("����� �߶��Դϴ�.");
			break;
		case 2:
			System.out.println("����� �����Դϴ�.");
			break;
		case 3:
			System.out.println("����� �������Դϴ�.");
			break;
		}

	}

}
