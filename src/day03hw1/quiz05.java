package day03hw1; //�ؼ�����

public class quiz05 {

	public static void main(String[] args) {

		int a = 1;
		System.out.println(a);
		int b = 1;
		System.out.println(b);
		int c = a + b;
		System.out.println(c);

		for (int i = 4; i <= 20; i++) {
			a = b;
			b = c;
			c = a + b;
			System.out.println(c);
		}

	}

}
