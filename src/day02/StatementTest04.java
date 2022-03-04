package day02;

public class StatementTest04 {

	public static void main(String[] args) {

		String str = "*";
		System.out.println(str);

		str = str + "*";
		System.out.println(str);

		str = str + "*";
		System.out.println(str);

		str = str + "*";
		System.out.println(str);

		str = str + "*";
		System.out.println(str);

		String str1 = "*";
		System.out.println(str1);

		for (int i = 1; i <= 4; i++) {
			str1 = str1 + "*";
			System.out.println(str1);
		}

		String str2 = "";
		for (int i = 1; i <= 5; i++) {
			str2 += "*";
			System.out.println(str2);
		}
	}

}
