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
		
		//Mammalia는 처음부터 상속을 목적으로 했던 추상적인 객체로
		//new 연산자를 통해서 객체가 만들어지길 원하지 않음
		//Mammalia클래스 만든 이유는 단지 상속관계를 쉽게하기위해서
//		Mammalia ma = new Mammalia(); ==>에러남 추상클래스는 객체만들지X 
//		ma.eating();
//		ma.sleeping();
		

		Horse h1 = new Horse();
		
		h1.eating();
		h1.sleeping();
		h1.run();					
	}

}
