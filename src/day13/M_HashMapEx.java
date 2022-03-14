package day13; //HashMap은 put사용

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// java.util  // interface Map //HashMap
public class M_HashMapEx {
	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap<String,String>();
		
		//hm.put(key, value);
		hm.put("귤", "제주");
		hm.put("사과", "대구");
		hm.put("인삼", "풍기");
		hm.put("참외", "성주");
		hm.put("바나나", "필리핀");
//		System.out.println(hm); //
		hm.put("바나나", "제주도");
		hm.put("랄라", "제주도");		
		System.out.println(hm); //key는 중복될 수 없어 / value 중복 가능 => 덮여씌움
		
		String v = hm.get("귤");
		String v1 = hm.get("바나나");
		System.out.println(v);
		System.out.println(v1);
		System.out.println("-------------------------");
		
			
		//key값을 set으로 리턴
		Set<String> set =hm.keySet(); //keySet는 키 목록 
		System.out.println(set); //[귤, 사과, 참외, 인삼, 바나나]
		
		
		Iterator<String> it =set.iterator(); //iterator는 
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key+" : "+hm.get(key));
		}
	}

}
