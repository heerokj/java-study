package day13;

import java.util.Calendar;

public class UtilEx3 {
	public static void main(String[] args) {
		
		//Calendar�� �߻�Ŭ������..new�Ͽ� ��ü ���� �Ұ�
		
		//Calendar.getInstance() �޼ҵ带 �̿��ϰų� 
		//Calendar Ŭ������ ��ӹ޴� GregorianCalendar Ŭ������ �̿��Ͽ� 
		//��ü�� ������ �� �ִ�.
		Calendar cal = Calendar.getInstance();//�̿� ���� �ۼ��Ͽ� ��ü ����, new ����
		System.out.println("cal : "+cal);
		
		//������������� get~
		//�����ϰ������ set~
		int week = cal.get(Calendar.WEEK_OF_YEAR); 
		System.out.println("������ ������ "+week+" ��° ���Դϴ�."); 
		//��
		System.out.println(cal.get(Calendar.YEAR)); //2022
		//�� 
		System.out.println(cal.get(Calendar.MONTH)+1); //3
		//�� 
		System.out.println(cal.get(Calendar.DATE)); //11
		//������ �� ������ ��¥�� ���° :
		System.out.println("������ �� ������ ��¥�� ���° : "+cal.get(Calendar.DAY_OF_WEEK));
		
		
	}
}
