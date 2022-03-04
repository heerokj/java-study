package day08hw;

public class Q02Cat extends Q01Animal{

	String kind;
	
	Q02Cat(){	
		kind = "러시안블루";
		System.out.println("자식클래스Q02Cat 기본생성자");
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
