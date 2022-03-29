package day01;

//5. 비트 연산자 : 비트 단위로 연산

// and : & , or: |
// boolean : true :1 , false :0

public class OperEx5 {

	public static void main(String[] args) {
	   
		byte a =10;  
		byte b =20; 
		System.out.println("------------------");

		System.out.println("a&b : " + (a&b));  
		// 10 2진수 : 0000 1010
		//           and
		// 20 2진수 : 0001 0110
		//           0000 0010  => 2
		System.out.println("a|b : " + (a|b));
		
		byte k1 = 13; //13 2진수 0000 1101
		byte k2 = 17; //17 2진수 0001 0001         //0000 1101 �? 0001 0001�? ?��리맞춰서 계산  
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
		
		System.out.println("b1&b2 : " +(b1&b2) //true and false 출력 ->false
				);

	}

}
