package day07;
//✅✅

//접근지정자, 접근 수정자, 접근 한정자
//private : 현재 클래스 내에서만 접근 가능
//default : 현재 패키지내에서만 접근 가능 /아무것도 안써있을때는 default
//protected : 현재 패키지와 상속관계에 있는 곳에서만 접근 가능
//public : 어디서나 접근 가능
//캡슐화(정보의 은닉)

public class ATM {
	private int balance; // ✅변수balance는 현재 클래스 내에서만 변경 등 접근가능! 다른곳에서는 안됨
	String name; // string형 멤버변수 name 생성
	String accountNo; // string형 멤버변수 accountNo생성

	
	
	// ✅✅
	// private붙이면 메인 메소드에서 변경 안됨(외부에서 직접 접근하지못한다는뜻)
	// 그러면 직접변경말고 간접적으로 접근할 수 있는 방법은?

	// setXXX() /getXXX() 사용하자!
	// setter, getter 메서드(자바에서 공식적으로 쓰는 용어는 아니지만 통상 개발자들 사이에서 사용되는 언어)

	// 예) balance 이 변수의 값을             ✅▶  void set변수명(자료형 변수명){
	// 지정 - setXXX()                              this.변수명 = 변수명;
	// 가져오기 - getXXX()                        }

//	                                       ✅▶  자료형 get변수명() {
//	                                	            return this.변수명;
//	                                            }

	public int getBalance() {
		return this.balance;
	}

	public void setBalance(int balance) {
		// 감사기록
		// 권한검사
		this.balance = balance;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	// 입금
	void deposit(int a) {
		balance += a;
		System.out.println(a + "원 입금합니다.");
		System.out.println("현재 잔액 : " + balance);
	}

	// 출금
	void withDraw(int a) {
		// db에 접근해서 데이터를 가져와서
		// 누가 이 작업을 수행하고 있는지 검사기록을 남긴다.
		// if(권한 있어?{
		// 언제 얼마를 출금 .. 담당자 누군지 기록..
		// }
		if (balance >= a) {
			balance -= a;
			System.out.println(a + "원 출금합니다.");
		} else {
			System.out.println("잔액이 부족합니다.");
		}
		System.out.println("현재 잔액 : " + balance);
	}
}
