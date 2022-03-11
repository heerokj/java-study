package day13hw; //다시

import java.util.HashSet; // 중복이 제거된다는 장점 이용
import java.util.Random;

public class HashSetEx2 {
	public static void main(String[] args) {
		
		//1. int 6칸짜리 배열 m선언
		int [] m = new int[6];	
	
		//2. Hashset 객체 생성
		HashSet hs = new HashSet();		
	
		//3. 랜덤하게 1부터 45사이의 값 뽑기 (랜덤클래스 사용)
		Random rnd = new Random();
		
		//4. 뽑은 값을 Hashset에 담기
		int r = rnd.nextInt();
		hs.add(r);
		System.out.println(r);
		//5. Hashset의 요소 개수가 6개라면 중단	
		
		//6. 아니면 3번으로 돌아가기		
		
     	//7. 한개씩꺼내서 화면에 출력	
		
		//8. 정렬		
		
		//9. 화면에 출력
		
		
	}

}
