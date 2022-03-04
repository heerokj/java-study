package day02;
//java.util 패키지 안에 Scanner 클래스가 다음과 같이 import 를 쓴 후 해당 클래스 경로를 호출
import java.util.Scanner; //scanner 클래스 호출

//스캐너 - 단점은 아스키코드 값 못 읽음
public class StatementEx7 {

	public static void main(String[] args) {

		System.out.println("성적 입력 :");
		
		Scanner sc = new Scanner(System.in); // 스캐너 객체 생성
		int score = sc.nextInt(); // 정수값 읽어오기

		System.out.println("score :" + score);

		
		
		if (score >= 90) {
			System.out.println("학점 : A");
		} else if (score >= 80) {
			System.out.println("학점 : B");
		} else if (score >= 70) {
			System.out.println("학점 : C");
		} else if (score >= 60) {
			System.out.println("학점 : D");
		} else {
			System.out.println("학점 : E");
		}
		
		System.out.println("---다른 스타일로 출력함---");
		
		String grade = "";
		if (score >= 90) {
			grade  = "a";
		} else if (score >= 80) {
			grade  = "b";
		} else if (score >= 70) {
			grade  = "c";
		} else if (score >= 60) {
			grade  = "d";
		} else {
			grade  = "e";
		}
		System.out.println("당신의 점수는 " + score + "점 학점 : " +grade);
			
		
	}

}
