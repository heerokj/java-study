package day07hw;

public class Q15Dog {

	String name, species;
	int age, 기분상태, 애교부리기, 달리기속도, 배변활동;

	Q15Dog() {
		name = "미미";
		species = "샤모예드";
		age = 2;
		기분상태 =0;
		달리기속도 = 0;
		애교부리기 = 5;
		배변활동 =5;		
	}		

	Q15Dog(String name, String species, int age){
		this();
		this.name = name;
		this.species = species;
		this.age = 4;
	}
	
	
	void walking() {
		System.out.println("산책하기 폴짝폴짝");
		기분상태 += 10;
		달리기속도 +=2;
		애교부리기 +=3;
	}
	
	void eating(String it) {
		System.out.println("냠냠 "+it + "먹기");
		기분상태 +=7;
		애교부리기 = 3;
		배변활동 =5;
	}
	
	void sleeping() {
		System.out.println("새근새근 잠자기");
		기분상태 += 2;
	}

	
	void status() {
		System.out.println("-----상태-----");
		System.out.println("이름 : "+name);
		System.out.println("종 : "+species);
		System.out.println("나이 : "+age);
		System.out.println("기분상태 : "+기분상태);
		System.out.println("달리기속도 : "+달리기속도);
		System.out.println("애교부리기 : "+애교부리기);
		System.out.println("배변활동 : "+배변활동);
		System.out.println();
		
	}
}
