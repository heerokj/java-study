package day08;

public class Rabbit extends Mammalia {

	Rabbit(){
		eye = 2;
		nose =1;
		ear =2;
		name = "�䳩��";
		species = "�Ӱ��";
	}
	
	@Override
	public void eating() {
		System.out.println("����� �Ծ��");
	}
	@Override
	public void sleeping() { 
		System.out.println("Ǯ������ �ڿ�");
	}

	public void jumping() {
		System.out.println("��¦��¦ �پ��");
		
	}
}
