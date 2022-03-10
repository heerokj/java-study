package day13;

import java.io.IOException;

public class ExceptionEx3 {
	public static void main(String[] args) {
		System.out.println("입력");
		try {
			int value = System.in.read();
			System.out.println(value);
		} catch (IOException ie) {
			System.out.println("입출력 오류 발생했습니다.");
			ie.printStackTrace();
		}finally {
			//예외가 있던 없던 반드시 실행되는 코드
		}System.out.println("예외가 있던 없던 이 부분은 반드시 실행된다.");
		//IO/network, db
		//자원반납하는 코드..
	}

}
