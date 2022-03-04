package day03hw2;

import java.util.Scanner;

public class quizz14 {

	public static void main(String[] args) {
		// 1. 3개의 값을 가져오기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력하시오:");
		int a = sc.nextInt();
		
		System.out.print("입력하시오:");
		int b = sc.nextInt();
		
		System.out.print("입력하시오:");
		int c = sc.nextInt();
		
		System.out.println("입력 값 : "+a+", "+b+", "+c);
		

		// 2. 큰값?
		int max = a;
		if (b > max)
			max = b;
		if (c > max)
			max = c;
		System.out.println(max);

		// 3. 최소값
		int min = a;
		if (b < min)
			min = b;
		if (c < min)
			min = c;
		System.out.println(min);

		// 5.합계
		int sum = a + b + c;
		System.out.println(sum);

		// 4.평균
		float avg = sum / 3;
		System.out.println(avg);

	}

}
