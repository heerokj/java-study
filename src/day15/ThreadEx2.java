package day15;

// ��Ƽ������ �������
// 1. Thread Ŭ���� ���
// 2. run() override
// 3. start() ���� (run()�� �θ��� �ʰ� start()�� ����)

public class ThreadEx2 extends Thread{ //1. Thread Ŭ���� ���

	ThreadEx2(String name){
		super(name); //�θ� String �Ű������ִ� �⺻�����ڸ� ȣ��
	}
	
	@Override
	public void run() { //2. run() override
		for(int i =0; i<=100; i++) {
			//���� �������� �������� ������ : Thread.currentThread()
			//�޼ҵ� ü�ι�� : Thread.currentThread().getName()
			System.out.println(Thread.currentThread().getName()+ " : "+i+"���� �޸��� ��"); //?
			try {
			Thread.sleep((int)(Math.random()*100)); //1000�� 1�� �ǹ�
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		ThreadEx2 th1 = new ThreadEx2("������");
		ThreadEx2 th2 = new ThreadEx2("õ����");
		System.out.println("ready~~~");
		System.out.println("start!!");
		th1.start();
		th2.start();  
		
		//��� ����� ���ö����� ���
		try {
			th1.join();// join���� �θ��� ����ó�� ���־����.
			th2.join();// join���� �θ��� ���ν������ join���� �θ� ��������� �Ϸ�� ������ ���� ����
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main Thread End"); //join���� �θ� ��������� �Ϸ�� �� ���
	}
}
