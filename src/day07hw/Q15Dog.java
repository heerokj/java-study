package day07hw;

public class Q15Dog {

	String name, species;
	int age, ��л���, �ֱ��θ���, �޸���ӵ�, �躯Ȱ��;

	Q15Dog() {
		name = "�̹�";
		species = "���𿹵�";
		age = 2;
		��л��� =0;
		�޸���ӵ� = 0;
		�ֱ��θ��� = 5;
		�躯Ȱ�� =5;		
	}		

	Q15Dog(String name, String species, int age){
		this();
		this.name = name;
		this.species = species;
		this.age = 4;
	}
	
	
	void walking() {
		System.out.println("��å�ϱ� ��¦��¦");
		��л��� += 10;
		�޸���ӵ� +=2;
		�ֱ��θ��� +=3;
	}
	
	void eating(String it) {
		System.out.println("�ȳ� "+it + "�Ա�");
		��л��� +=7;
		�ֱ��θ��� = 3;
		�躯Ȱ�� =5;
	}
	
	void sleeping() {
		System.out.println("���ٻ��� ���ڱ�");
		��л��� += 2;
	}

	
	void status() {
		System.out.println("-----����-----");
		System.out.println("�̸� : "+name);
		System.out.println("�� : "+species);
		System.out.println("���� : "+age);
		System.out.println("��л��� : "+��л���);
		System.out.println("�޸���ӵ� : "+�޸���ӵ�);
		System.out.println("�ֱ��θ��� : "+�ֱ��θ���);
		System.out.println("�躯Ȱ�� : "+�躯Ȱ��);
		System.out.println();
		
	}
}
