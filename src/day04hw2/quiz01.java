package day04hw2;

import java.util.Scanner;

public class quiz01 {

	public static void main(String[] args) {
		
		System.out.println("랜덤 값 : "+(int)(Math.random()*100));
		Scanner sc = new Scanner(System.in); //스케너 선언(객체 생성)
		System.out.print("입력 :");
		
		int value = sc.nextInt(); //정수값 입력받기
		
		if(value != (int)(Math.random()*100)) {
			if(value > (int)(Math.random()*100))
			System.out.println("땡! 조금 더 작은 수를 입력하시오 : ");
		}else {
			System.out.println("땡! 조금 더 큰 수를 입력하시오 : ");
		}
	}

}
