package day01;
//1. 증감?��?��?�� : ++, --
public class OperEx1 {
	public static void main(String[]args){
	
//		?�� ctrl + / : 주석처리
	int a = 100;
	int b = 10;

	a= a+1; //a?��1?��?��?�� ?��쪽a?�� ???�� 
	b=a; // a�? b?�� ???��
	//	?��?�� ?���? b = a++; ?�� 같음
	System.out.println("a :" + a + ", b:" +b);
	
	 b=a; // a(101)�? b?�� ???��
	 a=a+1; //a(101)?�� 1 ?��?���? b?�� ???�� -> 결국 a?�� 102 ,b?�� 101
	 // ?��?�� ?���? b = a++; ?�� 같음
	 System.out.println("a :" + a + ", b:" +b);
	 
	 //int ?��?��?�� ?��료형?���? ?��?��?���? 결과?�� int
	 
	System.out.println(a+b);
	System.out.println("a+b:"+ a +b); //문자?�� + 문자?�� �? 출력?��
	System.out.println("a+b:"+ (a+b)); //()?�� 먼�? 계산 ?�� 출력
	

 }
		
}
//0?��?��?��?��?�� : ( ) , .(dot)