package day06;

public class Medic {

	int hp, x, y, 치료력, 방어력, 치료속도, 이동속도;  // int형 멤버변수 hp, x, y, 치료력, 방어력, 치료속도, 이동속도 생성

	Medic() {     // 기본값으로 hp = 80, x = 0, y = 0, 치료력 = 2, 방어력 = 1, 
		hp = 80;  // 치료속도 = 2, 이동속도 = 2을 갖는 생성자 생성
		x = 0;
		y = 0;
		치료력 = 2;
		방어력 = 1;
		치료속도 = 2;
		이동속도 = 2;
		System.out.println("메딕 기본 생성자");
	}

	void 이동하기() { // return값이 없는 메서드 이동하기를 생성, 호출되면 {}안의 문장 실행
		System.out.println("고고고");
	}

	void 패트롤() { // return값이 없는 메서드 패트롤을 생성, 호출되면 {}안의 문장 실행
		System.out.println("정찰중");
	}

	void 정지() { // return값이 없는 메서드 정지를 생성, 호출되면 {}안의 문장 실행
		System.out.println("멈춤....");
	}

	void 치료하기() { // return값이 없는 메서드 치료하기를 생성, 호출되면 {}안의 문장 실행
		System.out.println("치유해줄게");
	}

	void 치료하기(Marine m) { // return값이 없는 메서드 치료하기를 생성, 호출되면 Marine 클래스의 입력된 참조변수에게 {}안의 문장 실행
		System.out.println("치유해줄게");
		m.hp += 치료력; // 입력된 참조변수의 hp값을 호출한 객체의 치료력만큼 플러스 시켜줌
	}

	void status() { // return값이 없는 메서드 status를 생성, 호출되면 {}안의 문장 실행
		System.out.println("--------상태------------");
		System.out.println("체력 : " + hp);
		System.out.println("x : " + x + ", y : " + y);
		System.out.println("치료속도 : " + 치료속도);
		System.out.println("---------끝------------");
}
	
}
