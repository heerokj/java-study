package day08hw;

public class Q02Cat extends Q01Animal{

	String kind;
	
	Q02Cat(){	
		kind = "���þȺ��";
		System.out.println("�ڽ�Ŭ����Q02Cat �⺻������");
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
