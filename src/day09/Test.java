package day09;

public class Test {
	static int no; //스테틱변수
	int no2;
	static { //++스테틱 블럭 : 객체초기화담당 => 먼저 호출됨++
		System.out.println("static block이 먼저 실행");
		int a = 10;
		System.out.println("a : "+a);
	}
	Test(){
		System.out.println("기본생성자");
	}

	public static void show() { //스테틱 메서드
		System.out.println("static method show()");
	}
	public void show2() {//일반메서드
		System.out.println("instance method show2()");
	}
}
