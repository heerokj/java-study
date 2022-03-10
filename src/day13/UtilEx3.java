package day13;

import java.util.Calendar;

public class UtilEx3 {
	public static void main(String[] args) {
		
		//추상클래스임..new할 수 없어
		Calendar cal = Calendar.getInstance();
		System.out.println("cal : "+cal);
		
		int week = cal.get(Calendar.WEEK_OF_YEAR);
		System.out.println("오늘은 올해의 "+week+" 번째 주입니다.");
		//년
		System.out.println(cal.get(Calendar.YEAR));
		//월 
		System.out.println(cal.get(Calendar.MONTH)+1);
		//일 
		System.out.println(cal.get(Calendar.DATE));
		//일주일 중 오늘의 날짜는 몇번째 :
		System.out.println("일주일 중 오늘의 날짜는 몇번째 : "+cal.get(Calendar.DAY_OF_WEEK));
		
		
	}
}
