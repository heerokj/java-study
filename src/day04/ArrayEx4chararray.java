package day04;
import java.util.Iterator;
// char �迭�� �����ϰ�
// �� �迭�� java world ��� ���ڸ� ���� ��
// �ݺ����� ����ؼ� ��� : java world
public class ArrayEx4chararray {

	public static void main(String[] args) {
		//char Ÿ���� ���� ' ' �̷��� ǥ��
		//��������ǥ��
		char[] ch = {'j','a','v','a',' ','w','o','r','l','d'};
	
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
		System.out.println();
		
		
		// ���ڸ� �������� ���
		for (int i =ch.length-1 ; i >=0; i--) {
			System.out.print(ch[i]);
		}
		System.out.println();
		
		// String Ŭ����
		// char �� �迭�� ���� ������.
		// char �� �迭�� ���� ���ŷο��� �������.	
		 String str = "java world";  
		 System.out.println(str);
	}

}
