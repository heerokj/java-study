package day04; 

public class ArrayEx5Dimensional2 {
	public static void main(String[] args) {
		// 2차원 배열
		// int[][] m = new int[행][열];
		// 번호는 똑같이 0번부터 시작
		int[][] m = new int[3][2]; //3?뻾2?뿴吏쒕━ 諛곗뿴

		System.out.println("m : " + m); // m?쓽 李몄“媛?
		System.out.println("m.length : " + m.length); // m?쓽 length /?뻾湲몄씠?? 3?뻾
		System.out.println("m[0] : " + m[0]); // m[0]?쓽 李몄“媛?
		System.out.println("m[0].length : " + m[0].length); // m[0]?쓽 length /?뿴湲몄씠?? 2?뿴
						
//		m[0][0] = 1;
//		m[0][1] = 2;
//		m[1][0] = 3;
//		m[1][1] = 4;
//		m[2][0] = 5;     
//		m[2][1] = 6;

//		System.out.println("洹몃깷 ???엯");
//		System.out.println(m[0][0]);
//		System.out.println(m[0][1]);
//		System.out.println(m[1][0]);
//		System.out.println(m[1][1]);
//	    System.out.println(m[2][0]);
//		System.out.println(m[2][1]); 


		
		//洹몃깷 ?씪?씪?씠 ???엯?븯?뒗寃껊낫?떒 for臾? ?궗?슜?븯?옄. 寃곌뎅 諛곗뿴 ?벐?뒗寃껋? 諛섎났臾? ?씠?슜?빐?꽌 以꾩뿬?벐湲곗쐞?븿?씠?떎.
		
		System.out.println("for臾? ?궗?슜?븯湲? ?씠?젃寃뚰븯?옄");
		int cnt = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				cnt++;
				m[i][j] = cnt;
				System.out.println("m["+i+"]["+j+"] : "+m[i][j]);
				
			}

		}
		
		System.out.println(m);  //李몄“媛?
		System.out.println(m[0]); //李몄“媛?
		System.out.println(m[0][0]); //?떎?젣媛?
		
		System.out.println("length");
		System.out.println(m.length);
		System.out.println(m[0].length);
	}
}
