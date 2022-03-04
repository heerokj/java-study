package day05; //가변인자 ok

public class MethodEx06Test {
	// 좀 더 쓸모있는 메서드 만들기 /가변인자 지원
	static int avg(int...data) { // 갯수가 확정되있지않고 변할때 / ...쓰면 배열형식으로 넘어옴
		System.out.println(data); //참조값이 출력됨
		
		int sum =0;    
		for(int i=0; i<data.length; i++) {   //data이름의 배열만들어서 구하자..
			//sum = sum+ data[i];
			sum +=data[i];
		}
		return sum/data.length; 
	}
	
	
	public static void main(String[] args) {
			
		int result1 = avg(100,200);
		int result2 = avg(100,200,300);
		int result3 = avg(100,200,300,400);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);		
	}}
