package day02;

public class StatementEx6 {

	public static void main(String[] args) {

		byte b1 = 10;
		short sh1 = 20;
		// byte b2 = b1+sh1; // -> 에러 int이하 자료형끼리 연산하면 결과는 int
		// byte b2 = (byte)(b1+sh1); //명시적변환
		int b2 = b1 + sh1;
		float f = b2;
		
		System.out.println("----------------------------");
		

		// 문제) 국어 영어 수학 점수의 총점과 평균을 출력
		// 총점 :
		// 평균 :

		int kor = 93;
		int eng = 90;
		int mat = 100;

		int tot = kor + eng + mat;
		// int avg = (kor+eng+mat)/3;
		System.out.println("총점 : " + tot);
		// System.out.println("평균 : "+avg); //값 71 ..평균인데 소수점이 안나와..정수형 변수이기 때문에

		// float avg = tot/3; // int랑 연산해서 이미 int값 그게 folat에 담김
		// int 나누기 float타입 하명 나머지 소수까지나옴
		float avg = tot / 3.0f;
		System.out.println("평균 : " + avg);

		// 평균 점수에 따른 학점 평가
		// 90이상이면 A , 80이상이면 B

		if (avg >= 90) {
			System.out.println("A학점");
		} else if (avg >= 80) {
			System.out.println("B학점");
		} else if (avg >= 70) {
			System.out.println("C학점");
		} else if (avg >= 60) {
			System.out.println("D학점");
		} else {
			System.out.println("F학점");
		}
	}

}
