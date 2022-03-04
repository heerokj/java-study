package day09;
//구현클래스가 되려면
//모든 메서드가 구현되어 있어야 한다.
public class Horse extends Mammalia implements Flyable{
	
	public Horse(){
		eye = 2;
		nose =1;
		ear =2;
		name = "망이";
		species = "적토마";
	}
	
	@Override	
	public void fly() {
		System.out.println("펄럭 날아요");
	}
	
	public void run() {
		System.out.println("달료~~~");
	}


	@Override
	public void eating() {
		System.out.println("망이는 풀먹어요");
		
	}
	
	@Override
	public void sleeping() { 
		System.out.println("망이는 흙바닥에서 자요");
	}
	
	
	
}
