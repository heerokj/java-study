package day13hw;

import java.util.HashSet;

public class HashSetEx2 {
	public static void main(String[] args) {
		
		//1. int 6칸짜리 배열 m선언
		int [] m = new int[6];	
	
		//2. Hashset 객체 생성
		HashSet hs = new HashSet();		
	
		//3. 랜덤하게 1부터 45사이의 값 뽑기 (랜덤클래스 사용)
		int num = (int)((Math.random())*45);
		
		//4. 뽑은 값을 Hashset에 담기
		hs.add(num);
		
		//5. Hashset의 요소 개수가 6개라면 중단	
		if()

		//6. 아니면 3번으로 돌아가기		
		
     	//7. 한개씩꺼내서 화면에 출력	
		
		//8. 정렬		
		int count =0;
		for(int j =0; j<m.length-1; j++) {
			if(m[j]>m[j+1]) {
				int temp = m[j];
				m[j] =  m[j+1];
				m[j+1] = temp;				
			}
		}
		count++;
		System.out.println();
		//9. 화면에 출력
		
		
		
		
/* 		
		
		//1. int 6칸짜리 배열 m선언
		int [] m = new int[6];	
		//2. Hashset 객체 생성
		HashSet hs = new HashSet();		
		//3. 랜덤하게 1부터 45사이의 값 뽑기 (랜덤클래스 사용)
//		int num = (int)((Math.random())*45);		
		//4. 뽑은 값을 Hashset에 담기
//		hs.add(num);	
		//5. Hashset의 요소 개수가 6개라면 중단	
		for(int i=0; i<=6;i++) {
			int num = (int)((Math.random())*45);
			hs.add(num);
		}
		System.out.println(hs);
			
		//6. 아니면 3번으로 돌아가기		
     	//7. 한개씩꺼내서 화면에 출력		
		//8. 정렬		
		//9. 화면에 출력
		
		
*/		
	
		
	}

}
