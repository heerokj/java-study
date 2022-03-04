package day03hw2;

import java.util.Scanner;

public class quiz12 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.print("입력:");
		
		int value = sc.nextInt();
		
		if(value%3 ==0) {
			System.out.println(value+"는 3의 배수입니다.");
		}else {
			System.out.println(value+"는 3의 배수가 아닙니다.");
		}

	}

}
