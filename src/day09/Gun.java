package day09;

public class Gun implements Weapon{
	int bullet;

	Gun() {
		bullet = 6;
	}

	public void use() {
		if (bullet > 0) {
			System.out.println("����~!");
			bullet--;
		} else {
			System.out.println("ƽ~");
		}
	}

	public void reuse() {
		System.out.println("Gun �Ѿ����� ��ī��");
	}

}
