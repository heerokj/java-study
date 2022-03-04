package day06; // Person 설계도!

public class Person {
	
	public int 나이;
	public int 눈; 
	public int 코; 
	public int 입;
	public String 이름; 
	public String 성별; 
	public String 직업;

	
	
	//생략되었지만 defalut임 ->이 생성자는 같은 패키지내에서만 고유할거야 => 다른 패키지에서 접근가능 예)day07 TestMain4 class
	public Person(){
		이름 = "홍길동";
		나이 = 20;
	}
		
	public void setAge(int age) {
		this.나이 = age;
	}
	
	public int getAge() {
		return this.나이;
	}
	
	
	
	
	void 먹기(){
		System.out.println("와그작");
	}
	void 자기(){
		System.out.println("쿨쿨");
	}
	void 생각하기(){
		System.out.println("멍~~");
	}
}
