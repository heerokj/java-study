package day07hw; //Q04. �簢�� Ŭ������ �����Ͻÿ�

public class Q04Square {

	int width;
	int height;

	void setWidth(int width) {
		this.width = width; 
	}

	int getWidth() {
		return this.width;
	}

	void setHeight(int height) {
		this.height = height;
	}

	int getHeight() {
		return this.height;
	}

	int getCalArea() {
		return width * height;
	}

//	void getCalArea() {
//		System.out.println(width*height);     ������..�� �̰� �ȵ���..�̤� -> ok�ذ�
//	}

	public static void main(String[] args) {
		Q04Square s = new Q04Square();
		s.setWidth(100);
		s.setHeight(100);
		System.out.println("�簢���� ���� : " + s.getCalArea());
	}


}
