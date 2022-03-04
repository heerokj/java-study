package day10;

public class StringEx2 {

	public static void main(String[] args) {

		String str = "java oracle";

		// +++
		// 몇번째 문자찾기
		// 4번째 문자(배열의 인덱스는 0부터)
		char ch = str.charAt(3);

		System.out.println("4번째문자 : " + ch); // 4번째문자 : a
		System.out.println("---------------");

		
		// +++
		// 문자열 연결
		String str2 = "월요일";
		String str3 = "화요일";
		String str4 = str2.concat(str3);
		System.out.println("str4 :" + str4); // str4 :월요일화요일
		String str5 = "수요일";
		String str6 = str4 + str5;
		System.out.println(str6); // 월요일화요일수요일

		
		// 이렇게 연결해도 ok
		// +++ 메서드 체이닝 +++
		System.out.println("월월월".concat("화화화").concat("수수수"));
		System.out.println("---------------");

		
		//+++
		boolean flag = str.contains("java");

		System.out.println(flag); // true   ???
		// equals() : 내용비교
		// equalsIgnoreCase()
		// 대소문자를 무시하고 내용이 동일한지 비교하는 메서드

		boolean isSame = str.equalsIgnoreCase("JAVA ORACLE");
		System.out.println("equalsIgnoreCase() : 대소문자 무시하고비교 :" + isSame);
		System.out.println("---------------");

		
		//+++
		// 특정 문자의 위치를 리턴(단 배열의 인덱스는 0부터 시작)
		int position = str.indexOf('r');
		System.out.println(position); // 6(공백포함하니깐)

		//+++
		// length() : 문자열의 길이
		System.out.println(str.length()); //11

		//+++
		// 글자를 역순으로 출력		
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i)); //elcaro avaj
		}
		System.out.println();
		System.out.println("-----------");

		//+++
		// 문자열을 char배열로 리턴하는 메서드
		char[] ch2 = str.toCharArray();
		for (int i = 0; i < ch2.length; i++) {
			System.out.print(ch2[i]); //java oracle
		}
		System.out.println();
		
		// 역순으로 출력
		for (int i = str.length() - 1; i <= 0; i--) {
			System.out.print(ch2[i]);
		}
		System.out.println();
		System.out.println("----------------");

		int a = 20;
		
		
		// 문자열 형 변환
		String str7 = "" + a; // +연산에 의해 정수값과 문자 붙어
		System.out.println(str7); // 20
		System.out.println(str7.charAt(0)); // 2

		String str10 = String.valueOf(20);
		System.out.println(str10); // 20

		// 문자열의 부분집합 : substring
		System.out.println(str.substring(2, 6));
		// 2번부터 6번전까지 글자

		// +++
		// id+ @도메인 : id만 추출
		String email = "dagda@hanfos.com";
		int pos = email.indexOf('@');
		System.out.println(pos); // 5
		// 5번 전까지가 필요
		System.out.println(email.substring(0, pos));
		System.out.println(email.substring(0, email.indexOf('@')));
		System.out.println();

		// +++
		String friendList = "aaa,bbb,ccc,ddd"; // 친구아이디
		String[] list = friendList.split(","); // ,기준으로 분리해서 배열에 담기
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
		System.out.println();

	}

}
