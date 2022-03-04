package day04; //버블정렬

public class ArrayEx9sortquiz {
	public static void main(String[] args) {

		int[] m = { 3, 2, 9, 8, 6, 1 };

		for (int i = 0; i < m.length; i++) {
			System.out.print(m[i] + "\t");
		}
		System.out.println();

		
		// <문제> 정렬해서 출력
		
		// 1. 버블정렬
		int count = 0;
		for (int j = 0; j < m.length - 1; j++) { // 5라는 값은 6이면 안됨 j+1도 존재하니깐(인덱스는 6개잖아)
			if (m[j] > m[j + 1]) {               // 5는 배열의길이-1 하면 됨
				int temp = m[j];
				m[j] = m[j + 1];
				m[j + 1] = temp;
			}
		}
		count++;
		System.out.println("------"+count+"번째 정렬 후, 아래 결과------");
		// 출력1
		for (int k = 0; k < m.length; k++) {
			System.out.print(m[k] + "\t");
		}
		System.out.println();

		
		
		 
		
		for (int j = 0; j < 4; j++) {
			if (m[j] > m[j + 1]) {
				int temp = m[j];
				m[j] = m[j + 1];
				m[j + 1] = temp;
			}
		}
		count++;
		System.out.println("------"+count+"번째 정렬 후, 아래 결과------");
		//출력2
		for (int k = 0; k < m.length; k++) {
			System.out.print(m[k] + "\t");
		}
		System.out.println();
		
		
		
		
	
		for (int j = 0; j < 3; j++) {
			if (m[j] > m[j + 1]) {
				int temp = m[j];
				m[j] = m[j + 1];
				m[j + 1] = temp;
			}
		}
		count++;
		System.out.println("------"+count+"번째 정렬 후, 아래 결과------");
		//출력3
		for (int k = 0; k < m.length; k++) {
			System.out.print(m[k] + "\t");
		}
		System.out.println();
		
		
		
		
		
		for (int j = 0; j < 2; j++) {
			if (m[j] > m[j + 1]) {
				int temp = m[j];
				m[j] = m[j + 1];
				m[j + 1] = temp;
			}
		}
		count++;
		System.out.println("------"+count+"번째 정렬 후, 아래 결과------");
		//출력4
		for (int k = 0; k < m.length; k++) {
			System.out.print(m[k] + "\t");
		}
		System.out.println();
		
		
		
		
		
		for (int j = 0; j < 1; j++) {
			if (m[j] > m[j + 1]) {
				int temp = m[j];
				m[j] = m[j + 1];
				m[j + 1] = temp;
			}
		}
		count++;
		System.out.println("------"+count+"번째 정렬 후, 아래 결과------");
		//출력5
		for (int k = 0; k < m.length; k++) {
			System.out.print(m[k] + "\t");
		}
		System.out.println();
		
	}

}
