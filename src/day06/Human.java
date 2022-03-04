package day06; 

public class Human { 
	//멤버 변수
	String 이름, 직업, 성별, 전화번호; //String형 멤버변수 이,직,성,전 생성
	int 나이; //int형 멤버변수 나이 생성
	
	
	//다양한 매개변수를 갖는 생성자 
	
	
	//초기생성자
	Human(){ 
		이름 = "홍홍홍";
		직업 = "프로그래머";
		성별 = "남";
		나이 = 20;
		전화번호 = "010-1111-2222";
		System.out.println("기본생성자"); //매개변수가 없는 생성자를 기본생성자 
	}
	
	

	// name, age, gender, job는 지역변수 생성자가 끝나면 사라짐
	Human(String name, int age, String gender, String job){//스트링형 매개변수인 name, 인트형 매개변수 age, 
			이름 = name;                                 // 스트링형 매개변수 job, 스트링형 매개변수 gender를 갖는 생성자
			나이 = age;                                  //이 생성자를 main메서드에서 호출하면 
			성별 = gender;                                //나이=age값, 이름=name값, 직업=job값, 성별은 gender값을 기본값으로 가짐.
			직업 =job;
			System.out.println("String int String String 매개변수를 갖는 생성자");
			}
		 
	
//✔✔
//	 Human(String 성별, String 이름, int 나이){
//	 멤버변수 = 지역변수;  => 멤버변수와 지역변수 이름이 같아서 이클립스는 둘다 멤버변수로 인식함 =>null이나 0을 가져옴
//	 성별 = 성별;     //어떻게 해줄까? 
//	 이름 = 이름;     // 1. 이름다르게 한다.          
//	 나이 = 나이;     // 2. this 사용해서 멤버변수를 지칭 /자기자신을 가리키는 참조변수
//   }
//
	

	Human(String 성별, String 이름, int 나이){  //스트링형 매개변수 성별, 스트링형 매개변수 이름, 인트형 매개변수 나이 갖는 생성자
		//멤버변수 = 지역변수;  
		this.성별 = 성별;     //멤버변수 지칭할때 this.변수명으로!
		this.이름 = 이름;              
		this.나이 = 나이;  
		System.out.println("성별 이름 나이 순서로 되어있는 생성자 호출");
	}
	
	  //위 아래는 다른 생성자이다.==> 자료형 , 순서 등이 다르기 때문에
	
	Human(String 이름, int 나이, String 직업){  //스트링형 매개변수 이름, 인트형 매개변수 나이, 스트링형 매개변수 직업 갖는 생성자
		this.이름 = 이름;    
		this.나이 = 나이;              
		this.직업 = 직업;  
		System.out.println("String int String 매개변수를 갖는 생성자");
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
	void 상태보기() {
		System.out.println("이름 : "+이름);
		System.out.println("직업 : "+직업);
		System.out.println("성별 : "+성별);
		System.out.println("나이 : "+나이);
		System.out.println("전화번호 : "+전화번호);
	}
	
	
	
}
