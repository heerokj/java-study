package day07; // Person ���赵!

public class Person {
	 // �������
	String name; 
	 int age;
	 int eye; 
	 int nose; 
	 int mouth;
	 String gender; 
	 String job;
     char ch;
	
	//�⺻������
	//�����Ǿ����� defalut�� ->�� �����ڴ� ���� ��Ű���������� �����Ұž� => �ٸ� ��Ű������ ���ٰ��� ��)day07 TestMain4 class
	public Person(){
		name = "ȫ�浿";
		age = 20;
		System.out.println("personŬ������ �⺻������");
	}		
	public Person(String name) {
		this();
		this.name = name;
		System.out.println("person Ŭ������ String �Ű����� ������");
	}
	
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}
	
	
	void eating(){
		System.out.println("�ͱ���");
	}
	void sleeping(){
		System.out.println("����");
	}
	void thinking(){
		System.out.println("��~~");
	}
}
