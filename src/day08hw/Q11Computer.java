package day08hw;

public class Q11Computer {
	int 채널, 리모컨, 본체;
	String 제조국, 제조사;

	Q11Computer() {
		채널 = 1;
		제조국 = "대한민국";
		제조사 = "삼성";
	}

	public void on() {
		System.out.println("켜지는중입니다.");
	}

	public void off() {
		System.out.println("꺼지는중입니다.");
	}

}
