package day10hw;

public class Q05 {
	public static void main(String[] args) {
		
		String str1 = new String("java study");
		String str2 = new String("java study");		
		System.out.println(str1==str2); //false 출력 => 참조값 다름
		System.out.println(str1.equals(str2)); //true 출력 => 문자열 자체 비교
		
		
		String str3 = "java study";
		String str4 = "java study";
		System.out.println(str3 == str4); //true 출력
		System.out.println(str3.equals(str4)); //true 출력 =>String은 같은문자열 갖으면 같은 참조값사용

				
		System.out.println(str1.toString()); //java study출력
				
	}

}
