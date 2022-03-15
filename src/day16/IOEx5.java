package day16;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOEx5 {
	
	public static void main(String[] args) throws IOException {
		
		File f1 = new File("c:\\Hello.java");
		File f2 = new File("c:\\Hello5.java");
		
		//파일에 접근해서 읽어오는 능력이 있는 클래스
		FileInputStream fis = new FileInputStream(f1);	
		FileOutputStream fos = new FileOutputStream(f2);
		
		//BufferedInputStream(InputStream in)
		//InputStream객체와 그의 후손들(부모자식관계 성립하게 때문에)
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		
		//bis : buffer사용가능 + file접근가능
		
		int value = 0;
		
		while((value = bis.read()) != -1) {
			bos.write(value);
			System.out.print((char)value);
		}
		bos.flush();
	}

}
