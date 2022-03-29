package day17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOEx8 {
	public static void main(String[] args) throws IOException {
		
		
		//System.in ==> byte 계열
	
		System.out.print("입력: (종료 : crl+z)");
				
		InputStreamReader isr = new InputStreamReader(System.in); //키보드로부터 입력받은거를  isr로 이용
		
		//속도를 빠르게 하기 위해
		BufferedReader br = new BufferedReader(isr);
		
		//입력받은 값을 파일에 저장(한글)
		FileWriter fw = new FileWriter("c:\\ddd.txt"); 
		
		//빠르게 저장
		BufferedWriter bw = new BufferedWriter(fw);
		
		
		String msg = null; //읽어온것을 출력
		
		while((msg = br.readLine()) != null) {  
			bw.write(msg+"\n");
			System.out.println(msg); 
		}
		bw.flush();
	}
	
}
