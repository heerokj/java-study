package day13; //HashMap�� put���

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// java.util  // interface Map //HashMap
public class M_HashMapEx {
	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap<String,String>();
		
		//hm.put(key, value);
		hm.put("��", "����");
		hm.put("���", "�뱸");
		hm.put("�λ�", "ǳ��");
		hm.put("����", "����");
		hm.put("�ٳ���", "�ʸ���");
//		System.out.println(hm); //
		hm.put("�ٳ���", "���ֵ�");
		hm.put("����", "���ֵ�");		
		System.out.println(hm); //key�� �ߺ��� �� ���� / value �ߺ� ���� => ��������
		
		String v = hm.get("��");
		String v1 = hm.get("�ٳ���");
		System.out.println(v);
		System.out.println(v1);
		System.out.println("-------------------------");
		
			
		//key���� set���� ����
		Set<String> set =hm.keySet(); //keySet�� Ű ��� 
		System.out.println(set); //[��, ���, ����, �λ�, �ٳ���]
		
		
		Iterator<String> it =set.iterator(); //iterator�� 
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key+" : "+hm.get(key));
		}
	}

}
