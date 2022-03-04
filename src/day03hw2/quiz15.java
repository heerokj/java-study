package day03hw2;

import java.util.Scanner;

public class quiz15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 : ");
		
		int value = sc.nextInt();
		
		if(value>0) {
			System.out.println(value+"는 양수입니다.");
		}else if(value ==0) {
			System.out.println(value+"는 0입니다.");
		}else if(value<0){
			System.out.println(value+"는 음수입니다.");
		}
			
			

	}

}
