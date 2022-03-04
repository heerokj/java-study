package day04; //버블정렬 Ex9이어서 

public class ArrayEx9sortquiz2 {
	public static void main(String[] args) {

		int[] m = { 3, 2, 9, 8, 6, 1 };
		for (int i = 0; i < m.length; i++) {
			System.out.print(m[i] + "\t");
		}
		System.out.println();

		int count =0;
		for (int i = 0; i < m.length - 1; i++) {  //--> 여기서 i는 그아래 for문의 반복을 의미! 반복 횟수 설정
			for (int j = 0; j < m.length - 1-i; j++) { // i는 반복할 때 마다 1씩 증가 
				if (m[j] > m[j + 1]) {               // 1씩증가하는 i를 (배열m길이-1)에서 빼주기
					int temp = m[j];
					m[j] = m[j + 1];
					m[j + 1] = temp;
				}
			}
			count++;
			System.out.println("------"+count+"번째 정렬 후, 아래 결과------");
			// 출력
			for (int k = 0; k < m.length; k++) {
				System.out.print(m[k] + "\t");
			}
			System.out.println();

		}
	}
}
