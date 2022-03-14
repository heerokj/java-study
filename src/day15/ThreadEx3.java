package day15;
//��Ƽ ������( 1��°����� ThreadŬ������ ��ڹ��� ���ϴ� ��� : �ڹٴ� ���ϻ�Ӹ� �����ϱ� ������)
//1. Runnable �������̽� ����(��� start()��� �޼��尡 ����)
//2. run() override
//3. Runnable ������ Ŭ������ ��ü�� ����
//4. Thread ��ü�� ����
//    => Thread ��ü�� ������ �Ű������� Runnable ������ Ŭ������ ��ü�� �־��� : Thread(Runnable target)
//5. Thread Ŭ���� ��ü�� ���ؼ� start() ȣ��

public class ThreadEx3 implements Runnable{

	String name;
	 
	ThreadEx3(String name){ //String �Ű������ִ� ������
		this.name = name;
	}//constructor end

	@Override //Runnable �������̽��� run�߻�޼��常 ����������
	public void run() { //���� �������̵� �������ν� ��������
		for(int i =1; i<=100; i++) {
			System.out.println(name +" : "+i+"���� �޸�����");
		}		
	}//run() end
	
	
	public static void main(String[] args) {
			
	 //Runnable r = new ThreadEx3(); => Runnable�� ������ Ŭ������ ��ü�� ����
	 //Thread t = new Thread(r); => ������ Thread(Runnable target)
	 //���ٷ� ������ => Thread t = new Thread(new ThreadEx3());
			
		
			
		//Runnable ������ Ŭ������ ��ü�� ����
		ThreadEx3 r1 =new ThreadEx3("�䳢");
		ThreadEx3 r2 =new ThreadEx3("�ź���");
		
		//th1.start() //�ȵ� => �����忡 start���� ����� �־??
		Thread th1 = new Thread(r1); //Thread(Runnable target)
		Thread th2 = new Thread(r2); //Thread(Runnable target)
		
		// Thread Ŭ���� ��ü�� ���ؼ� start() ȣ��
		th1.start();
		th2.start();
		
	}
}
