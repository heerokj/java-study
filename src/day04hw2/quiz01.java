package day04hw2;

import java.util.Scanner;

public class quiz01 {

	public static void main(String[] args) {
		
		System.out.println("���� �� : "+(int)(Math.random()*100));
		Scanner sc = new Scanner(System.in); //���ɳ� ����(��ü ����)
		System.out.print("�Է� :");
		
		int value = sc.nextInt(); //������ �Է¹ޱ�
		
		if(value != (int)(Math.random()*100)) {
			if(value > (int)(Math.random()*100))
			System.out.println("��! ���� �� ���� ���� �Է��Ͻÿ� : ");
		}else {
			System.out.println("��! ���� �� ū ���� �Է��Ͻÿ� : ");
		}
	}

}
