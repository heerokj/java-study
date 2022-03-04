package day05;

public class MethodEx02 {
	
// static 리턴할값의자료형 메서드명	(자료형  매개변수명, 자료형  매개변수명, ...){
//	       코드1;
	
//	return 값;
//	 
//	void : 이 매서드를 실행한 후 호출한 쪽으로 아무값도 리턴할 필요없음. 즉 리턴할 값이 없으면=> 리턴할값의자료형말고 void쓰기
		              
	static int hap(int a, int b) { // 부를때는 갯수, 자료형 모두 맞아야 정확하게 호출할 수 있음 / ()사이에 변수는 여러개 사용가능
		System.out.println("a :" + a + ", b :" + b);
		int c = a + b;
		return c; //날 호출한 곳으로 이 값을 가지고 돌아가! 돌려줄 값이 있다면 꼭 써주기
	} 
	
	static int minus(int a, int b) {   //여기서 int는 리턴할값의 자료형
		int c = a - b; // 100이 c 변수에 대입
		return c;
	}	    //c는 리턴값! 계산결과인 c를 돌려줌

	static int max(int a, int b) {
		if(a > b) {
			return a;  //System.out.println(a); 쓰지말고  	  
		}else {
			return b;
		}	
	}
	
	static int max(int a, float b) {  
		if(a>b) {
			return a;
		}else {
			return (int)b;  //리턴할값의 자료형 : int / b는 float타입으로 형변환 시켜줘야됨
		}
	}
	
	static int sum(int a, int b, int c) {	
		//int result = a+b+c;
		return a=b+c;
	}
	 
	static int sum(int a, int b, int c, int d) {
		return a+b+c+d;
	}
	
	static float sum( int a, float b, int c) {
		return a+b+c;
	}
	
	//메소드도 이름이같다면 메소드 시그니쳐로 구분한다 (매개변수 갯수, 자료형 등등)
	//method signature{
	//   method body
	// }
	
	//method overloading
	//다중정의
	//방법 : 메서드명은 동일 (매개변수의 갯수, 순서, 타입을 다르게)
	
	public static void main(String[] args) {
		int result = hap(100,200);
		System.out.println(result);   //result : 300
						
		int result2 = minus(300,200);
		System.out.println(result2);
		
		int result3 = max(100,200);
		System.out.println(result3); //result3 : 200
		
		int result4 = max(100,200.0f);
		System.out.println(result4);
		
		int result5 = sum(100,200,300);
		System.out.println(result5); //result5 : 600
		
		int x1 =100; int x2 =100; int x3 =100; int x4 =100;
		int result6 = sum(x1,x2,x3,x4);
		System.out.println(result6); //result6 : 1000
		
		float result7 = sum(100,200.0f,300);
		System.out.println(result7); //result7 : 600.0
	}
	
}

