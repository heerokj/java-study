package day03;

public class StatementEx09printf {

	public static void main(String[] args) {

		int year = 2022;
		int month = 2;
		int day = 20;
		System.out.println("������ " + year + "�� " + month + "�� " + day + "�� �Դϴ�.");

		System.out.printf("������ %d�� %d�� %d�� �Դϴ�.", year, month, day); // printf ����ϸ� +��ȣ �ʿ���� ��°���

		// ù��° �μ����� ��������� �����ϰ�
		// �ι�° �ڸ����� ���� �Ҵ�

		// %d : ����, %b : ��, %c : ����, %f : �Ǽ�, %s : ���ڿ��� �ǹ�
		System.out.println();
		System.out.println("-------------------");

		int hour = 10;
		int minute = 50;
		int second = 10;
		String nation = "�ѱ�";

		System.out.println(nation + " �ð��� ���� " + hour + "�� " + minute + "�� " + second + "�� �Դϴ�.");
		System.out.printf("%s �ð��� ���� %d�� %d�� %d�� �Դϴ�.", nation, hour, minute, second);

		System.out.println("-------------------");

		String name = "ȫ�浿";
		int age = 20;
		float height = 182.3f;
		float weight = 75.3f;

		System.out.println("�� �̸��� " + name + "�̰� ���̴� " + age + "�� Ű�� " + height + " �����Դ� " + weight + " �Դϴ�.");
		System.out.printf("�� �̸��� %s�̰� ���̴� %d�� Ű�� %f�� �����Դ� %f�� �Դϴ�.", name, age, height, weight);
	}

}
