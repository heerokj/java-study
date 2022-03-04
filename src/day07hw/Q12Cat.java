package day07hw; //12. Animal 클래스를 상속받은 Cat 클래스를 작성

//조건1 : 멤버변수 : kind 
//조건2 : 다양한 매개변수있는 생성자를 작성한다.

public class Q12Cat extends Q11Animal {

	String kind, species;

	Q12Cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
				
		System.out.println("이름은 "+name+"이에요");
		System.out.println("나이는 "+age+"살 이에요");
		
	}

}
