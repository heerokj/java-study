package day10;

import java.util.Scanner;

public class TestMain1 {
	public static void main(String[] args) {

		// ����ڷκ��� ���ڸ� �Է¹ޱ�
		System.out.println("�����Է� : "); // 220304 3xxxxxx
		Scanner sc = new Scanner(System.in);

		String data = sc.next();
		System.out.println(data);

		String year = data.substring(0, 2);
		String month = data.substring(2, 4);
		String day = data.substring(4, 6);
		String type = data.substring(6, 7);
		String gender ="";
		if(type.equals("1")||type.equals("3")) {
			gender = "����";		
		}else {
			gender = "����";
		}
		
		System.out.println(year+"��"+month+"��"+day+"�ϻ�"+gender +"�Դϴ�.");
		System.out.println();
		System.out.println(data.substring(0,2)+"��"+data.substring(2,4)+"��"
				+data.substring(4,6)+"�ϻ�"+((type.equals("1")||type.equals("3"))?"����":"����")+"�Դϴ�");
		
		

	}

}
