package day03; //ok

public class StatementTest02 {

	public static void main(String[] args) {

		// 1부터 1000사이 숫자중 3의 배수(5개)의 누적합을 출력하시오.(최대한 반복횟수는 줄여서)

		int sum = 0;
		int counter = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 3 == 0) {
				counter++;
				sum += i;
				System.out.println(i);
				if (counter == 5)
					break;
			}
			System.out.println("누적합 : " + sum); //디버깅해서 아래랑 결과 값 차이 이해하기 => ok
		}
		System.out.println("최종누적합 : " + sum);
	}

}
