package day08;

import day06.Marine;

public class TestMain2 {

	public static void main(String[] args) {
		// class : ����� ���� �ڷ���
		// Parent Marine ��

		//��������p1����?& Parent Ŭ������ �����ڸ� �ʱⰪ���� ���ο� ��ü p1 ����
		Parent p1 = new Parent("ȫ�Ǽ�", 40, "�Ǽ�");
		System.out.println(p1.name); //p1�� ����Ű�� name���
		p1.eating(); //p1�� ����Ű�� eating�޼ҵ� ȣ��
		p1.sleeping(); //p1�� ����Ű�� sleeping�޼ҵ� ȣ��
		p1.singing();//p1�� ����Ű�� singing�޼ҵ� ȣ��
		p1.nagging();//p1�� ����Ű�� nagging�޼ҵ� ȣ��

		System.out.println("------------------");

		Marine m1;
//		m1 = p1;   +++++ class�� �ٸ��� ������ ���� �ȵ�

		Parent p2;
		p2 = p1; // ���� Ŭ���������� ������ ���� ����
		System.out.println(p2.name);
		
		


	}
}
