package day06hw; //´Ù½Ã

import java.util.Arrays;

public class Q10Lotto {

	int[] num = new int[45];
	int[] t = new int[6];
	int a, b, temp;

	Q10Lotto() {
		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1;
		}
		for (int i = 1; i <= 1000; i++) {
			a = (int) (Math.random() * 45);
			b = (int) (Math.random() * 45);

			temp = num[a];
			num[a] = num[b];
			num[b] = temp;
		}
		for (int i = 0; i < t.length - 1; i++) {
			for (int j = 1; j < t.length - i; j++) {
				if (t[j - 1] > t[j]) {
					temp = t[j - 1];
					t[j - 1] = t[j];
					t[j] = temp;
				}

			}

		}

	}

	void print() {
		System.out.println(Arrays.toString(t));
	}

}