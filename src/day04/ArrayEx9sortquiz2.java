package day04; //�������� Ex9�̾ 

public class ArrayEx9sortquiz2 {
	public static void main(String[] args) {

		int[] m = { 3, 2, 9, 8, 6, 1 };
		for (int i = 0; i < m.length; i++) {
			System.out.print(m[i] + "\t");
		}
		System.out.println();

		int count =0;
		for (int i = 0; i < m.length - 1; i++) {  //--> ���⼭ i�� �׾Ʒ� for���� �ݺ��� �ǹ�! �ݺ� Ƚ�� ����
			for (int j = 0; j < m.length - 1-i; j++) { // i�� �ݺ��� �� ���� 1�� ���� 
				if (m[j] > m[j + 1]) {               // 1�������ϴ� i�� (�迭m����-1)���� ���ֱ�
					int temp = m[j];
					m[j] = m[j + 1];
					m[j + 1] = temp;
				}
			}
			count++;
			System.out.println("------"+count+"��° ���� ��, �Ʒ� ���------");
			// ���
			for (int k = 0; k < m.length; k++) {
				System.out.print(m[k] + "\t");
			}
			System.out.println();

		}
	}
}
