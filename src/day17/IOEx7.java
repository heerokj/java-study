package day17; //ok

import java.io.IOException;

public class IOEx7 {
	public static void main(String[] args) throws IOException {
		
		// 1. System.in.read()
		// 2. Scaner
		
		//키보드로 부터 입력받은 갑을 화면에 출력
		System.out.print("입력: (종료 : crl+z)");
		int value = 0;
		
		while((value = System.in.read()) != -1) {  //키보드 입력은 system.in ?
			System.out.print((char)value); //한글안됨
		}
		
	}

}
