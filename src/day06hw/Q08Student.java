package day06hw;

public class Q08Student {

	int ��ȣ, ����, ����, ����;
	String �̸�;
		
	
	Q08Student(int ��ȣ, String �̸�, int ����, int ����, int ����){
		this.��ȣ = ��ȣ;
		this.�̸� = �̸�;
		this.���� = ����;
		this.���� = ����;
		this.���� = ����;
		System.out.println("��ȣ �̸� ���� ���� ���� ����� ������ ȣ��");
		
	}
	
	void printSum(){
		System.out.println("���� :" +(����+����+����));
	}
	
	void printAvg() {
		System.out.println("��� : "+(����+����+����)/3);
	}
	
	void ���º���() {
		System.out.println(��ȣ+","+�̸�+","+����+","+����+","+����);
	}
	
}
