package day15;

public class c_ProducterCustomerEx {
	public static void main(String[] args) {
	
		c_Car car = new c_Car(); 

		// 자동차 회사
		c_Producter p = new c_Producter(car);

		// 고객
		c_Customer c = new c_Customer(car);

		p.start(); 
		c.start();

	}

}
