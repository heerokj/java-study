package day09;
//static����, static method��
//static area�� �ε��Ǵ� ����,method

//new
public class TestMain4 {
		
	//public : ��𿡼��� ���� ������
	//static : ������
	//void : ���ϰ��� ����
	//main : main �̸��� ���� �޼���
	//(String[] args) :String �迭�� �Ű������� ����..
	public static void main(String[] args) {
		
		// +++++��ó�� �ν��Ͻ�ȭ ���ص� ��밡�� 		
//		System.out.println(SmartPhone.company); //null���
//		SmartPhone.company = "���";
//		System.out.println(SmartPhone.company); //������
			
		
		SmartPhone sp1 = new SmartPhone("�����Ұ�å","���̰���","01011112222","������",500000);
		SmartPhone sp2 = new SmartPhone("G3","�ѱ�","01022223333","L*",1000000);
		
		System.out.println("sp1.company : "+sp1.company); //L*
		System.out.println("sp2.company : "+sp2.company); //L*
		
		System.out.println("sp1�� SmartPhone�� �ν��Ͻ� : "+(sp1 instanceof SmartPhone));//�ν��Ͻ����� �ƴ��� ���
		System.out.println("-----------------------------------");
		sp2.company = "��*";//SmartPhoneŬ���� ��������� static���ΰ��,�������sp1�� ����Ű�� ���κ����� �����Ͽ����� sp1,sp2�� ����Ű�°� �Ѵٹٲ� 
		System.out.println("sp1.company : "+sp1.company); //��*
		System.out.println("sp2.company : "+sp2.company); //��*
		

		
	}

}
