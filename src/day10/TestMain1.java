package day10;

import java.util.Scanner;

public class TestMain1 {
	public static void main(String[] args) {

		// 사용자로부터 문자를 입력받기
		System.out.println("문자입력 : "); // 220304 3xxxxxx
		Scanner sc = new Scanner(System.in);

		String data = sc.next();
		System.out.println(data);

		String year = data.substring(0, 2);
		String month = data.substring(2, 4);
		String day = data.substring(4, 6);
		String type = data.substring(6, 7);
		String gender ="";
		if(type.equals("1")||type.equals("3")) {
			gender = "남성";		
		}else {
			gender = "여성";
		}
		
		System.out.println(year+"년"+month+"월"+day+"일생"+gender +"입니다.");
		System.out.println();
		System.out.println(data.substring(0,2)+"년"+data.substring(2,4)+"월"
				+data.substring(4,6)+"일생"+((type.equals("1")||type.equals("3"))?"남성":"여성")+"입니다");
		
		

	}

}
