package day04hw;
//���� 4���� index�� ���� 3�� ����̸�  3333  ���� 5�� ����� 5555
//3��5�� ������� 3535 �� �����ϰ� �ùٸ��� �ԷµǾ����� ���

public class qiuz05 {

	public static void main(String[] args) {

		int[] a = new int[100];

		for (int i = 0; i < a.length; i++) {
			if(i%3 ==0 && i%5 ==0) {
				System.out.println("a[" + i + "] : " + 3535);  //������� ���� ���ֱ� 
			}else if(i%5 ==0) {
				System.out.println("a[" + i + "] : " + 5555);
			}else if(i%3 ==0) {
				System.out.println("a[" + i + "] : " + 3333);
			}else {
				System.out.println("a[" + i + "] : " + (i+1));
			}
					
		}

	}

}
