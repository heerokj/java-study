package day17;  //MemberŬ������ ����  // '��ü' �о����   ok 

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class IOEx12 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		
		FileInputStream fis = new FileInputStream("c:\\member.txt");
		
		//��ü�о����
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		//�����о�
		Object obj = ois.readObject(); // readObject()
		
		//������Ʈ�� �޼��� 11���ۿ������� 
		//��ü����ȯ
		Member m2 = (Member)obj; 
		System.out.println(m2.getName()); //�Ѱ��� ������ ��������
		System.out.println(m2.getId()); 
		System.out.println(m2.getPw()); 
		System.out.println(m2.getAddrs()); 
		System.out.println(m2.getEmail()); 
		System.out.println(m2.getAge()); 
		
		
		
	}

}
