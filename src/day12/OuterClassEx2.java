package day12;
//2. static Inner Class
public class OuterClassEx2 {

	private int a = 10; 
	static int b = 20;
	static final int c = 30;
	
	//����ƽ�Ѻ���ó�� Ŭ������ ����
	static class InnerClass2{
		int d =40;
		static int e = 50;  
		static final int f = 60;
		void print(){
//			System.out.println(a); =>�ƿ���Ŭ������ new�ؾ߸��ϴ� ������ �ü����� /�����̺��󼭰� �ƴ϶� 
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			System.out.println(e);
			System.out.println(f);
	}
	
}
	public static void main(String[] args) {
		System.out.println(OuterClassEx2.b);
		
		InnerClass2 ic = new InnerClass2(); //�������� Ŭ����ó�� �ܵ����� ����( ���µ� ����ó��)
		ic.print();
	}
}