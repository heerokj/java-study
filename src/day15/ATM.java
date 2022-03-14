package day15;

public class ATM {
	String account;
	int balance;
	//�⺻������
	public ATM(String account, int balance) {
		//�Ű����� �ִ� ������
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
	
	//���� �Ա��ϴµ��� �ٸ������ �Ա����� ���ϰ� �ϱ�!
	//database�� lock ������� ���! => synchronizedŰ���� ���!
	
	//deposit(int money)
	//����ȭ �޼��� ��, �� �޼��尡 �����ϴ� ������ �ٸ������ �̰��� ��� ���ϰ� �� 
	public synchronized void deposit(int money) {
		balance += money;
		System.out.println(money +"�� �Ա��մϴ�.");
		System.out.println("���� �ܾ� : "+balance);
	}
	//withDraw(int money)
	public synchronized void withDraw(int money) {
		balance -= money;
		System.out.println(money +"�� ����մϴ�.");
		System.out.println("���� �ܾ� : "+balance);
	}
	

}
