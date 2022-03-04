package day02;

import java.io.IOException;

public class StatementTest06 {

	public static void main(String[] args) throws IOException {
		// n입력하면
		// 1부터 n까지 출력되도록 만들기(단, n은 10을 넘지않는다)

		System.out.println("입력");

		int n = System.in.read(); // 표준입력장치로부터 한문자를 ascii코드값으로 가져오기
		// System.out.println(n); //56출력*
		n -= 48; // 56-48 => 8 -=은 대입연산자
		// System.out.println(n); //8출력

		for (int i = 1; i <= n; i++) { // n에 8쓴거랑 똑같이 동작
			System.out.println(i);
		}

	}

}
