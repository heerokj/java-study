package day07hw;

public class Q07Test {
	public static void main(String[] args) {

		Q07Monkey m = new Q07Monkey();{
		System.out.println("�������� �� :" + m.eye);
		System.out.println("�������� �� :" + m.nose);
		System.out.println("�������� �� :" + m.ear);
		System.out.println("�������� �̸� :" + m.name);
		System.out.println("�������� �� :" + m.epecies);

		m.eating("�ٳ���");
		m.sleeping();
		m.climbing();
		}

	Q07Rabbit r = new Q07Rabbit();{

		System.out.println("�䳢�� �� :" + r.eye);
		System.out.println("�䳢�� �� :" + r.nose);
		System.out.println("�䳢�� �� :" + r.ear);
		System.out.println("�䳢�� �̸� :" + r.name);

		r.eating("���");
		r.sleeping();
		r.jumping();
	}

	Q07Whale w = new Q07Whale();{

		System.out.println("���� �� :" + w.eye);
		System.out.println("���� �� :" + w.nose);
		System.out.println("���� �� :" + w.ear);
		System.out.println("���� �̸� :" + w.name);

		w.eating("����");
		w.sleeping();
		w.swimming();
	}
 }
}
