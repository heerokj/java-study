package day08hw;
//부모클래스
public class Q01Animal {

	String name;
	int age;
	
	Q01Animal() {
		System.out.println("부모클래스 기본생성자");
	}

	public void eating(String name) {
		System.out.println(name + " 을 먹어요");
	}

	public void sleeping() {
		System.out.println("zzz");
	}

}
