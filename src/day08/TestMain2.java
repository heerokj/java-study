package day08;

import day06.Marine;

public class TestMain2 {

	public static void main(String[] args) {
		// class : 사용자 정의 자료형
		// Parent Marine 등

		//참조변수p1선언?& Parent 클래스의 생성자를 초기값으로 새로운 객체 p1 생성
		Parent p1 = new Parent("홍판서", 40, "판서");
		System.out.println(p1.name); //p1이 가르키는 name출력
		p1.eating(); //p1이 가르키는 eating메소드 호출
		p1.sleeping(); //p1이 가르키는 sleeping메소드 호출
		p1.singing();//p1이 가르키는 singing메소드 호출
		p1.nagging();//p1이 가르키는 nagging메소드 호출

		System.out.println("------------------");

		Marine m1;
//		m1 = p1;   +++++ class가 다르면 참조값 전달 안됨

		Parent p2;
		p2 = p1; // 같은 클래스끼리는 참조값 전달 가능
		System.out.println(p2.name);
		
		


	}
}
