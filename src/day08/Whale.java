package day08;

public class Whale extends Mammalia{
	
	Whale(){
		eye = 2;
		nose =1;
		ear =2;
		name = "도로리";
		species = "물고래";
	}
	
	@Override
	public void eating() {
		System.out.println("새우를 먹어요");
	}
	@Override
	public void sleeping() { 
		System.out.println("물속에서 자요");
	}

	public void swmmining() {
		System.out.println("첨범첨범 수영해요");
	
	}	
}
