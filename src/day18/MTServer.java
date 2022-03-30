package day18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class MTServer extends Thread{
	
	Socket client; // Socket의 객체 client 변수 선언
	 
	MTServer(Socket client){
		this.client = client; // 생성자를 통해 전달받은 매개변수 client를 MTServer에서 선언한 client에 전달
	}

	@Override
	public void run() {
		//클라이언트와 통신을 담당하는 코드
		
		// 1. 접속 사용자의 IP출력
		String ip = client.getInetAddress().getHostAddress(); // client의 ip주소를 변수 ip에 저장
		System.out.println(ip); //ip값 출력
		
		
		InputStream is; // InputStream 객체 is 변수 선언
		try {
			// 2. 통신객체(수신부)
			is = client.getInputStream(); //client로부터 값을 읽어오기 => 변수 is에 전달
			InputStreamReader isr = new InputStreamReader(is); // byteStream -> charStream으로 변환
			BufferedReader br = new BufferedReader(isr); //속도 높이는 버퍼기능
			
			// 3. 발신부
			PrintWriter pw = new PrintWriter(
					              new BufferedWriter(
					            		  new OutputStreamWriter(					           
					            				  client.getOutputStream())));
			// client로 값을 전달하는 객체 생성 및 byteStream -> charStream으로 변환 + 버퍼기능, 다양한 자료형에 대해 입력 가능
			
			
			
			String data = ""; //String형 data초기화
			// 4. 반복해서
			// 5. 한줄읽기
			while((data = br.readLine()) != null) { //data에 client로 부터 읽은 값을 전달하여 더이상 읽을 데이터가 없을때까지 반복실행 
				// 6. 콘솔에 출력
				System.out.println("["+ip+"]"+data); //ip별 입력한 data값 출력
				// 7. 다시 클라이언트에 보내기
				pw.println("메아리 :"+data); //전달받은 data값을 다시 client에게 보내기
				pw.flush(); //버퍼에 남은 데이터 내려주기
				
			}

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
