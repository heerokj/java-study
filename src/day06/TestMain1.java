package day06;
// reference Ÿ�� ���� : array, class, interface
public class TestMain1 {
	public static void main(String[] args) {
		//���赵�� ������ ��ü �����
		
		//�ڷ��� ������;
		//Ŭ������ ��������;
		//int a;
		Car c;
		//�������� = new ������();
		//new : ��ü �Ҵ� ������
		c = new Car();
		System.out.println(c);

		Car c2 = new Car(); //���� �Ѵ� �� ����
		//�޸𸮿� �Ҵ�� ��ü
		//�ϳ��� ��Ŭ������ ���� �������� �ν��Ͻ��� ������ ���մ�
		
		
		//������ ����
		System.out.println(c.�ڵ�); //0
		c.�ڵ� = 1; 
		System.out.println(c.�ڵ�); //1
		System.out.println("-----------");
		System.out.println(c2.�ڵ�);  //0
		//c �ڵ����� ���� ����� ���
		System.out.println(c.����);   //0
		
		c.����();  // �θ��θ�
		System.out.println("-----------");
		
		
		Car myCar = new Car();
		
		myCar.���� = "��Ʋ��";
		myCar.���� = 4;
		
		System.out.println(myCar.����);
		
		//���ο� �ڵ��� ��ü�� ����� ��������� ����
		//(������ ���� ���) �ʱ�ȭ��Ű�� �������Ѻ�����
		//�̸��� friendCar 
		
		Car friendCar = new Car();
		friendCar.���� = "����";
		friendCar.���� = 4;
		friendCar.�� = 2;
		friendCar.�ӵ� = 0;
		friendCar.�ڵ� = 1;
		System.out.println(friendCar.����);
		
		friendCar.����();
		friendCar.����();
		System.out.println();
	}
	
	

}
