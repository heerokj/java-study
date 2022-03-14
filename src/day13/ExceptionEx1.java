package day13;

import java.util.Random;

public class ExceptionEx1 {
	public static void main(String[] args) {
		// 1. ERROR :ġ���� ����
		// 2. EXCEPTION : ���������
		// �����������
		// 1. ���� ó��
		// 2. ���� ����

		Random rnd = new Random();
		int a = 100;
		try {
			// 10 �̸��� 0������ ���� ������ ���ϱ�
			int value = rnd.nextInt(10);
			System.out.println(value); // ���� ��������0�̶��
			System.out.println(a / value); // ���������� =>Exception
		} catch (ArithmeticException ae) { // �ڷ�������������
			System.out.println("ArithmeticExcepton �߻��ϸ� " 
		                + "�̺κ��� �ڵ尡 �����");		
		}catch(NullPointerException ne) {
			System.out.println("�� ������ ���� �߻��� �� �ڵ����"); 
		}catch(Exception e) {
			//��� Exception�� ���� / �������� ���ֱ� / ������ �Ȱɸ��°� ���ֱ�
			System.out.println("��� ���ܴ� ���⼭ �� �ɸ�");
			System.out.println("�̰� ���� �𸣴� Exception");
			e.printStackTrace(); // ���� ������ �����ؼ� ���
		}
		
	}
}
