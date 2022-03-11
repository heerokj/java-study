package day13; // 다시

import java.util.Stack;

public class StackEx1 {
	public static void main(String[] args) {
		
		//Stack 구현해 놓은 클래스 : 후입선출(LIFO), 선입후출(FILO)
		Stack s = new Stack();
		
		//push메서드 사용하여 스택 추가 /push => 넣는거
		s.push("딸기"); 
		s.push("수박");
		System.out.println(s);
		s.push("배");
		s.push("두리안");
		s.push("포도");
		System.out.println(s);
	
		//pop메서드 사용하여 스택 꺼내옴 /pop() -> 꺼내는거
		Object obj = s.pop(); 
		System.out.println(obj); //마지막에 들어간거(=포도)꺼내옴
		System.out.println(s);		
		
		System.out.println("------------------");
		//스택은 부모가 벡터이니 벡터의 메소드도 쓸 수 있음
		// ↓ 이렇게도 가능하나 push랑 pop을 많이 씀
		Object obj2 = s.get(2);
		System.out.println(obj2);
	}
}
