package day05hw2; //�迭 ����� ���� ���� ���� �����ϴ� �޼��带 �����ϼ��� 

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
