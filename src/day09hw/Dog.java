package day09hw;

public class Dog extends Q01Animal implements Barkable{

	String kind;

	Dog() {
		kind = "Ǫ��";
		System.out.println("�ڽ�Ŭ����Q03Dog �⺻������");
	}

	@Override
	public void barkSound() {
		System.out.println("�۸�");
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
