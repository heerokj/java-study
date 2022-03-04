package day02;

public class StatementEx2sum {

	public static void main(String[] args) {
		// 1부터 100까지 누적해서 출력
		int sum = 0;
		for (int i = 1; i <= 5; i++) {
			sum = sum + i;
			System.out.println("i :" + i + ", sum =" + sum);
		}
	}

}
