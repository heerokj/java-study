package day09;

public class Gun implements Weapon{
	int bullet;

	Gun() {
		bullet = 6;
	}

	public void use() {
		if (bullet > 0) {
			System.out.println("»§¾ß~!");
			bullet--;
		} else {
			System.out.println("Æ½~");
		}
	}

	public void reuse() {
		System.out.println("Gun ÃÑ¾ËÀåÀü ÂûÄ«´Ú");
	}

}
