package day08;

public class TestMain1 {
	public static void main(String[] args) {

		Parent p1 = new Parent(); 
		p1.singing();

		System.out.println("--------------");
		Child c1 = new Child();
		System.out.println(c1.name);
		System.out.println(c1.snsid);
		c1.eating();
		c1.sleeping();
		c1.singing();//child class���� �����ǵȰ� ��µ�
		c1.nagging();   
		c1.goClub();
		            

		//++++++	
		//����� �����ޱ������ �־ �� �������� 
		//�ٸ�, �ٽ� �����ؼ� ��밡��(������ : method overriding)
		
	}
}
