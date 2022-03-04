package day06hw;

import java.util.Arrays;

public class Q11NewLotto {
	int cnt;

	int[] rnd = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 
			11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
			21, 22, 23, 24, 25, 26, 27, 28,29, 30, 
			31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 
			41, 42, 43, 44, 45 };

	
	int[] m = new int[6];

	
	
	Q11NewLotto(int cnt) {
		this.cnt = cnt;
	}

	
	
	
	void shuffle() {
		for (int i = 1; i <= 1000; i++) {

			int a = (int) (Math.random() * 45);
			int b = (int) (Math.random() * 45);

			int temp = rnd[a];
			rnd[a] = rnd[b];
			rnd[b] = temp;
		}
	}

	
	
	
	void sort() {
		for (int i = 0; i < 6; i++) {
			m[i] = rnd[i];
		}
		for (int i = 0; i < m.length - 1; i++) {
			for (int j = 0; j < m.length - 1 - i; j++) {
				if (m[j] > m[j + 1]) {
					int temp = m[j];
					m[j] = m[j + 1];
					m[j + 1] = temp;
				}
			}
		}
	}

	
	
	
	void print() {
		for (int i = 0; i < cnt; i++) {
			shuffle();
			sort();
			System.out.println(Arrays.toString(m));

		}

	}
}