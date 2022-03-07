package day09hw2;

public class Q10 {
	public static void main(String[] args) {
		Circle c = new Circle(10);
		c.draw();
	}
}

abstract class Shape {
	public void paint() { //����޼ҵ�
		draw();
	}

	abstract public void draw(); //�߻�޼ҵ�
}

//�θ�Ŭ����(�߻�)���������� �ڽĵ� �߻�Ŭ������(??) 
//���� �߻�Ŭ������� => ���θ޼��忡�� �ν��Ͻ� ��������??�Ф�
class Circle extends Shape { 

	private int radius; //�������

	public Circle(int radius) { //������
		this.radius = radius;
	}

	double getArea() { //��� �޼ҵ�
		return 3.14 * radius * radius;
	}
	
	@Override
	public void draw() {
		System.out.println("������="+radius);
}

}

// (1) 3���� 4�� 
//�߻�Ŭ������ �ν��Ͻ�ȭ �� �� ���� ������ ������ �߻��Ѵ�. new ����
// (2) ���� 
