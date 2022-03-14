package day15;
//메모리를 할당받아 실행중인 ㅍ프로그램 == >프로세스

//프로그램내에서 실행되는 흐름의 단위 => Thread

//동시에.. => Muㅣti Thread 지원

//멀티태스크, 멀티쓰레드

//muti Thread
//1. Thread 상속
//2. Runnablee 인터페이스 구현

public class ThreadEx1 {
	public static void main(String[] args) {
		Thread th = Thread.currentThread();
			String name = th.getName();	///스레드의 이름		
			System.out.println(name);
		}

}
