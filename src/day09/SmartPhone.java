package day09;
//static
//�������� /���뺯��
//heap�� ������� �ʰ� static area�� ���� -> �Ѱ��ۿ� �������
//�ν��Ͻ�ȭ ���ص�(new ���ص�) ��� ����
public class SmartPhone {
	String prodnctName, nation, phoneNumber;
	static String company; //++�������� => ++main�޼ҵ忡�� �������!
	int price; 
	
		//������ ����� : ������ ���콺 -> �ҽ� -> ��¡�ʵ�			
		public SmartPhone(String prodnctName, String nation, String phoneNumber, String company, int price) {
			super();
			this.prodnctName = prodnctName;
			this.nation = nation;
			this.phoneNumber = phoneNumber;
			this.company = company;
			this.price = price;
		}
		
		
		void call() {
			System.out.println("������");
		}
		void receive() {
			System.out.println("��ȭ�޾ҽ��ϴ�");
		}
		void playGame() {
			System.out.println("���Ӱ���~");
		}
	}

