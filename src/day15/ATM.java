package day15;

public class ATM {
	String account;
	int balance;
	//기본생성자
	public ATM(String account, int balance) {
		//매개변수 있는 생성자
		super();
		this.account = account;
		this.balance = balance;
	}
	//setter, getter
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
	
	//내가 입금하는동안 다른사람이 입금하지 못하게 하기!
	//database의 lock 같은기능 사용! => synchronized키워드 사용!
	
	//deposit(int money)
	//동기화 메서드 즉, 이 메서드가 실행하는 동안은 다른사람은 이것을 사용 못하게 됨 
	public synchronized void deposit(int money) {
		balance += money;
		System.out.println(money +"원 입금합니다.");
		System.out.println("현재 잔액 : "+balance);
	}
	//withDraw(int money)
	public synchronized void withDraw(int money) {
		balance -= money;
		System.out.println(money +"원 출금합니다.");
		System.out.println("현재 잔액 : "+balance);
	}
	

}
