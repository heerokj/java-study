package day15;
//��Ƽ ������( 1��°����� ThreadŬ������ ��ڹ��� ���ϴ� ��� : �ڹٴ� ���ϻ�Ӹ� �����ϱ� ������)
// 1.  Runnable �������̽� ����
// 2. 
// 3. 
// 4. 
// 5. Thread

public class ThreadEx3 implements Runnable{

	String name;
	
	ThreadEx3(String name){
		this.name = name;
	}//constructor end

	@Override
	public void run() {
		for(int i =1; i<=100; i++) {
			System.out.println(name +":"+i+"���� �޸�����");
		}		
	}//run() end
	
	public static void main(String[] args) {
		ThreadEx3 r1 =new ThreadEx3("�䳢");
		ThreadEx3 r2 =new ThreadEx3("�ź���");
		
		//th1.start() //�ȵ� => �����忡 start���� ����� �־?
		Thread th1 = new Thread(r1); //Thread(Runnable target)
		Thread th2 = new Thread(r2); //Thread(Runnable target)
		
		th1.start();
		th2.start();
		
	}
}
