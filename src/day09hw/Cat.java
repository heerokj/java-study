package day09hw;

public class Cat extends Q01Animal implements Barkable{

	String kind;
	
	Cat(){	
		kind = "���þȺ��";
		System.out.println("�ڽ�Ŭ����Q02Cat �⺻������");
	}
	
	@Override
	public void barkSound() {
		System.out.println("�߿�");
	}
	
	@Override
	public void eating(String name) {
		System.out.println(name+" �� �Ծ��");
	}
	
	@Override
	public void sleeping() {
		System.out.println("zzzĹŸ������ �ڿ�");
	}
}