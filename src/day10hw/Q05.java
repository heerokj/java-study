package day10hw;

public class Q05 {
	public static void main(String[] args) {
		
		String str1 = new String("java study");
		String str2 = new String("java study");		
		System.out.println(str1==str2); //false ��� => ������ �ٸ�
		System.out.println(str1.equals(str2)); //true ��� => ���ڿ� ��ü ��
		
		
		String str3 = "java study";
		String str4 = "java study";
		System.out.println(str3 == str4); //true ���
		System.out.println(str3.equals(str4)); //true ��� =>String�� �������ڿ� ������ ���� ���������

				
		System.out.println(str1.toString()); //java study���
				
	}

}
