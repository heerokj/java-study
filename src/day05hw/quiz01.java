//�߱����� ���� - �ϼ� no
//[�˰���]
//1. ��ǻ�Ͱ� ���ڸ����ڸ� �����Ѵ�.
//2. ����ڷκ��� 3�ڸ����ڸ� �Է¹޴´�.
//3. �Ǻ��Ѵ�.(�ڸ��� ���ڰ� ��ġ�ϸ� :strike /�ڸ��´ٸ����� ���ڰ���ġ�ϸ� : ball)
//4. ����Ѵ�.
//5. 3strike�̸� �����Ѵ�.
//6. �ƴϸ� 2������ ���ư��� �ݺ��Ѵ�.

package day05hw;

import java.util.Arrays;
import java.util.Scanner;

public class quiz01 {
	public static void main(String[] args) {
		// 1. ��ǻ�Ͱ� ���ڸ����ڸ� ����
		int[] num = new int[3];
//		num[0] = (int)(Math.random()*10);
//		num[1] = (int)(Math.random()*10);
//		num[2] = (int)(Math.random()*10); 
//      �Ʒ�ó�� ������ 
//      for(int i =0; i<num.length; i++) {
//      num[i] = (int)(Math.random()*10);
//       }

		// �ߺ��������ֱ�
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 10);
			for (int j = 0; j < i; j++) {
				if (num[j] == num[i]) {
					i--;
					break; // �𸣰ڴ�..ok.. ��������°ź���
				}
			}
		}
		System.out.println("������ : " + Arrays.toString(num));

		
		// 2. ����ڷκ��� 3�ڸ� ���� �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		System.out.println("������Է°� : ");
		int value = sc.nextInt();
		int[] user = new int[3];
		user[0] = value / 100;
		user[1] = value % 100 / 10;
		user[2] = value % 10;

		System.out.println("������Է°� : " + Arrays.toString(user));

		
		// 3. �Ǻ�

		int ball = 0;
		int strike = 0;

		for (int i = 0; i < num.length; i++)
			if (num[i] == user[i]) {
				strike++;
			} else {
				for (int j = 0; j < num.length; j++) {
					if (user[i] == num[j]) {
						ball++;
					}
				}
			}

		System.out.println(strike + "S" + "," + ball + "B");
	}
}
