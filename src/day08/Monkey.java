package day08;

public class Monkey extends Mammalia {
	
	Monkey(){
		eye = 2;
		nose =1;
		ear =2;
		name = "���̼���";
		species = "�Ȱ������";
	}
	
	@Override
	public void eating() {
		System.out.println("�ٳ����� �Ծ��");
	}
	@Override
	public void sleeping() {
		System.out.println("���������� �ڿ�");
	}

	public void climbing() {
		System.out.println("�������� �پ��");
	
	}	
}
