package day15;

public class ATM {

	String account;
	int balance;

	// �⺻������
	ATM() {

	}

	// �Ű����� �ִ� ������
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

	
	// ���� �Ա��ϴµ��� �ٸ������ �Ա����� ���ϰ� �ϱ�!
	// database�� lock �������! => synchronized Ű���� ���!

	// <����ȭ �޼���� ����� ��>
	// public�� void �ڸ� ���̿� synchronized ���ָ� ��
	// ����ȭ �޼��� ��, �� �޼��尡 �����ϴ� ������ �ٸ������ �̰��� ��� ���ϰ� ��
	
	public synchronized void deposit(int money) {
		// �Ա�
		balance += money; // �� �޼��尡 ȣ��Ǹ� money��ŭ balance�� �����ְ�
		System.out.println(money + "�� �Ա��մϴ�."); // ���
		System.out.println("���� �ܾ� : " + balance); // ���
	}

	// ���
	public synchronized void withDraw(int money) {
		if (balance >= money) { // money�� balance���� �۰ų� ���ٸ�
			balance -= money; // money��ŭ balance �������ְ�
			System.out.println(money + "�� ����մϴ�.");// ���
			System.out.println("���� �ܾ� : " + balance);// ���
		}

	}
}
