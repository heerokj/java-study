package day02hw1;

public class quiz11 {

	public static void main(String[] args) {

		for (int dan = 1; dan <= 9; dan++) {
			for (int i = 1; i <= 9; i++) {
				System.out.print(dan + "*" + i + "=" + (dan * i) + "\t");
			}
			System.out.println(); // ���� -> **��ġ�� ���⿡?
			                      // ù���� for������ dan�� 1�ϰ��, �ȿ��ִ�for�� ��� ��ģ�� 
			                      // ����� �״��� dan =2�ϰ�� �ݺ� 
		}

	}

}
