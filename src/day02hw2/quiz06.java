package day02hw2; //���.. ok(11�� Ǯ���� ����Ǯ��)

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
