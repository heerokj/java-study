package day04;
//�ζ� ��ȣ����ϱ�
public class ArrayEx8lottoTest {
	public static void main(String[] args) {

		int[] rnd = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 
				11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 
				21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 
				31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45 }; 

		for (int i = 1; i <= 1000; i++) {    //i �� 1000���� �۰ų� ���������� for�� �ݺ� =>1000�� ����

			int a = (int) (Math.random() * 45);  //�����ϰ� ���� 1~44������ ������ ����a,b�� �Ҵ�
			int b = (int) (Math.random() * 45);  

			int temp = rnd[a]; 
			rnd[a] = rnd[b];
			rnd[b] = temp;		
		}

		
		
		//����
		//���� ��Ʈ, ���� ����, ����Ʈ..
		
		//���� �غ���

		for (int i = 0; i < 6; i++) {
			System.out.println(rnd[i] + "\t");
		}
	}

}
