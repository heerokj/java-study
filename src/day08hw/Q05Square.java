package day08hw;

public class Q05Square extends Q05Figure{

	int Length, height;
	
	Q05Square(){
		Length = 10;
		height = 5;
	}
	
	
	double SquareArea() {
		return Length*height;				
	}
	
	@Override
	public void type(String name) {
		System.out.println("이것은" + name + "입니다.");
	}
	
	
}
