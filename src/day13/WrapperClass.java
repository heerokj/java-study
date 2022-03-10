package day13; //다른사람꺼 참고하기

public class WrapperClass {
	public static void main(String[] args) {

		
		
		
		// 2진수
		String bin = Integer.toBinaryString(10);
		System.out.println(bin); // 10의 2진수

		int e = Integer.parseInt("300");
		System.out.println(++e);

		
		// byte 127값을 Wrapper Class b1으로
		Byte b1 = 127;
		// 이 값을 long형으로 형변환
		long f = b1.longValue();
		// 화면에 출력
		System.out.println(f);
		
		//java.lang.Math
		
		
		
		

	}

}
