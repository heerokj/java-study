package day15;
//�޸𸮸� �Ҵ�޾� �������� �����α׷� == >���μ���

//���α׷������� ����Ǵ� �帧�� ���� => Thread

//���ÿ�.. => Mu��ti Thread ����

//��Ƽ�½�ũ, ��Ƽ������

//muti Thread
//1. Thread ���
//2. Runnablee �������̽� ����

public class ThreadEx1 {
	public static void main(String[] args) {
		Thread th = Thread.currentThread();
			String name = th.getName();	///�������� �̸�		
			System.out.println(name);
		}

}
