package day03hw1;

public class quiz01 {

	public static void main(String[] args) {
		// 1���� 1000 ���� ������ 3�� ��� (5��) �� �������� ����ϼ���
		// (�ִ��� �ݺ�Ƚ���� �ٿ��� )

		int sum = 0;
		int counter = 0;
		for (int i = 1; i < 1000; i++) {
			if (i % 3 == 0) {
				counter++;
				sum += i;
				if (counter == 5)
					break;
			}
		}//for�� end
		System.out.println(sum); //���������ո� ���
	}

}
