package day07hw; //Q01. 각 변수마다 setter, getter method를 추가

public class Q01HandPhone {

	private String productName;
	private String productType;
	private int price;
	private String phoneNumber;

	public void setPname(String productName) {
		this.productName = productName;
	}

	public String getPname() {
		return this.productName;
	}

	public void setPtype(String productType) {
		this.productType = productType;
	}

	public String getPtype() {
		return this.productType;
	}

	public void Price(int price) {
		this.price = price;
	}

	public int Price() {
		return this.price;
	}

	public void setPnumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPnumber() {
		return this.phoneNumber;
	}

}
