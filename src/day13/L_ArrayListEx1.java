package day13;

import java.util.ArrayList;

public class L_ArrayListEx1 {
	public static void main(String[] args) {
		
		ArrayList v = new ArrayList();
		System.out.println("v : "+v);
		//v.add(object);
		//��ũ��Ʈ�迭 �������̴� ��ü�ּ� ����
		//ArrayList�� ��ü�� ���尡��
		//��� �⺻�� ���� �����? => ����ڽ̿� ���� �⺻���� ���������� �ڵ���ȯ
		v.add(3); //v.add(new Integer(3)); �����Ϸ��� �̷��� �����ϴ°���
				v.add("����");
				v.add("����");
				v.add("���"); 
				v.add(0,"��");
				v.add("����");
				System.out.println("v : "+v);
				v.add("����");
				v.add("����");
				v.add("���");
				v.add("��");
				v.add("����");
				v.add("����");
				System.out.println("v : "+v);
	
			    String fruit = "�θ���"; 
				Object obj = fruit;
				v.add(obj);	 // �� ���� obj���� ������??   
			    System.out.println("v : "+v); 
				System.out.println("�� ������ ��  : "+v.size()); //12
				System.out.println("--------------------");
				
				//1���� ������
				//�̸��� ù���ڸ� ȭ�鿡 ���
				Object obj1 = v.get(0);
				System.out.println(obj1);
				System.out.println(obj1.toString());
				System.out.println("--------------------");
				
//				for(int i=0; i<v.size();i++) {
//					Object obj2 = v.get(i);
//					System.out.println(obj2.toString());
//					String str =(String)obj2;
//					System.out.println(str.substring(0,1));
//				}
	}

}