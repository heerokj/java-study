package day04;

public class ArrayEx8 {

	public static void main(String[] args) {
		
		//1. 1부터 45의 값을 갖는 배열 rnd를 선언한다. 선언과 동시에 초기화
		int[] rnd = {
				1,2,3,4,5,6,7,8,9,10,
				11,12,13,14,15,16,17,18,19,20,
				21,22,23,24,25,26,27,28,29,30,
				31,32,33,34,35,36,37,38,39,40,
				41,42,43,44,45
		}; //for문 써도 ok
			
		
		
		//2. 랜덤하게 정수하나를 생성한다.	
		// System.out.println(Math.random());  
		//0*45<Math.random()*45<1*45  //정수아님  
		
		//System.out.println(Math.random()*45);                  
		
		//랜덤은 더블타입을 반환하고 정수 int는 __비트 따라서 형변환필요  
		//System.out.println((int)Math.random()*45); 
		//0나옴 왜?=> (int)는 ()때문에 연산자 취급됨. => ()부터 진행
		 	
		//System.out.println((int)(Math.random()*45));// => good  // 0~44까지의 정수
	
		int a = (int)(Math.random()*45); 
		int b = (int)(Math.random()*45);
		System.out.println("a : "+a+","+"b = "+b);
		
		
		//a,b의 값을 index로 하는 배열의 값을 출력
		System.out.println("rnd[" +a+ "] :"+ rnd[a]);  //rnd[3] :4
		System.out.println("rnd[" +b+ "] :"+ rnd[b]);  //rnd[8] :9
		
		
		
		//수배열의 요소값을 자리바꿈
		
		int temp = rnd[a];
		rnd[a] = rnd[b];
		rnd[b] = temp; 
	
		System.out.println("rnd[" +a+ "] :"+ rnd[a]); //rnd[3] :9
		System.out.println("rnd[" +b+ "] :"+ rnd[b]); //rnd[8] :4
		
	}
		
}


