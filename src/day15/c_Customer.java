package day15;

import java.util.Random;

//��Ƽ������
public class c_Customer extends Thread {
	
	c_Car car;
	Random rnd = new Random();

	c_Customer(c_Car car) {
		this.car = car;
	}
	
	@Override 
	public void run() {
		for (int i = 0; i < 20; i++) {
			// �����ϰ� 5���̳���
			try {
				Thread.sleep(rnd.nextInt(5) * 1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// 1�뾿 ������
			String carName = car.pop();
		}
	}
	// 20�� ������ ������ ������
	

}
