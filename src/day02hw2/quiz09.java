package day02hw2; //ê³ ë?? ok       // ??ë¬¸ì A : 65 ~ Z :90?œ”?œ” //?†Œë¬¸ì a : 97 ~ z :122?œ”?œ”
import java.io.IOException;

public class quiz09 {
	public static void main(String[] args) throws IOException {

		System.out.println("?…? ¥:");

		int value = System.in.read(); // ?‚¬?š©?ë¡œë??„° ê°’ì„ ?…? ¥ë°›ìŒ

		if (65 <= value && value <= 90) {
			System.out.println((char) value + " ?Š” ??ë¬¸ì?…?‹ˆ?‹¤."); // ?•„?Š¤?‚¤ì½”ë“œë¡? ì¶œë ¥?˜?Š”?°
		} else if (97 <= value && value <= 122) { // (char)ë¶™ì—¬ì£¼ë©´ ?•´?‹¹ ë¬¸ìë¡? ì¶œë ¥?¨?œ”
			System.out.println((char) value + " ?Š” ?†Œë¬¸ì?…?‹ˆ?‹¤.");
		}

		//ê°„ë‹¨?ˆ?
//		int i = System.in.read();
//		char c = (char) i;
//		if (i >= 65) {
//			if (i <= 90) {
//				System.out.println(c + "??(?Š”) ??ë¬¸ì?…?‹ˆ?‹¤.");
//			} else if (i <= 122) {
//				System.out.println(c + "??(?Š”) ?†Œë¬¸ì?…?‹ˆ?‹¤.");
//			}
//		}
	}
}
