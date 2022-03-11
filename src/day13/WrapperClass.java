package day13; 

public class WrapperClass {
	public static void main(String[] args) {

		//Wrapper Class
		//primitive type(�⺻Ÿ��)�� ���� ==> ��ü�� ��ȯ�ϱ� ���� Ŭ����
		 
		//int ==> Integer, byte==> Byte ���� �������� �̸� ���Ǿ�����
		
		//int�� �ִ밪, �ּҰ��� ���
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
			
		Integer it1 = new Integer(10); //�ڽ�
		int b = it1.intValue(); //��ڽ�
		System.out.println(b); //10
		System.out.println("---------------");
		
		//boxing
		//Integer �� Ŭ����. Ŭ������ new�ؼ� ��ü������� �����
		//�׷��� Wrapper Ŭ������ primitive type�� ������ ������ �ֱ⋚����
		//String ó�� new���ϰ� �ٷ� ���� ������ �� �ְ� ����(�ڹ� 4����)
		
		Integer it2 =20; //Integer it2 = new Integer(20);�� ����
		
		
		//unboxing
		//�ݴ�� �޼��� �Ⱦ��� ������ �ٷ� ��ü ��°͵� �����ϰ���
		int c = it2; // int c = it2.intValue(); �� ����
		System.out.println(c); //20
		
		
		//Integer�� long���� ����ȯ
		long d = it2.longValue();
		
		//10�� 2������ ��ȯ�� �� String ������ ����ȯ�Ͽ� String�� ������ ����
		String bin = Integer.toBinaryString(10);
		System.out.println(bin); // 1010(10�� 2����) 

		int e = Integer.parseInt("300");
		System.out.println(++e); //301
		
		// byte 127���� Wrapper Class b1���� �ٷ� ����
		Byte b1 = 127;
		// �� ���� long������ ����ȯ
		long f = b1.longValue();
		// ȭ�鿡 ���
		System.out.println(f);
		

	}

}
