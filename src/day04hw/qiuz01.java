package day04hw;// 배열사용하여 두 행렬의 덧셈구하기

public class qiuz01 {

	public static void main(String[] args) {

		int[][] a = { { 3, 2, 3 }, 
				      { 4, 5, 6 }, 
				      { 1, 4, 9 } };

		int[][] b = { { 1, 8, 7 }, 
				      { 6, 4, 4 }, 
				      { 3, 2, 3 } };

		int[][] c = new int[3][3];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.println("c[" + i + "][" + j + "] : " + c[i][j]);
			}
		}

	}

}
