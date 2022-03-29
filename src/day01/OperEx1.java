package day01;
//연산자
//자료 가공을 위해 정해진 방식에 따라
//계산하고 그 결과를 얻기위한 행위를 의미하는 기호들의 총칭

//1. 증감연산자 : ++, --

public class OperEx1 {
	public static void main(String[]args){
	
		int a = 100; // 정수형 변수 a에 100을 대입
		int b = 10;  // 정수형 변수 b에 10을 대입

		
	/*      변수 a 에 1을 더한 값을 변수 a에 대입	
		
			a = a + 1; 
			a++; 
			++a; 라고 써줘도 됨
			
			System.out.println("a: " + a); //101출력
			
			
			번수 b 에 1을 뺀값을 변수 b에 대입
			
			b = b - 1; 
			b--;
			--b; 라고 써줘도 됨
			System.out.println("b: " + b); 
	 */
		
		
		
	 /* a = a + 1;
	    b = a; 
	    b = ++a; => ++a 의 의미는 a를 먼저 +1하고 b에 대입해 라는 의미*/
		
	 /* b = a;
	    a = a + 1; 
	    b = a++; => 먼저 b에 대입하고 a에 +1을 하라는 의미*/
		
		
		b = a++;
		
		System.out.println("a: " + a + ", b: " + b);
		
		
	}

}

//0순위: ( ) , .(dot)