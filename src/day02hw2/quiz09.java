package day02hw2; //고�?? ok       // ??문자 A : 65 ~ Z :90?��?�� //?��문자 a : 97 ~ z :122?��?��
import java.io.IOException;

public class quiz09 {
	public static void main(String[] args) throws IOException {

		System.out.println("?��?��:");

		int value = System.in.read(); // ?��?��?��로�??�� 값을 ?��?��받음

		if (65 <= value && value <= 90) {
			System.out.println((char) value + " ?�� ??문자?��?��?��."); // ?��?��?��코드�? 출력?��?��?��
		} else if (97 <= value && value <= 122) { // (char)붙여주면 ?��?�� 문자�? 출력?��?��
			System.out.println((char) value + " ?�� ?��문자?��?��?��.");
		}

		//간단?��?
//		int i = System.in.read();
//		char c = (char) i;
//		if (i >= 65) {
//			if (i <= 90) {
//				System.out.println(c + "??(?��) ??문자?��?��?��.");
//			} else if (i <= 122) {
//				System.out.println(c + "??(?��) ?��문자?��?��?��.");
//			}
//		}
	}
}
