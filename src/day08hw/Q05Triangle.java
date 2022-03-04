package day08hw;

public class Q05Triangle extends Q05Figure{

	int Length, height;

	Q05Triangle(){
		Length = 10;
		height = 5;
	}
	
	double TriangleArea() {
		return (Length*height)/2;				
	}
	
	@Override
	public void type(String name) {
		System.out.println("이것은" + name + "입니다.");
	}
	
	
}
