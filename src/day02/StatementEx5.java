package day02;
//��� ��

//���Ǻб⹮ : Ư�� ���ǿ� ���� �ٸ� ������ �����Ű���� �Ҷ� ���
//  if(����){                ���ǿ� ���� else if �� ���� ����!
//     ����1;                          else�� ���� ����! �Ѵ� ���� ����!
//  }else if(����){
//     ����2;
//} else if(����){
//     ����3;
//} else(����){
//     ����4;

import java.io.IOException;

public class StatementEx5 {

// ����: �Է��� ���ڰ� ¦������ Ȧ������ �Ǵ� : �޼��� ���	
	public static void main(String[] args) throws IOException {
		System.out.println("�����Է� :");
		// 1. ����ڷκ��� ���ڸ� �Է¹޴´�.
		int n = System.in.read();
		System.out.println("n:" + n);

		// 2. �ƽ�Ű�ڵ� ==> ����
		n -= 48;

		// 3. 2�� ���� ������ 0�̸� ¦�� �ƴϸ� Ȧ��
		 
		if (n % 2 == 0) {
			System.out.println("¦���Դϴ�.");
		} else {
			System.out.println("Ȧ���Դϴ�.");

		}
	}
}
