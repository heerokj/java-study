package day07hw; //Q06 . �ﰢ�� Ŭ������ �����Ͻÿ�.

public class Q06Triangle {
	
	int width, height;
	
	
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
		return (width*height)/2;
	}

	
	public static void main(String[] args) {
		Q06Triangle t = new Q06Triangle();
		
		t.setHeight(100);
		t.setWidth(100);
		System.out.println("�ﰢ���� ���� : " + t.getCalArea());		
	}
}
