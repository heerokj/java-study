package day07;

public class SuperManMain {
	public static void main(String[] args) {

		// SuperMan sm = new SuperMan();
		// �θ� ������(Person���ִ�) �ҷ�����,
		// �ڽ�Ŭ���� ������ �ҷ�����

		SuperMan sm = new SuperMan("Ŭ��ũ", "��������", 20, 190.0f, 70.0f);

		System.out.println(sm.age);
		System.out.println("�̸� : " + sm.name); // Ŭ��ũ
		System.out.println("Ű : " + sm.height); // 190.0
		System.out.println("������ : " + sm.weight); // 70.0
		System.out.println("���� : " + sm.job); // ��������
		sm.eating();
		sm.�������߻�();
		sm.�����ϱ�();

	}
}
