package day08hw;

public class Q06Friend extends Q07Man {

	String job;


	Q06Friend(String name, int age, String job){
		this.age = age;
		this.name = name;
		this.job = job;		
	}	

	@Override
	public void showInfo() {
		System.out.printf("%s�� %d���̸� %s�Դϴ�.", name, age, job);
		System.out.println();
		System.out.println(name + "�� " + age + "�̸� " + job + "�Դϴ�.");		
	}

	public void showName() {
		System.out.println("�̸� : " + name);
	}
}
