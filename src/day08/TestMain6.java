package day08;

public class TestMain6 {
	public static void main(String[] args) {
		
		Rabbit r1 = new Rabbit();
			
		r1.eating();
		r1.sleeping();
		r1.jumping();
		
		System.out.println("--------");
		
		Monkey m1 = new Monkey();
		
		m1.eating();
		m1.sleeping();
		m1.climbing();
		
		System.out.println("--------");
		
		Whale w1 = new Whale();
		
		w1.eating();
		w1.sleeping();
		w1.swmmining();
		System.out.println("--------");
		
		//Mammalia�� ó������ ����� �������� �ߴ� �߻����� ��ü��
		//new �����ڸ� ���ؼ� ��ü�� ��������� ������ ����
		//MammaliaŬ���� ���� ������ ���� ��Ӱ��踦 �����ϱ����ؼ�
//		Mammalia ma = new Mammalia(); ==>������ �߻�Ŭ������ ��ü������X 
//		ma.eating();
//		ma.sleeping();
		

		Horse h1 = new Horse();
		
		h1.eating();
		h1.sleeping();
		h1.run();					
	}

}
