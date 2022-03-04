package day05hw2; //배열 요소중 가장 작은 값을 리턴하는 메서드를 구현하세요 

public class quiz07 {
	
	static int findMin(int[] m) {
		int min = m[0];
		for(int i=0; i<m.length; i++ ) {
			if(m[i]<min) {
				min = m[i];
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		int[] m = {21,32,31,14,51,26,37,82,19};
		
		int result = findMin(m);
		System.out.println("result : "+ result); 
	}

}
