package day09;

public class Test {
	static int no; //����ƽ����
	int no2;
	static { //++����ƽ �� : ��ü�ʱ�ȭ��� => ���� ȣ���++
		System.out.println("static block�� ���� ����");
		int a = 10;
		System.out.println("a : "+a);
	}
	Test(){
		System.out.println("�⺻������");
	}

	public static void show() { //����ƽ �޼���
		System.out.println("static method show()");
	}
	public void show2() {//�Ϲݸ޼���
		System.out.println("instance method show2()");
	}
}
