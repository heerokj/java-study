package day17; //ok

import java.io.IOException;

public class IOEx7 {
	public static void main(String[] args) throws IOException {
		
		// 1. System.in.read()
		// 2. Scaner
		
		//Ű����� ���� �Է¹��� ���� ȭ�鿡 ���
		System.out.print("�Է�: (���� : crl+z)");
		int value = 0;
		
		while((value = System.in.read()) != -1) {  //Ű���� �Է��� system.in ?
			System.out.print((char)value); //�ѱ۾ȵ�
		}
		
	}

}
