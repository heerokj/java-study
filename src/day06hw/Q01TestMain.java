package day06hw; 

public class Q01TestMain { 
	
	//멤버 변수
	String name,gender, job, 종특; 
	int eye, arm, age;
	
	//초기생성자
	Q01TestMain(){
		name = "홍길동";
		gender ="남";
		job = "도적";
		종특 = "스틸";
		eye = 2;
		arm = 2;
		age = 20;
		System.out.println("기본생성자");
	}
	
	//멤버 메소드
	void 스틸() {
		System.out.println("내꼬내꼬 다 내꼬얌!!!");
	}
	
	void 달리기() {
		System.out.println("헛둘 헛둘");
	}
	
	void 빠르게달리기() {
		System.out.println("땀나게 달려요");
	}
	
	void 축지법() {
		System.out.println("동해 번쩍 서해 번쩍");
	}
	
	
	
	
	
}
