package day15;
//멀티 쓰레드( 1번째방법인 Thread클래스를 상솟받지 못하는 경우 : 자바는 단일상속만 지원하기 때문에)
// 1.  Runnable 인터페이스 구현
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
			System.out.println(name +":"+i+"미터 달리는중");
		}		
	}//run() end
	
	public static void main(String[] args) {
		ThreadEx3 r1 =new ThreadEx3("토끼");
		ThreadEx3 r2 =new ThreadEx3("거북이");
		
		//th1.start() //안됨 => 쓰레드에 start없고 런어블에 있어서?
		Thread th1 = new Thread(r1); //Thread(Runnable target)
		Thread th2 = new Thread(r2); //Thread(Runnable target)
		
		th1.start();
		th2.start();
		
	}
}
