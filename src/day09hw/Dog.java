package day09hw;

public class Dog extends Q01Animal implements Barkable{

	String kind;

	Dog() {
		kind = "푸들";
		System.out.println("자식클래스Q03Dog 기본생성자");
	}

	@Override
	public void barkSound() {
		System.out.println("멍멍");
	}
	
	@Override
	public void eating(String name) {
		System.out.println(name + " 을 먹어요");
	}

	@Override
	public void sleeping() {
		System.out.println("zzz 개집에서 자요");
	}

}
