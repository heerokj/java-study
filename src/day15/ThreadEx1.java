package day15;
//�޸𸮸� �Ҵ�޾� �������� ���α׷� =>���μ���
//���α׷������� ����Ǵ� �帧�� ���� => Thread
//�ϳ��� �帧 ������ ���ÿ� �������� �۾� ���� : ��Ƽ�½�ũ, ��Ƽ������

// muti Thread ó�����
// 1. Thread ���
// 2. Runnablee �������̽� ����

public class ThreadEx1 {
	public static void main(String[] args) {
		Thread th = Thread.currentThread(); //���� �������� �������� ��ü�� ����
			String name = th.getName();	///�������� �̸�		
			System.out.println("���� �������� �������� �̸��� : "+name);
	
			// ���� 3�� ���� ���
			System.out.println("���� �������� �������� �̸��� : " + Thread.currentThread().getName());
			
	}

}
