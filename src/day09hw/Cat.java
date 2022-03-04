package day09hw;

public class Cat extends Q01Animal implements Barkable{

	String kind;
	
	Cat(){	
		kind = "러시안블루";
		System.out.println("자식클래스Q02Cat 기본생성자");
	}
	
	@Override
	public void barkSound() {
		System.out.println("야옹");
	}
	
	@Override
	public void eating(String name) {
		System.out.println(name+" 를 먹어요");
	}
	
	@Override
	public void sleeping() {
		System.out.println("zzz캣타워에서 자요");
	}
}