package day08;
//ParentŬ������ ��ӹ��� ChildŬ����
public class Child extends Parent { 

	String snsid;

	Child() {
		super(); // �θ������ �ҷ����� / ��������
		this.snsid = "aaa";
		this.name = "ȫ�浿";
		this.age = 20;
		System.out.println("Child�⺻������");
	}
 
	//+++++ method overriding 
	// �θ� �������ִ°͵� �Ȱ��� ������ ����
	@Override // �� �޼���� �������̵� �޼��� ��� �ǹ� //��Ÿ���� �߰ߵ� /@Ű���� : annotation
	public void singing() { //���������� public => �θ��� ����������(���⼱ dafalut)�� �����ϰų� ������̸� �������̵� ����
		System.out.println("�������̵�~~~~~!!!");
	}
	
	public void goClub() {
		System.out.println("������");
	}

}
