package day08;

public class TestMain5 {
	public static void main(String[] args) {

		Marine m1 = new Marine(); 
		Marine m2 = new Marine();
		Medic me = new Medic();
		Ghost g1 = new Ghost();
		
		System.out.println("m1�������� :"+m1);
		System.out.println("m2�������� :"+m2);
		System.out.println("me�������� :"+me);
		System.out.println("g1�������� :"+g1);
		System.out.println("============");
		
		// m1 ==> m2 ����
		m1.�����ϱ�(m2);
		m2.status();

		// m1 ==> ghost����
		m1.�����ϱ�(g1);
		g1.status();
		
		// m1==>medic ����
		m1.�����ϱ�(me); // ����Ŭ������ �����ϱ� �޵��߰�
		me.status();
	

		// me ==> ghost ġ��
		me.ġ���ϱ�(g1); // �޵�Ŭ�󽺿� �����ϱ� ��Ʈ �߰�
		g1.status();
		// me ==> medic ġ��
		me.ġ���ϱ�(me);
		me.status();

		g1.�����ϱ�(m2);
		g1.�����ϱ�(me);
		g1.�����ϱ�(g1);
		
		
		
	}

}
