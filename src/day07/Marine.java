package day07;

public class Marine {
	
	//멤버변수는 전역변수 => 어떤 메서드에서든 쓸 수 있음
	int hp, x, y, 사거리, 공격력, 방어력;
	int 공격속도, 이동속도;
	
 
	// 생성자
	Marine() {   //이렇게 생성자 만들어 놓으면 new 객체 생성할때 마다 자료형의 기본값이 들어가는게 아니라
		hp = 100; // 생성자 { }안의 값이 들어감
		x = 0;
		y = 0;
		사거리 = 4;
		공격력 = 5;
		방어력 = 3;
		공격속도 = 3;
		이동속도 = 4;
		System.out.println("기본 생성자 호출됨");
	}

	
	
	
	
//	Marine(int a) { // 생성자
//		// 이렇게 생성자를 만들어 놓으면 new 클래스명 할 때마다
//		// 자료형의 기본값이 들어가는게 아니라 생성자 {} 안의 값이 들어감
//		hp = a;
//		x = 0;
//		y = 0;
//		사거리 = 4;
//		공격력 = 5;
//		방어력 = 3;
//		공격속도 = 3;
//		이동속도 = 4;
//		System.out.println("매개변수 있는 마린 기본 생성자"); // 얘는 값이 들어갔다고 알려주려고 쓴것. 원래는 필요없음.
//	}

			
	Marine(int hp) { 
		this();// 기본생성자 호출
		this.hp = hp;
	}
	
	
	
	//추가 /hp,x,y를 변경
	Marine(int hp, int x, int y ) { 	
		this(hp); // int를 매개변수로 갖는 생성자 호출 =>그게 여기선 hp 
		this.x = x;
		this.y = y;
		
		사거리 = 4;   //지정한값 빼고 자료형의 기본값으로 간다..어떻게해줄까
		공격력 = 5;   //만들어놓았던 기본생성자도 써주자
		방어력 = 3;   //근데 매번쓰기 어려우니깐 기본생성자 호출하자
		공격속도 = 3;  //✔this(); =>기본생성자 호출 ! 아래 예제 보기!
		이동속도 = 4;	 		             
	}	
		
	
	
	//추가 예제
	Marine(int hp, int 공격력, int 공격속도,  int 이동속도 ) { 	
			this(); //기본생성자 =>먼저 다 실행되고
			this.hp = hp; //그다음 변경된거 실행 
			this.공격력 = 공격력 ;  // ✔기본생성자는 반드시 그 메서드의 첫번째 라인에 와야한다.
			this.공격속도 = 공격속도;
			this.이동속도 = 이동속도;	
	}
	
	
	
	Marine(int hp, int x, int y,  int 공격력, int 이동속도 ) { 	
		this(hp, x, y);
//		this.hp = hp;
//		this.x = x;
//		this.y = y;
		this.공격력 = 공격력 ; 
		this.이동속도 = 이동속도;
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
	

