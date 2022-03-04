package day02;

public class StatementTest11 {

	public static void main(String[] args) {

		// 문제) 1부터 100사이의 정수중 3의 배수만 출력
		// 1. 1부터 100까지 사이의 정수를 출력 (for)
		// 2. 3의배수일때만 출력(if)

		for (int i = 1; i <= 100; i++) {  //1부터 100보다 작을 때까지 1씩증가하면서 반복 
			if (i % 3 == 0) {      //조건 만족하면 이하 출력
				System.out.println(i);
			} else {  //else 생략가능
			}
		}
	}
}
