package day16;

import java.io.File;
import java.io.IOException;

public class FileEx {

	public static void main(String[] args) throws IOException {
		String str = new String("c:\\");// \두개! \한개는 특수문자나타낼때 쓰는 문자
		File f = new File(str);

		System.out.println("----------------");

		File f1 = new File("c:\\Hello2.java"); // 파일이 없어도 오류X

		// 파일이 있나?
		System.out.println(f1.exists() ? "파일있음" : "파일없음");

		// 파일이 없으면 파일 생성..
		if (!f1.exists()) { // exists()있으면 참 없으면 거짓
			// 생성
			f1.createNewFile(); // 예외전가시킴 (throws IOException)
			System.out.println("파일을 생성합니다.");
		} else {
			System.out.println("파일이 존재합니다.");
		}
		System.out.println("----------------");
		
		String path = f1.getAbsolutePath(); //절대경로
		System.out.println(path); //c:\Hello2.java출력

		
		//isXXX() : boolean 값을 리턴
		//얘가 파일인가요?
		if(f1.isFile()) {
			System.out.println("파일입니다.");
		}
		if(f1.isDirectory()) {
			System.out.println("디렉토리입니다.");
		}
		
		System.out.println("----------------");
		File f2 = new File("C:\\dev\\eclipse-jee-2021-12-R-win32-x86_64\\eclipse");
		if(f2.isDirectory()) {
			System.out.println("디렉토리 맞음");
			
			// 현재 디렉토리의 파일목록을 배열로 리턴
			String [] list = f2.list(); 
			//출력
			for(String x : list) { // 향상된 for문
				System.out.println(x);
			}
			
		}

	}
}
