package day13hw;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class HashSetEx1 {
	public static void main(String[] args) {

		// 1. int 6칸짜리 배열 m선언
		int[] m = new int[6];

		// 2. Hashset 객체 생성
		HashSet hs = new HashSet();

		// 3. 랜덤하게 1부터 45사이의 값 뽑기 (랜덤클래스 사용)
		Random rnd = new Random();

		// 5. Hashset의 요소 개수가 6개라면 중단
		// 6. 아니면 3번으로 돌아가기
		while (hs.size() < 6) {

			int v = rnd.nextInt(45) + 1;
			System.out.println(v);
			hs.add(v);
			System.out.println(hs);
		}

		// 7. 한개씩꺼내서 화면에 출력
		Iterator it = hs.iterator();
		for( int i = 0; i<m.length; i++) {
			m[i] = (int)it.next();
			System.out.println(Arrays.toString(m));
		}
		// 8. 정렬
		Arrays.sort(m);

		// 9. 화면에 출력
		for(int i=0; i<m.length;i++) {
			System.out.println(m[i]+"\t");
		}
		System.out.println();
		
		
	
		
		
		System.out.println("=====다른방식으로=====");
		// 1. int 6칸짜리 배열 m선언

		// 2. Hashset 객체 생성
		HashSet set = new HashSet();

		// 3. 랜덤하게 1부터 45사이의 값 뽑기 (랜덤클래스 사용)
		// 4. 뽑은 값을 Hashset에 담기
		for (int i = 0; set.size() < 6; i++) {
			int num = (int) (Math.random() * 45) + 1;
			set.add(num);
			System.out.println(num);
		}
		System.out.println(set);

		// 5. Hashset의 요소 개수가 6개라면 중단
		// 6. 아니면 3번으로 돌아가기
		// 7. 한개씩꺼내서 화면에 출력

		// 8. 정렬
		// 9. 화면에 출력
		List list = new LinkedList(hs);
		Collections.sort(list);
		System.out.println(list);

	}

}
