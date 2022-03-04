package day08hw;

public class Q12Main {

	public static void main(String[] args) {
		
		Q12PDA p = new Q12PDA();
		
		p.on();
		p.call("010-1234-5678");
		p.connect();
		p.useInternet();
		

	}
}
