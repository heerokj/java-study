package day08;

public class TestMain5 {
	public static void main(String[] args) {

		Marine m1 = new Marine(); 
		Marine m2 = new Marine();
		Medic me = new Medic();
		Ghost g1 = new Ghost();
		
		System.out.println("m1참조변수 :"+m1);
		System.out.println("m2참조변수 :"+m2);
		System.out.println("me참조변수 :"+me);
		System.out.println("g1참조변수 :"+g1);
		System.out.println("============");
		
		// m1 ==> m2 공격
		m1.공격하기(m2);
		m2.status();

		// m1 ==> ghost공격
		m1.공격하기(g1);
		g1.status();
		
		// m1==>medic 공격
		m1.공격하기(me); // 마린클래스에 공격하기 메딕추가
		me.status();
	

		// me ==> ghost 치료
		me.치료하기(g1); // 메딕클라스에 공격하기 고스트 추가
		g1.status();
		// me ==> medic 치료
		me.치료하기(me);
		me.status();

		g1.공격하기(m2);
		g1.공격하기(me);
		g1.공격하기(g1);
		
		
		
	}

}
