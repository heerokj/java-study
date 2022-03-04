package day03; //디버깅 하면서 이해하기

// break : 가장 가까운 반복문을 탈출
// continue : 이번만 생략

//break 라벨 : 라벨이 붙어있는 반복문을 탈출
//continue 라벨: 라벨명이 붙어있는 반복문에서 이번만 생략

public class StatementEx11debug {
	public static void main(String[] args) {

		// for (int i = 1; i <= 4; i++) {
		// for (int j = 1; j <= 4; j++) {
		// if (j > i)
		// break; // 의미: j가 i보다 크면 그만해 / 브레이크만나면 가장 가까운 반복문을 빠져나간다.

		// for (int i = 1; i <= 4; i++) {
		// for (int j = 1; j <= 4; j++) {
		// if (j == i)
		// continue; // 이번회차만 생략 반복문 빠져나가지 않음

		// 라벨
		outer: for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				if (j > i)
					break outer; // j > i 일 경우 outer라벨 붙어있는 반복문 자체를 빠져나감

				System.out.println("i :" + i + ", j :" + j);
				System.out.println();
			}

		} // 더블클릭 => 브레이크 포인트 생성 / 여기서부터 실행안하고 멈춤
			// f11 => 디버그
			// f8

	}
}
