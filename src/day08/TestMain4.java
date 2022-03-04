package day08;

public class TestMain4 {

	public static void main(String[] args) {

		Parent p2 = new Parent();
		Child c2 = new Child();
		p2 = c2;
		
		System.out.println("--------");
 
		
		
//		Parent p1 = new Parent(); 
		Parent p1; // 간단히

//		Child c1 = new Child(); 
//		p1 = c1; 
		p1 = new Child(); // 간단히

 //     Parent p1 = new Child(); //최종적으로 간단히상속관계일때만 가능

		System.out.println(p1.name);
		p1.singing();
	}

}
