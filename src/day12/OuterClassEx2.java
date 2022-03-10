package day12;
//2. static Inner Class
public class OuterClassEx2 {

	private int a = 10; 
	static int b = 20;
	static final int c = 30;
	
	//스테틱한변수처럼 클래스가 존재
	static class InnerClass2{
		int d =40;
		static int e = 50;  
		static final int f = 60;
		void print(){
//			System.out.println(a); =>아우터클래스가 new해야만하는 변수는 올수없음 /프라이빗라서가 아니라 
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			System.out.println(e);
			System.out.println(f);
	}
	
}
	public static void main(String[] args) {
		System.out.println(OuterClassEx2.b);
		
		InnerClass2 ic = new InnerClass2(); //독립적인 클래스처럼 단독으로 가능( 스태딕 변수처럼)
		ic.print();
	}
}