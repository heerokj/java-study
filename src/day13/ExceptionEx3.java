package day13;

import java.io.IOException;

public class ExceptionEx3 {
	public static void main(String[] args) {
		System.out.println("�Է�");
		try {
			int value = System.in.read();
			System.out.println(value);
		} catch (IOException ie) {
			System.out.println("����� ���� �߻��߽��ϴ�.");
			ie.printStackTrace();
		}finally {
			//���ܰ� �ִ� ���� �ݵ�� ����Ǵ� �ڵ�
		}System.out.println("���ܰ� �ִ� ���� �� �κ��� �ݵ�� ����ȴ�.");
		//IO/network, db
		//�ڿ��ݳ��ϴ� �ڵ�..
	}

}
