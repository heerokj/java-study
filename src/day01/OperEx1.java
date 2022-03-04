package day01;
//1. ì¦ê°?—°?‚°? : ++, --
public class OperEx1 {
	public static void main(String[]args){
	
//		?¤ ctrl + / : ì£¼ì„ì²˜ë¦¬
	int a = 100;
	int b = 10;

	a= a+1; //a?—1?”?•˜?—¬ ?™¼ìª½a?— ???… 
	b=a; // aë¥? b?— ???…
	//	?œ„?— ?‹ê³? b = a++; ?‘ ê°™ìŒ
	System.out.println("a :" + a + ", b:" +b);
	
	 b=a; // a(101)ë¥? b?— ???…
	 a=a+1; //a(101)?— 1 ?”?•˜ê³? b?— ???… -> ê²°êµ­ a?Š” 102 ,b?Š” 101
	 // ?œ„?— ?‹ê³? b = a++; ?‘ ê°™ìŒ
	 System.out.println("a :" + a + ", b:" +b);
	 
	 //int ?´?•˜?˜ ?ë£Œí˜•?¼ë¦? ?—°?‚°?•˜ë©? ê²°ê³¼?Š” int
	 
	System.out.println(a+b);
	System.out.println("a+b:"+ a +b); //ë¬¸ì?—´ + ë¬¸ì?—´ ë¡? ì¶œë ¥?¨
	System.out.println("a+b:"+ (a+b)); //()?•ˆ ë¨¼ì? ê³„ì‚° ?›„ ì¶œë ¥
	

 }
		
}
//0?ˆœ?œ„?—°?‚°? : ( ) , .(dot)