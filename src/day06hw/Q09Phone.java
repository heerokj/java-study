package day06hw;

public class Q09Phone {

	String ����, ������, ��ȭ��ȣ, ������;
	int ����;

	
	Q09Phone(String ����, String ������, int ����, String ��ȭ��ȣ) {
		this.���� = ����;
		this.������ = ������;
		this.���� = ����;
		this.��ȭ��ȣ = ��ȭ��ȣ;
	}

	Q09Phone(String ����, String ������, String ��ȭ��ȣ) {
		this.���� = ����;
		this.������ = ������;
		this.��ȭ��ȣ = ��ȭ��ȣ;
	}

	Q09Phone(String ����, String ������, String ������, String ��ȭ��ȣ) {
		this.���� = ����;
		this.������ = ������;
		this.������ = ������;
		this.��ȭ��ȣ = ��ȭ��ȣ;
	}

	
	void status() {
	 	System.out.println(����);
	 	System.out.println(������);
	 	System.out.println(��ȭ��ȣ);
	 	System.out.println(������);
	 	System.out.println(����);
	
	}
	
}
