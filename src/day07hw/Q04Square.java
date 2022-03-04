package day07hw; //Q04. 사각형 클래스를 생성하시오

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
//		System.out.println(width*height);     에러남..왜 이건 안되지..ㅜㅜ -> ok해결
//	}

	public static void main(String[] args) {
		Q04Square s = new Q04Square();
		s.setWidth(100);
		s.setHeight(100);
		System.out.println("사각형의 넓이 : " + s.getCalArea());
	}


}
