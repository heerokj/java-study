package day04;
//배열 :apt 변수
//동일한 사이즈에 연속된 공간에 할당되는 변수
public class ArrayEx1basic {
	public static void main(String[] args) {
		
		//1. 변수를 100개를 선언하고    //자바는 변수를 선언하면 무조건 맨처음에는 초기화(값을 할당) 시켜야함
//		int a1 =0;
//		int a2 =0;
//		int a3 =0;
//		int a4 =0;
//		int a5 =0;
		//...
//		int a100 =0;
		
		//2. 1부터 100까지 값을 할당하고
//		a1=1;
//		a2=2;
//		a3=3;
//		a4=4;
//		a5=5;
        //...
//		a100=100; 이렇게하면..일일이 다 써야함 
		

		//3. 이 변수를 출력
//		System.out.println("a1 : "+a1);
//	    ...
//		System.out.println("a100 : " + a100);
		System.out.println("---------------------------------------");
		
		
		
		//<변수>
		//자료형[] 변수명;
		//자료형  변수명[];
		
		
		int[] m; //32평 apt
		//int m[] 와 같음
		
		m = new int[3];  //예)3층짜리 apt 의미  /길이 3 / 0 ,1, 2번째 <==인덱스
		
		System.out.println("m : "+m); // heap에 있는 변수를 찾기위한 주소는
		                              //stack에 저장되어있음 (참조값들어있는것
	
		// 배열 결국 쓴느것은 반복문이용해서 줄여쓰기위함
		for(int i=0; i<3;i++) {
			m[i]= (i+1)*10; 
			System.out.println("m[" +i+ "] : " + m[i]); 
		}
//		m[0] = 10; 예)m아파트 0번호수에 10 대입
//		m[1] = 20;
//		m[2] = 30;   //[]안에있는거 : index
		
//		System.out.println("m[0] : "+m[0]);
//		System.out.println("m[1] : "+m[1]);
//		System.out.println("m[2] : "+m[2]);  /이렇게 하면 복잡하니깐 위에 for문처럼 사용가능
		
		
		
		
		
	}

}
