package day06hw;

public class Q09 {

	public static void main(String[] args) {

		Q09Phone p1 = new Q09Phone("������S22", "�Ｚ", 1000000, "010-1111-2222");
		Q09Phone p2 = new Q09Phone("ȫ�̳�Ʈ", "������", "010-2222-3333");
		Q09Phone p3 = new Q09Phone("������", "����", "�߱�", "010-3333-4444");

		p1.status();
		p2.status();
		p3.status();
	}
}
