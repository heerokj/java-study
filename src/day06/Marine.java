package day06;
//클래스의 구성요소
//member 변수 or member필드
//생성자
//member method
public class Marine {
	
	//멤버변수는 전역변수 => 어떤 메서드에서든 쓸 수 있음
	int hp, x, y, 사거리, 공격력, 방어력;
	int 공격속도, 이동속도;
	

	

	// <생성자>
	// 1. 클래스명과 동일한 이름을 갖는 메서드
	// 2. 객채의 초기화를 담당
	// 3. 리턴값이 없지만 void 키워드 사용하지 않는다.  보이드를 붙이면 생성자가 아니라 일반메서드
	// 4. 생성자를 여러개 가질수있다
	// 5. 생성자는 따로 지정하지 않으면(생성자가 한개도 없다면) 실행시 JVM이 기본생성자는 존재하는것으로 간주

	
	
	// 생성자
	Marine() {   //이렇게 생성자 만들어 놓으면 new 객체 생성할때 마다 자료형의 기본값이 들어가는게 아니라
		hp = 100; // 생성자 { }안의 값이 들어감
		x = 0;
		y = 0;
		사거리 = 4;
		공격력 = 5;
		방어력 = 3;
		이동속도 = 4;
		System.out.println("기본 생성자 호출됨");
	}

	
	
	
	
	Marine(int a) { // 생성자
		// 이렇게 생성자를 만들어 놓으면 new 클래스명 할 때마다
		// 자료형의 기본값이 들어가는게 아니라 생성자 {} 안의 값이 들어감
		hp = a;
		x = 0;
		y = 0;
		사거리 = 4;
		공격력 = 5;
		방어력 = 3;
		공격속도 = 3;
		이동속도 = 4;
		System.out.println("매개변수 있는 마린 기본 생성자"); // 얘는 값이 들어갔다고 알려주려고 쓴것. 원래는 필요없음.
	}

	
	
	
	
	void 공격하기() {  // return값이 없는 메서드 공격하기를 생성, 호출되면 {}안의 문장 실행
		System.out.println("뚜두두두두두두");
	}
	
	
	void 공격하기(Marine m) {  // return값이 없는 메서드 공격하기를 생성, 호출되면 Marine 클래스의 입력된 참조변수에게 {}안의 문장 실행
		// 배열에 참조값 전달하듯이 m2의 참조값 전달
		System.out.println("공격하기 메서드의 m : " + m);
		m.hp -= 공격력;
	}

	void 이동하기() {  // return값이 없는 메서드 이동하기를 생성, 호출되면 {}안의 문장 실행
		System.out.println("고고고");
	}

	void 정지() {  // return값이 없는 메서드 정지를 생성, 호출되면 {}안의 문장 실행
		System.out.println("정지...");
	}

	void 스팀팩() {  // return값이 없는 메서드 스팀팩을 생성, 호출되면 {}안의 문장 실행
		if (hp > 3) { // 스팀팩을 호출한 객체의 hp가 3이상이면 
			System.out.println("오예~~");  // 문장 출력하면서
			// 체력 약간 감소
			hp -= 3;  // 스팀팩을 호출한 객체의 hp -3
			// 공격속도 빨라짐
			공격속도 += 2; // 스팀팩을 호출한 객체의 공격속도 +2
			// 이동속도 증가
			이동속도 += 2; // 스팀팩을 호출한 객체의 이동속도 +2
		} else { // 그렇지않다면(호출한 객체의 hp가 3이하이면)
			System.out.println("체력이 부족합니다."); // 체력이 부족합니다. 출력 
		}
	}

	void 패트롤() {  // return값이 없는 메서드 패트롤을 생성, 호출되면 {}안의 문장 실행
		System.out.println("정찰중...");
	}

	void status() {  // return값이 없는 메서드 패트롤을를 생성, 호출되면 {}안의 문장 실행
		System.out.println("--------상태------------");
		System.out.println("체력 : " + hp);
		System.out.println("x : " + x + ", y : " + y);
		System.out.println("공격속도 : " + 공격속도);
		System.out.println("---------끝------------");
	}


	}
	

