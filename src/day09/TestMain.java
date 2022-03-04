package day09;

public class TestMain {
	public static void main(String[] args) {
		Horse h = new Horse(); // ctrl+shift+o import해주기 그래도 뒷부분 오류남 => horse 클래스보면 기본생성자가 defalut였음
		                       //                                                 =>public으로 바꿔주기
		
		h.eating();
		h.fly();
		
		Marine m1 = new Marine();
		m1.fly();
		//날수있게하기
		
		System.out.println("--------------");
		Flyable f;
		f= h; //인터페이스 구현 => 부모 자식 관계가 성립
		f.fly();
		
		f =m1;
		f.fly();
		
		//다형성
		//동일한 조작방법으로 동작시키지만 대상에 따라 다른 실행을 하게 하는것
		
		// 1. 캡슐화
		// 2. 상속
		// 3. 추상화
		// 4. 다형성
		
		
		
	}

}