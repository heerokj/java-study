package day05;

public class MethodEx02 {
	
// static �����Ұ����ڷ��� �޼����	(�ڷ���  �Ű�������, �ڷ���  �Ű�������, ...){
//	       �ڵ�1;
	
//	return ��;
//	 
//	void : �� �ż��带 ������ �� ȣ���� ������ �ƹ����� ������ �ʿ����. �� ������ ���� ������=> �����Ұ����ڷ������� void����
		              
	static int hap(int a, int b) { // �θ����� ����, �ڷ��� ��� �¾ƾ� ��Ȯ�ϰ� ȣ���� �� ���� / ()���̿� ������ ������ ��밡��
		System.out.println("a :" + a + ", b :" + b);
		int c = a + b;
		return c; //�� ȣ���� ������ �� ���� ������ ���ư�! ������ ���� �ִٸ� �� ���ֱ�
	} 
	
	static int minus(int a, int b) {   //���⼭ int�� �����Ұ��� �ڷ���
		int c = a - b; // 100�� c ������ ����
		return c;
	}	    //c�� ���ϰ�! ������� c�� ������

	static int max(int a, int b) {
		if(a > b) {
			return a;  //System.out.println(a); ��������  	  
		}else {
			return b;
		}	
	}
	
	static int max(int a, float b) {  
		if(a>b) {
			return a;
		}else {
			return (int)b;  //�����Ұ��� �ڷ��� : int / b�� floatŸ������ ����ȯ ������ߵ�
		}
	}
	
	static int sum(int a, int b, int c) {	
		//int result = a+b+c;
		return a=b+c;
	}
	 
	static int sum(int a, int b, int c, int d) {
		return a+b+c+d;
	}
	
	static float sum( int a, float b, int c) {
		return a+b+c;
	}
	
	//�޼ҵ嵵 �̸��̰��ٸ� �޼ҵ� �ñ״��ķ� �����Ѵ� (�Ű����� ����, �ڷ��� ���)
	//method signature{
	//   method body
	// }
	
	//method overloading
	//��������
	//��� : �޼������ ���� (�Ű������� ����, ����, Ÿ���� �ٸ���)
	
	public static void main(String[] args) {
		int result = hap(100,200);
		System.out.println(result);   //result : 300
						
		int result2 = minus(300,200);
		System.out.println(result2);
		
		int result3 = max(100,200);
		System.out.println(result3); //result3 : 200
		
		int result4 = max(100,200.0f);
		System.out.println(result4);
		
		int result5 = sum(100,200,300);
		System.out.println(result5); //result5 : 600
		
		int x1 =100; int x2 =100; int x3 =100; int x4 =100;
		int result6 = sum(x1,x2,x3,x4);
		System.out.println(result6); //result6 : 1000
		
		float result7 = sum(100,200.0f,300);
		System.out.println(result7); //result7 : 600.0
	}
	
}

