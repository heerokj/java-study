package day08;

public class Monkey extends Mammalia {
	
	Monkey(){
		eye = 2;
		nose =1;
		ear =2;
		name = "숭이숭이";
		species = "안경원숭이";
	}
	
	@Override
	public void eating() {
		System.out.println("바나나를 먹어요");
	}
	@Override
	public void sleeping() {
		System.out.println("나무위에서 자요");
	}

	public void climbing() {
		System.out.println("영차영차 뛰어요");
	
	}	
}
