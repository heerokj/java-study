package day13;

import java.util.HashSet;
import java.util.Iterator;

public class S_HashSetEx1 {
	public static void main(String[] args) {
		
		HashSet hs = new HashSet(); 
			
		hs.add("딸기");
		hs.add("바나나");
		hs.add("감");
		hs.add("딸기");
		hs.add("딸기");
		hs.add("딸기");
		hs.add("딸기");
		System.out.println(hs); //[감, 바나나, 딸기] =>중복 허용X
	
		
	/*
		Collection c = new HashSet(); // 참조변수 Collection c  가능! 다형성때문에
		c.add("딸기");                 // 근데 왜 이렇게 해놓지?
		c.add("바나나");               // 예를들어 나중에 TreeSet으로 바꾼다할때 아래 코드를 검토할 필요X
		c.add("감");
		c.add("딸기");
		c.add("딸기");
		c.add("딸기");
		c.add("딸기");
		System.out.println(c); 
	 */		
	

		
		
		
		//iterator : 컬랙션에 저장된 data를 읽어오는 인터페이스
		//iterator를 메소드호출하면 그 반환결과가 iterator객체를 얻을 수 있다
		Iterator it = hs.iterator();  // ++1회용
		
				
//		Object obj = it.next();
//		System.out.println(obj); //감
		
		
		boolean data = it.hasNext();
		if(data)System.out.println("다음 값 있음");
		else System.out.println("다음값 없음");
		
		
		while(it.hasNext()) {  //읽어올 data가 없을 때 까지(false가 될 때까지) While문이용해서 계속반복
			Object obj2 = it.next();
			System.out.println(obj2);
		}
		
		while(it.hasNext()) { 
			Object obj2 = it.next();
			System.out.println(obj2); // 값안나옴 이미 위에서 읽어왔잖아 => ++다시 iterator객체 얻어와야함
		}
		
		System.out.println("----------");
		it = hs.iterator(); //++다시 새로운객체 얻어오기
		
		while(it.hasNext()) { 
			Object obj2 = it.next();
			System.out.println(obj2); // 값안나옴 이미 위에서 읽어왔잖아 => 다시 iterator얻어와야함
		}
/*		it = hs.iterator();
		for(int i=0; i<hs.size(); i++) {
			Object obj = hs.get(i); // HashSet은 get이 없으니 에러남
			System.out.println(obj); 
		}
*/
	}

}
