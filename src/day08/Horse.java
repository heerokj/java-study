package day08;
//����Ŭ������ �Ƿ���

public class Horse extends Mammalia{
	
	public Horse(){
		eye = 2;
		nose =1;
		ear =2;
		name = "����";
		species = "���丶";
	}
	
	
	public void run() {
		System.out.println("�޷�~~~");
	}


	@Override
	public void eating() {
		System.out.println("���̴� Ǯ�Ծ��");
		
	}
	
	@Override
	public void sleeping() { 
		System.out.println("���̴� ��ٴڿ��� �ڿ�");
	}
	
	
	
}
