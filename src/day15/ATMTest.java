package day15;

public class ATMTest {

	public static void main(String[] args) {
		// ���� ����
		ATM atm = new ATM("ȫ�浿", 10000);

		// ���ÿ� ���� ������������ �� ���¿�
		// �Ա�, ����� ���ÿ� ó���Ѵٰ� ����..

		ATMThread at1 = new ATMThread(atm);
		ATMThread at2 = new ATMThread(atm);
		ATMThread at3 = new ATMThread(atm);
		
		at1.start();
		at2.start();
		at3.start();
	}
}
