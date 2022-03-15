package day13;

import java.util.ArrayList;

public class L_ArrayListEx1 {
	public static void main(String[] args) {
		
		ArrayList v = new ArrayList();
		System.out.println("v : "+v);
		//v.add(object);
		//오크젝트배열 참조형이니 객체주소 저장
		//ArrayList는 객체만 저장가능
		//어떻게 기본형 숫자 저장돼? => 오토박싱에 의해 기본형이 참조형으로 자동변환
		v.add(3); //v.add(new Integer(3)); 컴파일러가 이렇게 저장하는거임
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
