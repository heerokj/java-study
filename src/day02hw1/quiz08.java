package day02hw1; //∞ÌπŒ ok

import java.io.IOException;

public class quiz08 {

	public static void main(String[] args) throws IOException {

		System.out.println("∏Ó¡Ÿ?");

		int sc = System.in.read();
		sc -= 48;

		String str = "";
		for (int i = 1; i <= sc; i++) {
			str = str + "*";
			System.out.println(str);
		}

	}

}
