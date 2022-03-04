package day07hw; //11. Animal Å¬·¡½º¸¦ ÀÛ¼ºÇÑ´Ù.

public class Q11Animal {

	String name;
	int age;
	

	void eating(String it) {
		System.out.println(it + "À» ¸Ô¾î¿ä");
	}
	void sleeping() {
		System.out.println("ÄðÄðÄð");
	}

	public static void main(String[] args) {
		Q11Animal a = new Q11Animal();

		a.eating("name");
		a.sleeping();
	}
}
