package day02hw2;

public class quiz11othermethod {

	public static void main(String[] args) {

		int total = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				total = total + i;
			} else {
				total = total + 0;
			}

		}
		System.out.println("1부터 100까지 사이의 짝수의 누적합은 " + total + "입니다.");
	}
}
