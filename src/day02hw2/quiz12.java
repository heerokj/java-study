package day02hw2;

import java.io.IOException;

public class quiz12 {

	public static void main(String[] args) throws IOException {

		System.out.println("입력:");
		int value = System.in.read();

		if (65 <= value && value <= 90) {
			int a = value + 32;
			System.out.println((char) a);
		} else if (97 <= value && value <= 122) {
			int b = value - 32;
			System.out.println((char) b); // 큰값을 작은값으로 바꾸려면 형변환 시켜줘야
		}
		// System.out.println((char) value + 32); ->요렇게는 왜 안돼??

	}
}
