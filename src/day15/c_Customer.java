package day15;

import java.util.Random;

//멀티쓰레드

public class c_Customer extends Thread {

	c_Car car;
	Random rnd = new Random();

	c_Customer(c_Car car) {
		this.car = car;
	}

	@Override
	public void run() {
		// 20대의 차량을
		for (int i = 0; i < 20; i++) {
			// 랜덤하게 5초이내에 1대씩(공장은 일정하게 생산하나 손님은 항상 일정하게 오는건 아니니까)
			try {
				Thread.sleep(rnd.nextInt(5) * 1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// 1대씩 꺼내기
			String carName = car.pop();
		}
	}
	// 20대 차량을 차고에서 꺼내기

}
