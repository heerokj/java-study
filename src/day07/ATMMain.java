package day07;

public class ATMMain {
	public static void main(String[] args) {
	
		ATM atm = new ATM();
		
//		atm.balance =5000;  //변수에 직접접근
	
		atm.setBalance(90000);
		
		atm.deposit(5000);  //메소드는 기록남게?
		
		atm.withDraw(10000);
		
	}
	
}
