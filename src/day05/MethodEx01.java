package day05; // ok
public class MethodEx01 {
	// ���־��� �ڵ�� ���� �޼ҵ� ���� ���´�. (�ǹ��ִ� �޼ҵ� �̸�����)
    // ���⼭ �����ϸ� �ҷ����°�(�ٸ� ��)������ ��� ������
	
	// static void �̸�(){
	// �ڵ�;
	// }
	
	//method
	//cnt : �Ű�����, ����, ��ť��Ʈ
	 
	
	static void printStar(int cnt) {  //�޼ҵ� �� ��ȣ�� ���Ҽ� �ִ°� => ���θ޼ҵ忡�� �����Ҷ� //������ ���ɰ����� //���� �Ѱ��̰� �����Ҷ� �Ҵ絵 ���� �����ϴ� ���� �� ���� �ְ� �����ϴ°� 
		String str = "";
		for (int i = 1; i <= cnt; i++) {
			str += "*";               
			System.out.println(str);
		}
	}
	static void printCode(String code) {  //���� �� �ִ� �� �� Ÿ�԰��� ����
		String msg ="";
		for(int i=1; i<=6; i++){
			System.out.println(msg);
			msg += code;
		}
	}
	
	static void printGuGuDan(int dan) { 
		for(int i=1; i<=9; i++) {
			System.out.println(dan+"*"+i+" = "+dan*i);
			} 
	}
	 
	public static void main(String[] args) {

		printStar(3); //->�̷� �ڵ带 ���� ������ ���� �ö󰡼� �����ϰ� ���ƿ�
		printStar(3); //�� 3�����
	System.out.println("1");
		printStar(5); //�� 5���ٷ�
		System.out.println("2");
			
		printGuGuDan(5);
		printGuGuDan(2);
		printGuGuDan(6);
			
		printCode("+");
		
	}
}