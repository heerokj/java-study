package day10hw;
//7. String Ŭ������ ���� ���Ǵ� �޼��带 �����ϰ�
//�� �޼��尡 � ����� �ִ��� �����Ͻÿ�.

public class Q07 {
	public static void main(String[] args) {
		
		String str = "java study";

		// +++ ���°���ִ� ����ã��
		char ch = str.charAt(2); 
		System.out.println(ch); 
		System.out.println("---------------");

		
		// +++���ڿ� ����
		String str2 = "�ڹ�";
		String str3 = "����"; 
		String str4 = str2.concat(str3);
		System.out.println(str4);		
		System.out.println("�ڹ�".concat("����").concat("�մϴ�"));
		System.out.println("---------------");

		
		//+++��ҹ��� �����ϰ� ������ �������� ��
		boolean b = str.equalsIgnoreCase("JAVA STUDY");
		System.out.println(b);
		System.out.println("---------------");

		
		//+++Ư�� ������ ��ġ�� ����
		int position = str.indexOf('s');
		System.out.println(position); 
		System.out.println("---------------");
		
		
		//+++���ڿ� ����
		System.out.println(str.length()); 
		System.out.println("---------------");
		
		
		//+++���ڸ� �������� ���		
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		System.out.println("---------------");
		
		
		//+++���ڿ��� char�迭�� �����ϴ� �޼���
		char[] ch2 = str.toCharArray();
		for (int i = 0; i < ch2.length; i++) {
			System.out.print(ch2[i]); 
		}
		System.out.println();
		System.out.println("---------------");
		
		
		

		// +++���ڿ��� �κ����� : substring
		System.out.println(str.substring(2, 6));
		System.out.println(str.substring(2));
		System.out.println("---------------");
		

		// +++�и��ϱ�
		String alp = "java,study,hahaha,hohoho"; 
		String[] list = alp.split(","); // ,�������� �и��ؼ� �迭�� ���
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
		System.out.println();
		
	}

}
