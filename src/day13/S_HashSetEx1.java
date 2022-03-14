package day13;

import java.util.HashSet;
import java.util.Iterator;

public class S_HashSetEx1 {
	public static void main(String[] args) {
		
		HashSet hs = new HashSet(); 
			
		hs.add("����");
		hs.add("�ٳ���");
		hs.add("��");
		hs.add("����");
		hs.add("����");
		hs.add("����");
		hs.add("����");
		System.out.println(hs); //[��, �ٳ���, ����] =>�ߺ� ���X
	
		
	/*
		Collection c = new HashSet(); // �������� Collection c  ����! ������������
		c.add("����");                 // �ٵ� �� �̷��� �س���?
		c.add("�ٳ���");               // ������� ���߿� TreeSet���� �ٲ۴��Ҷ� �Ʒ� �ڵ带 ������ �ʿ�X
		c.add("��");
		c.add("����");
		c.add("����");
		c.add("����");
		c.add("����");
		System.out.println(c); 
	 */		
	

		
		
		
		//iterator : �÷��ǿ� ����� data�� �о���� �������̽�
		//iterator�� �޼ҵ�ȣ���ϸ� �� ��ȯ����� iterator��ü�� ���� �� �ִ�
		Iterator it = hs.iterator();  // ++1ȸ��
		
				
//		Object obj = it.next();
//		System.out.println(obj); //��
		
		
		boolean data = it.hasNext();
		if(data)System.out.println("���� �� ����");
		else System.out.println("������ ����");
		
		
		while(it.hasNext()) {  //�о�� data�� ���� �� ����(false�� �� ������) While���̿��ؼ� ��ӹݺ�
			Object obj2 = it.next();
			System.out.println(obj2);
		}
		
		while(it.hasNext()) { 
			Object obj2 = it.next();
			System.out.println(obj2); // ���ȳ��� �̹� ������ �о���ݾ� => ++�ٽ� iterator��ü ���;���
		}
		
		System.out.println("----------");
		it = hs.iterator(); //++�ٽ� ���οü ������
		
		while(it.hasNext()) { 
			Object obj2 = it.next();
			System.out.println(obj2); // ���ȳ��� �̹� ������ �о���ݾ� => �ٽ� iterator���;���
		}
/*		it = hs.iterator();
		for(int i=0; i<hs.size(); i++) {
			Object obj = hs.get(i); // HashSet�� get�� ������ ������
			System.out.println(obj); 
		}
*/
	}

}
