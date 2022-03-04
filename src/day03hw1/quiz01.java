package day03hw1;

public class quiz01 {

	public static void main(String[] args) {
		// 1부터 1000 사이 숫자중 3의 배수 (5개) 의 누적합을 출력하세요
		// (최대한 반복횟수는 줄여서 )

		int sum = 0;
		int counter = 0;
		for (int i = 1; i < 1000; i++) {
			if (i % 3 == 0) {
				counter++;
				sum += i;
				if (counter == 5)
					break;
			}
		}//for문 end
		System.out.println(sum); //최종누적합만 출력
	}

}
