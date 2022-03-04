package day08;

public class Rabbit extends Mammalia {

	Rabbit(){
		eye = 2;
		nose =1;
		ear =2;
		name = "Åä³©ÀÌ";
		species = "¾Ó°í¶ó";
	}
	
	@Override
	public void eating() {
		System.out.println("´ç±ÙÀ» ¸Ô¾î¿ä");
	}
	@Override
	public void sleeping() { 
		System.out.println("Ç®À§¿¡¼­ ÀÚ¿ä");
	}

	public void jumping() {
		System.out.println("ÆúÂ¦ÆúÂ¦ ¶Ù¾î¿ä");
		
	}
}
