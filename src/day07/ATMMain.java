package day07;

public class ATMMain {
	public static void main(String[] args) {
	
		ATM atm = new ATM();
		
//		atm.balance =5000;  //������ ��������
	
		atm.setBalance(90000);
		
		atm.deposit(5000);  //�޼ҵ�� ��ϳ���?
		
		atm.withDraw(10000);
		
	}
	
}
