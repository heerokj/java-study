package day17;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOEx9 {
	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = new FileOutputStream("c:\\dos.txt");
		
		DataOutputStream dos = new DataOutputStream(fos); //DataOutputStream(OutputStream out)
				
		dos.writeUTF("ȫ�浿");
		dos.writeInt(20);
		dos.writeFloat(180.0f);
		dos.writeFloat(60.0f);
		
		//���� : �� true �� : false true
		dos.writeBoolean(true);
		
		//������ ������ �о����
		
		//�������ٱ��� �ɷ��� �ִ� Ŭ���� 
		FileInputStream fis = new FileInputStream("c:\\dos.txt");
		
		//primitive type �ڷḦ ���� �� �ִ� Ŭ����
		DataInputStream dis = new DataInputStream(fis);//DataInputStream(InputStream in)
		
		
		
		//�о�ö��� ������ �߿� (������ �������)
		String name = dis.readUTF();
		int age = dis.readInt();
		float height = dis.readFloat();
		float weight = dis.readFloat();
		boolean gender = dis.readBoolean(); 
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
		System.out.println(weight);
		System.out.println((gender)?"��":"��");
		
	}

}
