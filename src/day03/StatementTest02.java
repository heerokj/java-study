package day03; //ok

public class StatementTest02 {

	public static void main(String[] args) {

		// 1���� 1000���� ������ 3�� ���(5��)�� �������� ����Ͻÿ�.(�ִ��� �ݺ�Ƚ���� �ٿ���)

		int sum = 0;
		int counter = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 3 == 0) {
				counter++;
				sum += i;
				System.out.println(i);
				if (counter == 5)
					break;
			}
			System.out.println("������ : " + sum); //������ؼ� �Ʒ��� ��� �� ���� �����ϱ� => ok
		}
		System.out.println("���������� : " + sum);
	}

}
