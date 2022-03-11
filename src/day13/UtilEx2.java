package day13; //아래 ?

import java.text.SimpleDateFormat;
import java.util.Date;

public class UtilEx2 {
	public static void main(String[] args) {

		// 자바에서 날짜와 연관된 클래스
		Date d = new Date();
		System.out.println(d); //Fri Mar 11 01:39:13 KST 2022
		// 1900기분으로 지금까지의 연도
		System.out.println(d.getYear()); //122
		// 현재 연도
		System.out.println(d.getYear() + 1900); //2022
		// 1월이 0월로 설정되어있음
		System.out.println(d.getMonth()); //2
		// 현재 월
		System.out.println(d.getMonth() + 1); //3
		System.out.println("----------------");
		// 현재시간을 밀리세컨드 형식으로 가져온 후 long형 변수 time에 저장
		long time = System.currentTimeMillis();
		System.out.println(time); // 1646930353485
		System.out.println("----------------");

		// 날짜 형식을 사용
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String time2 = sdf.format(d); //안에 d넣는지 어케앎??
		System.out.println(time2);
		System.out.println(sdf.format(time));

	}
}
