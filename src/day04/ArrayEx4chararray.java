package day04;
import java.util.Iterator;
// char 배열을 선언하고
// 이 배열에 java world 라는 글자를 담은 후
// 반복문을 사용해서 출력 : java world
public class ArrayEx4chararray {

	public static void main(String[] args) {
		//char 타입은 공백 ' ' 이렇게 표시
		//작은따옴표로
		char[] ch = {'j','a','v','a',' ','w','o','r','l','d'};
	
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
		System.out.println();
		
		
		// 글자를 역순으로 출력
		for (int i =ch.length-1 ; i >=0; i--) {
			System.out.print(ch[i]);
		}
		System.out.println();
		
		// String 클래스
		// char 형 배열과 같은 아이임.
		// char 형 배열은 쓰기 번거로워서 만들어짐.	
		 String str = "java world";  
		 System.out.println(str);
	}

}
