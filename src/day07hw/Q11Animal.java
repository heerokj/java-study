package day07hw; //11. Animal Ŭ������ �ۼ��Ѵ�.

public class Q11Animal {

	String name;
	int age;
	

	void eating(String it) {
		System.out.println(it + "�� �Ծ��");
	}
	void sleeping() {
		System.out.println("������");
	}

	public static void main(String[] args) {
		Q11Animal a = new Q11Animal();

		a.eating("name");
		a.sleeping();
	}
}
