package day09hw2;
//(1) A objA = new A(); ��ü�� �����ϰ� �̶� �����Ǵ�  ������ ��� ����ϼ��� 
//(2) B objB = new B(); ��ü�� �����ϰ� �̶� �����Ǵ�  ������ ��� ����ϼ��� 
//(3) C objC = new C(); ��ü�� �����ϰ� �̶� �����Ǵ�  ������ ��� ����ϼ��� 
public class Main {
	public static void main(String[] args) {
		
		A objA = new A();
		objA.set(1, 2);
				
		
		B objB = new B();
		int c = 3;
		int d = 4;
		System.out.println("c��d : "+c+","+d);
		
		C objC = new C();
		int e = 5;
		int f = 6;
		System.out.println("e��f : "+e+","+f);
		
	}
	
}


