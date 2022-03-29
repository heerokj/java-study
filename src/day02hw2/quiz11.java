package day02hw2; //고�??.. ?�� for�? ?��?��?�� 출력?���? => ?��?��?��?��마다 ?��?��?�� 계속출력
                          //for�? 밖에?�� 출력?���? => for문안?��?�� 계산?�� 최종 ?��?��?��?�� 출력

public class quiz11 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum += i; // sum = sum+i; ?�� 같음
			}
		} // for�? ?��
			// �? ?�� 최종 값을 출력 => 2550
		System.out.println("1부터 100까지사이의 짝수의 누적합은" + sum + "입니다.");
	}
}
