package day09;

public class TestMain6 {
	public static void main(String[] args) {
		System.out.println(Test.no); //new���ص� ���� /TestŬ�������� static���� �޼ҵ��
		Test.show(); //new �ϱ� �� ȣ�Ⱑ��
		
		System.out.println("------------");
		
		Test t = new Test();
		System.out.println(t.no2);//�Ϲݺ����� new������� �� ȣ�Ⱑ��
		t.show2();//�Ϲݸ޼��嵵 new ������� �� ȣ�Ⱑ��
		
		
		
	}

}
