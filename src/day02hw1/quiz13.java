package day02hw1; //고민 ok

public class quiz13 {

	public static void main(String[] args) {
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		String str = "*";
		
		
		System.out.println("------");
		//두번째 풀때
		for (int j = 1; j <= 5; j++) {
			for (int i = 5; i >= j; i--) {
				String sum = "";
				sum += "*";
				System.out.print(sum);
			}
			System.out.println();
		}
		
		
	}

}
