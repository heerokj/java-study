package day08hw;

public class Q03Dog extends Q01Animal {

	String kind;

	Q03Dog() {
		kind = "Ǫ��";
		System.out.println("�ڽ�Ŭ����Q03Dog �⺻������");
	}

	@Override
	public void eating(String name) {
		System.out.println(name + " �� �Ծ��");
	}

	@Override
	public void sleeping() {
		System.out.println("zzz �������� �ڿ�");
	}

}
