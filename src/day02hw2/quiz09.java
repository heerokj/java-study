package day02hw2; //κ³ λ?? ok       // ??λ¬Έμ A : 65 ~ Z :90?? //?λ¬Έμ a : 97 ~ z :122??
import java.io.IOException;

public class quiz09 {
	public static void main(String[] args) throws IOException {

		System.out.println("?? ₯:");

		int value = System.in.read(); // ?¬?©?λ‘λ??° κ°μ ?? ₯λ°μ

		if (65 <= value && value <= 90) {
			System.out.println((char) value + " ? ??λ¬Έμ???€."); // ??€?€μ½λλ‘? μΆλ ₯???°
		} else if (97 <= value && value <= 122) { // (char)λΆμ¬μ£Όλ©΄ ?΄?Ή λ¬Έμλ‘? μΆλ ₯?¨?
			System.out.println((char) value + " ? ?λ¬Έμ???€.");
		}

		//κ°λ¨??
//		int i = System.in.read();
//		char c = (char) i;
//		if (i >= 65) {
//			if (i <= 90) {
//				System.out.println(c + "??(?) ??λ¬Έμ???€.");
//			} else if (i <= 122) {
//				System.out.println(c + "??(?) ?λ¬Έμ???€.");
//			}
//		}
	}
}
