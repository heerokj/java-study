package day06hw;

public class Q09Phone {

	String 폰명, 제조사, 전화번호, 제조국;
	int 가격;

	
	Q09Phone(String 폰명, String 제조사, int 가격, String 전화번호) {
		this.폰명 = 폰명;
		this.제조사 = 제조사;
		this.가격 = 가격;
		this.전화번호 = 전화번호;
	}

	Q09Phone(String 폰명, String 제조사, String 전화번호) {
		this.폰명 = 폰명;
		this.제조사 = 제조사;
		this.전화번호 = 전화번호;
	}

	Q09Phone(String 폰명, String 제조사, String 제조국, String 전화번호) {
		this.폰명 = 폰명;
		this.제조사 = 제조사;
		this.제조국 = 제조국;
		this.전화번호 = 전화번호;
	}

	
	void status() {
	 	System.out.println(폰명);
	 	System.out.println(제조사);
	 	System.out.println(전화번호);
	 	System.out.println(제조국);
	 	System.out.println(가격);
	
	}
	
}
