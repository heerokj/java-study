package day08;

import day07.Marine;

public class TestMain3  {
	public static void main(String[] args) {
		
		Parent p1 = new Parent();
		
		Child c1 = new Child();
		
		System.out.println("p1 : "+p1);
		System.out.println("c1 : "+c1);
		System.out.println("---------------------");
		

		Marine m1 ;  // auto import : ctl + shift + O 		
		// m1 = p1 ==> �ȵȴ�!! /�ٸ� class�̱� ������ ������ ����X  
		System.out.println("---------------------");
		
		
		
		p1 = c1; //=> ����!! /��ӹ޾ұ⿡ p1�� ��������� �޼��尡 ��� c1�� �ֱ⶧�� 
		         // �θ����������� = �ڽ��� �������� �Ҵ�... OK!!! 
		
		//c1 = p1; ==> �Ұ���!! /�ڽ��� ��������� �޼��带 �θ� ��� ������ �ִ� ���� �ƴϱ� ������
		System.out.println("p1 : " + p1); 
		System.out.println("c1 : " + c1);
		
		System.out.println("p1.name : " + p1.name);
		                                 
		 //?????
		//System.out.println(p1.snsid); //==> �Ұ���!!/  p1�� c1�� �������� �޾����� ���� p1�� �˰� �ִ� ��������� �ƴϱ⶧����
		 
		p1.singing(); //=> ����!! p1�� �������� �˰� �ִ� �޼����̱� ������ ���� ���� /�������̵� ���
		//p1.goClub();
		
		System.out.println("------------------------");
		
		
		Child c2 ;
		
		c2 = c1; //==>����!! / ���� Ŭ�����̱� ������ ���� /c1�� �������� c2�� ����
		System.out.println("c1 : " + c1); 
		System.out.println("c2 : " + c2);
		
		System.out.println("c2.name : " + c2.name);
		c2.goClub();
		
		System.out.println("------------------------");
		
		System.out.println("p1 : " + p1);
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		
		Child c3; 
		
		// c3 = p1; =>�Ұ���!! / p1�� c1�� �������� ������ ������ ������ �θ��̱⶧���� �ڽĿ��� �θ� �Ҵ��� �ǹǷ� �Ұ���
		c3 =(Child)p1;   // ��ü ����ȯ : p1 ==> �ڽ��� ��ü 
		
		System.out.println(c3.name);
		
		c3.goClub();
	}

}
