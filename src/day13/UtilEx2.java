package day13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UtilEx2 {
	public static void main(String[] args) {

		// �ڹٿ��� ��¥�� ������ Ŭ����
		Date d = new Date();
		// 1900������� ���ݱ����� ����
		System.out.println(d.getYear() + 1900);
		// 0������..
		System.out.println(d.getMonth() + 1);
		System.out.println("----------------");
		long time = System.currentTimeMillis();
		System.out.println(time);
		System.out.println("----------------");

		// ��¥ ������ ���
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String time2 = sdf.format(d);
		System.out.println(time2);
		System.out.println(sdf.format(time));

	}
}
