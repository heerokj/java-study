package day02;
//제어문 중

//조건분기문 : 특정 조건에 따라 다른 문장을 실행시키고자 할때 사용
//  if(조건){                조건에 따라 else if 가 없을 수도!
//     문장1;                          else가 없을 수도! 둘다 없을 수도!
//  }else if(조건){
//     문장2;
//} else if(조건){
//     문장3;
//} else(조건){
//     문장4;

import java.io.IOException;

public class StatementEx5 {

// 문제: 입력한 숫자가 짝수인지 홀수인지 판단 : 메세지 출력	
	public static void main(String[] args) throws IOException {
		System.out.println("숫자입력 :");
		// 1. 사용자로부터 숫자를 입력받는다.
		int n = System.in.read();
		System.out.println("n:" + n);

		// 2. 아스키코드 ==> 숫자
		n -= 48;

		// 3. 2로 나눈 나머지 0이면 짝수 아니면 홀수
		 
		if (n % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");

		}
	}
}
