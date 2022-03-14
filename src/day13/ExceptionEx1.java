package day13;

import java.util.Random;

public class ExceptionEx1 {
	public static void main(String[] args) {
		// 1. ERROR :치명적 오류
		// 2. EXCEPTION : 가벼운오류
		// 가벼운오류는
		// 1. 예외 처리
		// 2. 예외 전가

		Random rnd = new Random();
		int a = 100;
		try {
			// 10 미만의 0포함한 양의 정수를 구하기
			int value = rnd.nextInt(10);
			System.out.println(value); // 만약 뽑은값이0이라면
			System.out.println(a / value); // 에러날수도 =>Exception
		} catch (ArithmeticException ae) { // 자료형참조변수형
			System.out.println("ArithmeticExcepton 발생하면 " 
		                + "이부분의 코드가 샐행됨");		
		}catch(NullPointerException ne) {
			System.out.println("널 포이터 예외 발생시 이 코드실행"); 
		}catch(Exception e) {
			//모든 Exception의 조상 / 마지막에 써주기 / 위에서 안걸리는거 써주기
			System.out.println("모든 예외는 여기서 다 걸림");
			System.out.println("이건 나도 모르는 Exception");
			e.printStackTrace(); // 지금 스택을 추적해서 출력
		}
		
	}
}
