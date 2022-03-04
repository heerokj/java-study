package day04hw; //길이가 100개인 int 타입 배열에 정수 1~100의 값을 대입

public class qiuz04 {

	public static void main(String[] args) {

		int[] a = new int[100];

		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] : " + (i+1));
		}

	}

}
