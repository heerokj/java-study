package day06;

public class TestMain2Person {
	public static void main(String[] args) {
		
		Person p1 = new Person();  //p1�� ���������̴� ������ ���
		p1.�̸� ="ȫ�浿";   //������ �⺻�� ������ �� �ʱ�ȭ�ϱ�
		p1.���� =20;
		p1.�� =2;
		p1.�� =1;
		p1.�� =1;
		p1.���� ="��";
		p1.���� ="����";
		
		System.out.println(p1);
		System.out.println(p1.�̸�);
		
		System.out.println(p1.����);
		System.out.println(p1.����);
		
		p1.�Ա�();
		p1.�ڱ�();
		p1.�����ϱ�();
		System.out.println("----------");
		  
		
		Person p2 = new Person(); 
		
		p2.�̸� ="ȣ����";
		p2.���� =20;
		p2.�� =2;
		p2.�� =1;
		p2.�� =1;
		p2.���� ="��";
		p2.���� ="���׹��";
		
		System.out.println(p2);
		System.out.println(p2.�̸�);
		System.out.println(p2.����);
		System.out.println(p2.��);
		System.out.println(p2.��);
		System.out.println(p2.����);
		System.out.println(p2.����);
		
		p2.�Ա�();
		p2.�ڱ�();
		p2.�����ϱ�();
		System.out.println("----------");
	}
}
		
		

