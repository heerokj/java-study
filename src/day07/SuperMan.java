package day07;
//Person 클래스의 자식 클래스(자식:부모의 확장판)
//Private만 제외하고 물려준다
public class SuperMan extends Person {

	//this : 나자신을 가리키는 참조변수
	//this() : 내 클래스의 기본생성자
	//super : 부모를 가리키는 참조변수
	//super() : 부모 클래스의 기본생성자
	
	float height;
	float weight;
	
	
	SuperMan(){
		//✔부모의 변수는 무엇으로 초기화 할것인가?  뭔솔??
		//부모 생성자를 호출 
		super(); //super키워드 때문에 부모의 생성자가 불려나옴 => 생략해도ok
		         //항상 첫번째 라인에 와야함			
		System.out.println("superman클래스의 기본생성자");
	}
	
	
	
	
	SuperMan(String name, String job, int age, float height, float weight){
	   //super(); // 부모클래스의 기본생성자
		super(name);		
		this.job = job;
		this.age = age;
		this.height = height;
		this.weight = weight;
		System.out.println("Superman 클래스의 매개변수 있는 생성자 ");	
	}
	
	
	public void 레이져발사() {
		System.out.println("뿅뿅");
	}
	 public void 비행하기() {
	 System.out.println("날아라 쓔융");	
	 
	 
	 
	 
	 
	 
	}
}
