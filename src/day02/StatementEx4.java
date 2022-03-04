package day02;

import java.io.IOException; // 아래 throws IO~ 쓰려면 import~써줘야함

public class StatementEx4 {
	                                    //System.in.read 사용하려면 위에 throws IOExcepton써줘야됨
	public static void main(String[] args) throws IOException { 

		System.out.println("몇단?");
		
		// 표준 입력 장치로 부터 값을 입력받아 오기
		int value = System.in.read(); // 사용자로부터 값을 입력받아 
		System.out.println("입력한문자의 ascill:" + value); //아스키코드

		value -= 48; //아스키코드 -> 숫자
		System.out.println("숫자화 시킨값 :" + value);
		// 3-> 51-48

		
		// 문제) 입력한 단의 구구단 출력

		for (int i = 1; i <= 9; i++) { // {}안에있는 i는 지역변수 / 그 지역안에서만 적용되는 것
			System.out.println(value + "*" + i + "=" + (value * i));
		}
	}
}
