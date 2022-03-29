package day02;

import java.io.IOException;

public class StatementTest07 {

//문제 : 사용자로부터 숫자를 입력받아 3의 배수인지여부를 출력 

	public static void main(String[] args) throws IOException {
 
		System.out.println("입력하세요!");

		int value = System.in.read(); // 1. 사용자로부터 값을 입력받는다.

		value -= 48; // 2. 아스키코드 ==> 숫자
		System.out.println(value);

		// 3. 이 값이 3의배수인지 판정 &
		// 4. 조건에 따라 메세지를 출력
		if (value % 3 == 0) {
			System.out.println(value + "는 3의배수 입니다.");
		} else {
			System.out.println(value + "는 3의배수가 아닙니다.");
		}
	}
}
