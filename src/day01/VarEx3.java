package day01;

public class VarEx3 {
	public static void main(String[]args) {
		byte b1 = 10;
		byte b2 = 50;
		
		System.out.println(b1);
		System.out.println(b2);
		
		short sh1 = 12812;
		
		
		// b1 ���� �ȿ� ����ִ� ���� sh1 ��� ������ ����
		// sh1 = b1; 
		// ū�� = ������; 
		// System.out.println(sh1); 
		// ������
		
		// b1 = sh1;
		// ������ = ū��.. ū���� �����ܿ� ���� �� ���ݾ�..
 		// ���������ȯ��?
		b1 =(byte)sh1;
		System.out.println(b1); //but ����ȯ�g���� ��¥ ū�������� �̻��ϰ� ���� ����..
		
		//2byte ũ��
		char c1 = 'a';
		char c2 = 97; // ASCII�ڵ� �� A:65 a:97 0:48 
		char c3 = '\u0061'; //�����ڵ� ��
		System.out.println(c1); 
		System.out.println(c2);
		System.out.println(c3);
		
		
		char ch1 ='j';
		char ch2 ='a';
		char ch3 ='v';
		char ch4 ='a';
		System.out.println(ch1+ch2+ch3+ch4); //418�� ��� (�׳� +���ԵǸ� ASCII�ڵ尡 �������Ե�)
		//+��  1.���������  2. ���Ῥ���� : ���ڿ��ڿ� + =>����
		System.out.println(""+ch1+ch2+ch3+ch4); //java���
		
		//������ ���� : string -----------------
		String str  = "java";
		System.out.println(str); 
		
		//ȭ�鿡 ǥ���ϱ� ����� Ű ��
		//Ư�� ���� : ��, ����
		// \n : ����	
		// \t : tab
		// \b :�齺���̽�
		// \\ : ����\
		// \' : '
		// \" : "
		System.out.println("������ \n ��ſ�\t ����� �Դϴ�.");
		
		//���� ���� : boolean  
		//c���� 1 or 0 ǥ������
		//�ڹ� �ݵ�� true, false�� ǥ��
		//��, ���� : ������ ������ �� �ִ� �ڷ���
		//boolean b = 1;
		boolean bl1 = true;  //1
		boolean bl2 = false; //0
		
		System.out.println(bl1);
		System.out.println(bl2);
		
		
		
				
	}

}
