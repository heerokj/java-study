package day02hw2; //ê³ ë??.. êµ¬ê?ë§âœ”ok

import java.util.Scanner;

public class quiz07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("?…? ¥:"); //?…? ¥ë°›ê¸° ? „ "?…? ¥"ì¶œë ¥
		int value = sc.nextInt(); //? •?ˆ˜?˜•ê°’ì„ ?…? ¥ë°›ìŒ

		int hour = value / (60 * 60); //?‚˜?ˆˆ ëª«ì? ?‹œê°?
		int minute = value / 60 - (hour * 60); //int minute = value % 3600 /60 ?´?‘ ê°™ìŒ
		int second = value % 60; 
		System.out.println(hour + "?‹œê°?" + minute + "ë¶?" + second + "ì´?");

	}

}
