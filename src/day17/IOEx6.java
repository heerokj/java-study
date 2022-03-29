package day17; //ok read읽어와서 다른파일에 write하기

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOEx6 {
	public static void main(String[] args) throws IOException {
		File f1 = new File("c:\\Hello.java");
		File f2 = new File("c:\\Hello6.java"); //file쓰기위한 객체생성
		
		
		FileReader fr = new FileReader(f1);	
		FileWriter fw = new FileWriter(f2);	 //쓰기객체
		
		//BufferedReader(Reader in) :Reader 객체와 그 후손들을 매개변수로 갖는 생성자
		BufferedReader br = new BufferedReader(fr); //객체 생성 후 예외전가시켜주기
		BufferedWriter bw = new BufferedWriter(fw);
		
		
	//	String msg = br.readLine();  //한줄읽기?
		
		String msg = null;
		
		while((msg = br.readLine()) != null) {
			System.out.println(msg);
			//bw.write(msg); // 한줄로출력
			bw.write(msg+"\n"); 
		}
		bw.flush(); // 요걸해야 txt에 입력됨
		
		
	}

}
