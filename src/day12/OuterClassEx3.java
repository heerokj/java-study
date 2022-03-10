package day12;
//3. local inner class : ��������ó�� ���Ǵ� Ŭ����
public class OuterClassEx3 {

	private int a = 10;
	static int b = 20;
	static final int c = 30;

	public void printAll() {
		int k = 0; // ��������
		// System.out.println("printall()");

		
		// �޼����� ��������ó�� ���
		class LocalInnerClass {
			int d = 40;
			//static int e = 50;  //�ƿ���Ŭ������ �� ���������� ���ȵ�
			static final int f = 60;

			void print() {
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
				System.out.println(d);
				//System.out.println(e);
				System.out.println(f);
			}//printAll()end
		}//LocalInnerClass end
		
		//�޼��尡 ������ ������ ����ؾ� (��������ó��)
		LocalInnerClass lic = new LocalInnerClass();
		lic.print();
	}//printAll()end

	public static void main(String[] args) {
		OuterClassEx3 oce = new OuterClassEx3();
		oce.printAll();
	}
}
