package day09hw2;
//(1) A objA = new A(); 객체를 생성하고 이때 생성되는  변수롤 모두 출력하세요 
//(2) B objB = new B(); 객체를 생성하고 이때 생성되는  변수롤 모두 출력하세요 
//(3) C objC = new C(); 객체를 생성하고 이때 생성되는  변수롤 모두 출력하세요 
public class Main {
	public static void main(String[] args) {
		
		A objA = new A();
		objA.set(1, 2);
				
		
		B objB = new B();
		int c = 3;
		int d = 4;
		System.out.println("c와d : "+c+","+d);
		
		C objC = new C();
		int e = 5;
		int f = 6;
		System.out.println("e와f : "+e+","+f);
		
	}
	
}


