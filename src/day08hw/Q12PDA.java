package day08hw;

public class Q12PDA extends Q11Computer {

	Q12PDA(){
		super();
	}
	
	public void call(String string) {

		System.out.println(string + "번으로 전화 거는중");
	}

	public void connect() {
		System.out.println("연결중입니다.");
	}

	public void useInternet() {
		System.out.println("Internet 사용중입니다.");
	}

}
