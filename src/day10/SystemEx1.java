package day10;

public class SystemEx1 {

	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());
	// ���� �ð��� Milliseconds �������� ����
	
		System.gc(); //garbage collectorȣ��
		
	System.out.println(System.currentTimeMillis());
	System.exit(0); // 0�� �������� 0�̾ƴ� �ٸ����� ����������
	System.out.println("test");
	}
}
