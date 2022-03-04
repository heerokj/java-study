package day10;

public class SystemEx1 {

	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());
	// 현재 시간을 Milliseconds 형식으로 리턴
	
		System.gc(); //garbage collector호출
		
	System.out.println(System.currentTimeMillis());
	System.exit(0); // 0은 정상종료 0이아닌 다른값은 비정상종료
	System.out.println("test");
	}
}
