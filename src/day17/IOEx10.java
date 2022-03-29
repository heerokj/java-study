package day17; //ok

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOEx10 {
	public static void main(String[] args) throws IOException {
		
		//test.txt : Hello java IO World 만세!!
		
		// 1.File 객체 생성
		//File f = new File("c:\\test.txt");
				
		// 2. file + char Stream 계열 쓰기 클래스
		//FileWriter fw = new FileWriter(f);
					
		// 3. 버퍼 char Stream 계열 쓰기 클래스
		//BufferedWriter bw = new BufferedWriter(fw);
		
		
		BufferedWriter bw = new BufferedWriter(
				                  new FileWriter(
				                		   new File("c:\\test.txt")));		
				
		// 4. 문자를 저장
		bw.write("Hello java IO World 만세!!!");
		bw.flush();
		System.out.println("-----------------");
		
		
		
		// 5. file 객체 생성
		//File f2 = new File("c:\\test.txt");		
		
		// 6. 파일 접근할 수 있는 char Stream 계열 읽기 클래스 => 읽는개체
		//FileReader fr = new FileReader(f2);				
		
		// 7. 버퍼를 사용 할 수 있는 char Stream 계열 읽기 클래스
		//BufferedReader br = new BufferedReader(fr);
		
		
		BufferedReader br = new BufferedReader(
				                  new FileReader(
				                		  new File("c:\\test.txt")));
		
			
		// 8. 읽어오기 =>지금은 한줄이니 한줄만 읽어오기
		String data = br.readLine();		
		// 9. 콘솔에 출력하기
		System.out.println(data);
		
		
	}

}
