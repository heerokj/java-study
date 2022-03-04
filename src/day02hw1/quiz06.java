package day02hw1;

import java.io.IOException;

public class quiz06 {

	public static void main(String[] args) throws IOException {

		System.out.println("몇단?");

		int sc = System.in.read(); //  표준 입력 장치로 부터 값을 입력받아 오기 / 아스키코드로 불러옴
		sc -= 48; // 아스키코드-> 숫자
		for (int i = 1; i <= 9; i++) { // 1부터 9까지 i가 1씩증가할때마다 이하출력
			System.out.println(sc + "*" + i + "=" + (sc * i));

		}

	}

}
