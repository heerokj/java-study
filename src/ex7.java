
public class ex7 {
	public static void main(String[] args) {

		Car car  = null;
		Fire fe = new Fire();
		
		Fire fe2 = (Fire)car;
		Car car2 = (Car)fe;	
		
		car2.stop();
		car2.drive();
		System.out.println(car2.color);
		System.out.println(car2.door);				
	}
}

class Car {
	String color;
	int door;

	void drive() {
		System.out.println("ºÎ¸ª");
	}

	void stop() {
		System.out.println("stop");
	}
}

class Fire extends Car {
	void water() {
		System.out.println("water");
	}
}
