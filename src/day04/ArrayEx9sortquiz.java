package day04; //��������

public class ArrayEx9sortquiz {
	public static void main(String[] args) {

		int[] m = { 3, 2, 9, 8, 6, 1 };

		for (int i = 0; i < m.length; i++) {
			System.out.print(m[i] + "\t");
		}
		System.out.println();

		
		// <����> �����ؼ� ���
		
		// 1. ��������
		int count = 0;
		for (int j = 0; j < m.length - 1; j++) { // 5��� ���� 6�̸� �ȵ� j+1�� �����ϴϱ�(�ε����� 6���ݾ�)
			if (m[j] > m[j + 1]) {               // 5�� �迭�Ǳ���-1 �ϸ� ��
				int temp = m[j];
				m[j] = m[j + 1];
				m[j + 1] = temp;
			}
		}
		count++;
		System.out.println("------"+count+"��° ���� ��, �Ʒ� ���------");
		// ���1
		for (int k = 0; k < m.length; k++) {
			System.out.print(m[k] + "\t");
		}
		System.out.println();

		
		
		 
		
		for (int j = 0; j < 4; j++) {
			if (m[j] > m[j + 1]) {
				int temp = m[j];
				m[j] = m[j + 1];
				m[j + 1] = temp;
			}
		}
		count++;
		System.out.println("------"+count+"��° ���� ��, �Ʒ� ���------");
		//���2
		for (int k = 0; k < m.length; k++) {
			System.out.print(m[k] + "\t");
		}
		System.out.println();
		
		
		
		
	
		for (int j = 0; j < 3; j++) {
			if (m[j] > m[j + 1]) {
				int temp = m[j];
				m[j] = m[j + 1];
				m[j + 1] = temp;
			}
		}
		count++;
		System.out.println("------"+count+"��° ���� ��, �Ʒ� ���------");
		//���3
		for (int k = 0; k < m.length; k++) {
			System.out.print(m[k] + "\t");
		}
		System.out.println();
		
		
		
		
		
		for (int j = 0; j < 2; j++) {
			if (m[j] > m[j + 1]) {
				int temp = m[j];
				m[j] = m[j + 1];
				m[j + 1] = temp;
			}
		}
		count++;
		System.out.println("------"+count+"��° ���� ��, �Ʒ� ���------");
		//���4
		for (int k = 0; k < m.length; k++) {
			System.out.print(m[k] + "\t");
		}
		System.out.println();
		
		
		
		
		
		for (int j = 0; j < 1; j++) {
			if (m[j] > m[j + 1]) {
				int temp = m[j];
				m[j] = m[j + 1];
				m[j + 1] = temp;
			}
		}
		count++;
		System.out.println("------"+count+"��° ���� ��, �Ʒ� ���------");
		//���5
		for (int k = 0; k < m.length; k++) {
			System.out.print(m[k] + "\t");
		}
		System.out.println();
		
	}

}
