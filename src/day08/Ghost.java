package day08;

public class Ghost extends Terran {

	int ���ݷ�;

	Ghost() {
		hp = 150;
		x = 0;
		y = 0;
		���ݷ� = 8;
		���� = 3;
		�̵��ӵ� = 4;
		���ݼӵ� = 3;
		System.out.println("��Ʈ �⺻������");
	}

	void �����ϱ�(Terran g) {
		System.out.println("�ѵεεεεε�");
		g.hp -=���ݷ�;
	}

	void �ٰ���() {
		System.out.println("Nuclear Lunch Detected");
	}

}
