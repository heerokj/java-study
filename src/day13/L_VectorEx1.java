package day13; 

import java.util.Vector;

//Java Collection Framework(JCF)

//다수의 데이터를 쉽고 효과적으로 처리할 수 있는 표준화된 방법을 제공하는 클래스의 집합
//데이터를 저장하는 자료구조와 데이터를 처리하는 알고리즘을 구조화하여 클래스로 구현해놓은 것

//인터페이스 ==> 구현한 클래스를 사용


public class L_VectorEx1 {
	public static void main(String[] args) {
		
		int[]m = new int[3];
		System.out.println(m.length); //3
		
		Vector v = new Vector();
		//v.add(object);
		v.add("딸기");
		v.add("포도");
		v.add("사과");
		v.add("배");
		v.add("수박");
		System.out.println("v : "+v);
		System.out.println(v.capacity()); //총 배열의 크기 10칸(기본생성자)
		v.add("딸기");
		v.add("포도");
		v.add("사과");
		v.add("배");
		v.add("수박");
		v.add("딸기");
		System.out.println("v : "+v);
		System.out.println(v.capacity()); //10개넘으면 10추가해서 20개
	
	    String fruit = "두리안";
		Object obj = fruit;
		v.add(obj);
	    
	    System.out.println("v : "+v);
		System.out.println(v.capacity()); 
		System.out.println("총 데이터 수  : "+v.size());
		System.out.println("--------------------");
		
		//1개식 꺼내서
		//이름의 첫글자만 화면에 출력
		Object obj1 = v.get(0);
		System.out.println(obj1);
		System.out.println(obj1.toString());
		System.out.println("--------------------");
		
		for(int i=0; i<v.size();i++) {
			Object obj2 = v.get(i);
			System.out.println(obj2.toString());
			String str =(String)obj2;
			System.out.println(str.substring(0,1));
		}
		
		
		
		
		
		
	
	}

}
