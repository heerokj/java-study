package day07;
//import day06.Marine; //import�ؾ� �ٸ�
public class MarineMain {
	public static void main(String[] args) {
		Marine m1 = new Marine();
//		Marine m1; // ����=> Ŭ������ ���� ��Ű���� �־�� ���ٰ���
		m1.status();
		
		//ü�� ,x��ǥ,y��ǥ
		Marine m2 = new Marine(500,100,200); 
		m2.status();        
		
		//ü��, ���ݷ�, ���ݼӵ�, �̵��ӵ�
		Marine m3 = new Marine(200,20,20,8);
		m3.status();
	}
		
}
 
