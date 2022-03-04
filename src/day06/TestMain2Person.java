package day06;

public class TestMain2Person {
	public static void main(String[] args) {
		
		Person p1 = new Person();  //p1은 참조변수이니 참조값 출력
		p1.이름 ="홍길동";   //변수들 기본값 가지니 다 초기화하기
		p1.나이 =20;
		p1.눈 =2;
		p1.코 =1;
		p1.입 =1;
		p1.성별 ="남";
		p1.직업 ="도적";
		
		System.out.println(p1);
		System.out.println(p1.이름);
		
		System.out.println(p1.직업);
		System.out.println(p1.나이);
		
		p1.먹기();
		p1.자기();
		p1.생각하기();
		System.out.println("----------");
		  
		
		Person p2 = new Person(); 
		
		p2.이름 ="호빵맨";
		p2.나이 =20;
		p2.눈 =2;
		p2.코 =1;
		p2.입 =1;
		p2.성별 ="남";
		p2.직업 ="동네백수";
		
		System.out.println(p2);
		System.out.println(p2.이름);
		System.out.println(p2.나이);
		System.out.println(p2.눈);
		System.out.println(p2.코);
		System.out.println(p2.성별);
		System.out.println(p2.직업);
		
		p2.먹기();
		p2.자기();
		p2.생각하기();
		System.out.println("----------");
	}
}
		
		

