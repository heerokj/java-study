package day06; // Person ���赵!

public class Person {
	
	public int ����;
	public int ��; 
	public int ��; 
	public int ��;
	public String �̸�; 
	public String ����; 
	public String ����;

	
	
	//�����Ǿ����� defalut�� ->�� �����ڴ� ���� ��Ű���������� �����Ұž� => �ٸ� ��Ű������ ���ٰ��� ��)day07 TestMain4 class
	public Person(){
		�̸� = "ȫ�浿";
		���� = 20;
	}
		
	public void setAge(int age) {
		this.���� = age;
	}
	
	public int getAge() {
		return this.����;
	}
	
	
	
	
	void �Ա�(){
		System.out.println("�ͱ���");
	}
	void �ڱ�(){
		System.out.println("����");
	}
	void �����ϱ�(){
		System.out.println("��~~");
	}
}
