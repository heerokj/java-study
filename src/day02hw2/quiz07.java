package day02hw2; //고�??.. 구�?링✔ok

import java.util.Scanner;

public class quiz07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("?��?��:"); //?��?��받기 ?�� "?��?��"출력
		int value = sc.nextInt(); //?��?��?��값을 ?��?��받음

		int hour = value / (60 * 60); //?��?�� 몫�? ?���?
		int minute = value / 60 - (hour * 60); //int minute = value % 3600 /60 ?��?�� 같음
		int second = value % 60; 
		System.out.println(hour + "?���?" + minute + "�?" + second + "�?");

	}

}
