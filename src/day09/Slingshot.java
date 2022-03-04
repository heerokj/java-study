package day09;

public class Slingshot implements Weapon{

	@Override
	public void use() { 
		System.out.println("새총 발사!!");
	}
	@Override
	public void reuse() {
		System.out.println("돌맹이 주워오는중");
	}
}
