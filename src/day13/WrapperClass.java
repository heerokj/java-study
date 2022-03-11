package day13; 

public class WrapperClass {
	public static void main(String[] args) {

		//Wrapper Class
		//primitive type(기본타입)의 변수 ==> 객체로 전환하기 위한 클래스
		 
		//int ==> Integer, byte==> Byte 등의 형식으로 이름 명명되어있음
		
		//int의 최대값, 최소값을 출력
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
			
		Integer it1 = new Integer(10); //박싱
		int b = it1.intValue(); //언박싱
		System.out.println(b); //10
		System.out.println("---------------");
		
		//boxing
		//Integer 는 클래스. 클래스는 new해서 객체만들고나서 써야함
		//그러나 Wrapper 클래스와 primitive type은 밀접한 연관이 있기떄문에
		//String 처럼 new안하고 바로 값을 대입할 수 있게 해줌(자바 4부터)
		
		Integer it2 =20; //Integer it2 = new Integer(20);와 같음
		
		
		//unboxing
		//반대로 메서드 안쓰고 변수에 바로 객체 담는것도 가능하게함
		int c = it2; // int c = it2.intValue(); 와 같음
		System.out.println(c); //20
		
		
		//Integer를 long으로 형변환
		long d = it2.longValue();
		
		//10을 2진수로 변환한 후 String 형으로 형변환하여 String형 변수로 저장
		String bin = Integer.toBinaryString(10);
		System.out.println(bin); // 1010(10의 2진수) 

		int e = Integer.parseInt("300");
		System.out.println(++e); //301
		
		// byte 127값을 Wrapper Class b1으로 바로 대입
		Byte b1 = 127;
		// 이 값을 long형으로 형변환
		long f = b1.longValue();
		// 화면에 출력
		System.out.println(f);
		

	}

}
