package day04; 

public class ArrayEx5Dimensional2 {
	public static void main(String[] args) {
		// 2���� �迭
		// int[][] m = new int[��][��];
		// ��ȣ�� �Ȱ��� 0������ ����
		int[][] m = new int[3][2]; //3?��2?��짜리 배열

		System.out.println("m : " + m); // m?�� 참조�?
		System.out.println("m.length : " + m.length); // m?�� length /?��길이?? 3?��
		System.out.println("m[0] : " + m[0]); // m[0]?�� 참조�?
		System.out.println("m[0].length : " + m[0].length); // m[0]?�� length /?��길이?? 2?��
						
//		m[0][0] = 1;
//		m[0][1] = 2;
//		m[1][0] = 3;
//		m[1][1] = 4;
//		m[2][0] = 5;     
//		m[2][1] = 6;

//		System.out.println("그냥 ???��");
//		System.out.println(m[0][0]);
//		System.out.println(m[0][1]);
//		System.out.println(m[1][0]);
//		System.out.println(m[1][1]);
//	    System.out.println(m[2][0]);
//		System.out.println(m[2][1]); 


		
		//그냥 ?��?��?�� ???��?��?��것보?�� for�? ?��?��?��?��. 결국 배열 ?��?��것�? 반복�? ?��?��?��?�� 줄여?��기위?��?��?��.
		
		System.out.println("for�? ?��?��?���? ?��?��게하?��");
		int cnt = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				cnt++;
				m[i][j] = cnt;
				System.out.println("m["+i+"]["+j+"] : "+m[i][j]);
				
			}

		}
		
		System.out.println(m);  //참조�?
		System.out.println(m[0]); //참조�?
		System.out.println(m[0][0]); //?��?���?
		
		System.out.println("length");
		System.out.println(m.length);
		System.out.println(m[0].length);
	}
}
