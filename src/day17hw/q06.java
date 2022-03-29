package day17hw;

//Q06. 사용자가 입력한 글을 아스키 코드로 변환하여 +3만큰 증가시키는 글자로 암호화 하려고 한다. 
//다음의 예를 참조하여 코드를 작성하시오
//ex) 아스키코드를 3만큼이동한 값을 출력
//입력: ABC 
//quiz6.txt파일 
//------------------
//DEF

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class q06 {
	public static void main(String[] args) throws IOException {
		
		System.out.print("입력 :");	
	//	InputStreamReader isr = new InputStreamReader(System.in);
	//	BufferedReader br = new BufferedReader(isr);
		
		BufferedReader br = new BufferedReader(
				                  new InputStreamReader(System.in));
		
		
		FileWriter fw = new FileWriter("c:\\q06.txt");
		BufferedWriter bw = new BufferedWriter(fw); 
	
		
		int value = 0;
		while ((value = System.in.read()) != -1) {
			bw.write((char)(value + 3));
			System.out.print((char)(value + 3));
		}
		bw.flush();  //아니 왜 메모장에 안써지냐구..
		
		
	//고민..어렵..ㅋ	
		/*
	 * 	char n = br.readLine().charAt(0);
	 * int num = n;
	 * system.out.println(num);
	 */
		
//		char n = 0;
//		while((n = br.readLine().charAt(0)) != -1) {
//			bw.write(n+3);
//			System.out.println((char)n+3);
//		}bw.flush();
		
		
	/*	
		String data = null;
		while((data = br.readLine()) != null) {
			bw.write(data);
			System.out.println(data);
		}bw.flush();
	*/
		

		
	}

}
