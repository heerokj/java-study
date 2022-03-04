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
		c1.singing();//child class에서 재정의된게 출력됨
		c1.nagging();   
		c1.goClub();
		            

		//++++++	
		//상속은 물려받기싫은게 있어도 다 물려받음 
		//다만, 다시 정의해서 사용가능(재정의 : method overriding)
		
	}
}
