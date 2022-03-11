package day13;

import java.util.Calendar;

public class UtilEx3 {
	public static void main(String[] args) {
		
		//Calendar는 추상클래스임..new하여 객체 생성 불가
		
		//Calendar.getInstance() 메소드를 이용하거나 
		//Calendar 클래스를 상속받는 GregorianCalendar 클래스를 이용하여 
		//객체를 생성할 수 있다.
		Calendar cal = Calendar.getInstance();//이와 같이 작성하여 객체 생성, new 못함
		System.out.println("cal : "+cal);
		
		//가져오고싶을때 get~
		//설정하고싶을때 set~
		int week = cal.get(Calendar.WEEK_OF_YEAR); 
		System.out.println("오늘은 올해의 "+week+" 번째 주입니다."); 
		//년
		System.out.println(cal.get(Calendar.YEAR)); //2022
		//월 
		System.out.println(cal.get(Calendar.MONTH)+1); //3
		//일 
		System.out.println(cal.get(Calendar.DATE)); //11
		//일주일 중 오늘의 날짜는 몇번째 :
		System.out.println("일주일 중 오늘의 날짜는 몇번째 : "+cal.get(Calendar.DAY_OF_WEEK));
		
		
	}
}
