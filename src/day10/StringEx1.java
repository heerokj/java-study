package day10;

public class StringEx1 {

	public static void main(String[] args) {
		String str1 = new String("java");
		String str2 = new String("java");
	
		// ==  =>참조값비교
		if(str1 == str2) {
			System.out.println("동일 객체");
		}else {
			System.out.println("다른객체"); // 다른객체 출력(동일한 대상인지 비교 참조값 달라서 다른객체임)
		}
		
		if(str1.equals(str2)) {
			System.out.println("동일하 문자열");  //O출력(문자열 자체를 비교하는것이기 때문에)
		}else {
			System.out.println("다른 문자열");
		}
		//즉,  
		//Object 클래스 : equals() : 동일객체인지 참조를 비교
		//String 클래스 : equals() : Override method
		System.out.println("-------------");
		
		
		System.out.println(str1);
		System.out.println(str1.toString()); 
		// Overriding mothod라서 문자열자체가 출력
	
		
		//참조값
		System.out.println(str1.getClass().getName()+ '@' + Integer.toHexString(str1.hashCode()));
	
		
		//클래스지만 primitive type처럼 사용할 수 있는 예외적인 클래스 : String
		//char[] --> 불편
		String str3 = "java";
		String str4 = "java";
		
		if(str3 == str4) {
			System.out.println("동일 객체"); 
		}else {
			System.out.println("다른객체"); 
		}//동일 객체 출력 =>String은 같은문자열 갖으면 같은 참조값사용
		
		
		//deprecated : 더 이상 안씀
	}
}