package day09hw2;

public class Q10 {
	public static void main(String[] args) {
		Circle c = new Circle(10);
		c.draw();
	}
}

abstract class Shape {
	public void paint() { //멤버메소드
		draw();
	}

	abstract public void draw(); //추상메소드
}

//부모클래스(추상)물려받으니 자식도 추상클래스임(??) 
//만약 추상클래스라면 => 메인메서드에서 인스턴스 생성가능??ㅠㅠ
class Circle extends Shape { 

	private int radius; //멤버변수

	public Circle(int radius) { //생성자
		this.radius = radius;
	}

	double getArea() { //멤버 메소드
		return 3.14 * radius * radius;
	}
	
	@Override
	public void draw() {
		System.out.println("반지름="+radius);
}

}

// (1) 3번과 4번 
//추상클래스는 인스턴스화 될 수 없기 때문에 에러가 발생한다. new 못함
// (2) 위에 
