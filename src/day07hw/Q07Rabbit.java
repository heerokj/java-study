package day07hw; //Q07.  �Ʒ��� 3���� Ŭ������ �����ϼ���
                 //(�޼��� ȣ��� ������ �޼����� ��µǵ��� �ۼ����ּ���)
public class Q07Rabbit {

	int eye, nose, ear;
	String name, epecies;
	
	Q07Rabbit(){
		eye = 1; 
		nose =2;
		ear = 3;
		name = "���䳢";
	}
	
	public void eating(String it) {
		System.out.println(it+"�� �Ծ��");
	}
	public void sleeping() {
		System.out.println("���ٻ��� ���� �ڿ�");
	}
	public void jumping() {
		System.out.println("���ѱ��� �پ��");
	}	
	
}
