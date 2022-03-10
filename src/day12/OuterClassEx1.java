package day12;
//Inner Class의 종류
//1. Member Inner Class
public class OuterClassEx1 {

	private int a = 10;
	static int b = 20;
	static final int c = 30;
	
	class InnerClass{ //이너클래스는 아우터클래스의 private변수에도 접근가능
		int d =40;
//		static int e = 50;  => 안됨
		static final int f = 60;
		void print(){
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
//			System.out.println(e);
			System.out.println(f);
			
		}
	}

	public static void main(String[] args) {
		
		OuterClassEx1 oce = new OuterClassEx1();
		System.out.println(oce.a);
		
	    //+++++	
		OuterClassEx1.InnerClass ic = oce.new InnerClass();
		ic.print();
		//InnerClass 는 단독으로 접근가능 안됨 
		//OuterClass new해줘야 접근가능
	
		
		
//이것이 기본				
//		OuterClassEx1 oce = new OuterClassEx1();
//		System.out.println(oce.a);
//		System.out.println(oce.b);
//		System.out.println(oce.c);
     
		
//아래도 가능 - 스테틱은 new없이 가능
//		System.out.println(OuterClassEx1.b);
//		System.out.println(OuterClassEx1.c);
		
	}
}

