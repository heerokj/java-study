package day13; 

import java.util.Vector;

//Java Collection Framework(JCF)

//�ټ��� �����͸� ���� ȿ�������� ó���� �� �ִ� ǥ��ȭ�� ����� �����ϴ� Ŭ������ ����
//�����͸� �����ϴ� �ڷᱸ���� �����͸� ó���ϴ� �˰����� ����ȭ�Ͽ� Ŭ������ �����س��� ��

//�������̽� ==> ������ Ŭ������ ���


public class L_VectorEx1 {
	public static void main(String[] args) {
		
		int[]m = new int[3];
		System.out.println(m.length); //3
		
		Vector v = new Vector();
		//v.add(object);
		v.add("����");
		v.add("����");
		v.add("���");
		v.add("��");
		v.add("����");
		System.out.println("v : "+v);
		System.out.println(v.capacity()); //�� �迭�� ũ�� 10ĭ(�⺻������)
		v.add("����");
		v.add("����");
		v.add("���");
		v.add("��");
		v.add("����");
		v.add("����");
		System.out.println("v : "+v);
		System.out.println(v.capacity()); //10�������� 10�߰��ؼ� 20��
	
	    String fruit = "�θ���";
		Object obj = fruit;
		v.add(obj);
	    
	    System.out.println("v : "+v);
		System.out.println(v.capacity()); 
		System.out.println("�� ������ ��  : "+v.size());
		System.out.println("--------------------");
		
		//1���� ������
		//�̸��� ù���ڸ� ȭ�鿡 ���
		Object obj1 = v.get(0);
		System.out.println(obj1);
		System.out.println(obj1.toString());
		System.out.println("--------------------");
		
		for(int i=0; i<v.size();i++) {
			Object obj2 = v.get(i);
			System.out.println(obj2.toString());
			String str =(String)obj2;
			System.out.println(str.substring(0,1));
		}
		
		
		
		
		
		
	
	}

}
