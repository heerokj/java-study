package day12;
//Inner Class�� ����
//1. Member Inner Class
public class OuterClassEx1 {

	private int a = 10;
	static int b = 20;
	static final int c = 30;
	
	class InnerClass{ //�̳�Ŭ������ �ƿ���Ŭ������ private�������� ���ٰ���
		int d =40;
//		static int e = 50;  => �ȵ�
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
		//InnerClass �� �ܵ����� ���ٰ��� �ȵ� 
		//OuterClass new����� ���ٰ���
	
		
		
//�̰��� �⺻				
//		OuterClassEx1 oce = new OuterClassEx1();
//		System.out.println(oce.a);
//		System.out.println(oce.b);
//		System.out.println(oce.c);
     
		
//�Ʒ��� ���� - ����ƽ�� new���� ����
//		System.out.println(OuterClassEx1.b);
//		System.out.println(OuterClassEx1.c);
		
	}
}

