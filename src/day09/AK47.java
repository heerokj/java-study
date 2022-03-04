package day09;

public class AK47 implements Weapon{ 
	
	@Override
	public void use() {
		System.out.println("빵!");
	}
	
	@Override
	public void reuse() {
		System.out.println("AK47 : 재장전");
	}
}

//경찰이 무기 쓰게 하려면??
//=>>