package day03hw2;

import java.util.Scanner;

public class quiz15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�Է� : ");
		
		int value = sc.nextInt();
		
		if(value>0) {
			System.out.println(value+"�� ����Դϴ�.");
		}else if(value ==0) {
			System.out.println(value+"�� 0�Դϴ�.");
		}else if(value<0){
			System.out.println(value+"�� �����Դϴ�.");
		}
			
			

	}

}
