package day09;

public class Marine extends Terran implements Flyable {

	int 공격력;

	@Override
	public void fly() {
		System.out.println("제트 분사기 피융");
	}

	Marine() {
		hp = 100;
		x = 0;
		y = 0;
		사거리 = 4;
		공격력 = 5;
		방어력 = 3;
		이동속도 = 4;
		System.out.println("마린 기본 생성자 호출됨");
	}

	void 공격하기(Terran m) {
		System.out.println("공격하기 메서드의 m : " + m);
		m.hp -= 공격력;
	}

	void 스팀팩() {
		if (hp > 3) { 
			System.out.println("오예~~"); 		
			hp -= 3; 			
			공격속도 += 2;		
			이동속도 += 2; 
		} else {
			System.out.println("체력이 부족합니다."); 
		}
	}

}
