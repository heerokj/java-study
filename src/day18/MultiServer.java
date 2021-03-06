package day18; //서버한개에 동시에 여러 클라이언트 접속하도록 

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiServer {

	public static void main(String[] args) {
				
		//서버 소켓 객체 생성
		try {
			
					ServerSocket ss = new ServerSocket(5000); // 서버쪽 소켓 생성 -> 5000포트를 통해 Client 접속 허용
					
					//클라이언트의 접속 대기
					while(true) {//무한반복
					System.out.println("클라이언트의 접속 대기");
					
					Socket client = ss.accept(); //접속을 대기하다가 client가 접속하면 client의 소켓을 리턴하여 client변수에 저장
					System.out.println("client :"+client); //client출력
					
					//System.out.println("client ip :"+
					//		client.getInetAddress().getHostAddress()); //
					
					
					//멀티쓰레드 처리(day15참고)
					//통신 담당하는 MTServer /  class따로만듦
					
					//소켓을통해 전하기
					MTServer ms = new MTServer(client); //MTServer객체생성 => 소켓(client)을 매개변수로 전달
					ms.start(); //start메소드 호출

		}

	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
}
