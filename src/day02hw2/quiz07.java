package day02hw2; //κ³ λ??.. κ΅¬κ?λ§βok

import java.util.Scanner;

public class quiz07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("?? ₯:"); //?? ₯λ°κΈ° ?  "?? ₯"μΆλ ₯
		int value = sc.nextInt(); //? ??κ°μ ?? ₯λ°μ

		int hour = value / (60 * 60); //?? λͺ«μ? ?κ°?
		int minute = value / 60 - (hour * 60); //int minute = value % 3600 /60 ?΄? κ°μ
		int second = value % 60; 
		System.out.println(hour + "?κ°?" + minute + "λΆ?" + second + "μ΄?");

	}

}
