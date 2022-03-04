package day06; 
// 객체의 설계도 : calss
// 구성요소 
//	1. 멤버변수 or 멤버필드 
//	2. 생성자
//  3. 멤버 메소드

public class Car {  // ✔main메서드 없음
	//속성 , 특징
	int 핸들,바퀴, 엔진, 문, 속도;
	String 차종, 제조사;
	
 	//기능, 동작, 행위
	
	void 전진() { //return값이 없는 메서드 전진을 생성, 호출되면 { }안에있는 문장실행
		System.out.println("부르부릉");
	}
	void 후진() { // return 값이 없는 메서드 후진을 생성, 호출되면 { }안에있는 문장실행
		System.out.println("띠리리");
	}
	void 정지() { //return 값이 없는 메서드 정지를 생성, 호출되면 { }안에있는 문장실행
		System.out.println("끼익");
	}
	void 가속() { //return 값이 없는 메서드 가속을 생성, 호출되면 { }안에있는 문장 실행
		System.out.println("슝");
	}
	void 감속() { //return 값이 없는 메서드 감속을 생성, 호출되면 { }안에있는 문장 실행
		System.out.println("~~감속~~");
	}
	
}
