package day02;

public class StatementTest05 {

	public static void main(String[] args) {

		// 3��
		for (int i = 1; i < 10; i++) { // {}�ȿ��ִ� i�� �������� / �� �����ȿ����� ����Ǵ� ��
			System.out.println("3*=" + i + "=" + (3 * i));
		}
		System.out.println("--------------");
		// 4��
		for (int i = 1; i < 10; i++) { // �Ǵٸ� for���� i�ᵵ ok
			System.out.println("4*=" + i + "=" + (4 * i));
		}
		System.out.println("--------------");
		// 5��
		for (int i = 1; i < 10; i++) {
			System.out.println("5*=" + i + "=" + (5 * i));

		}

		// ���⼭ �ݺ����� �� �ݺ���ų �� �־�!!
		System.out.println("�ݺ��� �ȿ� �ݺ���*******");

		for (int dan = 3; dan <= 5; dan++) {
			for (int i = 1; i <=9 ; i++) { 
				System.out.println(dan + "*"+i + "=" + (dan * i));
			}
		}
	}
}


