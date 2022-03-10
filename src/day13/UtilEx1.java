package day13;

import java.util.Random;

public class UtilEx1 {
	public static void main(String[] args) {

		//java.lang.Math
		System.out.println(Math.random());
		
		//1.생성자
		Random rnd = new Random();
		//2.정수값을 랜덤하게 구하려고한다.
		System.out.println(rnd.nextInt(45));
		
		
	}
}
