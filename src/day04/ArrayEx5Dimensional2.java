package day04; 

public class ArrayEx5Dimensional2 {
	public static void main(String[] args) {
		// 2Â÷¿ø ¹è¿­
		// int[][] m = new int[Çà][¿­];
		// ¹øÈ£´Â ¶È°°ÀÌ 0¹øºÎÅÍ ½ÃÀÛ
		int[][] m = new int[3][2]; //3?–‰2?—´ì§œë¦¬ ë°°ì—´

		System.out.println("m : " + m); // m?˜ ì°¸ì¡°ê°?
		System.out.println("m.length : " + m.length); // m?˜ length /?–‰ê¸¸ì´?? 3?–‰
		System.out.println("m[0] : " + m[0]); // m[0]?˜ ì°¸ì¡°ê°?
		System.out.println("m[0].length : " + m[0].length); // m[0]?˜ length /?—´ê¸¸ì´?? 2?—´
						
//		m[0][0] = 1;
//		m[0][1] = 2;
//		m[1][0] = 3;
//		m[1][1] = 4;
//		m[2][0] = 5;     
//		m[2][1] = 6;

//		System.out.println("ê·¸ëƒ¥ ???…");
//		System.out.println(m[0][0]);
//		System.out.println(m[0][1]);
//		System.out.println(m[1][0]);
//		System.out.println(m[1][1]);
//	    System.out.println(m[2][0]);
//		System.out.println(m[2][1]); 


		
		//ê·¸ëƒ¥ ?¼?¼?´ ???…?•˜?Š”ê²ƒë³´?‹¨ forë¬? ?‚¬?š©?•˜?. ê²°êµ­ ë°°ì—´ ?“°?Š”ê²ƒì? ë°˜ë³µë¬? ?´?š©?•´?„œ ì¤„ì—¬?“°ê¸°ìœ„?•¨?´?‹¤.
		
		System.out.println("forë¬? ?‚¬?š©?•˜ê¸? ?´? ‡ê²Œí•˜?");
		int cnt = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				cnt++;
				m[i][j] = cnt;
				System.out.println("m["+i+"]["+j+"] : "+m[i][j]);
				
			}

		}
		
		System.out.println(m);  //ì°¸ì¡°ê°?
		System.out.println(m[0]); //ì°¸ì¡°ê°?
		System.out.println(m[0][0]); //?‹¤? œê°?
		
		System.out.println("length");
		System.out.println(m.length);
		System.out.println(m[0].length);
	}
}
