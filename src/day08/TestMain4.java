package day08;

public class TestMain4 {

	public static void main(String[] args) {

		Parent p2 = new Parent();
		Child c2 = new Child();
		p2 = c2;
		
		System.out.println("--------");
 
		
		
//		Parent p1 = new Parent(); 
		Parent p1; // ������

//		Child c1 = new Child(); 
//		p1 = c1; 
		p1 = new Child(); // ������

 //     Parent p1 = new Child(); //���������� ��������Ӱ����϶��� ����

		System.out.println(p1.name);
		p1.singing();
	}

}
