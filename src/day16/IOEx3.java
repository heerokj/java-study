package day16;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOEx3 {
	public static void main(String[] args) throws IOException {

		// c:\\Hello.java파일의 내용을 c:\\Hello3.java에 다른파일로 생성하기

		// 1.Hello.java파일 객체 f1 생성
		File f1 = new File("c:\\Hello.java");
		// 2.Hello3.java파일 객체 f2 생성
		File f2 = new File("c:\\Hello3.java");

		
		FileInputStream fis = new FileInputStream(f1);
		FileOutputStream fos = new FileOutputStream(f2);

		
		// fis.read() : 아스키코드 값으로 읽어옴
		int value = 0;
		// 3.f1를 이용해서 파일 읽어오기('1'바이트씩)
		while ((value = fis.read()) != -1) { //읽어온값  value에 저장
			// 4.f2를 이용해서 파일 쓰기
			fos.write(value); //읽어온 값을 파일에써
			System.out.println((char) value);
		}

	}

}
