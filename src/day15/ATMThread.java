package day15;
import java.util.Random;

//���ÿ� �ϳ��� ���¿� �Աݰ� ��ݱ���� ������ �� �ֵ��� ��Ƽ ������ ����
//Thread Ŭ���� ��ӹ��� Multi Thread

public class ATMThread extends Thread {
	ATM atm;
	Random rnd = new Random();
	
	public ATMThread(ATM atm) {
		this.atm = atm;
	}
	
	public void run() {
		// 5ȸ�Ա� 5ȸ ���
		// �����ư��鼭..
		boolean flag = true;
		
		for(int i = 0; i<5; i++) {
			//��������ŭ �����
			int money = rnd.nextInt(10)*1000;
			if(flag) {
				atm.deposit(money); // �Ա�
			}else {
				atm.withDraw(money); // ���
			}
			flag = !flag;// true ==> false, false ==> true�� ����
		} // for�� ����
	}
	
}
