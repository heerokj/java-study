package day02;

public class StatementEx6 {

	public static void main(String[] args) {

		byte b1 = 10;
		short sh1 = 20;
		// byte b2 = b1+sh1; // -> ���� int���� �ڷ������� �����ϸ� ����� int
		// byte b2 = (byte)(b1+sh1); //�������ȯ
		int b2 = b1 + sh1;
		float f = b2;
		
		System.out.println("----------------------------");
		

		// ����) ���� ���� ���� ������ ������ ����� ���
		// ���� :
		// ��� :

		int kor = 93;
		int eng = 90;
		int mat = 100;

		int tot = kor + eng + mat;
		// int avg = (kor+eng+mat)/3;
		System.out.println("���� : " + tot);
		// System.out.println("��� : "+avg); //�� 71 ..����ε� �Ҽ����� �ȳ���..������ �����̱� ������

		// float avg = tot/3; // int�� �����ؼ� �̹� int�� �װ� folat�� ���
		// int ������ floatŸ�� �ϸ� ������ �Ҽ���������
		float avg = tot / 3.0f;
		System.out.println("��� : " + avg);

		// ��� ������ ���� ���� ��
		// 90�̻��̸� A , 80�̻��̸� B

		if (avg >= 90) {
			System.out.println("A����");
		} else if (avg >= 80) {
			System.out.println("B����");
		} else if (avg >= 70) {
			System.out.println("C����");
		} else if (avg >= 60) {
			System.out.println("D����");
		} else {
			System.out.println("F����");
		}
	}

}
