package day13; // 예외전가

public class ExceptionEx2 {
	
/*	static int plus(String x, String y) {
		int a = 0;
		int b = 0;
		try { // 예외가 발생한 지점에 try
			a = Integer.parseInt(x); // "10" ==> 10
			b = Integer.parseInt(y); // "20" ==> 20
		} catch (NumberFormatException e) {
			System.out.println("숫자형식이 올바르지 않습니다..확인하세요!!!");
		}
		return a + b; 
	}
*/
	
	//이 메서드를 사용하는 사람이 자신의 환경에 맞게 이 예외를 처리하도록 전가 
	//=>이것을 처리하는 사람이 출력시(메인메소드에서)사용하기
	static int plus(String x, String y) throws NumberFormatException{
		int a = 0;
		int b = 0;
		
		a = Integer.parseInt(x); // "10" ==> 10
		b = Integer.parseInt(y); // "20" ==> 20
		return a + b; 
	}
	
	
	
	public static void main(String[] args) {
		String a = "10a"; // 예외발생
		String b = "10";
		
		int result = 0;
		try {
			result = plus(a, b);
		}catch(NumberFormatException nfe) {
			System.out.println("숫자형식이 올바르지 않습니다..확인하세요!!!");
		}

		System.out.println("result " + result);
	}

}
