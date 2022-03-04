package day08;
//구현클래스가 되려면

public class Horse extends Mammalia{
	
	public Horse(){
		eye = 2;
		nose =1;
		ear =2;
		name = "망이";
		species = "적토마";
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
