package day09;

public class TestMain {
	public static void main(String[] args) {
		Horse h = new Horse(); // ctrl+shift+o import���ֱ� �׷��� �޺κ� ������ => horse Ŭ�������� �⺻�����ڰ� defalut����
		                       //                                                 =>public���� �ٲ��ֱ�
		
		h.eating();
		h.fly();
		
		Marine m1 = new Marine();
		m1.fly();
		//�����ְ��ϱ�
		
		System.out.println("--------------");
		Flyable f;
		f= h; //�������̽� ���� => �θ� �ڽ� ���谡 ����
		f.fly();
		
		f =m1;
		f.fly();
		
		//������
		//������ ���۹������ ���۽�Ű���� ��� ���� �ٸ� ������ �ϰ� �ϴ°�
		
		// 1. ĸ��ȭ
		// 2. ���
		// 3. �߻�ȭ
		// 4. ������
		
		
		
	}

}