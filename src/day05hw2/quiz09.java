package day05hw2; //배열 요소를 정렬하는 메서드를 구현하세요 (  버블 소트 이외에 다른 정렬알고리즘 사용 ) 

//해설..

public class quiz09 {
	
	static void sort(int[] m) {
		int min = m[0];
		for(int i=0; i<m.length; i++ ) {
			if(m[i]<min) {
				int temp = m[i];
				m[i] = min;
				min = temp;
//				System.out.println(Arrays.toString(m));
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		int[] m = { 21, 32, 31, 14, 51, 26, 37, 82, 19 }; 

		sort(m); 

//		System.out.println(Arrays.toString(m));  // [ 14, 19, 21, 26, 31, 32, 37, 51, 82 ]			​
	}

}
