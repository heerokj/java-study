package day04;
//로또 번호출력하기
public class ArrayEx8lotto2sort {
	public static void main(String[] args) {

		//1. 1~45정수값 갖는 배열 rnd선언 (선언&초기화)
		int[] rnd = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 
				11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 
				21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 
				31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45 }; 
        
		
		for (int i = 1; i <= 1000; i++) {   //i 가 1000보다 작거나 같을때까지 for문 반복 =>1000번 실행

			int a = (int) (Math.random() * 45);  //랜덤하게 나온 1~44사이의 정수가 변수a,b에 할당
			int b = (int) (Math.random() * 45);

			//수배열의 요소값을 자리바꿈
			int temp = rnd[a];    
			rnd[a] = rnd[b];
			rnd[b] = temp;
		}

		
		//정렬용 배열
		int[] m = new int[6];
		//
		for(int i = 0; i<6; i++) {
			m[i] = rnd[i];
		} 
		
		//정렬(sort)-버블정렬
		for(int i=0; i<m.length-1; i++) {
			for(int j=0; j<m.length-1-i; j++) {
				if(m[j] >m[j+1]) {
					int temp = m[j];
					m[j] = m[j+1];
					m[j+1] = temp;
				}
			}
		}
		//출력 
		for (int i = 0; i < 6; i++) {
			System.out.print(m[i] + "\t");
		}
		System.out.println();
	}
}
