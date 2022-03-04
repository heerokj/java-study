package day03;

public class StatementEx09printf {

	public static void main(String[] args) {

		int year = 2022;
		int month = 2;
		int day = 20;
		System.out.println("어제는 " + year + "년 " + month + "월 " + day + "일 입니다.");

		System.out.printf("어제는 %d년 %d월 %d일 입니다.", year, month, day); // printf 사용하면 +기호 필요없이 출력가능

		// 첫번째 인수값에 출력형식을 지정하고
		// 두번째 자리부터 값을 할당

		// %d : 정수, %b : 논리, %c : 문자, %f : 실수, %s : 문자열을 의미
		System.out.println();
		System.out.println("-------------------");

		int hour = 10;
		int minute = 50;
		int second = 10;
		String nation = "한국";

		System.out.println(nation + " 시간은 현재 " + hour + "시 " + minute + "분 " + second + "초 입니다.");
		System.out.printf("%s 시간은 현재 %d시 %d분 %d초 입니다.", nation, hour, minute, second);

		System.out.println("-------------------");

		String name = "홍길동";
		int age = 20;
		float height = 182.3f;
		float weight = 75.3f;

		System.out.println("내 이름은 " + name + "이고 나이는 " + age + "살 키는 " + height + " 몸무게는 " + weight + " 입니다.");
		System.out.printf("내 이름은 %s이고 나이는 %d살 키는 %f는 몸무게는 %f는 입니다.", name, age, height, weight);
	}

}
