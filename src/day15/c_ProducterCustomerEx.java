package day15;

public class c_ProducterCustomerEx {
	public static void main(String[] args) {
	
		c_Car car = new c_Car(); 

		// �ڵ��� ȸ��
		c_Producter p = new c_Producter(car);

		// ��
		c_Customer c = new c_Customer(car);

		p.start(); 
		c.start();

	}

}
