package day03hw2;

import java.util.Scanner;

public class quiz12 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.print("�Է�:");
		
		int value = sc.nextInt();
		
		if(value%3 ==0) {
			System.out.println(value+"�� 3�� ����Դϴ�.");
		}else {
			System.out.println(value+"�� 3�� ����� �ƴմϴ�.");
		}

	}

}
