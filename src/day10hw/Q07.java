package day10hw;
//7. String 클래스의 자주 사용되는 메서드를 정리하고
//이 메세드가 어떤 결과를 주는지 정리하시오.

public class Q07 {
	public static void main(String[] args) {
		
		String str = "java study";

		// +++ 몇번째에있는 문자찾기
		char ch = str.charAt(2); 
		System.out.println(ch); 
		System.out.println("---------------");

		
		// +++문자열 연결
		String str2 = "자바";
		String str3 = "공부"; 
		String str4 = str2.concat(str3);
		System.out.println(str4);		
		System.out.println("자바".concat("공부").concat("합니다"));
		System.out.println("---------------");

		
		//+++대소무자 무시하고 내용이 동일한지 비교
		boolean b = str.equalsIgnoreCase("JAVA STUDY");
		System.out.println(b);
		System.out.println("---------------");

		
		//+++특정 문자의 위치를 리턴
		int position = str.indexOf('s');
		System.out.println(position); 
		System.out.println("---------------");
		
		
		//+++문자열 길이
		System.out.println(str.length()); 
		System.out.println("---------------");
		
		
		//+++글자를 역순으로 출력		
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		System.out.println("---------------");
		
		
		//+++문자열을 char배열로 리턴하는 메서드
		char[] ch2 = str.toCharArray();
		for (int i = 0; i < ch2.length; i++) {
			System.out.print(ch2[i]); 
		}
		System.out.println();
		System.out.println("---------------");
		
		
		

		// +++문자열의 부분집합 : substring
		System.out.println(str.substring(2, 6));
		System.out.println(str.substring(2));
		System.out.println("---------------");
		

		// +++분리하기
		String alp = "java,study,hahaha,hohoho"; 
		String[] list = alp.split(","); // ,기준으로 분리해서 배열에 담기
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
		System.out.println();
		
	}

}
