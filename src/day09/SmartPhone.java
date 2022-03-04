package day09;
//static
//정적변수 /공용변수
//heap에 저장되지 않고 static area에 저장 -> 한개밖에 저장못함
//인스턴스화 안해도(new 안해도) 사용 가능
public class SmartPhone {
	String prodnctName, nation, phoneNumber;
	static String company; //++정적변수 => ++main메소드에서 결과보기!
	int price; 
	
		//생성자 만들기 : 오른쪽 마우스 -> 소스 -> 유징필드			
		public SmartPhone(String prodnctName, String nation, String phoneNumber, String company, int price) {
			super();
			this.prodnctName = prodnctName;
			this.nation = nation;
			this.phoneNumber = phoneNumber;
			this.company = company;
			this.price = price;
		}
		
		
		void call() {
			System.out.println("따르릉");
		}
		void receive() {
			System.out.println("전화받았습니다");
		}
		void playGame() {
			System.out.println("게임게임~");
		}
	}

