package day18;

import java.net.InetAddress;
import java.net.UnknownHostException;

// network 관련 클래스 : java.net.*;
public class NetEx1 {
	public static void main(String[] args) throws UnknownHostException {
		
		InetAddress inet = InetAddress.getLocalHost();
		 
		System.out.println(inet.getHostAddress()); //컴퓨터의 ip주소
		System.out.println(inet.getHostName()); //컴퓨터의 name 
		
		//접속할 서버의 ip주소
		//네이버의 ip
		//이름 ==> ip : DNS
		
		//naver dns에 물어봐서 서버목록들을 배열로 넘겨받도록
		InetAddress [] inet2 = InetAddress.getAllByName("www.naver.com");
		
		for(InetAddress x : inet2) { // 향상된for문
			System.out.println(x.getHostAddress());
		}//네이버에 접속 할 수 있는 ip얻을 수 있음
		
		
		
	}
	

}
