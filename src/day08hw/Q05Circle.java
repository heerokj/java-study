package day08hw;

public class Q05Circle extends Q05Figure {

	int r;

	Q05Circle() {
		r = 5;
	}

	double CircleArea() {
		return r * r * (Math.PI);
	}

	@Override
	public void type(String name) {
		System.out.println("이것은" + name + "입니다.");
	}
}
