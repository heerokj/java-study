package day09;

public class Marine extends Terran implements Flyable {

	int ���ݷ�;

	@Override
	public void fly() {
		System.out.println("��Ʈ �л�� ����");
	}

	Marine() {
		hp = 100;
		x = 0;
		y = 0;
		��Ÿ� = 4;
		���ݷ� = 5;
		���� = 3;
		�̵��ӵ� = 4;
		System.out.println("���� �⺻ ������ ȣ���");
	}

	void �����ϱ�(Terran m) {
		System.out.println("�����ϱ� �޼����� m : " + m);
		m.hp -= ���ݷ�;
	}

	void ������() {
		if (hp > 3) { 
			System.out.println("����~~"); 		
			hp -= 3; 			
			���ݼӵ� += 2;		
			�̵��ӵ� += 2; 
		} else {
			System.out.println("ü���� �����մϴ�."); 
		}
	}

}
