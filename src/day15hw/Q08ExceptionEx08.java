package day15hw;
//Q08.���� �ڵ带 �����Ҷ� �Ʒ��� ���� �ΰ��� ������ 

import java.io.IOException;

//����� �߻��Ҽ� �ִ�. 
//��°���� ���� ó���ϱ����� �Ʒ� �ڵ带 �����Ͻÿ�

import java.util.Random;

public class Q08ExceptionEx08 {
	public static void main(String[] args) {
		int num[] = new int[3];

		Random rnd = new Random();
		int index = rnd.nextInt(10);
		try {
			num[index] = rnd.nextInt(500);
			System.out.println("index : " + index + "num[ " + index + "] : " + num[index]);
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("index : " + index + "num[ " + index + "] : �������� �ʽ��ϴ�.");
		}

	}
}
