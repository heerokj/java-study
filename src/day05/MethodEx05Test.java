package day05; // method Overloading / ok

public class MethodEx05Test {

	static int plus(int a, int b) { // ���� �޼ҵ� �ȿ��ִº����� �ٸ��� !
		int c = 0;
		c = a + b;
		return c;
	}
	static float plus(float a, int b) {
		float c = 0;
		c = a + b; // �̶��� +�� ���������
		return c;
	}
	static String plus(String a, String b) {
		return a + b; // ��Ʈ���϶� �̶��� +�� ���Ῥ����
	}

	
	
	
	public static void main(String[] args) {

		int a = 100;
		int b = 200;
		int result1 = plus(a, b);
		System.out.println("a : " + a); // �� �����غ� �Ŀ� �����ϱ� => ok

		float result2 = plus(100.0f, b);

		String result3 = plus("������", "������");

		System.out.println("------------");
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);

	}

}
