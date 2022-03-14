package day13;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class S_HashSetEx2 {
	public static void main(String[] args) {
		
		Set set  = new HashSet(); // HashSet만들기
		
		 // set 크기가 6보다 작을동안 랜덤값(1~45)를 저장
		for(int i = 0; set.size()<6; i++) { 
			int num = (int)(Math.random()*45) +1;
		//	set.add(new Integer(num)); 
			set.add(num);
		}
		System.out.println(set); //정렬되지 않은 상태로결과 출력
		
		
		//--정렬하기--		
		
		//정렬하기 전!
		//Collections.sort(list); //에러
		//set sort 사용 불가 
		//=> Collections.sort(List list) sort에 매개변수로 올수있는게 리스트만 되기때문에
		//set을 리스트로 옮기고 정렬해야 함
		
		List list = new LinkedList(set); //LinkedList(Collection c)
		Collections.sort(list); //Collections.sort(List list)
		System.out.println(list);
	}

}
