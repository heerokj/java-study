package day03hw1; //어렵..고민 ok

public class quiz02 {

	public static void main(String[] args) {
		// ( 2중 for문을 사용 )
		// 1부터 1000 사이의 두 수 합이 3의 배수 값 (10개만)을 구하고
		// 그 값의 누적합을 구하시요

		int counter = 0;
		int sum = 0;
		for (int i = 1; i <= 1000; i++) {
			for (int j = 1; i <= j; j++) {
				if ((i + j) % 3 == 0) {
					counter++;
					sum += (i + j);
					if (counter == 10) 
						break;
				}
			}
		}

		System.out.println(sum);
	}
}
