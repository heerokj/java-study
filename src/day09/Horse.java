package day09;
//����Ŭ������ �Ƿ���
//��� �޼��尡 �����Ǿ� �־�� �Ѵ�.
public class Horse extends Mammalia implements Flyable{
	
	public Horse(){
		eye = 2;
		nose =1;
		ear =2;
		name = "����";
		species = "���丶";
	}
	
	@Override	
	public void fly() {
		System.out.println("�޷� ���ƿ�");
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
