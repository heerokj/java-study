package day01;

// 3. shift������

//����� ����� �׳� ��������� * �� / ���°� ���ϰ� ������ ����
//�׷��� ��ǻ�Ͱ� ���⿡�� shift �����ڰ� ������ ����
//���α׷��� �������� ���ƾ� �ؼ� �Ϲ������δ� �� �Ⱦ���
//���Ӱ� ���� ���� ������ �켱���� �ϴ� �ý��� ������ ���� �����
//���ÿ� �� ��������

public abstract class OperEx3 {

	public static void main(String[] args) {
	
		byte b = 10;
		System.out.println("b>>2 : " +(b>>2));
		System.out.println("b<<2 : " +(b<<2));
		//>> ���������� �а� �����ڸ��� 0���� ��ü
		//>>> ���������� �а� ���� �ڸ��� ��ȣ�� ������ ��ü
		
		byte b2 = 20;
		System.out.println("b2>>2 : " +(b2>>2));
		System.out.println("b2<<2 : " +(b2<<2)); 

		System.out.println("b2>>3 : " +(b2>>3)); 
		System.out.println("b2<<3 : " +(b2<<3)); 
		//��� 2�� n�� �����ų�(>>) ������(<<)
		
	}

}
