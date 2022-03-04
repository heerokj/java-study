package day08;
//Parent클래스를 상속받은 Child클래스
public class Child extends Parent { 

	String snsid;

	Child() {
		super(); // 부모생성자 불러오기 / 생략가능
		this.snsid = "aaa";
		this.name = "홍길동";
		this.age = 20;
		System.out.println("Child기본생성자");
	}
 
	//+++++ method overriding 
	// 부모가 가지고있는것도 똑같이 가지고 오기
	@Override // 이 메서드는 오버라이드 메서드 라는 의미 //오타나도 발견됨 /@키워드 : annotation
	public void singing() { //접근지정자 public => 부모의 접근지정자(여기선 dafalut)가 동일하거나 허용적이면 오버라이딩 가능
		System.out.println("오버라이딩~~~~~!!!");
	}
	
	public void goClub() {
		System.out.println("룰루랄라");
	}

}
