package day02; 

import java.util.Scanner; // 스캐너 클래스 호출

public class StatementTest10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); //스캐너 객체 생성
		// 스캐너 1개
		System.out.println("국어점수입력 : ");
		// 다음값 읽기
		int kor = sc.nextInt();
		// 다음 
		System.out.println("영어점수입력 : ");
		int eng = sc.nextInt();

		System.out.println("수학점수입력 : ");
		int mat = sc.nextInt();

		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + mat);

	}

}
