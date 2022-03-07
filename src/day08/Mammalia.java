package day08;
//추상클래스
//class 앞에 abstract 써주기
//실체클래스의 공통적인 부분을(변수나 메소드를) 추출해서 상위의 개념으로 만들어놓은것
//추상클래스 추상적으로만 있기를 바라고 객체 만들기 원치 않아 => 객체 생성할 수 없다.
//상속을 목적으로

//추상클래스 : 조감도
//클래스 : 객체를 만들기위한 일종의 설계도


//추상클래스는 추상메서드를 가질 수도 있고 구현메서드로만 구성될 수 있다.
//추상메서드를 하나라도 가지고 있는 클래스(여기서 Mammalia)는 반드시 추상클래스여야한다.
public abstract class Mammalia { 
	int eye, nose, ear;
	String name;
	String species;

	//자식들이 전부다 오버라이딩(재정의)해서 쓰고있다면 여기서 정의 안해도 됨
	public abstract void eating(); //미구현(추상)메서드

	
	public void sleeping(){	} //구현메서드
	
}
