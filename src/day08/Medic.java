package day08;

public class Medic extends Terran{

	int 치료력, 치료속도; 

	Medic() {    
		hp = 80;  
		x = 0;
		y = 0;
		치료력 = 2;
		방어력 = 1;
		치료속도 = 2;
		이동속도 = 2;
		System.out.println("메딕 기본 생성자");
	}


//	void 치료하기() { 
//		System.out.println("치유해줄게");
//	}

	void 치료하기(Terran m) { 
		System.out.println("치유해줄게");
		m.hp += 치료력; // 입력된 참조변수의 hp값을 호출한 객체의 치료력만큼 플러스 시켜줌
	}

/*	void 치료하기(Ghost m) { // return값이 없는 메서드 치료하기를 생성, 호출되면 Marine 클래스의 입력된 참조변수에게 {}안의 문장 실행
		System.out.println("치유해줄게");
		m.hp += 치료력; // 입력된 참조변수의 hp값을 호출한 객체의 치료력만큼 플러스 시켜줌
	}
	
	void 치료하기(Medic m) { // return값이 없는 메서드 치료하기를 생성, 호출되면 Marine 클래스의 입력된 참조변수에게 {}안의 문장 실행
		System.out.println("치유해줄게");
		m.hp += 치료력; // 입력된 참조변수의 hp값을 호출한 객체의 치료력만큼 플러스 시켜줌
	}
*/
}
	

