package day03; //����� �ϸ鼭 �����ϱ�

// break : ���� ����� �ݺ����� Ż��
// continue : �̹��� ����

//break �� : ���� �پ��ִ� �ݺ����� Ż��
//continue ��: �󺧸��� �پ��ִ� �ݺ������� �̹��� ����

public class StatementEx11debug {
	public static void main(String[] args) {

		// for (int i = 1; i <= 4; i++) {
		// for (int j = 1; j <= 4; j++) {
		// if (j > i)
		// break; // �ǹ�: j�� i���� ũ�� �׸��� / �극��ũ������ ���� ����� �ݺ����� ����������.

		// for (int i = 1; i <= 4; i++) {
		// for (int j = 1; j <= 4; j++) {
		// if (j == i)
		// continue; // �̹�ȸ���� ���� �ݺ��� ���������� ����

		// ��
		outer: for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				if (j > i)
					break outer; // j > i �� ��� outer�� �پ��ִ� �ݺ��� ��ü�� ��������

				System.out.println("i :" + i + ", j :" + j);
				System.out.println();
			}

		} // ����Ŭ�� => �극��ũ ����Ʈ ���� / ���⼭���� ������ϰ� ����
			// f11 => �����
			// f8

	}
}
