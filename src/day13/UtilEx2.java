package day13; //�Ʒ� ?

import java.text.SimpleDateFormat;
import java.util.Date;

public class UtilEx2 {
	public static void main(String[] args) {

		// �ڹٿ��� ��¥�� ������ Ŭ����
		Date d = new Date();
		System.out.println(d); //Fri Mar 11 01:39:13 KST 2022
		// 1900������� ���ݱ����� ����
		System.out.println(d.getYear()); //122
		// ���� ����
		System.out.println(d.getYear() + 1900); //2022
		// 1���� 0���� �����Ǿ�����
		System.out.println(d.getMonth()); //2
		// ���� ��
		System.out.println(d.getMonth() + 1); //3
		System.out.println("----------------");
		// ����ð��� �и������� �������� ������ �� long�� ���� time�� ����
		long time = System.currentTimeMillis();
		System.out.println(time); // 1646930353485
		System.out.println("----------------");

		// ��¥ ������ ���
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String time2 = sdf.format(d); //�ȿ� d�ִ��� ���ɾ�??
		System.out.println(time2);
		System.out.println(sdf.format(time));

	}
}
