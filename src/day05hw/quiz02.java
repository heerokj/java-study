package day05hw;

public class quiz02 {
	public static void main(String[] args) {
		int[][] a = { 
				{ 1, 4, 5, 10 }, 
				{ 3, 2, 6, 11 }, 
				{ 4, 1, 2, 7 }, 
				{ 8, 7, 13, 28 } 
				};
		
		System.out.println("가로의 합");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i][0] + a[i][1] + a[i][2] + a[i][3]);
		}
		System.out.println("----------");
		System.out.println("세로의 합");
		for (int i = 0; i < a[0].length; i++) {
			System.out.println(a[0][i] + a[1][i] + a[2][i] + a[3][i]);
		}

	}
}
