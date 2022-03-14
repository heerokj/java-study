package day15;

// 멀티쓰레드 구현방법
// 1. Thread 클래스 상속
// 2. run() override
// 3. start() 실행 (run()을 부르지 않고 start()로 실행)

public class ThreadEx2 extends Thread{ //1. Thread 클래스 상속

	ThreadEx2(String name){
		super(name); //부모 String 매개변수있는 기본생성자를 호출
	}
	
	@Override
	public void run() { //2. run() override
		for(int i =0; i<=100; i++) {
			//현재 실행중인 쓰래드의 참조값 : Thread.currentThread()
			//메소드 체인방식 : Thread.currentThread().getName()
			System.out.println(Thread.currentThread().getName()+ " : "+i+"미터 달리는 중"); //?
			try {
			Thread.sleep((int)(Math.random()*100)); //1000이 1초 의미
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		ThreadEx2 th1 = new ThreadEx2("동동이");
		ThreadEx2 th2 = new ThreadEx2("천둥이");
		System.out.println("ready~~~");
		System.out.println("start!!");
		th1.start();
		th2.start();  
		
		//경기 결과가 나올때까지 대기
		try {
			th1.join();// join으로 부르면 예외처리 해주어야함.
			th2.join();// join으로 부르면 메인스레드는 join으로 부른 스레드들이 완료될 때까지 실행 멈춤
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main Thread End"); //join으로 부른 스레드들이 완료된 후 출력
	}
}
