package day02;

public class StatementEx3 {

	public static void main(String[] args) {
		
		//3�� ���
		
		//while(����){
		//    ����1;
		//    ����2;
		//}
		//������ true�� ����� ����
		
		int i =1; //�ʱ��
		while(i<9) { 
			System.out.println("3*" +i+ "=" +(3*i)); //���ǽ�
			i++; //������
		}
		
		System.out.println("-----------------------------");
		
		
		
		int j =1; //�ʱ��
		do {
			System.out.println("3*" +j+ "=" +(3*j)); //�ϴ� ���� ���� �ѹ� ���� �� ���ǽ� �˻�
			j++; //������
		}while(j<=9); //���ǽ�
		
	}

}
