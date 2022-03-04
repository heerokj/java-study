package day10hw;

import java.util.Scanner;

public class Q01 {
	public static void main(String[] args) {

		System.out.print("주민번호입력 : ");
		Scanner sc = new Scanner(System.in);

		String data = sc.next();

		System.out.println(data.substring(0, 2) + "년 " 
		+ data.substring(2, 4) + "월 " 
				+ data.substring(4, 6) + "일 "
				+ ((data.equals("1") || data.equals("3")) ? "남성" : "여성") + "이시네요");

	}
}
