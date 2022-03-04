package day05; // method Overloading / ok

public class MethodEx05Test {

	static int plus(int a, int b) { // 메인 메소드 안에있는변수와 다른거 !
		int c = 0;
		c = a + b;
		return c;
	}
	static float plus(float a, int b) {
		float c = 0;
		c = a + b; // 이때의 +는 산술연산자
		return c;
	}
	static String plus(String a, String b) {
		return a + b; // 스트링일때 이때의 +는 연결연산자
	}

	
	
	
	public static void main(String[] args) {

		int a = 100;
		int b = 200;
		int result1 = plus(a, b);
		System.out.println("a : " + a); // 값 예상해본 후에 실행하기 => ok

		float result2 = plus(100.0f, b);

		String result3 = plus("오늘은", "수요일");

		System.out.println("------------");
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);

	}

}
