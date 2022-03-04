package day07;
//import day06.Marine; //import해야 다른
public class MarineMain {
	public static void main(String[] args) {
		Marine m1 = new Marine();
//		Marine m1; // 에러=> 클래스는 같은 패키지에 있어야 접근가능
		m1.status();
		
		//체력 ,x좌표,y좌표
		Marine m2 = new Marine(500,100,200); 
		m2.status();        
		
		//체력, 공격력, 공격속도, 이동속도
		Marine m3 = new Marine(200,20,20,8);
		m3.status();
	}
		
}
 
