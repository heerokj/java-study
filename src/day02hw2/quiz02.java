package day02hw2; //?��개로 ?���? ?���?..?��?��

public class quiz02 {
	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 4; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// for (int i = 5; i <= 5; i--) {
		// for (int j = 1; j <= i; j++) {
		// System.out.print("*");
		// }
		// System.out.println(); ?�� 무한반복 ?��??
		// }
	}

}
