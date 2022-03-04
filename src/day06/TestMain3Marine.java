package day06;

public class TestMain3Marine {
	public static void main(String[] args) {
		
		Marine m1 = new Marine(); //Marine클래스를 이용하여 m1이라는 이름의 새로운 객체 생성
		System.out.println(m1); // 참조값 출력
		
		System.out.println("m1 hp : " + m1.hp);  // 객체 m1의 hp라는 변수의 값 출력
		System.out.println("m1 공격력 : " + m1.공격력);  // 객체 m1의 공격력이라는 변수의 값 출력

		
		
		Marine m2 = new Marine();  // Marine 클래스를 이용하여 m2이라는 이름의 새로운 객체 생성
		System.out.println("m2 hp : " + m2.hp);  // 객체 m2의 hp라는 변수의 값 출력
		System.out.println("m2 공격력 : " + m2.공격력);  // 객체 m2의 공격력이라는 변수의 값 출력
		
		//다 0으로 출력되는이유는
		//Marine클래스에는 기본생성자를 만들어 놓지 않아서 자료형의 기본값이 출력된다
		
		
//		//객체m1에 각 변수에 값을 대입
//		m1.hp = 100;
//		m1.x =0;
//		m1.y =0;
//		m1.사거리 =4;
//		m1.공격력 =5;
//		m1.방어력 =3;
//		m1.이동속도 =4; 
		
//		m1.status();
//		m1.공격하기();
//		m1.스팀팩();              //이렇게 하는 대신 Marine클래스에 기본생성자 만들어 놓으면 편함
//		m1.status();
		
		
//		System.out.println("m1 hp : " + m1.hp);  // 대입한 값이 출력  ->m1 hp : 97
//		System.out.println("m1 공격력 : " + m1.공격력); //대입한 값이 출력  ->m1 공격력 : 5
		
		
		
		
		System.out.println();
		m1.status();  // 객체 m1의 status라는 메서드 호출
		m1.공격하기();  // 객체 m1의 공격하기라는 메서드 호출
		for (int i = 0; i < 100; i++) {  // int형 변수 i 생성, i의 값이 100보다 작으면 {}안의 문장 실행 후 i +1 -> 조건 만족하지 않을때까지 반복
			m1.스팀팩();  // 위의 조건을 만족하면 객체 m1의 스팀팩이라는 메서드를 호출
		}
		
		
		m1.status();  // 객체 m1의 status라는 메서드 호출
		System.out.println("\n"); // 구분선

		
		m2.status();  // 객체 m2의 status라는 메서드 호출

		
		// 대상을 지정해서 공격
		m1.공격하기(m2);  // 객체 m1의 공격하기라는 메서드 호출, 매개변수에 m2의 참조값 대입 ??????
		System.out.println("m2 : " + m2);  // m2의 참조값 출력
		m2.status();  // 객체 m2의 status라는 메서드 호출

		
		Medic me = new Medic();  // Medic 클래스를 이용하여 me이라는 이름의 새로운 객체 생성

		me.치료하기(m2);  // 객체 me의 치료하기라는 메서드 호출, 매개변수에 m2의 참조값 대입?????

		
		// m2 마린의 체력을 약간 상승
		m2.status();  // 객체 m2의 status라는 메서드 호출

		//???
		// 체력 500짜리 슈퍼마린 m3 생성 
		// 생성자는 멤버변수를 초기화
		// 생성자 여러개를 가질 수 있다.
		// 생성자 오버로드
		Marine m3 = new Marine (500);  // Marine 클래스의 int를 매개변수로 하는 생성자를 이용하여 m3이라는 이름의 새로운 객체 생성.
									   // ()안의 값은 매개변수의 값으로 적용됨.
		m3.status();  // 객체 m3의 status라는 메서드 호출
		
	}

}
