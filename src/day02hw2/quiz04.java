package day02hw2; //κ³ λ??.. ??

//1λΆ??° 100?¬?΄? ? ? μ€? 2 ?? 3? λ°°μκ°? ?? ?? ?©κ³λ?? κ΅¬ν??€.
public class quiz04 {
	public static void main(String[] args) {

		// ?€?΅ ..
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0 || i % 3 != 0) {
				sum += i;
			}

		}
		System.out.println(sum);

		// ??κ°? ? ?΅
		int sum1 = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0 && i % 3 != 0) {
				sum1 += i;
			}

		}
		System.out.println(sum1);

		// ?΄? κ²ν΄? ok
		int total = 0;
		for (int i = 1; i <= 100; i++) {

			if (i % 2 == 0) {
				total += 0;
			} else if (i % 3 == 0) {
				total += 0;
			} else {
				total = total + i;
			}
		}
		System.out.println(total);

	}

}