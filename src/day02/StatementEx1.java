package day02;
//자바 응용프로그램

//main method
//문장의 흐름을 제어하는 문 : 제어문
//제어문 중 반복문 : for문
public class StatementEx1 {

	public static void main(String[] args) {
		// for(초기식;조건식; 증감식){
		// 문장1;
		// 문장2;
		// }

		// 초기식 : for문에서 사용될 변수에 초기값을 할당
		// 조건식 : 조건식의 결과값은 논리값으로 true이면 {}안에 문장 실행하고, false이면 문장을 종료한다.
		// 증감식 : for문에서 사용될 변수를 증가,감소처리 해준다.
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(i + "번째 : 3* " + i + "=" + i * 3);
		}
		System.out.println("반복문 탈출");

	}
} 