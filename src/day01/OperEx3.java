package day01;

// 3. shift연산자

//사람이 보기는 그냥 산술연산자 * 와 / 쓰는게 편하고 가독성 높음
//그러나 컴퓨터가 쓰기에는 shift 연산자가 월등히 빠름
//프로그램은 가독성이 높아야 해서 일반적으로는 잘 안쓰나
//게임과 같은 빠른 성능을 우선으로 하는 시스템 개발을 위해 사용함
//평상시엔 잘 쓰지않음

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
