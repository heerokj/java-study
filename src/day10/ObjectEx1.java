package day10;

public class ObjectEx1 {
	public static void main(String[] args) {
		Object obj1 = new Object(); // ����X =>�̹� ��������ִ� Ŭ����
		Object obj2 = new Object(); 

		System.out.println("obj1 : "+obj1);
		System.out.println("obj2 : "+obj2);
		
		if(obj1 == obj2) {  //������ �ٸ�
			System.out.println("���ϰ�ü");
		}else {
			System.out.println("�ٸ���ü"); //�ٸ���ü ���
		}
		
		if(obj1.equals(obj2)) {  //������ �ٸ�(ObjectŬ���� equals�� �������� ��)
			System.out.println("���ϰ�ü");
		}else {
			System.out.println("�ٸ���ü"); //�ٸ���ü ���
		}
		System.out.println("-----------"); 
		
		
		System.out.println("obj1 : "+obj1); //obj1�� ������ ���
		System.out.println("obj1.toString() : "+obj1.toString()); 
		//toString �޼ҵ� : ��ü�� �������ִ� ������ ������ ���ڿ��� ����� �����ϴ� �޼ҵ�
		
		//������ : Ŭ�����̸� + @ + 16����(�ؽ��ڵ尪)
		//getClass : �������� ��ü�� ����	
	}

}
