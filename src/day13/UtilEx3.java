package day13;

import java.util.Calendar;

public class UtilEx3 {
	public static void main(String[] args) {
		
		//�߻�Ŭ������..new�� �� ����
		Calendar cal = Calendar.getInstance();
		System.out.println("cal : "+cal);
		
		int week = cal.get(Calendar.WEEK_OF_YEAR);
		System.out.println("������ ������ "+week+" ��° ���Դϴ�.");
		//��
		System.out.println(cal.get(Calendar.YEAR));
		//�� 
		System.out.println(cal.get(Calendar.MONTH)+1);
		//�� 
		System.out.println(cal.get(Calendar.DATE));
		//������ �� ������ ��¥�� ���° :
		System.out.println("������ �� ������ ��¥�� ���° : "+cal.get(Calendar.DAY_OF_WEEK));
		
		
	}
}
