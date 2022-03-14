package day15hw;

//Q10. 아래 코드의 예외를 두가지 방법으로 각각 따로 처리하시오.
public class Q10ExceptionEx10_1 {
	public static void main(String[] args) {
		call();
	}

	static void call() {
		String[] str = { "9", "a", "300", "20" };

		int res = 0;

		for (int i = 0; i < str.length; i++) {
			try {
				res += Integer.parseInt(str[i]);
			} catch (NumberFormatException ne) {
				System.out.println("a는 문자입니다.");
				res +=0;
			}
		}
		System.out.println("res : " + res);

	}
}