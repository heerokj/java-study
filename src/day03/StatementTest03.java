package day03;// ??ok

public class StatementTest03 {

	public static void main(String[] args) {

		int sum =0;
		int counter = 0;
		for (int i = 1; i <= 1000; i++) {
			for (int j = 1; j <= 1000; j++) {
				if ((i + j) % 3 == 0) {
					counter++;
					sum += (i+j);
					if(counter==10) break;
				}
			} 
		}

		System.out.println("´©ÀûÇÕ : "+ sum);
	}

}
