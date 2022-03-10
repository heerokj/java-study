package day13; // ��������

public class ExceptionEx2 {
	
/*	static int plus(String x, String y) {
		int a = 0;
		int b = 0;
		try { // ���ܰ� �߻��� ������ try
			a = Integer.parseInt(x); // "10" ==> 10
			b = Integer.parseInt(y); // "20" ==> 20
		} catch (NumberFormatException e) {
			System.out.println("���������� �ùٸ��� �ʽ��ϴ�..Ȯ���ϼ���!!!");
		}
		return a + b; 
	}
*/
	
	//�� �޼��带 ����ϴ� ����� �ڽ��� ȯ�濡 �°� �� ���ܸ� ó���ϵ��� ���� 
	//=>�̰��� ó���ϴ� ����� ��½�(���θ޼ҵ忡��)����ϱ�
	static int plus(String x, String y) throws NumberFormatException{
		int a = 0;
		int b = 0;
		
		a = Integer.parseInt(x); // "10" ==> 10
		b = Integer.parseInt(y); // "20" ==> 20
		return a + b; 
	}
	
	
	
	public static void main(String[] args) {
		String a = "10a"; // ���ܹ߻�
		String b = "10";
		
		int result = 0;
		try {
			result = plus(a, b);
		}catch(NumberFormatException nfe) {
			System.out.println("���������� �ùٸ��� �ʽ��ϴ�..Ȯ���ϼ���!!!");
		}

		System.out.println("result " + result);
	}

}
