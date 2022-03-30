package day18; //클라이언트 부분

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class NetEx2 {
	public static void main(String[] args) {
		
		//특정 서버에 접속 해보기
		//본인 ip주소 : 192.168.0.4
		
		 try {
			Socket s = new Socket("192.168.0.4", 5000);
			System.out.println(s);
			
			
			
			//종이컵 전화기의 발신부
			//클라이언트 입장에선 내보냄
			OutputStream os = s.getOutputStream();
			os.write(65); //서버쪽 콘솔에 전달되어 출력됨
			
			
			
			
			//한글처리는(바이스스트림) => char스트림으로 바꿔야 : InputStreamReader, OutputStreamWriter
			OutputStreamWriter ows = new OutputStreamWriter(os);
			
			//Buffer
			BufferedWriter bw = new BufferedWriter(ows);
			
			//다양한 자료형에 대해서 출력
			PrintWriter pw = new PrintWriter(bw);
			
			//pw.println("산토끼 토끼야..");
			//pw.flush();			
			
			
			
			//**클라이언트의 수신부 만들기(서버가 내보내는거 받기)
			BufferedReader br = new BufferedReader(
					                 new InputStreamReader(
							                 s.getInputStream()));
			                                 //소켓을 통해 인풋스트림 
				
			
			
			//키보드로 입력한 것을 서버에 보내고 싶을때(콘솔에 입력한 값이 서버에 전달되어 출력)
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader keyboard = new BufferedReader(isr);
			
			String data = "";
			String msg = ""; //
			while((data = keyboard.readLine()) != null) {
				System.out.println("클라이언트가 보내는 메세지 : "+data); 
				pw.println(data);
				pw.flush(); 
				
				//**서버로부터 메아리 전달받아 출력
				msg = br.readLine();
				System.out.println("메아리 전달받아 출력 : "+msg);
				
			}
			
			
		
			
		} catch (UnknownHostException e) {
			System.out.println("알수 없는 호스트");
		} catch (IOException e) {
			System.out.println("접속 실패");
			e.printStackTrace();
		} //처음에는 접속 실패 뜸 => 서버쪽에서 접속 허용시켜주고 그때 접속가능
		  // NetEx3 class에서 접속 허용해주고 NetEx2 class에서 다시 접속 => 접속됨
	}

}
