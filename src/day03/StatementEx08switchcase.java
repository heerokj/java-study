package day03;

import java.util.Scanner;

public class StatementEx08switchcase {
	public static void main(String[] args) {

		// ?¬?©?λ‘λ??° ?±? ? ?? ₯λ°κΈ°

		System.out.println("?±?  ?? ₯");
		Scanner sc = new Scanner(System.in);

		// String data = sc.next(); //.nextλ©μ?? λ¬Έμ?΄ κ°?? Έ?¬ ? ??
		// System.out.println(data); //λ¬Έμ?΄ μΆλ ₯
		
		int score = sc.nextInt(); //? ? κ°? κ°?? Έ?€κΈ?
		System.out.println(score); //? ? κ°? μΆλ ₯

		// ?<switch ~ caseλ¬?>
		// ifλ¬? ??? ? switchλ¬ΈμΌλ‘λ ?¬?©κ°??₯
		// switchμΌ??΄?€ λ¬Έμ? 
		// λ³? ?€λ₯? ?ΈκΈμ΄ ??Όλ©? μ‘°κ±΄λ§μ‘±? λΆ?λΆμ? λΉ μ Έ??€μ§?x
		// ??κΉμ? λͺ¨λ ?€??¨ 
		// λ©μΆκ³? ?Ά??λΆ?λΆμ break?€?? ??΄?Ό?¨
		switch (score / 10) { //?? ₯λ°μ? ? ?λ₯? 10?Όλ‘? ?? λͺ«μ΄
		case 10: // 10?Έ κ²½μ° 
		case 9:  // 9?Έ κ²½μ° (98/10 = 9)
			System.out.println("A?? "); //λͺ«μ΄ 10,9?Έκ²½μ° A?? 
			break; //λ§μ‘±?λ©? λ©μΆ€
		case 8:
			System.out.println("B?? ");
			break;
		case 7:
			System.out.println("C?? ");
			break;
		case 6:
			System.out.println("D?? ");
			break;

		default: // if λ¬Έμ else ?? => ?λ¨Έμ?? ?΄κ±?
			System.out.println("F?? ");

		} //switch ~ case λ¬? end
	}

}
