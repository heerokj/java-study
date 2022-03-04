package day08;

public class Marine extends Terran {

	int 공격력;

	
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


	//Terran 과 Terran의 모든 후손객체 참조값 전달받음
	void 공격하기(Terran m) { //Terran m = new Marine(); 부모의 변수에 전달됟ㅁ
		                    //Terran m = new Medic(); 등
		System.out.println("공격하기 메서드의 m : " + m);
		m.hp -= 공격력;
	}
	
	
	

	void 스팀팩() { 
		if (hp > 3) { // 스팀팩을 호출한 객체의 hp가 3이상이면
			System.out.println("오예~~"); // 문장 출력하면서
			// 체력 약간 감소
			hp -= 3; // 스팀팩을 호출한 객체의 hp -3
			// 공격속도 빨라짐
			공격속도 += 2; // 스팀팩을 호출한 객체의 공격속도 +2
			// 이동속도 증가
			이동속도 += 2; // 스팀팩을 호출한 객체의 이동속도 +2
		} else { // 그렇지않다면(호출한 객체의 hp가 3이하이면)
			System.out.println("체력이 부족합니다."); // 체력이 부족합니다. 출력
		}
	}

}
