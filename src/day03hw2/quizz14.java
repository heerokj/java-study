package day03hw2;

import java.util.Scanner;

public class quizz14 {

	public static void main(String[] args) {
		// 1. 3���� ���� ��������
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է��Ͻÿ�:");
		int a = sc.nextInt();
		
		System.out.print("�Է��Ͻÿ�:");
		int b = sc.nextInt();
		
		System.out.print("�Է��Ͻÿ�:");
		int c = sc.nextInt();
		
		System.out.println("�Է� �� : "+a+", "+b+", "+c);
		

		// 2. ū��?
		int max = a;
		if (b > max)
			max = b;
		if (c > max)
			max = c;
		System.out.println(max);

		// 3. �ּҰ�
		int min = a;
		if (b < min)
			min = b;
		if (c < min)
			min = c;
		System.out.println(min);

		// 5.�հ�
		int sum = a + b + c;
		System.out.println(sum);

		// 4.���
		float avg = sum / 3;
		System.out.println(avg);

	}

}
