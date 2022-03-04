package day08;
//부모클래스 Parent
public class Parent {

	int age; 
	String name, job;

	Parent() {
		name = "홍길동";
		job = "도적"; 
		age = 22;
		System.out.println("Parent 기본생성자");
	}

	//String, int, String매개변수를 갖는 생성자
	Parent(String name, int age, String job) {
		this();
		this.age = age;
		this.job = job;
		this.name = name;
		System.out.println("String, int, String 매개변수있는 생성자");
	}

	//모두에게 접근가능하고 리턴값이 없는(void써야함) eating메서드
	public void eating() { // 호출되면 { }안 코드실행
		System.out.println("냠냠");
	}

	
	void singing() {  // 접근지정자 defalut
		System.out.println("워우어");
	}

	public void sleeping() {
		System.out.println("쿨쿨");
	}

	public void nagging() {
		System.out.println("잔소리어쩌구저쩌구");
	}
}
