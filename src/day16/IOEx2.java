package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOEx2 {
	public static void main(String[] args) throws IOException {
		
		byte[] b = {'j','a','v','a'};
		
		File f = new File("c:\\javaout.txt");
		
		//자바에서 외부로 내보내기(파일로) 전용 클래스
		//FileOutputStream 
		FileOutputStream fos = new FileOutputStream(f);//예외전가throws FileNotFoundException
		
		//c드라이브에 저장됨
	//	fos.write(112); //예외전가 throws IOException
	
		//c드라이브에 저장됨
		fos.write(b); //배열의 이름을 써줘도 됨 
	
	}
	

}
