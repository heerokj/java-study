package day04;

public class ArrayEx6 {
	public static void main(String[] args) {

		int[] n = { 14, 2, 43, 12 }; // 초기값주기(값 할당하기)
		int[][] m = { 
				{ 0, 0, 0, }, // 2차열배열 초기값주기
				{ 0, 1, 2, 1, 3, 2, 5 }, 
				{ 0, 2, 4, 3, 8 }, 
				{ 0, 2, 7, 8 } };

		// 각 요소의 값을 이하처럼 출력
		// m[0][0] : 0
		// ....
		// m[3][3] : 8

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.println("m[" + i + "][" + j + "] : " + m[i][j]);
			}
		}

	}

}
