package day08;

public class Whale extends Mammalia{
	
	Whale(){
		eye = 2;
		nose =1;
		ear =2;
		name = "���θ�";
		species = "����";
	}
	
	@Override
	public void eating() {
		System.out.println("���츦 �Ծ��");
	}
	@Override
	public void sleeping() { 
		System.out.println("���ӿ��� �ڿ�");
	}

	public void swmmining() {
		System.out.println("÷��÷�� �����ؿ�");
	
	}	
}
