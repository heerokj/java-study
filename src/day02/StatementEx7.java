package day02;
//java.util ��Ű�� �ȿ� Scanner Ŭ������ ������ ���� import �� �� �� �ش� Ŭ���� ��θ� ȣ��
import java.util.Scanner; //scanner Ŭ���� ȣ��

//��ĳ�� - ������ �ƽ�Ű�ڵ� �� �� ����
public class StatementEx7 {

	public static void main(String[] args) {

		System.out.println("���� �Է� :");
		
		Scanner sc = new Scanner(System.in); // ��ĳ�� ��ü ����
		int score = sc.nextInt(); // ������ �о����

		System.out.println("score :" + score);

		
		
		if (score >= 90) {
			System.out.println("���� : A");
		} else if (score >= 80) {
			System.out.println("���� : B");
		} else if (score >= 70) {
			System.out.println("���� : C");
		} else if (score >= 60) {
			System.out.println("���� : D");
		} else {
			System.out.println("���� : E");
		}
		
		System.out.println("---�ٸ� ��Ÿ�Ϸ� �����---");
		
		String grade = "";
		if (score >= 90) {
			grade  = "a";
		} else if (score >= 80) {
			grade  = "b";
		} else if (score >= 70) {
			grade  = "c";
		} else if (score >= 60) {
			grade  = "d";
		} else {
			grade  = "e";
		}
		System.out.println("����� ������ " + score + "�� ���� : " +grade);
			
		
	}

}
