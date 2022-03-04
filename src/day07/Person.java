package day07; // Person 설계도!

public class Person {
	 // 멤버변수
	String name; 
	 int age;
	 int eye; 
	 int nose; 
	 int mouth;
	 String gender; 
	 String job;
     char ch;
	
	//기본생성자
	//생략되었지만 defalut임 ->이 생성자는 같은 패키지내에서만 공유할거야 => 다른 패키지에서 접근가능 예)day07 TestMain4 class
	public Person(){
		name = "홍길동";
		age = 20;
		System.out.println("person클래스의 기본생성자");
	}		
	public Person(String name) {
		this();
		this.name = name;
		System.out.println("person 클래스의 String 매개변수 생성자");
	}
	
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}
	
	
	void eating(){
		System.out.println("와그작");
	}
	void sleeping(){
		System.out.println("쿨쿨");
	}
	void thinking(){
		System.out.println("멍~~");
	}
}
