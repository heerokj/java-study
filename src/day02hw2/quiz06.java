package day02hw2; //고민.. ok(11번 풀고나니 쉽게풀림)

public class quiz06 {

	public static void main(String[] args) {

		int sum = 0;
		for (int i = 1; i <= 50; i++) {
			if (i % 5 == 0 && i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);

	}

}
