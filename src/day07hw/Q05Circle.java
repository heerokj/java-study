package day07hw; //Q05. 원 클래스를 생성하시오

public class Q05Circle {
	
	int r;
		
	void setR(int r) {
		this.r = r;				
	}	
	int getR() {
		return this.r;
	}

		
	double getCalArea() {
		return r*r*(Math.PI);				
	}

	
	public static void main(String[] args) {
		Q05Circle c = new Q05Circle();
		
		c.setR(100);
		System.out.println("원의 넓이 :" +c.getCalArea());			
	}
}
	
