package day15hw;
import java.util.ArrayList;

//Q09. 아래 코드에는 일부 오류가 있다 이것을 수정하여
//에러가 발생하지 않게 처리하시오.

public class Q09ExceptionEx09 {
	
	public static void main(String[] args){
		ArrayList list = new ArrayList();
		list.add("딸기");
		list.add(500);
		list.add("수박");
		list.add("파인애플");
		
		for(int i=0;i<list.size();i++){
			Object name = list.get(i);
			System.out.println(name);
		}
		
	}
}
