package day13hw;

import java.util.HashSet;

public class HashSetEx2 {
	public static void main(String[] args) {
		
		//1. int 6ĭ¥�� �迭 m����
		int [] m = new int[6];	
	
		//2. Hashset ��ü ����
		HashSet hs = new HashSet();		
	
		//3. �����ϰ� 1���� 45������ �� �̱� (����Ŭ���� ���)
		int num = (int)((Math.random())*45);
		
		//4. ���� ���� Hashset�� ���
		hs.add(num);
		
		//5. Hashset�� ��� ������ 6����� �ߴ�	
		if()

		//6. �ƴϸ� 3������ ���ư���		
		
     	//7. �Ѱ��������� ȭ�鿡 ���	
		
		//8. ����		
		int count =0;
		for(int j =0; j<m.length-1; j++) {
			if(m[j]>m[j+1]) {
				int temp = m[j];
				m[j] =  m[j+1];
				m[j+1] = temp;				
			}
		}
		count++;
		System.out.println();
		//9. ȭ�鿡 ���
		
		
		
		
/* 		
		
		//1. int 6ĭ¥�� �迭 m����
		int [] m = new int[6];	
		//2. Hashset ��ü ����
		HashSet hs = new HashSet();		
		//3. �����ϰ� 1���� 45������ �� �̱� (����Ŭ���� ���)
//		int num = (int)((Math.random())*45);		
		//4. ���� ���� Hashset�� ���
//		hs.add(num);	
		//5. Hashset�� ��� ������ 6����� �ߴ�	
		for(int i=0; i<=6;i++) {
			int num = (int)((Math.random())*45);
			hs.add(num);
		}
		System.out.println(hs);
			
		//6. �ƴϸ� 3������ ���ư���		
     	//7. �Ѱ��������� ȭ�鿡 ���		
		//8. ����		
		//9. ȭ�鿡 ���
		
		
*/		
	
		
	}

}
