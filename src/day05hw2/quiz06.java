package day05hw2;

public class quiz06 {
	
	static int findMax(int[] m) {
		int max = 0;
		for (int i = 0; i < m.length; i++) {
			if (m[i] > max) {
				max = m[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {

		int[] m = { 21, 32, 31, 14, 51, 26, 37, 82, 19 };

		int result = findMax(m);

		System.out.println("result : " + result); // result : 82
		
	}

}
