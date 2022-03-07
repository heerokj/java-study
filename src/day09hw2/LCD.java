package day09hw2;

public class LCD {
	private int size;
	
	public LCD(int n) {
		size = n;
	}
}


class ColorLCD extends LCD {
	int colorSize;

	public ColorLCD(int colorSize, int size) {	
		super(size);  
		this.colorSize = colorSize;
	}
}
