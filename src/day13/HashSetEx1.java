package day13;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx1 {
	public static void main(String[] args) {
		
		HashSet hs = new HashSet(); 
			
		hs.add("����");
		hs.add("�ٳ���");
		hs.add("��");
		hs.add("����");
		hs.add("����");
		hs.add("����");
		hs.add("����");
		hs.add("����");
		hs.add("����");
		System.out.println(hs);
	
		//hs.get(0); 
		Iterator it = hs.iterator();   //????
	
//		boolean data = it.hasNext();
		
//		Object obj = it.next();
//		System.out.println(obj); //��
		
		
		boolean data = it.hasNext();
		if(data)System.out.println("���� �� ����");
		else System.out.println("������ ����");
		
		while(it.hasNext()) {
			Object obj2 = it.next();
			System.out.println(obj2);
		}
		
	}

}
