package day14;

import java.util.ArrayList;

public class TestMain3_2 {
	public static void main(String[] args) {
		// string ���� ArrayList
		ArrayList<String> list = new ArrayList<String>(); //

		list.add("����");
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("����");
		Integer it = 20;

//		list.add(it); //String ���� ArrayList : �ٸ� �� add �ȵ�
		list.add("�ٳ���");

		// ArrayList �� �Ѱ��� ������
		// �������ڿ��� �ι�° ���ڸ� ���
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);

			System.out.println(str.substring(1, 2));

		}

	}

}
