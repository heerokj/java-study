package day04hw;
//문제 4에서 index의 값이 3의 배수이면  3333  값을 5의 배수는 5555
//3과5의 공배수는 3535 를 대입하고 올바르게 입력되었는지 출력

public class qiuz05 {

	public static void main(String[] args) {

		int[] a = new int[100];

		for (int i = 0; i < a.length; i++) {
			if(i%3 ==0 && i%5 ==0) {
				System.out.println("a[" + i + "] : " + 3535);  //공배수를 먼저 써주기 
			}else if(i%5 ==0) {
				System.out.println("a[" + i + "] : " + 5555);
			}else if(i%3 ==0) {
				System.out.println("a[" + i + "] : " + 3333);
			}else {
				System.out.println("a[" + i + "] : " + (i+1));
			}
					
		}

	}

}
