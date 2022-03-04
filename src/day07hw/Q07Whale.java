package day07hw;

public class Q07Whale {
	int eye, nose, ear;
	String name, species;

	Q07Whale(){
		eye = 3;
		nose =5;
		ear =4;
		name = "골골이";
	}
	
	void eating(String it) {
		System.out.println(it + "을 먹어요");
	}

	void sleeping() {
		System.out.println("잠을 잘자요");
	}

	void swimming() {
		System.out.println("헤엄을 잘해요");
	}
	
}
