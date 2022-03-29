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
				
		dos.writeUTF("홍길동");
		dos.writeInt(20);
		dos.writeFloat(180.0f);
		dos.writeFloat(60.0f);
		
		//성별 : 남 true 여 : false true
		dos.writeBoolean(true);
		
		//저장한 내용을 읽어오기
		
		//파일접근권한 능력이 있는 클래스 
		FileInputStream fis = new FileInputStream("c:\\dos.txt");
		
		//primitive type 자료를 읽을 수 있는 클래스
		DataInputStream dis = new DataInputStream(fis);//DataInputStream(InputStream in)
		
		
		
		//읽어올때는 순서가 중요 (저장한 순서대로)
		String name = dis.readUTF();
		int age = dis.readInt();
		float height = dis.readFloat();
		float weight = dis.readFloat();
		boolean gender = dis.readBoolean(); 
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
		System.out.println(weight);
		System.out.println((gender)?"남":"여");
		
	}

}
