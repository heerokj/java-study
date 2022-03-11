package day14;

import java.util.ArrayList;

public class TestMain3_1 {
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList (); //
		
		list.add("딸기");
		list.add("포도");
		list.add("포도");
		list.add("포도");
		list.add("포도");
		Integer it = 20; //다집어 넣을 수 있어 근데..! 아래 꺼낼땐 오류(런타임때 오류남)
		
		list.add(it);
		list.add("바나나");
		
		//ArrayList 에 한개씩 꺼내고
		//꺼낸문자에서 두번째 글자를 출력
		System.out.println(list);
		for(int i =0; i<list.size();i++) {
			Object obj = list.get(i);
		//	System.out.println(obj);
		//	obj.substring(); //에러 Object 클래스 11개 사메서드 사용 가능
			
			String str = (String)obj; //Integer는 String으로 형변환 안됨 부모자식관계X
			System.out.println(str.substring(1,2));
			
			
		}
		
		
		
	}

}
