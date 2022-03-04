package day08;

public class Ghost extends Terran {

	int 공격력;

	Ghost() {
		hp = 150;
		x = 0;
		y = 0;
		공격력 = 8;
		방어력 = 3;
		이동속도 = 4;
		공격속도 = 3;
		System.out.println("고스트 기본생성자");
	}

	void 공격하기(Terran g) {
		System.out.println("뚜두두두두두두");
		g.hp -=공격력;
	}

	void 핵공격() {
		System.out.println("Nuclear Lunch Detected");
	}

}
