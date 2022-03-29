package day17hw;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class q01 { 

	public static void main(String[] args) throws IOException {
	
		// 1.File 객체 생성
		File f = new File("c:\\Test.txt");
		// 2. file + char Stream 계열 쓰기 클래스
		FileWriter fw = new FileWriter(f);
		// 3. 버퍼 char Stream 계열 쓰기 클래스
		BufferedWriter bw = new BufferedWriter(fw);
		// 4. 문자를 저장
		bw.write("Hello javaWorld");
		bw.flush();
		System.out.println("저장함");
		
	
	}
}
