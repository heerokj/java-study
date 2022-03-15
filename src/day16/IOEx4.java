package day16;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOEx4 {
	public static void main(String[] args) throws IOException {

		File f = new File("c:\\Hello.java");
		File f2 = new File("c:\\Hello4.java");

		FileReader fr = new FileReader(f);
		FileWriter fw = new FileWriter(f2);

		
//		int value = 0;
//		value = fr.read();
//		System.out.println(value);

		
		// '2'바이트씩 읽어오기
		// 반복해서
		int value = 0;
		while ((value = fr.read()) != -1) {
			System.out.print((char) value);// 읽어오기
			fw.write(value); // .write(int c) //쓰기(c드라이브에 Hello4.java생김)
		}
		//Buffer 비워..
		//쓴다고 바로 써지는게 아니라 버퍼에 저장 => 버퍼 비우면 Hello4.java에 내용 저장됨
		fw.flush(); 

	}
	
}
