package day04;
//로또 번호출력하기
public class ArrayEx8lottoTest {
	public static void main(String[] args) {

		int[] rnd = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 
				11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 
				21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 
				31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45 }; 

		for (int i = 1; i <= 1000; i++) {    //i 가 1000보다 작거나 같을때까지 for문 반복 =>1000번 실행

			int a = (int) (Math.random() * 45);  //랜덤하게 나온 1~44사이의 정수가 변수a,b에 할당
			int b = (int) (Math.random() * 45);  

			int temp = rnd[a]; 
			rnd[a] = rnd[b];
			rnd[b] = temp;		
		}

		
		
		//정렬
		//버블 소트, 선택 정렬, 퀵소트..
		
		//내가 해보기

		for (int i = 0; i < 6; i++) {
			System.out.println(rnd[i] + "\t");
		}
	}

}
