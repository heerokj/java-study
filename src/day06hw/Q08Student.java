package day06hw;

public class Q08Student {

	int 번호, 국어, 영어, 수학;
	String 이름;
		
	
	Q08Student(int 번호, String 이름, int 국어, int 영어, int 수학){
		this.번호 = 번호;
		this.이름 = 이름;
		this.국어 = 국어;
		this.영어 = 영어;
		this.수학 = 수학;
		System.out.println("번호 이름 국어 영어 수학 순대로 생성자 호출");
		
	}
	
	void printSum(){
		System.out.println("총점 :" +(국어+영어+수학));
	}
	
	void printAvg() {
		System.out.println("평균 : "+(국어+영어+수학)/3);
	}
	
	void 상태보기() {
		System.out.println(번호+","+이름+","+국어+","+영어+","+수학);
	}
	
}
