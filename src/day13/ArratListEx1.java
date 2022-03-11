package day13;

import java.util.ArrayList;

public class ArratListEx1 {
	public static void main(String[] args) {
		
		ArrayList v = new ArrayList();
		//v.add(object);
				v.add("딸기");
				v.add("포도");
				v.add("사과");
				v.add(0,"배");
				v.add("수박");
				System.out.println("v : "+v);
				v.add("딸기");
				v.add("포도");
				v.add("사과");
				v.add("배");
				v.add("수박");
				v.add("딸기");
				System.out.println("v : "+v);
	
			    String fruit = "두리안"; 
				Object obj = fruit;
				v.add(obj);	 // 왜 굳이 obj에다 담은거??   
			    System.out.println("v : "+v); 
				System.out.println("총 데이터 수  : "+v.size()); //12
				System.out.println("--------------------");
				
				//1개식 꺼내서
				//이름의 첫글자만 화면에 출력
				Object obj1 = v.get(0);
				System.out.println(obj1);
				System.out.println(obj1.toString());
				System.out.println("--------------------");
				
//				for(int i=0; i<v.size();i++) {
//					Object obj2 = v.get(i);
//					System.out.println(obj2.toString());
//					String str =(String)obj2;
//					System.out.println(str.substring(0,1));
//				}
	}

}
