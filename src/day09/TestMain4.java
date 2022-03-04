package day09;
//static변수, static method는
//static area에 로딩되는 변수,method

//new
public class TestMain4 {
		
	//public : 어디에서든 접근 가능한
	//static : 정적인
	//void : 리턴값이 없는
	//main : main 이름을 갖는 메서드
	//(String[] args) :String 배열을 매개변수로 갖는..
	public static void main(String[] args) {
		
		// +++++맨처음 인스턴스화 안해도 사용가능 		
//		System.out.println(SmartPhone.company); //null출력
//		SmartPhone.company = "사과";
//		System.out.println(SmartPhone.company); //사과출력
			
		
		SmartPhone sp1 = new SmartPhone("빨간쌀공책","차이가나","01011112222","작은쌀",500000);
		SmartPhone sp2 = new SmartPhone("G3","한국","01022223333","L*",1000000);
		
		System.out.println("sp1.company : "+sp1.company); //L*
		System.out.println("sp2.company : "+sp2.company); //L*
		
		System.out.println("sp1은 SmartPhone의 인스턴스 : "+(sp1 instanceof SmartPhone));//인스턴스인지 아닌지 출력
		System.out.println("-----------------------------------");
		sp2.company = "삼*";//SmartPhone클래스 멤버변수에 static붙인경우,예를들어sp1이 가르키는 붙인변수를 변경하였을때 sp1,sp2이 가르키는게 둘다바뀜 
		System.out.println("sp1.company : "+sp1.company); //삼*
		System.out.println("sp2.company : "+sp2.company); //삼*
		

		
	}

}
