package day05hw2; //minus method를 overloading 시켜주세요

public class quiz08 {

	static int minus(int a, int b) {
		return a-b;
	}
	
	static float minus(int a, float b) {
		return a-b;
	}
	
	static double minus(int a, double b) {
		return a-b;
	}
	
	static float minus(float a, float b) {
		return a-b;
	}
	
	static double minus(double a, float b) {
		return a-b;
	}
	public static void main(String[] args) {
		
		
		System.out.println(minus(300,100)); // 200

		System.out.println(minus(300.0f,100)); // 200.0f

		System.out.println(minus(300,100.0d)); // 200.0d

		System.out.println(minus(300.0f,100.0f)); // 200.0f

		System.out.println(minus(300.0d,100.0f)); // 200.0d
	}
}
