package day15;

//��Ƽ������ ȯ��
//2�ʸ��� 1�����
public class c_Producter extends Thread{
	private c_Car car;
	
	c_Producter(c_Car car){
		this.car = car;
	}

	@Override
	public void run() {
		for(int i=0; i<20; i++) {
			// 2�ʸ��� ���� 1�뾿 ����
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//���� �̸��� ������
			String name = car.getCarName();
			
			//���� �ֱ�
			car.push(name);
		}
	
	}
	
}
