package day02hw2; //ê³ ë??.. ?œ”?œ”

//1ë¶??„° 100?‚¬?´?˜ ? •?ˆ˜ ì¤? 2 ?˜?Š” 3?˜ ë°°ìˆ˜ê°? ?•„?‹Œ ?ˆ˜?˜ ?•©ê³„ë?? êµ¬í•˜?‹œ?˜¤.
public class quiz04 {
	public static void main(String[] args) {

		// ?˜¤?‹µ ..
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0 || i % 3 != 0) {
				sum += i;
			}

		}
		System.out.println(sum);

		// ?•„?˜ê°? ? •?‹µ
		int sum1 = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0 && i % 3 != 0) {
				sum1 += i;
			}

		}
		System.out.println(sum1);

		// ?´? ‡ê²Œí•´?„ ok
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