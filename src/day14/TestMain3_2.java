package day14;

import java.util.ArrayList;

public class TestMain3_2 {
	public static void main(String[] args) {
		// string 전용 ArrayList
		ArrayList<String> list = new ArrayList<String>(); //

		list.add("딸기");
		list.add("포도");
		list.add("포도");
		list.add("포도");
		list.add("포도");
		Integer it = 20;

//		list.add(it); //String 전용 ArrayList : 다른 값 add 안됨
		list.add("바나나");

		// ArrayList 에 한개씩 꺼내고
		// 꺼낸문자에서 두번째 글자를 출력
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);

			System.out.println(str.substring(1, 2));

		}

	}

}
