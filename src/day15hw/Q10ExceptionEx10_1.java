package day15hw;

//Q10. �Ʒ� �ڵ��� ���ܸ� �ΰ��� ������� ���� ���� ó���Ͻÿ�.
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
				System.out.println("a�� �����Դϴ�.");
				res +=0;
			}
		}
		System.out.println("res : " + res);

	}
}