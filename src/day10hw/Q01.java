package day10hw;

import java.util.Scanner;

public class Q01 {
	public static void main(String[] args) {

		System.out.print("�ֹι�ȣ�Է� : ");
		Scanner sc = new Scanner(System.in);

		String data = sc.next();

		System.out.println(data.substring(0, 2) + "�� " 
		+ data.substring(2, 4) + "�� " 
				+ data.substring(4, 6) + "�� "
				+ ((data.equals("1") || data.equals("3")) ? "����" : "����") + "�̽ó׿�");

	}
}
