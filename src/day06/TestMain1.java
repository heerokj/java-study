package day06;
// reference 타입 변수 : array, class, interface
public class TestMain1 {
	public static void main(String[] args) {
		//설계도를 가지고 객체 만들기
		
		//자료형 변수명;
		//클래스명 참조변수;
		//int a;
		Car c;
		//참조변수 = new 생성자();
		//new : 객체 할당 연산자
		c = new Car();
		System.out.println(c);

		Car c2 = new Car(); //차가 한대 또 생성
		//메모리에 할당된 객체
		//하나으 ㅣ클래스로 부터 여러개의 인스턴스를 생성할 수잇다
		
		
		//변수에 접근
		System.out.println(c.핸들); //0
		c.핸들 = 1; 
		System.out.println(c.핸들); //1
		System.out.println("-----------");
		System.out.println(c2.핸들);  //0
		//c 자동차의 바퀴 몇개인지 출력
		System.out.println(c.바퀴);   //0
		
		c.전진();  // 부릉부릉
		System.out.println("-----------");
		
		
		Car myCar = new Car();
		
		myCar.차종 = "벤틀리";
		myCar.바퀴 = 4;
		
		System.out.println(myCar.차종);
		
		//새로운 자동차 객체를 만들고 멤버변수에 값을
		//(임의의 값을 사용) 초기화시키고 전진시켜보세요
		//이름은 friendCar 
		
		Car friendCar = new Car();
		friendCar.차종 = "벤츠";
		friendCar.바퀴 = 4;
		friendCar.문 = 2;
		friendCar.속도 = 0;
		friendCar.핸들 = 1;
		System.out.println(friendCar.차종);
		
		friendCar.전진();
		friendCar.후진();
		System.out.println();
	}
	
	

}
