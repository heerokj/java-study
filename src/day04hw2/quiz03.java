package day04hw2;

public class quiz03 {

	public static void main(String[] args) {
		int[][] score = { 
				{ 80, 80, 80, 0, 0 }, 
				{ 60, 50, 80, 0, 0 }, 
				{ 50, 90, 90, 0, 0 }, 
				{ 40, 50, 60, 0, 0 },
				{ 90, 90, 95, 0, 0 }, 
				{ 85, 95, 100, 0, 0 }, 
				};

		for (int i = 0; i < score.length; i++) {
			score[i][3] = score[i][0] + score[i][1] + score[0][2];
			score[i][4] = score[i][3] / 3;

			System.out.print("±¹¾î : " + score[i][0]+"\t");
//			System.out.print("¿µ¾î : " + score[i][1] + "\t");
//			System.out.print("¼öÇÐ : " + score[i][2] + "\t");
//			System.out.print("ÃÑÁ¡ : " + score[i][3] + "\t");
//			System.out.println("Æò±Õ : " + score[i][4]);
		}
	}
}
