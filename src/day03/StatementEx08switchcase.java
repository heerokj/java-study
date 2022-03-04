package day03;

import java.util.Scanner;

public class StatementEx08switchcase {
	public static void main(String[] args) {

		// ?‚¬?š©?ë¡œë??„° ?„±? ?„ ?…? ¥ë°›ê¸°

		System.out.println("?„±?  ?…? ¥");
		Scanner sc = new Scanner(System.in);

		// String data = sc.next(); //.nextë©”ì„œ?“œ?Š” ë¬¸ì?—´ ê°?? ¸?˜¬ ?ˆ˜ ?ˆ?Œ
		// System.out.println(data); //ë¬¸ì?—´ ì¶œë ¥
		
		int score = sc.nextInt(); //? •?ˆ˜ ê°? ê°?? ¸?˜¤ê¸?
		System.out.println(score); //? •?ˆ˜ ê°? ì¶œë ¥

		// ?œ…<switch ~ caseë¬?>
		// ifë¬? ???‹ ?— switchë¬¸ìœ¼ë¡œë„ ?‚¬?š©ê°??Š¥
		// switchì¼??´?Š¤ ë¬¸ì? 
		// ë³? ?‹¤ë¥? ?–¸ê¸‰ì´ ?—†?œ¼ë©? ì¡°ê±´ë§Œì¡±?•œ ë¶?ë¶„ì—?„œ ë¹ ì ¸?‚˜?˜¤ì§?x
		// ?•„?˜ê¹Œì? ëª¨ë‘ ?‹¤?–‰?•¨ 
		// ë©ˆì¶”ê³? ?‹¶??ë¶?ë¶„ì— break?‚¤?›Œ?“œ ?ˆ?–´?•¼?•¨
		switch (score / 10) { //?…? ¥ë°›ì? ? ?ˆ˜ë¥? 10?œ¼ë¡? ?‚˜?ˆˆ ëª«ì´
		case 10: // 10?¸ ê²½ìš° 
		case 9:  // 9?¸ ê²½ìš° (98/10 = 9)
			System.out.println("A?•™? "); //ëª«ì´ 10,9?¸ê²½ìš° A?•™? 
			break; //ë§Œì¡±?•˜ë©? ë©ˆì¶¤
		case 8:
			System.out.println("B?•™? ");
			break;
		case 7:
			System.out.println("C?•™? ");
			break;
		case 6:
			System.out.println("D?•™? ");
			break;

		default: // if ë¬¸ì˜ else ?Š?‚Œ => ?‚˜ë¨¸ì??Š” ?´ê±?
			System.out.println("F?•™? ");

		} //switch ~ case ë¬? end
	}

}
