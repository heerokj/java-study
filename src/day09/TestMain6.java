package day09;

public class TestMain6 {
	public static void main(String[] args) {
		System.out.println(Test.no); //new안해도 가능 /Test클래스에서 static변수 메소드는
		Test.show(); //new 하기 전 호출가능
		
		System.out.println("------------");
		
		Test t = new Test();
		System.out.println(t.no2);//일반변수는 new만들어진 후 호출가능
		t.show2();//일반메서드도 new 만들어진 후 호출가능
		
		
		
	}

}
