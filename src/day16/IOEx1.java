package day16;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class IOEx1 {
	public static void main(String[] args) throws IOException {
		
		//InputStream : System.in : 키보드
		
//		int value = System.in.read(); //예외전가(throws IOException)
//		System.out.println(value);
		
		File f =  new File("c:\\Hello.java");  //파일이 있던없던 객체생성가능
		FileInputStream fis = new FileInputStream(f);
		//위는 FileInputStream(File file)
		
	//	int value = fis.read();
	//	System.out.println(value); //112 출력 : 파일열었을때의 첫글자의 아스키코드값(한바이트만 읽어올수있기에)
		
		//파일 내용 한글자한글자 다 출력하고싶어
		int value =0;//
		while ((value = fis.read()) != -1) {
			char c = (char)value;//아스키코드값 문자로 형변환
			System.out.print(c); //한글은 깨짐 : 자바는 유니코드
		}
		
	}

}
