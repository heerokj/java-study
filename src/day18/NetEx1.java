package day18;

//소켓(socket)은 통신선 또는 전기선, 네트워크에 접속하게 하는 연결부를 뜻한다.
//소켓 프로그래밍은 클라이언트(client)와 서버(server)가 통신할 수 있는 환경을 설계하는것이다.

import java.net.InetAddress;
import java.net.UnknownHostException;

// network 관련 클래스 : java.net.*;
public class NetEx1 {
	public static void main(String[] args) throws UnknownHostException {
		
		InetAddress inet = InetAddress.getLocalHost(); //기본 생성자의 접근 제한자default이기 때문에 new연산자로 객체 생성할 수 없다
		
		System.out.println(inet.getHostAddress()); //컴퓨터의 ip주소
		System.out.println(inet.getHostName()); //컴퓨터의 name 
		
		//접속할 서버의 ip주소
		//네이버의 ip
		//이름 ==> ip : DNS
		
		//naver dns에 물어봐서 서버목록들을 배열로 넘겨받도록
		InetAddress [] inet2 = InetAddress.getAllByName("www.naver.com");
		
		for(InetAddress x : inet2) { // 향상된for문(배열만 사용가능)
			System.out.println(x.getHostAddress());
		}//네이버에 접속 할 수 있는 ip얻을 수 있음
		
		
		
	}
	

}
