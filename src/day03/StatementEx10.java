package day03;

import java.util.Scanner;

public class StatementEx10 {
	public static void main(String[] args) {
		
// 1. ����ڷκ��� ����⵵ 4�ڸ� ���ڸ� �Է¹޴´�.
		System.out.println("�¾ �鵵�� 4�ڸ����ڷ� �Է��ϼ���: ");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		System.out.println("year : " + year);

		// 2. 12�� ���� �������� �̿��ؼ� �츦 ���Ѵ�.
		
		// �� : 12����
				// �� �� �� �� �� �� �� �� �� �� �� ��
				// �� �� ȣ �� �� �� �� �� �� �� �� ��
				// 4 5 6 7 8 9 10 11 0 1 2 3

		
		year %= 12; // 
		System.out.println("12�� ���� �������� : " + year);

		if (year == 4) {
			System.out.println("����� ����Դϴ�.");
		} else if (year == 5) {
			System.out.println("����� �Ҷ��Դϴ�.");
		} else if (year == 6) {
			System.out.println("����� ȣ���̶��Դϴ�.");
		} else if (year == 7) {
			System.out.println("����� �䳢���Դϴ�.");
		} else if (year == 8) {
			System.out.println("����� ����Դϴ�.");
		} else if (year == 9) {
			System.out.println("����� ����Դϴ�.");
		} else if (year == 10) {
			System.out.println("����� �����Դϴ�.");
		} else if (year == 11) {
			System.out.println("����� ����Դϴ�.");
		} else if (year == 0) {
			System.out.println("����� �����̶��Դϴ�.");
		} else if (year == 1) {
			System.out.println("����� �߶��Դϴ�.");
		} else if (year == 2) {
			System.out.println("����� �����Դϴ�.");
		} else if (year == 3) {
			System.out.println("����� �������Դϴ�.");
		}

	}

}
