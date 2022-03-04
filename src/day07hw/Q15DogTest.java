package day07hw;

public class Q15DogTest {
	public static void main(String[] args) {
		
		Q15Dog d = new Q15Dog();
		d.status();
		
		d.eating("²­"); 
		d.status();

		Q15Dog d1 = new Q15Dog("ÄíÅ°","Çªµé",4);
		d1.status();
		
		d1.walking();
		d1.status();

		d1.sleeping();
		d1.status();
		
		
		
	}

}
