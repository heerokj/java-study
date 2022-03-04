package day02;

public class StatementTest05 {

	public static void main(String[] args) {

		// 3단
		for (int i = 1; i < 10; i++) { // {}안에있는 i는 지역변수 / 그 지역안에서만 적용되는 것
			System.out.println("3*=" + i + "=" + (3 * i));
		}
		System.out.println("--------------");
		// 4단
		for (int i = 1; i < 10; i++) { // 또다른 for문에 i써도 ok
			System.out.println("4*=" + i + "=" + (4 * i));
		}
		System.out.println("--------------");
		// 5단
		for (int i = 1; i < 10; i++) {
			System.out.println("5*=" + i + "=" + (5 * i));

		}

		// 여기서 반복문을 또 반복시킬 수 있어!!
		System.out.println("반복문 안에 반복문*******");

		for (int dan = 3; dan <= 5; dan++) {
			for (int i = 1; i <=9 ; i++) { 
				System.out.println(dan + "*"+i + "=" + (dan * i));
			}
		}
	}
}


