package day17; //MemberŬ������ ����  // '��ü' �����ϱ�   ok 

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class IOEx11 {
	public static void main(String[] args) throws IOException {
		
		//��� ��ü�� �����Ͽ� c:\\member.txt ���Ͽ� ����
		
		Member m1 = new Member("aaa", "bbb","hong","������","hong@gmail.com", 20 );
		
		FileOutputStream fos = new FileOutputStream("c:\\member.txt");
					
		// ��ü�� ���� 
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		//Serializable �������̽��� ������ ��ü�� �����ϰ� ���� �� ����(member class ���� Serializable �������̽���?)
		oos.writeObject(m1); //writeObject(Object obj) 
		
		
	}

}
