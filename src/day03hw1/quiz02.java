package day03hw1; //���..��� ok

public class quiz02 {

	public static void main(String[] args) {
		// ( 2�� for���� ��� )
		// 1���� 1000 ������ �� �� ���� 3�� ��� �� (10����)�� ���ϰ�
		// �� ���� �������� ���Ͻÿ�

		int counter = 0;
		int sum = 0;
		for (int i = 1; i <= 1000; i++) {
			for (int j = 1; i <= j; j++) {
				if ((i + j) % 3 == 0) {
					counter++;
					sum += (i + j);
					if (counter == 10) 
						break;
				}
			}
		}

		System.out.println(sum);
	}
}
