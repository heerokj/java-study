package day01;
//1. μ¦κ°?°?°? : ++, --
public class OperEx1 {
	public static void main(String[]args){
	
//		?€ ctrl + / : μ£Όμμ²λ¦¬
	int a = 100;
	int b = 10;

	a= a+1; //a?1???¬ ?Όμͺ½a? ??? 
	b=a; // aλ₯? b? ???
	//	?? ?κ³? b = a++; ? κ°μ
	System.out.println("a :" + a + ", b:" +b);
	
	 b=a; // a(101)λ₯? b? ???
	 a=a+1; //a(101)? 1 ??κ³? b? ??? -> κ²°κ΅­ a? 102 ,b? 101
	 // ?? ?κ³? b = a++; ? κ°μ
	 System.out.println("a :" + a + ", b:" +b);
	 
	 //int ?΄?? ?λ£ν?Όλ¦? ?°?°?λ©? κ²°κ³Ό? int
	 
	System.out.println(a+b);
	System.out.println("a+b:"+ a +b); //λ¬Έμ?΄ + λ¬Έμ?΄ λ‘? μΆλ ₯?¨
	System.out.println("a+b:"+ (a+b)); //()? λ¨Όμ? κ³μ° ? μΆλ ₯
	

 }
		
}
//0???°?°? : ( ) , .(dot)