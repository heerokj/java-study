package day01;
// 3. shift연산자
//가독성/ 빠른성능시스템 개발위해/ 평상시 잘 쓰지 않음

public abstract class OperEx3 {

	public static void main(String[] args) {
	
		byte b = 10;
		System.out.println("b>>2 : " +(b>>2));
		System.out.println("b<<2 : " +(b<<2));
		//>> 오른쪽으로 밀고 남는자리는 0으로 대체
		//>>> 오른쫏으로 밀고 남는 자리는 부호의 값으로 대체
		
		byte b2 = 20;
		System.out.println("b2>>2 : " +(b2>>2));
		System.out.println("b2<<2 : " +(b2<<2)); 

		System.out.println("b2>>3 : " +(b2>>3)); 
		System.out.println("b2<<3 : " +(b2<<3)); 
		//결론 2의 n을 나누거나(>>) 곱하자(<<)
		
	}

}
