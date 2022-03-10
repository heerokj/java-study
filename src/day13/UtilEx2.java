package day13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UtilEx2 {
	public static void main(String[] args) {

		// 자바에서 날짜와 연관된 클래스
		Date d = new Date();
		// 1900기분으로 지금까지의 연도
		System.out.println(d.getYear() + 1900);
		// 0기준임..
		System.out.println(d.getMonth() + 1);
		System.out.println("----------------");
		long time = System.currentTimeMillis();
		System.out.println(time);
		System.out.println("----------------");

		// 날짜 형식을 사용
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String time2 = sdf.format(d);
		System.out.println(time2);
		System.out.println(sdf.format(time));

	}
}
