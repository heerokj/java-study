package day10;

public class StringEx2 {

	public static void main(String[] args) {

		String str = "java oracle";

		// +++
		// ���° ����ã��
		// 4��° ����(�迭�� �ε����� 0����)
		char ch = str.charAt(3);

		System.out.println("4��°���� : " + ch); // 4��°���� : a
		System.out.println("---------------");

		
		// +++
		// ���ڿ� ����
		String str2 = "������";
		String str3 = "ȭ����";
		String str4 = str2.concat(str3);
		System.out.println("str4 :" + str4); // str4 :������ȭ����
		String str5 = "������";
		String str6 = str4 + str5;
		System.out.println(str6); // ������ȭ���ϼ�����

		
		// �̷��� �����ص� ok
		// +++ �޼��� ü�̴� +++
		System.out.println("������".concat("ȭȭȭ").concat("������"));
		System.out.println("---------------");

		
		//+++
		boolean flag = str.contains("java");

		System.out.println(flag); // true   ???
		// equals() : �����
		// equalsIgnoreCase()
		// ��ҹ��ڸ� �����ϰ� ������ �������� ���ϴ� �޼���

		boolean isSame = str.equalsIgnoreCase("JAVA ORACLE");
		System.out.println("equalsIgnoreCase() : ��ҹ��� �����ϰ�� :" + isSame);
		System.out.println("---------------");

		
		//+++
		// Ư�� ������ ��ġ�� ����(�� �迭�� �ε����� 0���� ����)
		int position = str.indexOf('r');
		System.out.println(position); // 6(���������ϴϱ�)

		//+++
		// length() : ���ڿ��� ����
		System.out.println(str.length()); //11

		//+++
		// ���ڸ� �������� ���		
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i)); //elcaro avaj
		}
		System.out.println();
		System.out.println("-----------");

		//+++
		// ���ڿ��� char�迭�� �����ϴ� �޼���
		char[] ch2 = str.toCharArray();
		for (int i = 0; i < ch2.length; i++) {
			System.out.print(ch2[i]); //java oracle
		}
		System.out.println();
		
		// �������� ���
		for (int i = str.length() - 1; i <= 0; i--) {
			System.out.print(ch2[i]);
		}
		System.out.println();
		System.out.println("----------------");

		int a = 20;
		
		
		// ���ڿ� �� ��ȯ
		String str7 = "" + a; // +���꿡 ���� �������� ���� �پ�
		System.out.println(str7); // 20
		System.out.println(str7.charAt(0)); // 2

		String str10 = String.valueOf(20);
		System.out.println(str10); // 20

		// ���ڿ��� �κ����� : substring
		System.out.println(str.substring(2, 6));
		// 2������ 6�������� ����

		// +++
		// id+ @������ : id�� ����
		String email = "dagda@hanfos.com";
		int pos = email.indexOf('@');
		System.out.println(pos); // 5
		// 5�� �������� �ʿ�
		System.out.println(email.substring(0, pos));
		System.out.println(email.substring(0, email.indexOf('@')));
		System.out.println();

		// +++
		String friendList = "aaa,bbb,ccc,ddd"; // ģ�����̵�
		String[] list = friendList.split(","); // ,�������� �и��ؼ� �迭�� ���
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
		System.out.println();

	}

}
