package day07;

public class SuperManMain {
	public static void main(String[] args) {

		// SuperMan sm = new SuperMan();
		// 부모 생성자(Person에있는) 불려온후,
		// 자식클래스 생성자 불려나옴

		SuperMan sm = new SuperMan("클라크", "사진기자", 20, 190.0f, 70.0f);

		System.out.println(sm.age);
		System.out.println("이름 : " + sm.name); // 클라크
		System.out.println("키 : " + sm.height); // 190.0
		System.out.println("몸무게 : " + sm.weight); // 70.0
		System.out.println("직업 : " + sm.job); // 사진기자
		sm.eating();
		sm.레이져발사();
		sm.비행하기();

	}
}
