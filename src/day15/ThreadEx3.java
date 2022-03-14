package day15;
//멀티 쓰레드( 1번째방법인 Thread클래스를 상솟받지 못하는 경우 : 자바는 단일상속만 지원하기 때문에)
//1. Runnable 인터페이스 구현(얘는 start()라는 메서드가 없음)
//2. run() override
//3. Runnable 구현한 클래스의 객체를 생성
//4. Thread 객체를 생성
//    => Thread 객체의 생성자 매개변수로 Runnable 구현한 클래스의 객체를 넣어줌 : Thread(Runnable target)
//5. Thread 클래스 객체를 통해서 start() 호출

public class ThreadEx3 implements Runnable{

	String name;
	 
	ThreadEx3(String name){ //String 매개변수있는 생성자
		this.name = name;
	}//constructor end

	@Override //Runnable 인터페이스는 run추상메서드만 가지고있음
	public void run() { //따라서 오버라이딩 해줌으로써 구현해줌
		for(int i =1; i<=100; i++) {
			System.out.println(name +" : "+i+"미터 달리는중");
		}		
	}//run() end
	
	
	public static void main(String[] args) {
			
	 //Runnable r = new ThreadEx3(); => Runnable을 구현한 클래스의 객체를 생성
	 //Thread t = new Thread(r); => 생성자 Thread(Runnable target)
	 //한줄로 간단히 => Thread t = new Thread(new ThreadEx3());
			
		
			
		//Runnable 구현한 클래스의 객체를 생성
		ThreadEx3 r1 =new ThreadEx3("토끼");
		ThreadEx3 r2 =new ThreadEx3("거북이");
		
		//th1.start() //안됨 => 쓰레드에 start없고 런어블에 있어서??
		Thread th1 = new Thread(r1); //Thread(Runnable target)
		Thread th2 = new Thread(r2); //Thread(Runnable target)
		
		// Thread 클래스 객체를 통해서 start() 호출
		th1.start();
		th2.start();
		
	}
}
