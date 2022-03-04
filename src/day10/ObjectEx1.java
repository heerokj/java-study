package day10;

public class ObjectEx1 {
	public static void main(String[] args) {
		Object obj1 = new Object(); // 에러X =>이미 만들어져있는 클래스
		Object obj2 = new Object(); 

		System.out.println("obj1 : "+obj1);
		System.out.println("obj2 : "+obj2);
		
		if(obj1 == obj2) {  //참조값 다름
			System.out.println("동일객체");
		}else {
			System.out.println("다른객체"); //다른객체 출력
		}
		
		if(obj1.equals(obj2)) {  //참조값 다름(Object클래스 equals는 참조값을 비교)
			System.out.println("동일객체");
		}else {
			System.out.println("다른객체"); //다른객체 출력
		}
		System.out.println("-----------"); 
		
		
		System.out.println("obj1 : "+obj1); //obj1의 참조값 출력
		System.out.println("obj1.toString() : "+obj1.toString()); 
		//toString 메소드 : 객체가 가지고있는 정보나 값들을 문자열로 만들어 리턴하는 메소드
		
		//참조값 : 클래스이름 + @ + 16진수(해쉬코드값)
		//getClass : 실행중인 객체를 리턴	
	}

}
