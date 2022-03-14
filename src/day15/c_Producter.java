package day15;

//멀티쓰레드 환경
//2초마다 1대생산
public class c_Producter extends Thread{
	private c_Car car;
	
	c_Producter(c_Car car){
		this.car = car;
	}

	@Override
	public void run() {
		for(int i=0; i<20; i++) {
			// 2초마다 차를 1대씩 생산
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//차량 이름을 얻어오기
			String name = car.getCarName();
			
			//차고에 넣기
			car.push(name);
		}
	
	}
	
}
