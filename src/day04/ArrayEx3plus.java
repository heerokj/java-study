package day04;

public class ArrayEx3plus {
	public static void main(String[] args) {
		
		//1. int a 배열 초기값 : 10,50,30,40,60
		int [] a = {10,50,30,40,60};
		
		//2. int b 배열 초기값 : 10,50,30,40,60
		int [] b = {10,50,30,40,60};
		
		//3. int c 배열 5칸짜리 
		int [] c = new int[5];
		
		//4. c배열에 a+b대입 : 30,60,120,160,220
		//a[0] = a[0]+b[0]
		//...
		
		for(int i=0; i<c.length; i++) {
			c[i] = a[i]+b[i];
			//5. c배열 요소를 출력
			System.out.println( "c["+i+"] : "+c[i]);
		}
	}

}
