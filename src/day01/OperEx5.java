package day01;
// 5. λΉνΈ?°?°? : λΉνΈ ?¨?λ‘? ?°?°
// and : & , or: |

// boolean : true :1 , false :0

// ?€ alt + λ°©ν₯?€
public class OperEx5 {

	public static void main(String[] args) {
	    byte a =10;  
		byte b =20; 
		System.out.println("------------------");

		System.out.println("a&b : " + (a&b)); 
		// 10 2μ§μ : 0000 1010
		//           and
		// 20 2μ§μ : 0001 0110
		//           0000 0010  => 2
		System.out.println("a|b : " + (a|b));
		
		byte k1 = 13; //13 2μ§μ 0000 1101
		byte k2 = 17; //17 2μ§μ 0001 0001         //0000 1101 κ³? 0001 0001λ₯? ?λ¦¬λ§μΆ°μ κ³μ°  
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
		
		System.out.println("b1&b2 : " +(b1&b2) //true and false μΆλ ₯ ->false
				);

	}

}
