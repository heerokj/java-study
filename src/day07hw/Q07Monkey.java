package day07hw;

public class Q07Monkey {

	int eye, nose, ear;
	String name, epecies;
 
	Q07Monkey() {
		name = "��Ű";
		epecies = "����������";
		eye = 2;
		nose = 1;
		ear = 1;
	}

	
	public void eating(String it) {
		System.out.println(it + "�� �Ծ��");
	}

	public void sleeping() {
		System.out.println("���� ���� �ڿ�");
	}

	public void climbing() {
		System.out.println("������ Ÿ��");
	}
}
