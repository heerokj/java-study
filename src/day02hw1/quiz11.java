package day02hw1;

public class quiz11 {

	public static void main(String[] args) {

		for (int dan = 1; dan <= 9; dan++) {
			for (int i = 1; i <= 9; i++) {
				System.out.print(dan + "*" + i + "=" + (dan * i) + "\t");
			}
			System.out.println(); // 엔터 -> **위치에 여기에?
			                      // 첫번쨰 for문에서 dan이 1일경우, 안에있는for문 모두 거친후 
			                      // 실행됨 그다음 dan =2일경우 반복 
		}

	}

}
