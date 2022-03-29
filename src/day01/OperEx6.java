package day01;

//6. 논리 연산자 : &&, ||

// OperEx5와 달리 논리값만 처리함
//따라서 변수의 값이 true 나 false로 부여되지 않고
//숫자값으로 부여되면 연산할 수 없어 오류발생

public class OperEx6 {

	public static void main(String[] args) {
	
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println("b1 && b2 : " + (b1 && b2)); // b1 과 b2를 and 비교하여 나온 값을 출력
		System.out.println("b1 || b2 : " + (b1 || b2)); // b1 과 b2를 or 비교하여 나온 값을 출력
		System.out.println("-------------------");
		
		
	// 	논리연산자는 아래와 같이 실행 불가능
	//	byte c1 = 10;
	//	byte c2 = 20;
	//  System.out.println(c1 && c2);  
	//	System.out.println("c1 || c2 : " + (c1 || c2);

	}

}
