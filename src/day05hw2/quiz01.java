package day05hw2; //Quiz1. 다음과 같은 코드가 실행될수 있도록 method overloading 을 구현해주세요 
public class quiz01 {
	
	static int plus(int a, int b) {
		//int c = 0;
		// c =a+b;
		//return c;
			return a+b;
	}
	
	static float plus(int a, float b, int c) {
		return a+b+c;
	}
	
	static double plus(int a, double b, int c) {
		return a+b+c;
	}
	
	public static void main(String[] args) {

		int result1 = plus(100,400);
		float result2 = plus(100,200.0f, 300);
		double result3 = plus(100,300.0, 200);
		
		System.out.println("result1 : "+result1);
		System.out.println("result2 : "+result2);
		System.out.println("result3 : "+result3);
		
	}

}
