package day13;

import java.util.Random;

public class UtilEx1 {
	public static void main(String[] args) {

		//java.lang.Math
		System.out.println(Math.random());
		
		//1.������
		Random rnd = new Random();
		//2.�������� �����ϰ� ���Ϸ����Ѵ�.
		System.out.println(rnd.nextInt(45));
		
		
	}
}
