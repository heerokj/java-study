package day07; 

public class Human { 
	
	String 이름, 직업, 성별, 전화번호;
	int 나이; 
		
	//초기생성자
	Human(){ 
		이름 = "홍홍홍";
		직업 = "프로그래머";
		성별 = "남";
		나이 = 20;
		전화번호 = "010-1111-2222";
		System.out.println("기본생성자"); //매개변수가 없는 생성자를 기본생성자 
	}
		
	
				 		
	Human(String 이름, int 나이, String 직업){ 
		this();
		this.이름 = 이름;    
		this.나이 = 나이;              
		this.직업 = 직업;  
		System.out.println("String int String 매개변수를 갖는 생성자");
	}
	
	
	Human(String name, int age, String gender, String job){
			이름 = name;                                 
			나이 = age;                                  
			성별 = gender;                              
			직업 =job;
			System.out.println("String int String String 매개변수를 갖는 생성자");
			}
		 

	Human(String name, String job, int age, String gender){ 
		this(name, age, gender);
//	    this.이름 = name;                                  
		this.직업 = job;                                     
//		this.나이 = age;
//		this.성별 = gender;                                   
		}
	
	
			
	Human(String 성별, String 이름, int 나이){   
		this.성별 = 성별;     
		this.이름 = 이름;              
		this.나이 = 나이;  
		System.out.println("성별 이름 나이 순서로 되어있는 생성자 호출");
	}
	
	
			
	//멤버 메소드	
	void 먹기() {
		System.out.println("냠냠 밥을 먹어요!");
	}
	void 말하기() {
		System.out.println("블라블라");
	}
	void 숨쉬기() {
		System.out.println("휴");
	}
	void status() {
		System.out.println("이름 : "+이름);
		System.out.println("직업 : "+직업);
		System.out.println("성별 : "+성별);
		System.out.println("나이 : "+나이);
		System.out.println("전화번호 : "+전화번호);
	}
	
}
