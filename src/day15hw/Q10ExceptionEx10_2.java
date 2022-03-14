package day15hw;

public class Q10ExceptionEx10_2 {
	public static void main(String[] args) {
		try {
			call();
		} catch (NumberFormatException ne) {
			System.out.println("숫자 형식 오류");
		}
	}

	static void call() {
		String[] str = { "9", "a", "300", "20" };

		int res = 0;

		for (int i = 0; i < str.length; i++) {
			res += Integer.parseInt(str[i]);
		}
		System.out.println("res : " + res);
	}
}
