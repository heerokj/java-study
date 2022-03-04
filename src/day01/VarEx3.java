package day01;

public class VarEx3 {
	public static void main(String[]args) {
		byte b1 = 10;
		byte b2 = 50;
		
		System.out.println(b1);
		System.out.println(b2);
		
		short sh1 = 12812;
		
		
		// b1 변수 안에 들어있는 값을 sh1 라는 변수에 대입
		// sh1 = b1; 
		// 큰잔 = 작은잔; 
		// System.out.println(sh1); 
		// 괜찮음
		
		// b1 = sh1;
		// 작은잔 = 큰잔.. 큰잔을 작은잔에 넣을 수 없잖아..
 		// 명시적형변환은?
		b1 =(byte)sh1;
		System.out.println(b1); //but 형변환헸지만 진짜 큰값넣을떄 이상하게 나올 수도..
		
		//2byte 크기
		char c1 = 'a';
		char c2 = 97; // ASCII코드 값 A:65 a:97 0:48 
		char c3 = '\u0061'; //유니코드 값
		System.out.println(c1); 
		System.out.println(c2);
		System.out.println(c3);
		
		
		char ch1 ='j';
		char ch2 ='a';
		char ch3 ='v';
		char ch4 ='a';
		System.out.println(ch1+ch2+ch3+ch4); //418로 출력 (그냥 +쓰게되면 ASCII코드가 더해지게됨)
		//+는  1.산술연산자  2. 열결연산자 : 문자열뒤에 + =>연결
		System.out.println(""+ch1+ch2+ch3+ch4); //java출력
		
		//문자형 변수 : string -----------------
		String str  = "java";
		System.out.println(str); 
		
		//화면에 표시하기 어려운 키 값
		//특수 문자 : 탭, 엔터
		// \n : 엔터	
		// \t : tab
		// \b :백스페이스
		// \\ : 문자\
		// \' : '
		// \" : "
		System.out.println("오늘은 \n 즐거운\t 목요일 입니다.");
		
		//논리형 변수 : boolean  
		//c언어는 1 or 0 표현가능
		//자바 반드시 true, false로 표현
		//참, 거짓 : 논리값을 저장할 수 있는 자료형
		//boolean b = 1;
		boolean bl1 = true;  //1
		boolean bl2 = false; //0
		
		System.out.println(bl1);
		System.out.println(bl2);
		
		
		
				
	}

}
