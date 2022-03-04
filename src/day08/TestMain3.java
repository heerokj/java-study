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
		// m1 = p1 ==> 안된다!! /다른 class이기 때문에 참조값 대입X  
		System.out.println("---------------------");
		
		
		
		p1 = c1; //=> 가능!! /상속받았기에 p1의 멤버변수와 메서드가 모두 c1에 있기때문 
		         // 부모의참조변수 = 자식의 참조값을 할당... OK!!! 
		
		//c1 = p1; ==> 불가능!! /자식의 멤버변수와 메서드를 부모가 모두 가지고 있는 것이 아니기 때문에
		System.out.println("p1 : " + p1); 
		System.out.println("c1 : " + c1);
		
		System.out.println("p1.name : " + p1.name);
		                                 
		 //?????
		//System.out.println(p1.snsid); //==> 불가능!!/  p1이 c1의 참조값을 받았지만 원래 p1이 알고 있던 멤버변수가 아니기때문에
		 
		p1.singing(); //=> 가능!! p1이 원래부터 알고 있던 메서드이기 때문에 접근 가능 /오버라이딩 출력
		//p1.goClub();
		
		System.out.println("------------------------");
		
		
		Child c2 ;
		
		c2 = c1; //==>가능!! / 같은 클래스이기 때문에 가능 /c1의 참조값을 c2에 대입
		System.out.println("c1 : " + c1); 
		System.out.println("c2 : " + c2);
		
		System.out.println("c2.name : " + c2.name);
		c2.goClub();
		
		System.out.println("------------------------");
		
		System.out.println("p1 : " + p1);
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		
		Child c3; 
		
		// c3 = p1; =>불가능!! / p1이 c1의 참조값을 가지고 있지만 본질은 부모이기때문에 자식에게 부모 할당이 되므로 불가능
		c3 =(Child)p1;   // 객체 형변환 : p1 ==> 자식의 객체 
		
		System.out.println(c3.name);
		
		c3.goClub();
	}

}
