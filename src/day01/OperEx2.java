package day01;

//2. 산술연산자
//+ , - , * , / , %

public class OperEx2 {

	public static void main(String[] args) {

		int a = 10; // 정수형 변수 a에 10을 대입
		int b = 20; // 정수형 변수 b에 20을 대입

		// int 이하의 자료형끼리 연산하면 결과는 int
		System.out.println(a + b); // a 더하기 b 한 값을 출력

		System.out.println("a + b: " + (a + b)); // a 더하기 b 한 값을 출력 //30출력
		System.out.println("a - b: " + (a - b)); // a 빼기 b 한 값을 출력 //-10출력
		System.out.println("a * b: " + (a * b)); // a 곱하기 b 한 값을 출력 //200출력
		System.out.println("a / b: " + (a / b)); // a 나누기 b 한 값의 몫을 출력 //0출력
		System.out.println("a % b: " + (a % b)); // a 나누기 b 한 값의 나머지를 출력 //10출력

		
		String c = "10";
		String d = "20";
		System.out.println("c + d: " + (c + d)); // 1020출력

	}

}
