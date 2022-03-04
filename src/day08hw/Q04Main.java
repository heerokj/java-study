package day08hw;

public class Q04Main {
	public static void main(String[] args) {
	
		Q02Cat c = new Q02Cat();
		System.out.println(c.kind);
		c.eating("»ý¼±");
		c.sleeping();
		
		System.out.println("--------");
		
		Q03Dog d = new Q03Dog();
		System.out.println(d.kind);
		d.eating("»À´Ù±Í");
		d.sleeping();
		
	}

}
