package day15;

public class ATM {

	String account;
	int balance;

	// 기본생성자
	ATM() {

	}

	// 매개변수 있는 생성자
	public ATM(String account, int balance) {
		super();
		this.account = account;
		this.balance = balance;
	}

	// setter, getter
	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public int getBlance() {
		return balance;
	}

	public void setBlance(int balance) {
		this.balance = balance;
	}

	
	// 내가 입금하는동안 다른사람이 입금하지 못하게 하기!
	// database의 lock 같은기능! => synchronized 키워드 사용!

	// <동기화 메서드로 만드는 법>
	// public과 void 자리 사이에 synchronized 써주면 됨
	// 동기화 메서드 즉, 이 메서드가 실행하는 동안은 다른사람은 이것을 사용 못하게 됨
	
	public synchronized void deposit(int money) {
		// 입금
		balance += money; // 이 메서드가 호출되면 money만큼 balance에 더해주고
		System.out.println(money + "원 입금합니다."); // 출력
		System.out.println("현재 잔액 : " + balance); // 출력
	}

	// 출금
	public synchronized void withDraw(int money) {
		if (balance >= money) { // money가 balance보다 작거나 같다면
			balance -= money; // money만큼 balance 차감해주고
			System.out.println(money + "원 출금합니다.");// 출력
			System.out.println("현재 잔액 : " + balance);// 출력
		}

	}
}
