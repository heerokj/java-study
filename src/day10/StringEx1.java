package day10;

public class StringEx1 {

	public static void main(String[] args) {
		String str1 = new String("java");
		String str2 = new String("java");
	
		// ==  =>��������
		if(str1 == str2) {
			System.out.println("���� ��ü");
		}else {
			System.out.println("�ٸ���ü"); // �ٸ���ü ���(������ ������� �� ������ �޶� �ٸ���ü��)
		}
		
		if(str1.equals(str2)) {
			System.out.println("������ ���ڿ�");  //O���(���ڿ� ��ü�� ���ϴ°��̱� ������)
		}else {
			System.out.println("�ٸ� ���ڿ�");
		}
		//��,  
		//Object Ŭ���� : equals() : ���ϰ�ü���� ������ ��
		//String Ŭ���� : equals() : Override method
		System.out.println("-------------");
		
		
		System.out.println(str1);
		System.out.println(str1.toString()); 
		// Overriding mothod�� ���ڿ���ü�� ���
	
		
		//������
		System.out.println(str1.getClass().getName()+ '@' + Integer.toHexString(str1.hashCode()));
	
		
		//Ŭ�������� primitive typeó�� ����� �� �ִ� �������� Ŭ���� : String
		//char[] --> ����
		String str3 = "java";
		String str4 = "java";
		
		if(str3 == str4) {
			System.out.println("���� ��ü"); 
		}else {
			System.out.println("�ٸ���ü"); 
		}//���� ��ü ��� =>String�� �������ڿ� ������ ���� ���������
		
		
		//deprecated : �� �̻� �Ⱦ�
	}
}