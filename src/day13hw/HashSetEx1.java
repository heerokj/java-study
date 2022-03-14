package day13hw;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class HashSetEx1 {
	public static void main(String[] args) {

		// 1. int 6ĭ¥�� �迭 m����
		int[] m = new int[6];

		// 2. Hashset ��ü ����
		HashSet hs = new HashSet();

		// 3. �����ϰ� 1���� 45������ �� �̱� (����Ŭ���� ���)
		Random rnd = new Random();

		// 5. Hashset�� ��� ������ 6����� �ߴ�
		// 6. �ƴϸ� 3������ ���ư���
		while (hs.size() < 6) {

			int v = rnd.nextInt(45) + 1;
			System.out.println(v);
			hs.add(v);
			System.out.println(hs);
		}

		// 7. �Ѱ��������� ȭ�鿡 ���
		Iterator it = hs.iterator();
		for( int i = 0; i<m.length; i++) {
			m[i] = (int)it.next();
			System.out.println(Arrays.toString(m));
		}
		// 8. ����
		Arrays.sort(m);

		// 9. ȭ�鿡 ���
		for(int i=0; i<m.length;i++) {
			System.out.println(m[i]+"\t");
		}
		System.out.println();
		
		
	
		
		
		System.out.println("=====�ٸ��������=====");
		// 1. int 6ĭ¥�� �迭 m����

		// 2. Hashset ��ü ����
		HashSet set = new HashSet();

		// 3. �����ϰ� 1���� 45������ �� �̱� (����Ŭ���� ���)
		// 4. ���� ���� Hashset�� ���
		for (int i = 0; set.size() < 6; i++) {
			int num = (int) (Math.random() * 45) + 1;
			set.add(num);
			System.out.println(num);
		}
		System.out.println(set);

		// 5. Hashset�� ��� ������ 6����� �ߴ�
		// 6. �ƴϸ� 3������ ���ư���
		// 7. �Ѱ��������� ȭ�鿡 ���

		// 8. ����
		// 9. ȭ�鿡 ���
		List list = new LinkedList(hs);
		Collections.sort(list);
		System.out.println(list);

	}

}
