package day07hw;

public class Q07Monkey {

	int eye, nose, ear;
	String name, epecies;
 
	Q07Monkey() {
		name = "¸ùÅ°";
		epecies = "¹öºø¿ø¼şÀÌ";
		eye = 2;
		nose = 1;
		ear = 1;
	}

	
	public void eating(String it) {
		System.out.println(it + "À» ¸Ô¾î¿ä");
	}

	public void sleeping() {
		System.out.println("ÄğÄğ ÀáÀ» ÀÚ¿ä");
	}

	public void climbing() {
		System.out.println("³ª¹«¸¦ Å¸¿ä");
	}
}
