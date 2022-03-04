package day05;    //참고 : 자바도 포인터있는데 c처럼 쓰지 않아 연산불가능  //다시 이해! 메서드 호출방식 비교하기

public class MethodEx04 {

	static int hap(int a, int b) { // a:100, b:200
		a = a + 1; // 101이 a에 대입 -> a는 101이 됨
		System.out.println(a + "," + b); // [값 101, 200 출력]
		return a + b; // 300
	} // 리턴하고 주고나면 여기 변수는 없어짐 / 메인 메소드 변수(이하에서a,b(지역변수랑 다름))에는 영향 주지않아

	
	  
	static int sum(int[] x) {
		System.out.println("x : " + x); // 참조형ㅇ
		int tot = 0;
		for (int i = 0; i < x.length; i++) {
			tot += x[i];
		}
		x[2] = 500;  //참조값에 의한 호출 / 참조값을 통해 변화주면 그건 힙에 반영 그건 메인 메소드에 영향 줌 /배열x의 2번째자리에 500 대입
		return tot; 
	}

	
	public static void main(String[] args) {

		int a = 100;
		int b = 200;
		int result = hap(a, b); // 지역변수에서 뭘 하든 리턴빼고 다른값에는 영향 주지않아 / 다른값이라 하면 int a =100;이런거
		//<메서드 호출방식에 따른 분류 :call by value 방식 >
		System.out.println(result); // [300 출력]		 
		System.out.println(a); // ✔ 값은 100 =>왜? 지역변수에서 뭘 하든 리턴빼고 다른값에는 영향 주지않아 [100 출력]
		System.out.println("-------------------");

		
		
		int[] m = { 1, 2, 3 };
		System.out.println("m : " + m); // 참조값 

		int[] k = m; // 예) 열쇠복사라고 생각하면 됨 /// int형 배열 k 생성 후 m의 값 대입
		System.out.println("k : " + k); // 참조값

//		System.out.println("k[1] : "+k[1]); 
//		k[1] = 100;  //값 담기
//		System.out.println("k[1] : "+k[1]); 
//		System.out.println("m[1] : "+m[1]); //m을 통해 접근 가능 /열쇠복사한 곳에서 변경하면 m의 값도 변경(?)
		
		
		
		//위에랑 다르니깐 비교!!!  +++????/++++
		
		// <메서드 호출방식에 따른 분류 :call by reference 방식 >
		//참조값에 의한 호출 / 참조값을 통해 변화주면 그건 힙에 반영 그건 메인 메소드에 영향 줌		
		int sumValue = sum(m); //int형 변수sumValue 생성하고 sum(m)값 대입
		System.out.println("배열요소의 합 : " + sumValue); //sumValue값 출력
		
		// return 값과 더불어 main 메서드 안의 다른 변수에까지 영향을 줄 수 있음.
		//sum메서드에서 x[2]를 500으로 변경했기 때문에 m[2]의 값에도 영향을 주어 m[2]값이 500으로 바뀜
	    System.out.println(m[2]); // [500 출력]  힙에 저장되에있는 m[2]값도 500으로 변함 
		
	}

}
