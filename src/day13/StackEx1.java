package day13; // �ٽ�

import java.util.Stack;

public class StackEx1 {
	public static void main(String[] args) {
		
		//Stack ������ ���� Ŭ���� : ���Լ���(LIFO), ��������(FILO)
		Stack s = new Stack();
		
		//push�޼��� ����Ͽ� ���� �߰� /push => �ִ°�
		s.push("����"); 
		s.push("����");
		System.out.println(s);
		s.push("��");
		s.push("�θ���");
		s.push("����");
		System.out.println(s);
	
		//pop�޼��� ����Ͽ� ���� ������ /pop() -> �����°�
		Object obj = s.pop(); 
		System.out.println(obj); //�������� ����(=����)������
		System.out.println(s);		
		
		System.out.println("------------------");
		//������ �θ� �����̴� ������ �޼ҵ嵵 �� �� ����
		// �� �̷��Ե� �����ϳ� push�� pop�� ���� ��
		Object obj2 = s.get(2);
		System.out.println(obj2);
	}
}
