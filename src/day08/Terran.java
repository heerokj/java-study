package day08;

public class Terran { // 공통적인부분 적어주기
	int hp, x, y, 사거리, 방어력;
	int 공격속도, 이동속도;

	void 이동하기() {
		System.out.println("고고고");
	}

	void 정지() {
		System.out.println("정지...");
	}

	void 패트롤() {  
		System.out.println("정찰중...");
	}

	void status() { 
		System.out.println("--------상태------------");
		System.out.println("체력 : " + hp);
		System.out.println("x : " + x + ", y : " + y);
		System.out.println("공격속도 : " + 공격속도);
		System.out.println("---------끝------------");
	}

}
