package day02;

public class StatementEx3 {

	public static void main(String[] args) {
		
		//3단 출력
		
		//while(조건){
		//    문장1;
		//    문장2;
		//}
		//조건이 true면 문장들 실행
		
		int i =1; //초기식
		while(i<9) { 
			System.out.println("3*" +i+ "=" +(3*i)); //조건식
			i++; //증감식
		}
		
		System.out.println("-----------------------------");
		
		
		
		int j =1; //초기식
		do {
			System.out.println("3*" +j+ "=" +(3*j)); //일단 먼저 루프 한번 실행 후 조건식 검사
			j++; //증감식
		}while(j<=9); //조건식
		
	}

}
