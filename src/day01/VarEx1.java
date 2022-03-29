package day01;

//primitive type
//정수형 : byte (8bit) short int(32bit) long(64bit)

//자료형 변수명 = 상수;
//상수는 항상 동일한 값을 갖는 수
//상수형은 변수의 형과 동일
//int 이하의 자료의 경우엔 int 타입 (?)
//java는 자료형을 아주 민감하게 취급하는 언어

public class VarEx1 {
	public static void main(String[] args) {

		// 자료형 변수명;
		// 10이라는 숫자를 저장
		byte b1; // b1이라는 이름의 byte 크기 변수를 선언
		b1 = 10; // b1이라는 변수에 10의 값을 대입
		System.out.println(b1); // 10출력

		
		b1 = 20; // = 대입 연산자, 할당연산자    b1이라는 변수에 20의 값을 대입
		System.out.println(b1); // 20출력

		short k; // short 크기의 변수 k를 선언		 
		k = 5000; // 변수k에 5000 값 대입	
		System.out.println(k); // 5000출력

		// 32bit 크기의 정수형 변수 i를 선언 대입 100000
		int i = 100000;
		System.out.println(i);

		
		// 32bit 크기의 정수형 변수 i를 선언 대입 2147483647
		int i1 =  2147483647; 
		// int 의 최대값, 범위 -2,147,483,648 ~ +2,147,483,647
		

		long t = 300L; // 64bit 크기의 정수형 변수 t를 선언, 300 대입
		// long형은 숫자값 뒤에 L을 붙여야 함.
		System.out.println(t); // t를 출력

		
		
		byte b11 = 10; // byte 크기의 b11이라는 변수를 선언하고 10의 값 대입
		byte b21 = 50; // byte 크기(8bit)의 b21이라는 변수를 선언하고 50의 값 대입
				
		System.out.println("b11: " + b11); // b11을 출력하는데 b11: 이라는 문자열과 함께 출력
		System.out.println("b21: " + b21); // b21를 출력하는데 b21: 이라는 문자열과 함께 출력
		
		short sh1 = 18121; // short 크기(16bit)의 정수형 변수 sh1에 18121 대입 
		
		// sh1 = b11;
		// b11 변수 안에 들어있는 값을 sh1 에 대입(암시적 형변환)
		// 큰잔 = 작은잔;
		// System.out.println("sh1: " + sh1); b11의 값을 대입한 sh1을 sh1: 라는 문자열과 함께 출력
		
		b11 = (byte)sh1; // short 형 sh1의 값을 임의로 byte 사이즈로 형변환 하여 byte 사이즈의 b11에 대입
		// 작은잔 = 큰잔; -> overflow -> error
		// 따라서 내가 임의로 형번환 하기 위해 큰잔 앞에 (작은잔의 변수형) 써줌(명시적 형변환)
		// risk : 담을 수 없는 값을 억지로 넣은 것이기 때문에 이상한 값 출력하기도 함
		System.out.println("b11: " + b11); // sh1의 값을 담은 b1을 b1: 라는 문자열과 함께 출력
		
		
		
		
	}

}
