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
		System.out.printf("%s는 %d살이며 %s입니다.", name, age, job);
		System.out.println();
		System.out.println(name + "는 " + age + "이며 " + job + "입니다.");		
	}

	public void showName() {
		System.out.println("이름 : " + name);
	}
}
