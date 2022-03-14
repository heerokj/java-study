package day15;
import java.util.Random;

//동시에 하나의 계좌에 입금과 출금기능을 수행할 수 있도록 멀티 쓰레드 구현
//Thread 클래스 상속받은 Multi Thread

public class ATMThread extends Thread {
	ATM atm;
	Random rnd = new Random();
	
	public ATMThread(ATM atm) {
		this.atm = atm;
	}
	
	public void run() {
		// 5회입금 5회 출금
		// 번갈아가면서..
		boolean flag = true;
		
		for(int i = 0; i<5; i++) {
			//랜덤값만큼 입출금
			int money = rnd.nextInt(10)*1000;
			if(flag) {
				atm.deposit(money); // 입금
			}else {
				atm.withDraw(money); // 출금
			}
			flag = !flag;// true ==> false, false ==> true로 변경
		} // for문 종료
	}
	
}
