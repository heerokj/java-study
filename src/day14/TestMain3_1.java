package day14;

import java.util.ArrayList;

public class TestMain3_1 {
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList (); //
		
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("����");
		Integer it = 20; //������ ���� �� �־� �ٵ�..! �Ʒ� ������ ����(��Ÿ�Ӷ� ������)
		
		list.add(it);
		list.add("�ٳ���");
		
		//ArrayList �� �Ѱ��� ������
		//�������ڿ��� �ι�° ���ڸ� ���
		System.out.println(list);
		for(int i =0; i<list.size();i++) {
			Object obj = list.get(i);
		//	System.out.println(obj);
		//	obj.substring(); //���� Object Ŭ���� 11�� ��޼��� ��� ����
			
			String str = (String)obj; //Integer�� String���� ����ȯ �ȵ� �θ��ڽİ���X
			System.out.println(str.substring(1,2));
			
			
		}
		
		
		
	}

}
