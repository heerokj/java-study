package day01;
// 5. ë¹„íŠ¸?—°?‚°? : ë¹„íŠ¸ ?‹¨?œ„ë¡? ?—°?‚°
// and : & , or: |

// boolean : true :1 , false :0

// ?¤ alt + ë°©í–¥?‚¤
public class OperEx5 {

	public static void main(String[] args) {
	    byte a =10;  
		byte b =20; 
		System.out.println("------------------");

		System.out.println("a&b : " + (a&b)); 
		// 10 2ì§„ìˆ˜ : 0000 1010
		//           and
		// 20 2ì§„ìˆ˜ : 0001 0110
		//           0000 0010  => 2
		System.out.println("a|b : " + (a|b));
		
		byte k1 = 13; //13 2ì§„ìˆ˜ 0000 1101
		byte k2 = 17; //17 2ì§„ìˆ˜ 0001 0001         //0000 1101 ê³? 0001 0001ë¥? ?ë¦¬ë§ì¶°ì„œ ê³„ì‚°  
		System.out.println("k1&k2 : " + (k1&k2)); //0000 1101 
		                                          // and
		                                          //0001 0001    
	                                              //0000 0001 -> 2	
		System.out.println("k1|k2 : " + (k1|k2)); 
		                //     0000 1101
		                //     or
		                //     0001 0001
		                //     0001 1101 -> 29
		System.out.println("------------------");
		
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println("b1&b2 : " +(b1&b2) //true and false ì¶œë ¥ ->false
				);

	}

}
