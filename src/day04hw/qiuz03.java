package day04hw; // 사용자로부터 값을 입력받아 총점과 평균을 출력하는 코드를 작성 (단 배열을 사용) 
//??
import java.util.Scanner;

public class qiuz03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력하시오 : "); 
		int a = sc.nextInt();
		System.out.print("입력하시오 : "); 
		int b = sc.nextInt();
		System.out.print("입력하시오 : "); 
		int c = sc.nextInt();
		System.out.print("입력하시오 : "); 
		int d = sc.nextInt();
		System.out.print("입력하시오 : "); 
		int e = sc.nextInt();
		System.out.print("입력하시오 : "); 
		int f = sc.nextInt();
		System.out.print("입력하시오 : "); 
		int g = sc.nextInt();
		System.out.print("입력하시오 : "); 
		int h = sc.nextInt();
		System.out.print("입력하시오 : "); 
		int i = sc.nextInt();
		System.out.print("입력하시오 : "); 
		int j = sc.nextInt();
		
		int sum = a+b+c+d+e+f+g+h+i+j;
		System.out.println("총점 : "+ sum );
		System.out.println("평균 : "+ sum/10);

	}

}
