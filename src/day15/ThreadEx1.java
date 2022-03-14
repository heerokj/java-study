package day15;
//메모리를 할당받아 실행중인 프로그램 =>프로세스
//프로그램내에서 실행되는 흐름의 단위 => Thread
//하나의 흐름 내에서 동시에 여러개의 작업 진행 : 멀티태스크, 멀티스레드

// muti Thread 처리방법
// 1. Thread 상속
// 2. Runnablee 인터페이스 구현

public class ThreadEx1 {
	public static void main(String[] args) {
		Thread th = Thread.currentThread(); //현재 실행중인 쓰레드의 객체를 리턴
			String name = th.getName();	///스레드의 이름		
			System.out.println("현재 실행중인 쓰레드의 이름은 : "+name);
	
			// 위에 3줄 한줄 요약
			System.out.println("현재 실행중인 스레드의 이름은 : " + Thread.currentThread().getName());
			
	}

}
