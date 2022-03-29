package day17hw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class q02 {
	public static void main(String[] args) throws IOException {

		//q02문제(읽어오고 다른곳에 저장)
		//읽어오기
		// 1. file 객체 생성
		 File f = new File("c:\\Test.txt");
		// 2. 파일 접근할 수 있는 char Stream 계열 읽기 클래스
		 FileReader fr = new FileReader(f);
		// 3. 버퍼를 사용 할 수 있는 char Stream 계열 읽기 클래스
		 BufferedReader br = new BufferedReader(fr);
		// 4. 읽어오기 =>지금은 한줄이니 한줄만 읽어오기	
		 String data = br.readLine();
		 System.out.println(data);
	
		 // 다른 곳에 저장
		// 5. c:\\Test2.txt 파일에 저장하기
		 File f2 = new File("c:\\Test2.txt");
		 FileWriter fw2 = new FileWriter(f2);
		 BufferedWriter bw2 = new BufferedWriter(fw2);
		bw2.write(data);
		bw2.flush();
		
		

	}

}
