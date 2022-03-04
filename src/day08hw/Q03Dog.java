package day08hw;

public class Q03Dog extends Q01Animal {

	String kind;

	Q03Dog() {
		kind = "푸들";
		System.out.println("자식클래스Q03Dog 기본생성자");
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
