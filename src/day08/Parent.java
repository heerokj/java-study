package day08;
//�θ�Ŭ���� Parent
public class Parent {

	int age; 
	String name, job;

	Parent() {
		name = "ȫ�浿";
		job = "����"; 
		age = 22;
		System.out.println("Parent �⺻������");
	}

	//String, int, String�Ű������� ���� ������
	Parent(String name, int age, String job) {
		this();
		this.age = age;
		this.job = job;
		this.name = name;
		System.out.println("String, int, String �Ű������ִ� ������");
	}

	//��ο��� ���ٰ����ϰ� ���ϰ��� ����(void�����) eating�޼���
	public void eating() { // ȣ��Ǹ� { }�� �ڵ����
		System.out.println("�ȳ�");
	}

	
	void singing() {  // ���������� defalut
		System.out.println("�����");
	}

	public void sleeping() {
		System.out.println("����");
	}

	public void nagging() {
		System.out.println("�ܼҸ���¼����¼��");
	}
}
